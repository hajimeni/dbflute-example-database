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
 * The base condition-query of white_purchase_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePurchaseReferrerCQ extends AbstractBsWhitePurchaseReferrerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePurchaseReferrerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePurchaseReferrerCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_purchase_referrer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePurchaseReferrerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePurchaseReferrerCIQ xcreateCIQ() {
        WhitePurchaseReferrerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePurchaseReferrerCIQ xnewCIQ() {
        return new WhitePurchaseReferrerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_purchase_referrer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePurchaseReferrerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePurchaseReferrerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _purchaseReferrerId;
    public ConditionValue getPurchaseReferrerId() {
        if (_purchaseReferrerId == null) { _purchaseReferrerId = nCV(); }
        return _purchaseReferrerId;
    }
    protected ConditionValue getCValuePurchaseReferrerId() { return getPurchaseReferrerId(); }

    protected Map<String, PurchaseCQ> _purchaseReferrerId_InScopeRelation_PurchaseMap;
    public Map<String, PurchaseCQ> getPurchaseReferrerId_InScopeRelation_Purchase() { return _purchaseReferrerId_InScopeRelation_PurchaseMap; }
    public String keepPurchaseReferrerId_InScopeRelation_Purchase(PurchaseCQ subQuery) {
        if (_purchaseReferrerId_InScopeRelation_PurchaseMap == null) { _purchaseReferrerId_InScopeRelation_PurchaseMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_purchaseReferrerId_InScopeRelation_PurchaseMap.size() + 1);
        _purchaseReferrerId_InScopeRelation_PurchaseMap.put(key, subQuery); return "purchaseReferrerId_InScopeRelation_Purchase." + key;
    }

    protected Map<String, PurchaseCQ> _purchaseReferrerId_NotInScopeRelation_PurchaseMap;
    public Map<String, PurchaseCQ> getPurchaseReferrerId_NotInScopeRelation_Purchase() { return _purchaseReferrerId_NotInScopeRelation_PurchaseMap; }
    public String keepPurchaseReferrerId_NotInScopeRelation_Purchase(PurchaseCQ subQuery) {
        if (_purchaseReferrerId_NotInScopeRelation_PurchaseMap == null) { _purchaseReferrerId_NotInScopeRelation_PurchaseMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_purchaseReferrerId_NotInScopeRelation_PurchaseMap.size() + 1);
        _purchaseReferrerId_NotInScopeRelation_PurchaseMap.put(key, subQuery); return "purchaseReferrerId_NotInScopeRelation_Purchase." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerId_Asc() { regOBA("PURCHASE_REFERRER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerId_Desc() { regOBD("PURCHASE_REFERRER_ID"); return this; }

    protected ConditionValue _purchaseReferrerName;
    public ConditionValue getPurchaseReferrerName() {
        if (_purchaseReferrerName == null) { _purchaseReferrerName = nCV(); }
        return _purchaseReferrerName;
    }
    protected ConditionValue getCValuePurchaseReferrerName() { return getPurchaseReferrerName(); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerName_Asc() { regOBA("PURCHASE_REFERRER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePurchaseReferrerCQ addOrderBy_PurchaseReferrerName_Desc() { regOBD("PURCHASE_REFERRER_NAME"); return this; }

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
    public BsWhitePurchaseReferrerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhitePurchaseReferrerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhitePurchaseReferrerCQ baseQuery = (WhitePurchaseReferrerCQ)baseQueryAsSuper;
        WhitePurchaseReferrerCQ unionQuery = (WhitePurchaseReferrerCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryPurchase()) {
            unionQuery.queryPurchase().reflectRelationOnUnionQuery(baseQuery.queryPurchase(), unionQuery.queryPurchase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchase() {
        return getConditionQueryPurchase();
    }
    protected PurchaseCQ _conditionQueryPurchase;
    public PurchaseCQ getConditionQueryPurchase() {
        if (_conditionQueryPurchase == null) {
            _conditionQueryPurchase = xcreateQueryPurchase();
            xsetupOuterJoinPurchase();
        }
        return _conditionQueryPurchase;
    }
    protected PurchaseCQ xcreateQueryPurchase() {
        String nrp = resolveNextRelationPath("white_purchase_referrer", "purchase");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        PurchaseCQ cq = new PurchaseCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("purchase");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinPurchase() {
        PurchaseCQ cq = getConditionQueryPurchase();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PURCHASE_REFERRER_ID", "PURCHASE_ID");
        registerOuterJoin(cq, joinOnMap, "purchase");
    }
    public boolean hasConditionQueryPurchase() {
        return _conditionQueryPurchase != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhitePurchaseReferrerCQ> _scalarConditionMap;
    public Map<String, WhitePurchaseReferrerCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhitePurchaseReferrerCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhitePurchaseReferrerCQ> _specifyMyselfDerivedMap;
    public Map<String, WhitePurchaseReferrerCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhitePurchaseReferrerCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhitePurchaseReferrerCQ> _queryMyselfDerivedMap;
    public Map<String, WhitePurchaseReferrerCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhitePurchaseReferrerCQ subQuery) {
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
    protected Map<String, WhitePurchaseReferrerCQ> _myselfExistsMap;
    public Map<String, WhitePurchaseReferrerCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhitePurchaseReferrerCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhitePurchaseReferrerCQ> _myselfInScopeMap;
    public Map<String, WhitePurchaseReferrerCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhitePurchaseReferrerCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePurchaseReferrerCB.class.getName(); }
    protected String xCQ() { return WhitePurchaseReferrerCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
