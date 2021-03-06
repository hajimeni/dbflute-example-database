package com.example.dbflute.oracle.dbflute.cbean.bs;

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
import com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.oracle.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;
import com.example.dbflute.oracle.dbflute.cbean.nss.*;

/**
 * The base condition-bean of SYNONYM_MEMBER_WITHDRAWAL.
 * @author oracleman
 */
public class BsSynonymMemberWithdrawalCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberWithdrawalCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberWithdrawalCB() {
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
        return "SYNONYM_MEMBER_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        BsSynonymMemberWithdrawalCB cb = this;
        cb.query().setMemberId_Equal(memberId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
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
    public SynonymMemberWithdrawalCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public SynonymMemberWithdrawalCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected SynonymMemberWithdrawalCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected SynonymMemberWithdrawalCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        SynonymMemberWithdrawalCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected SynonymMemberWithdrawalCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new SynonymMemberWithdrawalCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<SynonymMemberWithdrawalCB> unionQuery) {
        final SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final SynonymMemberWithdrawalCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<SynonymMemberWithdrawalCB> unionQuery) {
        final SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final SynonymMemberWithdrawalCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public ConditionBean lockForUpdateNoWait()
    { if (xhelpIsSqlClauseOracle()) { xhelpGettingSqlClauseOracle().lockForUpdateNoWait(); } return this; }
    public ConditionBean lockForUpdateWait(int waitSec)
    { if (xhelpIsSqlClauseOracle()) { xhelpGettingSqlClauseOracle().lockForUpdateWait(waitSec); } return this; }

    protected boolean xhelpIsSqlClauseOracle() {
        return getSqlClause() instanceof org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle;
    }

    protected org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle xhelpGettingSqlClauseOracle() {
        return (org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle)getSqlClause();
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberVendorSynonymNss _nssMemberVendorSynonym;
    public MemberVendorSynonymNss getNssMemberVendorSynonym() {
        if (_nssMemberVendorSynonym == null) { _nssMemberVendorSynonym = new MemberVendorSynonymNss(null); }
        return _nssMemberVendorSynonym;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.<span style="color: #FD4747">setupSelect_MemberVendorSynonym()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberWithdrawal synonymMemberWithdrawal = synonymMemberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberWithdrawal.<span style="color: #FD4747">getMemberVendorSynonym()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberVendorSynonymNss setupSelect_MemberVendorSynonym() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberVendorSynonym(); } });
        if (_nssMemberVendorSynonym == null || !_nssMemberVendorSynonym.hasConditionQuery())
        { _nssMemberVendorSynonym = new MemberVendorSynonymNss(query().queryMemberVendorSynonym()); }
        return _nssMemberVendorSynonym;
    }
    protected WithdrawalReasonNss _nssWithdrawalReason;
    public WithdrawalReasonNss getNssWithdrawalReason() {
        if (_nssWithdrawalReason == null) { _nssWithdrawalReason = new WithdrawalReasonNss(null); }
        return _nssWithdrawalReason;
    }
    /**
     * Set up relation columns to select clause. <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.<span style="color: #FD4747">setupSelect_WithdrawalReason()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberWithdrawal synonymMemberWithdrawal = synonymMemberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberWithdrawal.<span style="color: #FD4747">getWithdrawalReason()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WithdrawalReasonNss setupSelect_WithdrawalReason() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnWithdrawalReasonCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWithdrawalReason(); } });
        if (_nssWithdrawalReason == null || !_nssWithdrawalReason.hasConditionQuery())
        { _nssWithdrawalReason = new WithdrawalReasonNss(query().queryWithdrawalReason()); }
        return _nssWithdrawalReason;
    }
    protected SynonymMemberNss _nssSynonymMember;
    public SynonymMemberNss getNssSynonymMember() {
        if (_nssSynonymMember == null) { _nssSynonymMember = new SynonymMemberNss(null); }
        return _nssSynonymMember;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.<span style="color: #FD4747">setupSelect_SynonymMember()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberWithdrawal synonymMemberWithdrawal = synonymMemberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberWithdrawal.<span style="color: #FD4747">getSynonymMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SynonymMemberNss setupSelect_SynonymMember() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().querySynonymMember(); } });
        if (_nssSynonymMember == null || !_nssSynonymMember.hasConditionQuery())
        { _nssSynonymMember = new SynonymMemberNss(query().querySynonymMember()); }
        return _nssSynonymMember;
    }
    protected VendorSynonymMemberNss _nssVendorSynonymMember;
    public VendorSynonymMemberNss getNssVendorSynonymMember() {
        if (_nssVendorSynonymMember == null) { _nssVendorSynonymMember = new VendorSynonymMemberNss(null); }
        return _nssVendorSynonymMember;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorSynonymMember()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SynonymMemberWithdrawal synonymMemberWithdrawal = synonymMemberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
     * ... = synonymMemberWithdrawal.<span style="color: #FD4747">getVendorSynonymMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorSynonymMemberNss setupSelect_VendorSynonymMember() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorSynonymMember(); } });
        if (_nssVendorSynonymMember == null || !_nssVendorSynonymMember.hasConditionQuery())
        { _nssVendorSynonymMember = new VendorSynonymMemberNss(query().queryVendorSynonymMember()); }
        return _nssVendorSynonymMember;
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
            , new HpSpQyCall<SynonymMemberWithdrawalCQ>() {
                public boolean has() { return true; }
                public SynonymMemberWithdrawalCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<SynonymMemberWithdrawalCQ> {
        protected MemberVendorSynonymCB.HpSpecification _memberVendorSynonym;
        protected WithdrawalReasonCB.HpSpecification _withdrawalReason;
        protected SynonymMemberCB.HpSpecification _synonymMember;
        protected VendorSynonymMemberCB.HpSpecification _vendorSynonymMember;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<SynonymMemberWithdrawalCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWithdrawalReasonCode() { return doColumn("WITHDRAWAL_REASON_CODE"); }
        /**
         * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWithdrawalReasonInputText() { return doColumn("WITHDRAWAL_REASON_INPUT_TEXT"); }
        /**
         * WITHDRAWAL_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWithdrawalDatetime() { return doColumn("WITHDRAWAL_DATETIME"); }
        /**
         * REGISTER_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterProcess() { return doColumn("REGISTER_PROCESS"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateProcess() { return doColumn("UPDATE_PROCESS"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * VERSION_NO: {NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryWithdrawalReason()
                    || qyCall().qy().xgetReferrerQuery() instanceof WithdrawalReasonCQ) {
                columnWithdrawalReasonCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "SYNONYM_MEMBER_WITHDRAWAL"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberVendorSynonymCB.HpSpecification specifyMemberVendorSynonym() {
            assertRelation("memberVendorSynonym");
            if (_memberVendorSynonym == null) {
                _memberVendorSynonym = new MemberVendorSynonymCB.HpSpecification(_baseCB, new HpSpQyCall<MemberVendorSynonymCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberVendorSynonym(); }
                    public MemberVendorSynonymCQ qy() { return _qyCall.qy().queryMemberVendorSynonym(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberVendorSynonym.xsetSyncQyCall(new HpSpQyCall<MemberVendorSynonymCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberVendorSynonym(); }
                        public MemberVendorSynonymCQ qy() { return xsyncQyCall().qy().queryMemberVendorSynonym(); }
                    });
                }
            }
            return _memberVendorSynonym;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WithdrawalReasonCB.HpSpecification specifyWithdrawalReason() {
            assertRelation("withdrawalReason");
            if (_withdrawalReason == null) {
                _withdrawalReason = new WithdrawalReasonCB.HpSpecification(_baseCB, new HpSpQyCall<WithdrawalReasonCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWithdrawalReason(); }
                    public WithdrawalReasonCQ qy() { return _qyCall.qy().queryWithdrawalReason(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _withdrawalReason.xsetSyncQyCall(new HpSpQyCall<WithdrawalReasonCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWithdrawalReason(); }
                        public WithdrawalReasonCQ qy() { return xsyncQyCall().qy().queryWithdrawalReason(); }
                    });
                }
            }
            return _withdrawalReason;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SynonymMemberCB.HpSpecification specifySynonymMember() {
            assertRelation("synonymMember");
            if (_synonymMember == null) {
                _synonymMember = new SynonymMemberCB.HpSpecification(_baseCB, new HpSpQyCall<SynonymMemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQuerySynonymMember(); }
                    public SynonymMemberCQ qy() { return _qyCall.qy().querySynonymMember(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _synonymMember.xsetSyncQyCall(new HpSpQyCall<SynonymMemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySynonymMember(); }
                        public SynonymMemberCQ qy() { return xsyncQyCall().qy().querySynonymMember(); }
                    });
                }
            }
            return _synonymMember;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorSynonymMemberCB.HpSpecification specifyVendorSynonymMember() {
            assertRelation("vendorSynonymMember");
            if (_vendorSynonymMember == null) {
                _vendorSynonymMember = new VendorSynonymMemberCB.HpSpecification(_baseCB, new HpSpQyCall<VendorSynonymMemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorSynonymMember(); }
                    public VendorSynonymMemberCQ qy() { return _qyCall.qy().queryVendorSynonymMember(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorSynonymMember.xsetSyncQyCall(new HpSpQyCall<VendorSynonymMemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorSynonymMember(); }
                        public VendorSynonymMemberCQ qy() { return xsyncQyCall().qy().queryVendorSynonymMember(); }
                    });
                }
            }
            return _vendorSynonymMember;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<SynonymMemberWithdrawalCB, SynonymMemberWithdrawalCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<SynonymMemberWithdrawalCB, SynonymMemberWithdrawalCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<SynonymMemberWithdrawalCB, SynonymMemberWithdrawalCQ>() {
                public void setup(String function, SubQuery<SynonymMemberWithdrawalCB> subQuery, SynonymMemberWithdrawalCQ cq, String aliasName, DerivedReferrerOption option) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<SynonymMemberWithdrawalCB> columnQuery(final SpecifyQuery<SynonymMemberWithdrawalCB> leftSpecifyQuery) {
        return new HpColQyOperand<SynonymMemberWithdrawalCB>(new HpColQyHandler<SynonymMemberWithdrawalCB>() {
            public HpCalculator handle(SpecifyQuery<SynonymMemberWithdrawalCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected SynonymMemberWithdrawalCB xcreateColumnQueryCB() {
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
        cb.xsetupForColumnQuery((SynonymMemberWithdrawalCB)this);
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
    public SynonymMemberWithdrawalCB dreamCruiseCB() {
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
        cb.xsetupForDreamCruise((SynonymMemberWithdrawalCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<SynonymMemberWithdrawalCB> orQuery) {
        xorSQ((SynonymMemberWithdrawalCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *             public void query(SynonymMemberWithdrawalCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<SynonymMemberWithdrawalCB> andQuery) {
        xorSQAP((SynonymMemberWithdrawalCB)this, andQuery);
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
        final SynonymMemberWithdrawalCB cb;
        if (mainCB != null) {
            cb = (SynonymMemberWithdrawalCB)mainCB;
        } else {
            cb = new SynonymMemberWithdrawalCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<SynonymMemberWithdrawalCQ>() {
            public boolean has() { return true; }
            public SynonymMemberWithdrawalCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return SynonymMemberWithdrawalCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return SynonymMemberWithdrawalCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
