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
 * The base condition-bean of white_all_in_one_cls_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAllInOneClsCompoundPkRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAllInOneClsCompoundPkRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAllInOneClsCompoundPkRefCB() {
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
        return "white_all_in_one_cls_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(String fooCode, String barCode, String quxCode) {
        assertObjectNotNull("fooCode", fooCode);assertObjectNotNull("barCode", barCode);assertObjectNotNull("quxCode", quxCode);
        BsWhiteAllInOneClsCompoundPkRefCB cb = this;
        cb.query().setFooCode_Equal(fooCode);cb.query().setBarCode_Equal(barCode);cb.query().setQuxCode_Equal(quxCode);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_FooCode_Asc();
        query().addOrderBy_BarCode_Asc();
        query().addOrderBy_QuxCode_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_FooCode_Desc();
        query().addOrderBy_BarCode_Desc();
        query().addOrderBy_QuxCode_Desc();
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
    public WhiteAllInOneClsCompoundPkRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public WhiteAllInOneClsCompoundPkRefCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteAllInOneClsCompoundPkRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteAllInOneClsCompoundPkRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteAllInOneClsCompoundPkRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteAllInOneClsCompoundPkRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteAllInOneClsCompoundPkRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteAllInOneClsCompoundPkRefCB> unionQuery) {
        final WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteAllInOneClsCompoundPkRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteAllInOneClsCompoundPkRefCB> unionQuery) {
        final WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final WhiteAllInOneClsCompoundPkRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteAllInOneClsElementNss _nssWhiteAllInOneClsElementAsFoo;
    public WhiteAllInOneClsElementNss getNssWhiteAllInOneClsElementAsFoo() {
        if (_nssWhiteAllInOneClsElementAsFoo == null) { _nssWhiteAllInOneClsElementAsFoo = new WhiteAllInOneClsElementNss(null); }
        return _nssWhiteAllInOneClsElementAsFoo;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteAllInOneClsElementAsFoo()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = whiteAllInOneClsCompoundPkRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteAllInOneClsCompoundPkRef.<span style="color: #FD4747">getWhiteAllInOneClsElementAsFoo()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteAllInOneClsElementNss setupSelect_WhiteAllInOneClsElementAsFoo() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteAllInOneClsElementAsFoo(); } });
        if (_nssWhiteAllInOneClsElementAsFoo == null || !_nssWhiteAllInOneClsElementAsFoo.hasConditionQuery())
        { _nssWhiteAllInOneClsElementAsFoo = new WhiteAllInOneClsElementNss(query().queryWhiteAllInOneClsElementAsFoo()); }
        return _nssWhiteAllInOneClsElementAsFoo;
    }
    protected WhiteAllInOneClsElementNss _nssWhiteAllInOneClsElementAsBar;
    public WhiteAllInOneClsElementNss getNssWhiteAllInOneClsElementAsBar() {
        if (_nssWhiteAllInOneClsElementAsBar == null) { _nssWhiteAllInOneClsElementAsBar = new WhiteAllInOneClsElementNss(null); }
        return _nssWhiteAllInOneClsElementAsBar;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.<span style="color: #FD4747">setupSelect_WhiteAllInOneClsElementAsBar()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = whiteAllInOneClsCompoundPkRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteAllInOneClsCompoundPkRef.<span style="color: #FD4747">getWhiteAllInOneClsElementAsBar()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteAllInOneClsElementNss setupSelect_WhiteAllInOneClsElementAsBar() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteAllInOneClsElementAsBar(); } });
        if (_nssWhiteAllInOneClsElementAsBar == null || !_nssWhiteAllInOneClsElementAsBar.hasConditionQuery())
        { _nssWhiteAllInOneClsElementAsBar = new WhiteAllInOneClsElementNss(query().queryWhiteAllInOneClsElementAsBar()); }
        return _nssWhiteAllInOneClsElementAsBar;
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
            , new HpSpQyCall<WhiteAllInOneClsCompoundPkRefCQ>() {
                public boolean has() { return true; }
                public WhiteAllInOneClsCompoundPkRefCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteAllInOneClsCompoundPkRefCQ> {
        protected WhiteAllInOneClsElementCB.HpSpecification _whiteAllInOneClsElementAsFoo;
        protected WhiteAllInOneClsElementCB.HpSpecification _whiteAllInOneClsElementAsBar;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteAllInOneClsCompoundPkRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFooCode() { return doColumn("FOO_CODE"); }
        /**
         * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBarCode() { return doColumn("BAR_CODE"); }
        /**
         * QUX_CODE: {PK, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnQuxCode() { return doColumn("QUX_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnFooCode(); // PK
            columnBarCode(); // PK
            columnQuxCode(); // PK
        }
        @Override
        protected String getTableDbName() { return "white_all_in_one_cls_compound_pk_ref"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteAllInOneClsElementCB.HpSpecification specifyWhiteAllInOneClsElementAsFoo() {
            assertRelation("whiteAllInOneClsElementAsFoo");
            if (_whiteAllInOneClsElementAsFoo == null) {
                _whiteAllInOneClsElementAsFoo = new WhiteAllInOneClsElementCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteAllInOneClsElementCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteAllInOneClsElementAsFoo(); }
                    public WhiteAllInOneClsElementCQ qy() { return _qyCall.qy().queryWhiteAllInOneClsElementAsFoo(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteAllInOneClsElementAsFoo.xsetSyncQyCall(new HpSpQyCall<WhiteAllInOneClsElementCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteAllInOneClsElementAsFoo(); }
                        public WhiteAllInOneClsElementCQ qy() { return xsyncQyCall().qy().queryWhiteAllInOneClsElementAsFoo(); }
                    });
                }
            }
            return _whiteAllInOneClsElementAsFoo;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteAllInOneClsElementCB.HpSpecification specifyWhiteAllInOneClsElementAsBar() {
            assertRelation("whiteAllInOneClsElementAsBar");
            if (_whiteAllInOneClsElementAsBar == null) {
                _whiteAllInOneClsElementAsBar = new WhiteAllInOneClsElementCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteAllInOneClsElementCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteAllInOneClsElementAsBar(); }
                    public WhiteAllInOneClsElementCQ qy() { return _qyCall.qy().queryWhiteAllInOneClsElementAsBar(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _whiteAllInOneClsElementAsBar.xsetSyncQyCall(new HpSpQyCall<WhiteAllInOneClsElementCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteAllInOneClsElementAsBar(); }
                        public WhiteAllInOneClsElementCQ qy() { return xsyncQyCall().qy().queryWhiteAllInOneClsElementAsBar(); }
                    });
                }
            }
            return _whiteAllInOneClsElementAsBar;
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteAllInOneClsCompoundPkRefCB> columnQuery(final SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB> leftSpecifyQuery) {
        return new HpColQyOperand<WhiteAllInOneClsCompoundPkRefCB>(new HpColQyHandler<WhiteAllInOneClsCompoundPkRefCB>() {
            public HpCalculator handle(SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected WhiteAllInOneClsCompoundPkRefCB xcreateColumnQueryCB() {
        WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
        cb.xsetupForColumnQuery((WhiteAllInOneClsCompoundPkRefCB)this);
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
    public WhiteAllInOneClsCompoundPkRefCB dreamCruiseCB() {
        WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
        cb.xsetupForDreamCruise((WhiteAllInOneClsCompoundPkRefCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteAllInOneClsCompoundPkRefCB> orQuery) {
        xorSQ((WhiteAllInOneClsCompoundPkRefCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *             public void query(WhiteAllInOneClsCompoundPkRefCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteAllInOneClsCompoundPkRefCB> andQuery) {
        xorSQAP((WhiteAllInOneClsCompoundPkRefCB)this, andQuery);
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
        final WhiteAllInOneClsCompoundPkRefCB cb;
        if (mainCB != null) {
            cb = (WhiteAllInOneClsCompoundPkRefCB)mainCB;
        } else {
            cb = new WhiteAllInOneClsCompoundPkRefCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteAllInOneClsCompoundPkRefCQ>() {
            public boolean has() { return true; }
            public WhiteAllInOneClsCompoundPkRefCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return WhiteAllInOneClsCompoundPkRefCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return WhiteAllInOneClsCompoundPkRefCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
