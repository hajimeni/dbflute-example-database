package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of vendor_date_fk.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorDateFkCQ extends AbstractBsVendorDateFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorDateFkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorDateFkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_date_fk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorDateFkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorDateFkCIQ xcreateCIQ() {
        VendorDateFkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorDateFkCIQ xnewCIQ() {
        return new VendorDateFkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_date_fk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorDateFkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorDateFkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _barId;
    public ConditionValue getBarId() {
        if (_barId == null) { _barId = nCV(); }
        return _barId;
    }
    protected ConditionValue getCValueBarId() { return getBarId(); }

    /** 
     * Add order-by as ascend. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarId_Asc() { regOBA("bar_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarId_Desc() { regOBD("bar_id"); return this; }

    protected ConditionValue _barDate;
    public ConditionValue getBarDate() {
        if (_barDate == null) { _barDate = nCV(); }
        return _barDate;
    }
    protected ConditionValue getCValueBarDate() { return getBarDate(); }

    /** 
     * Add order-by as ascend. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarDate_Asc() { regOBA("bar_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @return this. (NotNull)
     */
    public BsVendorDateFkCQ addOrderBy_BarDate_Desc() { regOBD("bar_date"); return this; }

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
    public BsVendorDateFkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorDateFkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        VendorDateFkCQ baseQuery = (VendorDateFkCQ)baseQueryAsSuper;
        VendorDateFkCQ unionQuery = (VendorDateFkCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryVendorDatePk()) {
            unionQuery.queryVendorDatePk().reflectRelationOnUnionQuery(baseQuery.queryVendorDatePk(), unionQuery.queryVendorDatePk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorDatePkCQ queryVendorDatePk() {
        return getConditionQueryVendorDatePk();
    }
    protected VendorDatePkCQ _conditionQueryVendorDatePk;
    public VendorDatePkCQ getConditionQueryVendorDatePk() {
        if (_conditionQueryVendorDatePk == null) {
            _conditionQueryVendorDatePk = xcreateQueryVendorDatePk();
            xsetupOuterJoinVendorDatePk();
        }
        return _conditionQueryVendorDatePk;
    }
    protected VendorDatePkCQ xcreateQueryVendorDatePk() {
        String nrp = resolveNextRelationPath("vendor_date_fk", "vendorDatePk");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        VendorDatePkCQ cq = new VendorDatePkCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorDatePk");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorDatePk() {
        VendorDatePkCQ cq = getConditionQueryVendorDatePk();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("bar_date", "foo_date");
        registerOuterJoin(cq, joinOnMap, "vendorDatePk");
    }
    public boolean hasConditionQueryVendorDatePk() {
        return _conditionQueryVendorDatePk != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, VendorDateFkCQ> _scalarConditionMap;
    public Map<String, VendorDateFkCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorDateFkCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorDateFkCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorDateFkCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorDateFkCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, VendorDateFkCQ> _queryMyselfDerivedMap;
    public Map<String, VendorDateFkCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorDateFkCQ subQuery) {
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
    protected Map<String, VendorDateFkCQ> _myselfExistsMap;
    public Map<String, VendorDateFkCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorDateFkCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorDateFkCQ> _myselfInScopeMap;
    public Map<String, VendorDateFkCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorDateFkCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorDateFkCB.class.getName(); }
    protected String xCQ() { return VendorDateFkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
