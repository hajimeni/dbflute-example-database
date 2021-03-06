package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of SYNONYM_MEMBER_LOGIN.
 * @author oracleman
 */
public class BsSynonymMemberLoginCQ extends AbstractBsSynonymMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberLoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_MEMBER_LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymMemberLoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymMemberLoginCIQ xcreateCIQ() {
        SynonymMemberLoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymMemberLoginCIQ xnewCIQ() {
        return new SynonymMemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_MEMBER_LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymMemberLoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymMemberLoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberLoginId;
    public ConditionValue getMemberLoginId() {
        if (_memberLoginId == null) { _memberLoginId = nCV(); }
        return _memberLoginId;
    }
    protected ConditionValue getCValueMemberLoginId() { return getMemberLoginId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberLoginId_Asc() { regOBA("MEMBER_LOGIN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberLoginId_Desc() { regOBD("MEMBER_LOGIN_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberVendorSynonymCQ> _memberId_InScopeRelation_MemberVendorSynonymMap;
    public Map<String, MemberVendorSynonymCQ> getMemberId_InScopeRelation_MemberVendorSynonym() { return _memberId_InScopeRelation_MemberVendorSynonymMap; }
    public String keepMemberId_InScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ subQuery) {
        if (_memberId_InScopeRelation_MemberVendorSynonymMap == null) { _memberId_InScopeRelation_MemberVendorSynonymMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberVendorSynonymMap.size() + 1);
        _memberId_InScopeRelation_MemberVendorSynonymMap.put(key, subQuery); return "memberId_InScopeRelation_MemberVendorSynonym." + key;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberId_NotInScopeRelation_MemberVendorSynonymMap;
    public Map<String, MemberVendorSynonymCQ> getMemberId_NotInScopeRelation_MemberVendorSynonym() { return _memberId_NotInScopeRelation_MemberVendorSynonymMap; }
    public String keepMemberId_NotInScopeRelation_MemberVendorSynonym(MemberVendorSynonymCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberVendorSynonymMap == null) { _memberId_NotInScopeRelation_MemberVendorSynonymMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberVendorSynonymMap.size() + 1);
        _memberId_NotInScopeRelation_MemberVendorSynonymMap.put(key, subQuery); return "memberId_NotInScopeRelation_MemberVendorSynonym." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {UQ, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {UQ, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _loginDatetime;
    public ConditionValue getLoginDatetime() {
        if (_loginDatetime == null) { _loginDatetime = nCV(); }
        return _loginDatetime;
    }
    protected ConditionValue getCValueLoginDatetime() { return getLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_DATETIME: {UQ+, IX, NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginDatetime_Asc() { regOBA("LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_DATETIME: {UQ+, IX, NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginDatetime_Desc() { regOBD("LOGIN_DATETIME"); return this; }

    protected ConditionValue _mobileLoginFlg;
    public ConditionValue getMobileLoginFlg() {
        if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
        return _mobileLoginFlg;
    }
    protected ConditionValue getCValueMobileLoginFlg() { return getMobileLoginFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MobileLoginFlg_Asc() { regOBA("MOBILE_LOGIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_MobileLoginFlg_Desc() { regOBD("MOBILE_LOGIN_FLG"); return this; }

    protected ConditionValue _loginMemberStatusCode;
    public ConditionValue getLoginMemberStatusCode() {
        if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
        return _loginMemberStatusCode;
    }
    protected ConditionValue getCValueLoginMemberStatusCode() { return getLoginMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_InScopeRelation_MemberStatus() { return _loginMemberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_loginMemberStatusCode_InScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_loginMemberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_InScopeRelation_MemberStatusMap.put(key, subQuery); return "loginMemberStatusCode_InScopeRelation_MemberStatus." + key;
    }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_NotInScopeRelation_MemberStatus() { return _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.put(key, subQuery); return "loginMemberStatusCode_NotInScopeRelation_MemberStatus." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginMemberStatusCode_Asc() { regOBA("LOGIN_MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addOrderBy_LoginMemberStatusCode_Desc() { regOBD("LOGIN_MEMBER_STATUS_CODE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSynonymMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        SynonymMemberLoginCQ baseQuery = (SynonymMemberLoginCQ)baseQueryAsSuper;
        SynonymMemberLoginCQ unionQuery = (SynonymMemberLoginCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMemberVendorSynonym()) {
            unionQuery.queryMemberVendorSynonym().reflectRelationOnUnionQuery(baseQuery.queryMemberVendorSynonym(), unionQuery.queryMemberVendorSynonym());
        }
        if (baseQuery.hasConditionQueryMemberStatus()) {
            unionQuery.queryMemberStatus().reflectRelationOnUnionQuery(baseQuery.queryMemberStatus(), unionQuery.queryMemberStatus());
        }
        if (baseQuery.hasConditionQuerySynonymMember()) {
            unionQuery.querySynonymMember().reflectRelationOnUnionQuery(baseQuery.querySynonymMember(), unionQuery.querySynonymMember());
        }
        if (baseQuery.hasConditionQueryVendorSynonymMember()) {
            unionQuery.queryVendorSynonymMember().reflectRelationOnUnionQuery(baseQuery.queryVendorSynonymMember(), unionQuery.queryVendorSynonymMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberVendorSynonymCQ queryMemberVendorSynonym() {
        return getConditionQueryMemberVendorSynonym();
    }
    protected MemberVendorSynonymCQ _conditionQueryMemberVendorSynonym;
    public MemberVendorSynonymCQ getConditionQueryMemberVendorSynonym() {
        if (_conditionQueryMemberVendorSynonym == null) {
            _conditionQueryMemberVendorSynonym = xcreateQueryMemberVendorSynonym();
            xsetupOuterJoinMemberVendorSynonym();
        }
        return _conditionQueryMemberVendorSynonym;
    }
    protected MemberVendorSynonymCQ xcreateQueryMemberVendorSynonym() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_LOGIN", "memberVendorSynonym");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberVendorSynonymCQ cq = new MemberVendorSynonymCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberVendorSynonym");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberVendorSynonym() {
        MemberVendorSynonymCQ cq = getConditionQueryMemberVendorSynonym();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberVendorSynonym");
    }
    public boolean hasConditionQueryMemberVendorSynonym() {
        return _conditionQueryMemberVendorSynonym != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    protected MemberStatusCQ _conditionQueryMemberStatus;
    public MemberStatusCQ getConditionQueryMemberStatus() {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_LOGIN", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberStatusCQ cq = new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymMemberCQ querySynonymMember() {
        return getConditionQuerySynonymMember();
    }
    protected SynonymMemberCQ _conditionQuerySynonymMember;
    public SynonymMemberCQ getConditionQuerySynonymMember() {
        if (_conditionQuerySynonymMember == null) {
            _conditionQuerySynonymMember = xcreateQuerySynonymMember();
            xsetupOuterJoinSynonymMember();
        }
        return _conditionQuerySynonymMember;
    }
    protected SynonymMemberCQ xcreateQuerySynonymMember() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_LOGIN", "synonymMember");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SynonymMemberCQ cq = new SynonymMemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("synonymMember");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSynonymMember() {
        SynonymMemberCQ cq = getConditionQuerySynonymMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "synonymMember");
    }
    public boolean hasConditionQuerySynonymMember() {
        return _conditionQuerySynonymMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorSynonymMemberCQ queryVendorSynonymMember() {
        return getConditionQueryVendorSynonymMember();
    }
    protected VendorSynonymMemberCQ _conditionQueryVendorSynonymMember;
    public VendorSynonymMemberCQ getConditionQueryVendorSynonymMember() {
        if (_conditionQueryVendorSynonymMember == null) {
            _conditionQueryVendorSynonymMember = xcreateQueryVendorSynonymMember();
            xsetupOuterJoinVendorSynonymMember();
        }
        return _conditionQueryVendorSynonymMember;
    }
    protected VendorSynonymMemberCQ xcreateQueryVendorSynonymMember() {
        String nrp = resolveNextRelationPath("SYNONYM_MEMBER_LOGIN", "vendorSynonymMember");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorSynonymMemberCQ cq = new VendorSynonymMemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorSynonymMember");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorSynonymMember() {
        VendorSynonymMemberCQ cq = getConditionQueryVendorSynonymMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "vendorSynonymMember");
    }
    public boolean hasConditionQueryVendorSynonymMember() {
        return _conditionQueryVendorSynonymMember != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, SynonymMemberLoginCQ> _scalarConditionMap;
    public Map<String, SynonymMemberLoginCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymMemberLoginCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymMemberLoginCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymMemberLoginCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymMemberLoginCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, SynonymMemberLoginCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymMemberLoginCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymMemberLoginCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SynonymMemberLoginCQ> _myselfExistsMap;
    public Map<String, SynonymMemberLoginCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymMemberLoginCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymMemberLoginCQ> _myselfInScopeMap;
    public Map<String, SynonymMemberLoginCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymMemberLoginCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymMemberLoginCB.class.getName(); }
    protected String xCQ() { return SynonymMemberLoginCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
