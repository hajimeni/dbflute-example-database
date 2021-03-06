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
 * The base condition-query of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseCQ extends AbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from purchase) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PurchaseCIQ xcreateCIQ() {
        PurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PurchaseCIQ xnewCIQ() {
        return new PurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join purchase on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _purchaseId;
    public ConditionValue getPurchaseId() {
        if (_purchaseId == null) { _purchaseId = nCV(); }
        return _purchaseId;
    }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    /** 
     * Add order-by as ascend. <br />
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("purchase_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("purchase_id"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberCQ> _memberId_InScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return _memberId_InScopeRelation_MemberMap; }
    public String keepMemberId_InScopeRelation_Member(MemberCQ subQuery) {
        if (_memberId_InScopeRelation_MemberMap == null) { _memberId_InScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberMap.size() + 1);
        _memberId_InScopeRelation_MemberMap.put(key, subQuery); return "memberId_InScopeRelation_Member." + key;
    }

    protected Map<String, MemberCQ> _memberId_NotInScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return _memberId_NotInScopeRelation_MemberMap; }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberMap == null) { _memberId_NotInScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberMap.size() + 1);
        _memberId_NotInScopeRelation_MemberMap.put(key, subQuery); return "memberId_NotInScopeRelation_Member." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)member_id: {UQ, IX+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)member_id: {UQ, IX+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _productId;
    public ConditionValue getProductId() {
        if (_productId == null) { _productId = nCV(); }
        return _productId;
    }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    protected Map<String, ProductCQ> _productId_InScopeRelation_ProductMap;
    public Map<String, ProductCQ> getProductId_InScopeRelation_Product() { return _productId_InScopeRelation_ProductMap; }
    public String keepProductId_InScopeRelation_Product(ProductCQ subQuery) {
        if (_productId_InScopeRelation_ProductMap == null) { _productId_InScopeRelation_ProductMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productId_InScopeRelation_ProductMap.size() + 1);
        _productId_InScopeRelation_ProductMap.put(key, subQuery); return "productId_InScopeRelation_Product." + key;
    }

    protected Map<String, ProductCQ> _productId_NotInScopeRelation_ProductMap;
    public Map<String, ProductCQ> getProductId_NotInScopeRelation_Product() { return _productId_NotInScopeRelation_ProductMap; }
    public String keepProductId_NotInScopeRelation_Product(ProductCQ subQuery) {
        if (_productId_NotInScopeRelation_ProductMap == null) { _productId_NotInScopeRelation_ProductMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_productId_NotInScopeRelation_ProductMap.size() + 1);
        _productId_NotInScopeRelation_ProductMap.put(key, subQuery); return "productId_NotInScopeRelation_Product." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * (商品ID)product_id: {UQ+, IX, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("product_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ID)product_id: {UQ+, IX, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("product_id"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue getPurchaseDatetime() {
        if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
        return _purchaseDatetime;
    }
    protected ConditionValue getCValuePurchaseDatetime() { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入日時)purchase_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("purchase_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入日時)purchase_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("purchase_datetime"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue getPurchaseCount() {
        if (_purchaseCount == null) { _purchaseCount = nCV(); }
        return _purchaseCount;
    }
    protected ConditionValue getCValuePurchaseCount() { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入数量)purchase_count: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("purchase_count"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入数量)purchase_count: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("purchase_count"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue getPurchasePrice() {
        if (_purchasePrice == null) { _purchasePrice = nCV(); }
        return _purchasePrice;
    }
    protected ConditionValue getCValuePurchasePrice() { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入価格)purchase_price: {IX, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("purchase_price"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入価格)purchase_price: {IX, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("purchase_price"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue getPaymentCompleteFlg() {
        if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
        return _paymentCompleteFlg;
    }
    protected ConditionValue getCValuePaymentCompleteFlg() { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("payment_complete_flg"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("payment_complete_flg"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess() {
        if (_registerProcess == null) { _registerProcess = nCV(); }
        return _registerProcess;
    }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess() {
        if (_updateProcess == null) { _updateProcess = nCV(); }
        return _updateProcess;
    }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br />
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br />
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        PurchaseCQ baseQuery = (PurchaseCQ)baseQueryAsSuper;
        PurchaseCQ unionQuery = (PurchaseCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMember()) {
            unionQuery.queryMember().reflectRelationOnUnionQuery(baseQuery.queryMember(), unionQuery.queryMember());
        }
        if (baseQuery.hasConditionQueryProduct()) {
            unionQuery.queryProduct().reflectRelationOnUnionQuery(baseQuery.queryProduct(), unionQuery.queryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)member by my member_id, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    protected MemberCQ _conditionQueryMember;
    public MemberCQ getConditionQueryMember() {
        if (_conditionQueryMember == null) {
            _conditionQueryMember = xcreateQueryMember();
            xsetupOuterJoinMember();
        }
        return _conditionQueryMember;
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = resolveNextRelationPath("purchase", "member");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberCQ cq = new MemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("member");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMember() {
        MemberCQ cq = getConditionQueryMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("member_id", "member_id");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    public boolean hasConditionQueryMember() {
        return _conditionQueryMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (商品)product by my product_id, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return getConditionQueryProduct();
    }
    protected ProductCQ _conditionQueryProduct;
    public ProductCQ getConditionQueryProduct() {
        if (_conditionQueryProduct == null) {
            _conditionQueryProduct = xcreateQueryProduct();
            xsetupOuterJoinProduct();
        }
        return _conditionQueryProduct;
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = resolveNextRelationPath("purchase", "product");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        ProductCQ cq = new ProductCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("product");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinProduct() {
        ProductCQ cq = getConditionQueryProduct();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("product_id", "product_id");
        registerOuterJoin(cq, joinOnMap, "product");
    }
    public boolean hasConditionQueryProduct() {
        return _conditionQueryProduct != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, PurchaseCQ> _scalarConditionMap;
    public Map<String, PurchaseCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(PurchaseCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, PurchaseCQ> _specifyMyselfDerivedMap;
    public Map<String, PurchaseCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(PurchaseCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, PurchaseCQ> _queryMyselfDerivedMap;
    public Map<String, PurchaseCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(PurchaseCQ subQuery) {
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
    protected Map<String, PurchaseCQ> _myselfExistsMap;
    public Map<String, PurchaseCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(PurchaseCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, PurchaseCQ> _myselfInScopeMap;
    public Map<String, PurchaseCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(PurchaseCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PurchaseCB.class.getName(); }
    protected String xCQ() { return PurchaseCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
