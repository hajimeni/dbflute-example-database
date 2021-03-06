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
 * The base condition-query of white_uq_reference_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqReferenceRefNestCQ extends AbstractBsWhiteUqReferenceRefNestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqReferenceRefNestCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqReferenceRefNestCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_uq_reference_ref_nest) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqReferenceRefNestCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqReferenceRefNestCIQ xcreateCIQ() {
        WhiteUqReferenceRefNestCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqReferenceRefNestCIQ xnewCIQ() {
        return new WhiteUqReferenceRefNestCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_uq_reference_ref_nest on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqReferenceRefNestCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqReferenceRefNestCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _uqReferenceRefNestId;
    public ConditionValue getUqReferenceRefNestId() {
        if (_uqReferenceRefNestId == null) { _uqReferenceRefNestId = nCV(); }
        return _uqReferenceRefNestId;
    }
    protected ConditionValue getCValueUqReferenceRefNestId() { return getUqReferenceRefNestId(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefNestCQ addOrderBy_UqReferenceRefNestId_Asc() { regOBA("UQ_REFERENCE_REF_NEST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefNestCQ addOrderBy_UqReferenceRefNestId_Desc() { regOBD("UQ_REFERENCE_REF_NEST_ID"); return this; }

    protected ConditionValue _compoundUqFirstCode;
    public ConditionValue getCompoundUqFirstCode() {
        if (_compoundUqFirstCode == null) { _compoundUqFirstCode = nCV(); }
        return _compoundUqFirstCode;
    }
    protected ConditionValue getCValueCompoundUqFirstCode() { return getCompoundUqFirstCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefNestCQ addOrderBy_CompoundUqFirstCode_Asc() { regOBA("COMPOUND_UQ_FIRST_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefNestCQ addOrderBy_CompoundUqFirstCode_Desc() { regOBD("COMPOUND_UQ_FIRST_CODE"); return this; }

    protected ConditionValue _compoundUqSecondCode;
    public ConditionValue getCompoundUqSecondCode() {
        if (_compoundUqSecondCode == null) { _compoundUqSecondCode = nCV(); }
        return _compoundUqSecondCode;
    }
    protected ConditionValue getCValueCompoundUqSecondCode() { return getCompoundUqSecondCode(); }

    /** 
     * Add order-by as ascend. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefNestCQ addOrderBy_CompoundUqSecondCode_Asc() { regOBA("COMPOUND_UQ_SECOND_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @return this. (NotNull)
     */
    public BsWhiteUqReferenceRefNestCQ addOrderBy_CompoundUqSecondCode_Desc() { regOBD("COMPOUND_UQ_SECOND_CODE"); return this; }

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
    public BsWhiteUqReferenceRefNestCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteUqReferenceRefNestCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteUqReferenceRefNestCQ baseQuery = (WhiteUqReferenceRefNestCQ)baseQueryAsSuper;
        WhiteUqReferenceRefNestCQ unionQuery = (WhiteUqReferenceRefNestCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteUqReferenceRef()) {
            unionQuery.queryWhiteUqReferenceRef().reflectRelationOnUnionQuery(baseQuery.queryWhiteUqReferenceRef(), unionQuery.queryWhiteUqReferenceRef());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_uq_reference_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRef'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteUqReferenceRefCQ queryWhiteUqReferenceRef() {
        return getConditionQueryWhiteUqReferenceRef();
    }
    protected WhiteUqReferenceRefCQ _conditionQueryWhiteUqReferenceRef;
    public WhiteUqReferenceRefCQ getConditionQueryWhiteUqReferenceRef() {
        if (_conditionQueryWhiteUqReferenceRef == null) {
            _conditionQueryWhiteUqReferenceRef = xcreateQueryWhiteUqReferenceRef();
            xsetupOuterJoinWhiteUqReferenceRef();
        }
        return _conditionQueryWhiteUqReferenceRef;
    }
    protected WhiteUqReferenceRefCQ xcreateQueryWhiteUqReferenceRef() {
        String nrp = resolveNextRelationPath("white_uq_reference_ref_nest", "whiteUqReferenceRef");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteUqReferenceRefCQ cq = new WhiteUqReferenceRefCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteUqReferenceRef");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteUqReferenceRef() {
        WhiteUqReferenceRefCQ cq = getConditionQueryWhiteUqReferenceRef();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE");
        joinOnMap.put("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE");
        registerOuterJoin(cq, joinOnMap, "whiteUqReferenceRef");
    }
    public boolean hasConditionQueryWhiteUqReferenceRef() {
        return _conditionQueryWhiteUqReferenceRef != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteUqReferenceRefNestCQ> _scalarConditionMap;
    public Map<String, WhiteUqReferenceRefNestCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteUqReferenceRefNestCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteUqReferenceRefNestCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteUqReferenceRefNestCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteUqReferenceRefNestCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteUqReferenceRefNestCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteUqReferenceRefNestCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteUqReferenceRefNestCQ subQuery) {
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
    protected Map<String, WhiteUqReferenceRefNestCQ> _myselfExistsMap;
    public Map<String, WhiteUqReferenceRefNestCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteUqReferenceRefNestCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteUqReferenceRefNestCQ> _myselfInScopeMap;
    public Map<String, WhiteUqReferenceRefNestCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteUqReferenceRefNestCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqReferenceRefNestCB.class.getName(); }
    protected String xCQ() { return WhiteUqReferenceRefNestCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
