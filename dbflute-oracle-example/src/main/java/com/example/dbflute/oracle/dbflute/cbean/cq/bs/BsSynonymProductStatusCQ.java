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
 * The base condition-query of SYNONYM_PRODUCT_STATUS.
 * @author oracleman
 */
public class BsSynonymProductStatusCQ extends AbstractBsSynonymProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SYNONYM_PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymProductStatusCIQ xcreateCIQ() {
        SynonymProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymProductStatusCIQ xnewCIQ() {
        return new SynonymProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SYNONYM_PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode() {
        if (_productStatusCode == null) { _productStatusCode = nCV(); }
        return _productStatusCode;
    }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    protected Map<String, SynonymProductCQ> _productStatusCode_ExistsReferrer_SynonymProductListMap;
    public Map<String, SynonymProductCQ> getProductStatusCode_ExistsReferrer_SynonymProductList() { return _productStatusCode_ExistsReferrer_SynonymProductListMap; }
    public String keepProductStatusCode_ExistsReferrer_SynonymProductList(SynonymProductCQ subQuery) {
        if (_productStatusCode_ExistsReferrer_SynonymProductListMap == null) { _productStatusCode_ExistsReferrer_SynonymProductListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productStatusCode_ExistsReferrer_SynonymProductListMap.size() + 1);
        _productStatusCode_ExistsReferrer_SynonymProductListMap.put(key, subQuery); return "productStatusCode_ExistsReferrer_SynonymProductList." + key;
    }

    protected Map<String, SynonymProductCQ> _productStatusCode_NotExistsReferrer_SynonymProductListMap;
    public Map<String, SynonymProductCQ> getProductStatusCode_NotExistsReferrer_SynonymProductList() { return _productStatusCode_NotExistsReferrer_SynonymProductListMap; }
    public String keepProductStatusCode_NotExistsReferrer_SynonymProductList(SynonymProductCQ subQuery) {
        if (_productStatusCode_NotExistsReferrer_SynonymProductListMap == null) { _productStatusCode_NotExistsReferrer_SynonymProductListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productStatusCode_NotExistsReferrer_SynonymProductListMap.size() + 1);
        _productStatusCode_NotExistsReferrer_SynonymProductListMap.put(key, subQuery); return "productStatusCode_NotExistsReferrer_SynonymProductList." + key;
    }

    protected Map<String, SynonymProductCQ> _productStatusCode_InScopeRelation_SynonymProductListMap;
    public Map<String, SynonymProductCQ> getProductStatusCode_InScopeRelation_SynonymProductList() { return _productStatusCode_InScopeRelation_SynonymProductListMap; }
    public String keepProductStatusCode_InScopeRelation_SynonymProductList(SynonymProductCQ subQuery) {
        if (_productStatusCode_InScopeRelation_SynonymProductListMap == null) { _productStatusCode_InScopeRelation_SynonymProductListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productStatusCode_InScopeRelation_SynonymProductListMap.size() + 1);
        _productStatusCode_InScopeRelation_SynonymProductListMap.put(key, subQuery); return "productStatusCode_InScopeRelation_SynonymProductList." + key;
    }

    protected Map<String, SynonymProductCQ> _productStatusCode_NotInScopeRelation_SynonymProductListMap;
    public Map<String, SynonymProductCQ> getProductStatusCode_NotInScopeRelation_SynonymProductList() { return _productStatusCode_NotInScopeRelation_SynonymProductListMap; }
    public String keepProductStatusCode_NotInScopeRelation_SynonymProductList(SynonymProductCQ subQuery) {
        if (_productStatusCode_NotInScopeRelation_SynonymProductListMap == null) { _productStatusCode_NotInScopeRelation_SynonymProductListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_SynonymProductListMap.size() + 1);
        _productStatusCode_NotInScopeRelation_SynonymProductListMap.put(key, subQuery); return "productStatusCode_NotInScopeRelation_SynonymProductList." + key;
    }

    protected Map<String, SynonymProductCQ> _productStatusCode_SpecifyDerivedReferrer_SynonymProductListMap;
    public Map<String, SynonymProductCQ> getProductStatusCode_SpecifyDerivedReferrer_SynonymProductList() { return _productStatusCode_SpecifyDerivedReferrer_SynonymProductListMap; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_SynonymProductList(SynonymProductCQ subQuery) {
        if (_productStatusCode_SpecifyDerivedReferrer_SynonymProductListMap == null) { _productStatusCode_SpecifyDerivedReferrer_SynonymProductListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productStatusCode_SpecifyDerivedReferrer_SynonymProductListMap.size() + 1);
        _productStatusCode_SpecifyDerivedReferrer_SynonymProductListMap.put(key, subQuery); return "productStatusCode_SpecifyDerivedReferrer_SynonymProductList." + key;
    }

    protected Map<String, SynonymProductCQ> _productStatusCode_QueryDerivedReferrer_SynonymProductListMap;
    public Map<String, SynonymProductCQ> getProductStatusCode_QueryDerivedReferrer_SynonymProductList() { return _productStatusCode_QueryDerivedReferrer_SynonymProductListMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_SynonymProductList(SynonymProductCQ subQuery) {
        if (_productStatusCode_QueryDerivedReferrer_SynonymProductListMap == null) { _productStatusCode_QueryDerivedReferrer_SynonymProductListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productStatusCode_QueryDerivedReferrer_SynonymProductListMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_SynonymProductListMap.put(key, subQuery); return "productStatusCode_QueryDerivedReferrer_SynonymProductList." + key;
    }
    protected Map<String, Object> _productStatusCode_QueryDerivedReferrer_SynonymProductListParameterMap;
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_SynonymProductListParameter() { return _productStatusCode_QueryDerivedReferrer_SynonymProductListParameterMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_SynonymProductListParameter(Object parameterValue) {
        if (_productStatusCode_QueryDerivedReferrer_SynonymProductListParameterMap == null) { _productStatusCode_QueryDerivedReferrer_SynonymProductListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_productStatusCode_QueryDerivedReferrer_SynonymProductListParameterMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_SynonymProductListParameterMap.put(key, parameterValue); return "productStatusCode_QueryDerivedReferrer_SynonymProductListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue getProductStatusName() {
        if (_productStatusName == null) { _productStatusName = nCV(); }
        return _productStatusName;
    }
    protected ConditionValue getCValueProductStatusName() { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsSynonymProductStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsSynonymProductStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsSynonymProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSynonymProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, SynonymProductStatusCQ> _scalarConditionMap;
    public Map<String, SynonymProductStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SynonymProductStatusCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SynonymProductStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, SynonymProductStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SynonymProductStatusCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, SynonymProductStatusCQ> _queryMyselfDerivedMap;
    public Map<String, SynonymProductStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SynonymProductStatusCQ subQuery) {
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
    protected Map<String, SynonymProductStatusCQ> _myselfExistsMap;
    public Map<String, SynonymProductStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SynonymProductStatusCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SynonymProductStatusCQ> _myselfInScopeMap;
    public Map<String, SynonymProductStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SynonymProductStatusCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymProductStatusCB.class.getName(); }
    protected String xCQ() { return SynonymProductStatusCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
