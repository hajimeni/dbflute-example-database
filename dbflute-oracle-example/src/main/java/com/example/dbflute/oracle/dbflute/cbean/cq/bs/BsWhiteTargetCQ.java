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
 * The base condition-query of WHITE_TARGET.
 * @author oracleman
 */
public class BsWhiteTargetCQ extends AbstractBsWhiteTargetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteTargetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_TARGET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteTargetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteTargetCIQ xcreateCIQ() {
        WhiteTargetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteTargetCIQ xnewCIQ() {
        return new WhiteTargetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_TARGET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteTargetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteTargetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _targetId;
    public ConditionValue getTargetId() {
        if (_targetId == null) { _targetId = nCV(); }
        return _targetId;
    }
    protected ConditionValue getCValueTargetId() { return getTargetId(); }

    protected Map<String, WhiteRefTargetCQ> _targetId_ExistsReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_ExistsReferrer_WhiteRefTargetList() { return _targetId_ExistsReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_ExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery) {
        if (_targetId_ExistsReferrer_WhiteRefTargetListMap == null) { _targetId_ExistsReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_ExistsReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_ExistsReferrer_WhiteRefTargetListMap.put(key, subQuery); return "targetId_ExistsReferrer_WhiteRefTargetList." + key;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_NotExistsReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_NotExistsReferrer_WhiteRefTargetList() { return _targetId_NotExistsReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_NotExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery) {
        if (_targetId_NotExistsReferrer_WhiteRefTargetListMap == null) { _targetId_NotExistsReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_NotExistsReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_NotExistsReferrer_WhiteRefTargetListMap.put(key, subQuery); return "targetId_NotExistsReferrer_WhiteRefTargetList." + key;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_SpecifyDerivedReferrer_WhiteRefTargetList() { return _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery) {
        if (_targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap == null) { _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_SpecifyDerivedReferrer_WhiteRefTargetListMap.put(key, subQuery); return "targetId_SpecifyDerivedReferrer_WhiteRefTargetList." + key;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_InScopeRelation_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_InScopeRelation_WhiteRefTargetList() { return _targetId_InScopeRelation_WhiteRefTargetListMap; }
    public String keepTargetId_InScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ subQuery) {
        if (_targetId_InScopeRelation_WhiteRefTargetListMap == null) { _targetId_InScopeRelation_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_InScopeRelation_WhiteRefTargetListMap.size() + 1);
        _targetId_InScopeRelation_WhiteRefTargetListMap.put(key, subQuery); return "targetId_InScopeRelation_WhiteRefTargetList." + key;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_NotInScopeRelation_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_NotInScopeRelation_WhiteRefTargetList() { return _targetId_NotInScopeRelation_WhiteRefTargetListMap; }
    public String keepTargetId_NotInScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ subQuery) {
        if (_targetId_NotInScopeRelation_WhiteRefTargetListMap == null) { _targetId_NotInScopeRelation_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_NotInScopeRelation_WhiteRefTargetListMap.size() + 1);
        _targetId_NotInScopeRelation_WhiteRefTargetListMap.put(key, subQuery); return "targetId_NotInScopeRelation_WhiteRefTargetList." + key;
    }

    protected Map<String, WhiteRefTargetCQ> _targetId_QueryDerivedReferrer_WhiteRefTargetListMap;
    public Map<String, WhiteRefTargetCQ> getTargetId_QueryDerivedReferrer_WhiteRefTargetList() { return _targetId_QueryDerivedReferrer_WhiteRefTargetListMap; }
    public String keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery) {
        if (_targetId_QueryDerivedReferrer_WhiteRefTargetListMap == null) { _targetId_QueryDerivedReferrer_WhiteRefTargetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_targetId_QueryDerivedReferrer_WhiteRefTargetListMap.size() + 1);
        _targetId_QueryDerivedReferrer_WhiteRefTargetListMap.put(key, subQuery); return "targetId_QueryDerivedReferrer_WhiteRefTargetList." + key;
    }
    protected Map<String, Object> _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap;
    public Map<String, Object> getTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter() { return _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap; }
    public String keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(Object parameterValue) {
        if (_targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap == null) { _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap.size() + 1);
        _targetId_QueryDerivedReferrer_WhiteRefTargetListParameterMap.put(key, parameterValue); return "targetId_QueryDerivedReferrer_WhiteRefTargetListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetId_Asc() { regOBA("TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetId_Desc() { regOBD("TARGET_ID"); return this; }

    protected ConditionValue _targetName;
    public ConditionValue getTargetName() {
        if (_targetName == null) { _targetName = nCV(); }
        return _targetName;
    }
    protected ConditionValue getCValueTargetName() { return getTargetName(); }

    /** 
     * Add order-by as ascend. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetName_Asc() { regOBA("TARGET_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @return this. (NotNull)
     */
    public BsWhiteTargetCQ addOrderBy_TargetName_Desc() { regOBD("TARGET_NAME"); return this; }

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
    public BsWhiteTargetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteTargetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteTargetCQ> _scalarConditionMap;
    public Map<String, WhiteTargetCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteTargetCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteTargetCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteTargetCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteTargetCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteTargetCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteTargetCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteTargetCQ subQuery) {
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
    protected Map<String, WhiteTargetCQ> _myselfExistsMap;
    public Map<String, WhiteTargetCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteTargetCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteTargetCQ> _myselfInScopeMap;
    public Map<String, WhiteTargetCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteTargetCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteTargetCB.class.getName(); }
    protected String xCQ() { return WhiteTargetCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
