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
 * The base condition-query of SYNONYM_NEXT_SECRET_AUTH.
 * @author oracleman
 */
public class BsSynonymNextSecretAuthCQ extends AbstractBsSynonymNextSecretAuthCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextSecretAuthCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymNextSecretAuthCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_NEXT_SECRET_AUTH) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymNextSecretAuthCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymNextSecretAuthCIQ xcreateCIQ() {
        SynonymNextSecretAuthCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymNextSecretAuthCIQ xnewCIQ() {
        return new SynonymNextSecretAuthCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_NEXT_SECRET_AUTH on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymNextSecretAuthCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymNextSecretAuthCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _secretAuthCode;
    public ConditionValue getSecretAuthCode() {
        if (_secretAuthCode == null) { _secretAuthCode = nCV(); }
        return _secretAuthCode;
    }
    protected ConditionValue getCValueSecretAuthCode() { return getSecretAuthCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSecretAuthCQ addOrderBy_SecretAuthCode_Asc() { regOBA("SECRET_AUTH_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSecretAuthCQ addOrderBy_SecretAuthCode_Desc() { regOBD("SECRET_AUTH_CODE"); return this; }

    protected ConditionValue _secretAuthName;
    public ConditionValue getSecretAuthName() {
        if (_secretAuthName == null) { _secretAuthName = nCV(); }
        return _secretAuthName;
    }
    protected ConditionValue getCValueSecretAuthName() { return getSecretAuthName(); }

    /** 
     * Add order-by as ascend. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSecretAuthCQ addOrderBy_SecretAuthName_Asc() { regOBA("SECRET_AUTH_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextSecretAuthCQ addOrderBy_SecretAuthName_Desc() { regOBD("SECRET_AUTH_NAME"); return this; }

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
    public BsSynonymNextSecretAuthCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSynonymNextSecretAuthCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, SynonymNextSecretAuthCQ> _scalarConditionMap;
    public Map<String, SynonymNextSecretAuthCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymNextSecretAuthCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymNextSecretAuthCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymNextSecretAuthCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymNextSecretAuthCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, SynonymNextSecretAuthCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymNextSecretAuthCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymNextSecretAuthCQ subQuery) {
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
    protected Map<String, SynonymNextSecretAuthCQ> _myselfExistsMap;
    public Map<String, SynonymNextSecretAuthCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymNextSecretAuthCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymNextSecretAuthCQ> _myselfInScopeMap;
    public Map<String, SynonymNextSecretAuthCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymNextSecretAuthCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymNextSecretAuthCB.class.getName(); }
    protected String xCQ() { return SynonymNextSecretAuthCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
