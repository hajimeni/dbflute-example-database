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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of vendor_the_long_and_winding_table_and_column.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorTheLongAndWindingTableAndColumnCQ extends AbstractBsVendorTheLongAndWindingTableAndColumnCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorTheLongAndWindingTableAndColumnCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorTheLongAndWindingTableAndColumnCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_the_long_and_winding_table_and_column) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorTheLongAndWindingTableAndColumnCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorTheLongAndWindingTableAndColumnCIQ xcreateCIQ() {
        VendorTheLongAndWindingTableAndColumnCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorTheLongAndWindingTableAndColumnCIQ xnewCIQ() {
        return new VendorTheLongAndWindingTableAndColumnCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_the_long_and_winding_table_and_column on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorTheLongAndWindingTableAndColumnCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorTheLongAndWindingTableAndColumnCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _theLongAndWindingTableAndColumnId;
    public ConditionValue getTheLongAndWindingTableAndColumnId() {
        if (_theLongAndWindingTableAndColumnId == null) { _theLongAndWindingTableAndColumnId = nCV(); }
        return _theLongAndWindingTableAndColumnId;
    }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnId() { return getTheLongAndWindingTableAndColumnId(); }

    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList() { return _theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap; }
    public String keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ subQuery) {
        if (_theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap == null) { _theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.size() + 1);
        _theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.put(key, subQuery); return "theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList." + key;
    }

    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList() { return _theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap; }
    public String keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ subQuery) {
        if (_theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap == null) { _theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.size() + 1);
        _theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.put(key, subQuery); return "theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList." + key;
    }

    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList() { return _theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap; }
    public String keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ subQuery) {
        if (_theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap == null) { _theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.size() + 1);
        _theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.put(key, subQuery); return "theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList." + key;
    }

    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList() { return _theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap; }
    public String keepTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ subQuery) {
        if (_theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap == null) { _theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap.size() + 1);
        _theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap.put(key, subQuery); return "theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList." + key;
    }

    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList() { return _theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap; }
    public String keepTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ subQuery) {
        if (_theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap == null) { _theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap.size() + 1);
        _theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefListMap.put(key, subQuery); return "theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList." + key;
    }

    protected Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnRefCQ> getTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList() { return _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap; }
    public String keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ subQuery) {
        if (_theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap == null) { _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.size() + 1);
        _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListMap.put(key, subQuery); return "theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList." + key;
    }
    protected Map<String, Object> _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameterMap;
    public Map<String, Object> getTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter() { return _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameterMap; }
    public String keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(Object parameterValue) {
        if (_theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameterMap == null) { _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameterMap.size() + 1);
        _theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameterMap.put(key, parameterValue); return "theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_TheLongAndWindingTableAndColumnId_Asc() { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_TheLongAndWindingTableAndColumnId_Desc() { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    protected ConditionValue _theLongAndWindingTableAndColumnName;
    public ConditionValue getTheLongAndWindingTableAndColumnName() {
        if (_theLongAndWindingTableAndColumnName == null) { _theLongAndWindingTableAndColumnName = nCV(); }
        return _theLongAndWindingTableAndColumnName;
    }
    protected ConditionValue getCValueTheLongAndWindingTableAndColumnName() { return getTheLongAndWindingTableAndColumnName(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_TheLongAndWindingTableAndColumnName_Asc() { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_TheLongAndWindingTableAndColumnName_Desc() { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); return this; }

    protected ConditionValue _shortName;
    public ConditionValue getShortName() {
        if (_shortName == null) { _shortName = nCV(); }
        return _shortName;
    }
    protected ConditionValue getCValueShortName() { return getShortName(); }

    /** 
     * Add order-by as ascend. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_ShortName_Asc() { regOBA("SHORT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_ShortName_Desc() { regOBD("SHORT_NAME"); return this; }

    protected ConditionValue _shortSize;
    public ConditionValue getShortSize() {
        if (_shortSize == null) { _shortSize = nCV(); }
        return _shortSize;
    }
    protected ConditionValue getCValueShortSize() { return getShortSize(); }

    /** 
     * Add order-by as ascend. <br />
     * SHORT_SIZE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_ShortSize_Asc() { regOBA("SHORT_SIZE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SHORT_SIZE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsVendorTheLongAndWindingTableAndColumnCQ addOrderBy_ShortSize_Desc() { regOBD("SHORT_SIZE"); return this; }

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
    public BsVendorTheLongAndWindingTableAndColumnCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorTheLongAndWindingTableAndColumnCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, VendorTheLongAndWindingTableAndColumnCQ> _scalarConditionMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorTheLongAndWindingTableAndColumnCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorTheLongAndWindingTableAndColumnCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorTheLongAndWindingTableAndColumnCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, VendorTheLongAndWindingTableAndColumnCQ> _queryMyselfDerivedMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorTheLongAndWindingTableAndColumnCQ subQuery) {
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
    protected Map<String, VendorTheLongAndWindingTableAndColumnCQ> _myselfExistsMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorTheLongAndWindingTableAndColumnCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorTheLongAndWindingTableAndColumnCQ> _myselfInScopeMap;
    public Map<String, VendorTheLongAndWindingTableAndColumnCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorTheLongAndWindingTableAndColumnCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorTheLongAndWindingTableAndColumnCB.class.getName(); }
    protected String xCQ() { return VendorTheLongAndWindingTableAndColumnCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
