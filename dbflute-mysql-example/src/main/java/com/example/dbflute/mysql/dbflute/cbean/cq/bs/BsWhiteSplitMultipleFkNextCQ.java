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
 * The base condition-query of white_split_multiple_fk_next.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSplitMultipleFkNextCQ extends AbstractBsWhiteSplitMultipleFkNextCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkNextCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSplitMultipleFkNextCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_split_multiple_fk_next) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSplitMultipleFkNextCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSplitMultipleFkNextCIQ xcreateCIQ() {
        WhiteSplitMultipleFkNextCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSplitMultipleFkNextCIQ xnewCIQ() {
        return new WhiteSplitMultipleFkNextCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_split_multiple_fk_next on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSplitMultipleFkNextCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSplitMultipleFkNextCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _nextId;
    public ConditionValue getNextId() {
        if (_nextId == null) { _nextId = nCV(); }
        return _nextId;
    }
    protected ConditionValue getCValueNextId() { return getNextId(); }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _nextId_ExistsReferrer_WhiteSplitMultipleFkBaseListMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList() { return _nextId_ExistsReferrer_WhiteSplitMultipleFkBaseListMap; }
    public String keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ subQuery) {
        if (_nextId_ExistsReferrer_WhiteSplitMultipleFkBaseListMap == null) { _nextId_ExistsReferrer_WhiteSplitMultipleFkBaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextId_ExistsReferrer_WhiteSplitMultipleFkBaseListMap.size() + 1);
        _nextId_ExistsReferrer_WhiteSplitMultipleFkBaseListMap.put(key, subQuery); return "nextId_ExistsReferrer_WhiteSplitMultipleFkBaseList." + key;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseListMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList() { return _nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseListMap; }
    public String keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ subQuery) {
        if (_nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseListMap == null) { _nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseListMap.size() + 1);
        _nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseListMap.put(key, subQuery); return "nextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList." + key;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseListMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList() { return _nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseListMap; }
    public String keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ subQuery) {
        if (_nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseListMap == null) { _nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseListMap.size() + 1);
        _nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseListMap.put(key, subQuery); return "nextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList." + key;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _nextId_InScopeRelation_WhiteSplitMultipleFkBaseListMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_InScopeRelation_WhiteSplitMultipleFkBaseList() { return _nextId_InScopeRelation_WhiteSplitMultipleFkBaseListMap; }
    public String keepNextId_InScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ subQuery) {
        if (_nextId_InScopeRelation_WhiteSplitMultipleFkBaseListMap == null) { _nextId_InScopeRelation_WhiteSplitMultipleFkBaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextId_InScopeRelation_WhiteSplitMultipleFkBaseListMap.size() + 1);
        _nextId_InScopeRelation_WhiteSplitMultipleFkBaseListMap.put(key, subQuery); return "nextId_InScopeRelation_WhiteSplitMultipleFkBaseList." + key;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseListMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList() { return _nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseListMap; }
    public String keepNextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ subQuery) {
        if (_nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseListMap == null) { _nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseListMap.size() + 1);
        _nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseListMap.put(key, subQuery); return "nextId_NotInScopeRelation_WhiteSplitMultipleFkBaseList." + key;
    }

    protected Map<String, WhiteSplitMultipleFkBaseCQ> _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListMap;
    public Map<String, WhiteSplitMultipleFkBaseCQ> getNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList() { return _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListMap; }
    public String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ subQuery) {
        if (_nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListMap == null) { _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListMap.size() + 1);
        _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListMap.put(key, subQuery); return "nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList." + key;
    }
    protected Map<String, Object> _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameterMap;
    public Map<String, Object> getNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter() { return _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameterMap; }
    public String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(Object parameterValue) {
        if (_nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameterMap == null) { _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameterMap.size() + 1);
        _nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameterMap.put(key, parameterValue); return "nextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_NextId_Asc() { regOBA("NEXT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_NextId_Desc() { regOBD("NEXT_ID"); return this; }

    protected ConditionValue _secondCode;
    public ConditionValue getSecondCode() {
        if (_secondCode == null) { _secondCode = nCV(); }
        return _secondCode;
    }
    protected ConditionValue getCValueSecondCode() { return getSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_SecondCode_Asc() { regOBA("SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteSplitMultipleFkNextCQ addOrderBy_SecondCode_Desc() { regOBD("SECOND_CODE"); return this; }

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
    public BsWhiteSplitMultipleFkNextCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteSplitMultipleFkNextCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhiteSplitMultipleFkNextCQ> _scalarConditionMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteSplitMultipleFkNextCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteSplitMultipleFkNextCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteSplitMultipleFkNextCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteSplitMultipleFkNextCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteSplitMultipleFkNextCQ subQuery) {
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
    protected Map<String, WhiteSplitMultipleFkNextCQ> _myselfExistsMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteSplitMultipleFkNextCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteSplitMultipleFkNextCQ> _myselfInScopeMap;
    public Map<String, WhiteSplitMultipleFkNextCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteSplitMultipleFkNextCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSplitMultipleFkNextCB.class.getName(); }
    protected String xCQ() { return WhiteSplitMultipleFkNextCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
