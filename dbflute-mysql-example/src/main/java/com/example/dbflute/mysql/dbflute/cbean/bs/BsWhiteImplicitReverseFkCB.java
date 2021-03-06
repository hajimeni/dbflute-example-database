/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.mysql.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;
import com.example.dbflute.mysql.dbflute.cbean.nss.*;

/**
 * The base condition-bean of white_implicit_reverse_fk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitReverseFkCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitReverseFkCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitReverseFkCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isCheckCountBeforeQueryUpdate()) {
            enableCheckCountBeforeQueryUpdate();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_implicit_reverse_fk";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer whiteImplicitReverseFkId) {
        assertObjectNotNull("whiteImplicitReverseFkId", whiteImplicitReverseFkId);
        BsWhiteImplicitReverseFkCB cb = this;
        cb.query().setWhiteImplicitReverseFkId_Equal(whiteImplicitReverseFkId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_WhiteImplicitReverseFkId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_WhiteImplicitReverseFkId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (co-related sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (co-related sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public WhiteImplicitReverseFkCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteImplicitReverseFkCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteImplicitReverseFkCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteImplicitReverseFkCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteImplicitReverseFkCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteImplicitReverseFkCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteImplicitReverseFkCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteImplicitReverseFkCB> unionQuery) {
        final WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteImplicitReverseFkCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteImplicitReverseFkCB> unionQuery) {
        final WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteImplicitReverseFkCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteImplicitReverseFkRefNss _nssWhiteImplicitReverseFkRefWithImplicitReverseFK;
    public WhiteImplicitReverseFkRefNss getNssWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        if (_nssWhiteImplicitReverseFkRefWithImplicitReverseFK == null) { _nssWhiteImplicitReverseFkRefWithImplicitReverseFK = new WhiteImplicitReverseFkRefNss(null); }
        return _nssWhiteImplicitReverseFkRefWithImplicitReverseFK;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFk whiteImplicitReverseFk = whiteImplicitReverseFkBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteImplicitReverseFk.<span style="color: #FD4747">getWhiteImplicitReverseFkRefWithImplicitReverseFK()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteImplicitReverseFkRefNss setupSelect_WhiteImplicitReverseFkRefWithImplicitReverseFK(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate); } });
        if (_nssWhiteImplicitReverseFkRefWithImplicitReverseFK == null || !_nssWhiteImplicitReverseFkRefWithImplicitReverseFK.hasConditionQuery())
        { _nssWhiteImplicitReverseFkRefWithImplicitReverseFK = new WhiteImplicitReverseFkRefNss(query().queryWhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate)); }
        return _nssWhiteImplicitReverseFkRefWithImplicitReverseFK;
    }
    protected WhiteImplicitReverseFkSuppressNss _nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    public WhiteImplicitReverseFkSuppressNss getNssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        if (_nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null) { _nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = new WhiteImplicitReverseFkSuppressNss(null); }
        return _nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFk whiteImplicitReverseFk = whiteImplicitReverseFkBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteImplicitReverseFk.<span style="color: #FD4747">getWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteImplicitReverseFkSuppressNss setupSelect_WhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(final java.util.Date targetDate) {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate); } });
        if (_nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null || !_nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK.hasConditionQuery())
        { _nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK = new WhiteImplicitReverseFkSuppressNss(query().queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate)); }
        return _nssWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<WhiteImplicitReverseFkCQ>() {
                public boolean has() { return true; }
                public WhiteImplicitReverseFkCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<WhiteImplicitReverseFkCQ> {
        protected WhiteImplicitReverseFkRefCB.HpSpecification _whiteImplicitReverseFkRefWithImplicitReverseFK;
        protected WhiteImplicitReverseFkSuppressCB.HpSpecification _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteImplicitReverseFkCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWhiteImplicitReverseFkId() { return doColumn("WHITE_IMPLICIT_REVERSE_FK_ID"); }
        /**
         * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWhiteImplicitReverseFkName() { return doColumn("WHITE_IMPLICIT_REVERSE_FK_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnWhiteImplicitReverseFkId(); // PK
        }
        @Override
        protected String getTableDbName() { return "white_implicit_reverse_fk"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitReverseFkRefCB.HpSpecification specifyWhiteImplicitReverseFkRefWithImplicitReverseFK(final java.util.Date targetDate) {
            assertRelation("whiteImplicitReverseFkRefWithImplicitReverseFK");
            if (_whiteImplicitReverseFkRefWithImplicitReverseFK == null) {
                _whiteImplicitReverseFkRefWithImplicitReverseFK = new WhiteImplicitReverseFkRefCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitReverseFkRefCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
                    public WhiteImplicitReverseFkRefCQ qy() { return _qyCall.qy().queryWhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitReverseFkRefWithImplicitReverseFK.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitReverseFkRefCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
                        public WhiteImplicitReverseFkRefCQ qy() { return xsyncQyCall().qy().queryWhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate); }
                    });
                }
            }
            return _whiteImplicitReverseFkRefWithImplicitReverseFK;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitReverseFkRefCB.HpSpecification specifyWhiteImplicitReverseFkRefWithImplicitReverseFK() {
            assertRelation("whiteImplicitReverseFkRefWithImplicitReverseFK");
            if (_whiteImplicitReverseFkRefWithImplicitReverseFK == null) {
                _whiteImplicitReverseFkRefWithImplicitReverseFK = new WhiteImplicitReverseFkRefCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitReverseFkRefCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
                    public WhiteImplicitReverseFkRefCQ qy() { return _qyCall.qy().getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitReverseFkRefWithImplicitReverseFK.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitReverseFkRefCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
                        public WhiteImplicitReverseFkRefCQ qy() { return xsyncQyCall().qy().getConditionQueryWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
                    });
                }
            }
            return _whiteImplicitReverseFkRefWithImplicitReverseFK;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitReverseFkSuppressCB.HpSpecification specifyWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(final java.util.Date targetDate) {
            assertRelation("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK");
            if (_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null) {
                _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK = new WhiteImplicitReverseFkSuppressCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitReverseFkSuppressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
                    public WhiteImplicitReverseFkSuppressCQ qy() { return _qyCall.qy().queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitReverseFkSuppressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
                        public WhiteImplicitReverseFkSuppressCQ qy() { return xsyncQyCall().qy().queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate); }
                    });
                }
            }
            return _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteImplicitReverseFkSuppressCB.HpSpecification specifyWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
            assertRelation("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK");
            if (_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK == null) {
                _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK = new WhiteImplicitReverseFkSuppressCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteImplicitReverseFkSuppressCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
                    public WhiteImplicitReverseFkSuppressCQ qy() { return _qyCall.qy().getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK.xsetSyncQyCall(new HpSpQyCall<WhiteImplicitReverseFkSuppressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
                        public WhiteImplicitReverseFkSuppressCQ qy() { return xsyncQyCall().qy().getConditionQueryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
                    });
                }
            }
            return _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from white_implicit_reverse_fk_ref where ...) as FOO_MAX} <br />
         * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. <br />
         * This relation is auto-detected as implicit reverse FK.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedWhiteImplicitReverseFkRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
         *     public void query(WhiteImplicitReverseFkRefCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, WhiteImplicitReverseFkRef.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkCQ> derivedWhiteImplicitReverseFkRefList() {
            assertDerived("whiteImplicitReverseFkRefList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkCQ>() {
                public void setup(String function, SubQuery<WhiteImplicitReverseFkRefCB> subQuery, WhiteImplicitReverseFkCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveWhiteImplicitReverseFkRefList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteImplicitReverseFkCB, WhiteImplicitReverseFkCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<WhiteImplicitReverseFkCB, WhiteImplicitReverseFkCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteImplicitReverseFkCB, WhiteImplicitReverseFkCQ>() {
                public void setup(String function, SubQuery<WhiteImplicitReverseFkCB> subQuery, WhiteImplicitReverseFkCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsmyselfDerive(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteImplicitReverseFkCB> columnQuery(final SpecifyQuery<WhiteImplicitReverseFkCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteImplicitReverseFkCB>(new HpColQyHandler<WhiteImplicitReverseFkCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteImplicitReverseFkCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteImplicitReverseFkCB xcreateColumnQueryCB() {
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.xsetupForColumnQuery((WhiteImplicitReverseFkCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public WhiteImplicitReverseFkCB dreamCruiseCB() {
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.xsetupForDreamCruise((WhiteImplicitReverseFkCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                        OrScopeQuery
    //                                                                        ============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteImplicitReverseFkCB> orQuery) {
        xorSQ((WhiteImplicitReverseFkCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void query(WhiteImplicitReverseFkCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *             public void query(WhiteImplicitReverseFkCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteImplicitReverseFkCB> andQuery) {
        xorSQAP((WhiteImplicitReverseFkCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final WhiteImplicitReverseFkCB cb;
        if (mainCB != null) {
            cb = (WhiteImplicitReverseFkCB)mainCB;
        } else {
            cb = new WhiteImplicitReverseFkCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteImplicitReverseFkCQ>() {
            public boolean has() { return true; }
            public WhiteImplicitReverseFkCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteImplicitReverseFkCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteImplicitReverseFkCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
