package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "product";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    public void setProductId_Equal(Integer productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProductId(), "product_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Integer> productIdList) {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "product_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Integer> productIdList) {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "product_id");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select product_id from purchase where ...)} <br />
     * (購入)purchase by product_id, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseList for 'exists'. (NotNull)
     */
    public void existsPurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_ExistsReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "product_id", "product_id", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepProductId_ExistsReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select product_id from purchase where ...)} <br />
     * (購入)purchase by product_id, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductId_NotExistsReferrer_PurchaseList for 'not exists'. (NotNull)
     */
    public void notExistsPurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_NotExistsReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "product_id", "product_id", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepProductId_NotExistsReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select product_id from purchase where ...)} <br />
     * (購入)purchase by product_id, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'in-scope'. (NotNull)
     */
    public void inScopePurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_InScopeRelation_PurchaseList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "product_id", "product_id", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepProductId_InScopeRelation_PurchaseList(PurchaseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select product_id from purchase where ...)} <br />
     * (購入)purchase by product_id, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchaseList(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_NotInScopeRelation_PurchaseList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "product_id", "product_id", subQueryPropertyName, "purchaseList");
    }
    public abstract String keepProductId_NotInScopeRelation_PurchaseList(PurchaseCQ subQuery);

    public void xsderivePurchaseList(String function, SubQuery<PurchaseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_SpecifyDerivedReferrer_PurchaseList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "product_id", "product_id", subQueryPropertyName, "purchaseList", aliasName, option);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from purchase where ...)} <br />
     * (購入)purchase by product_id, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedPurchaseList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> derivedPurchaseList() {
        return xcreateQDRFunctionPurchaseList();
    }
    protected HpQDRFunction<PurchaseCB> xcreateQDRFunctionPurchaseList() {
        return new HpQDRFunction<PurchaseCB>(new HpQDRSetupper<PurchaseCB>() {
            public void setup(String function, SubQuery<PurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderivePurchaseList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderivePurchaseList(String function, SubQuery<PurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_QueryDerivedReferrer_PurchaseList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductId_QueryDerivedReferrer_PurchaseListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "product_id", "product_id", subQueryPropertyName, "purchaseList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductId_QueryDerivedReferrer_PurchaseList(PurchaseCQ subQuery);
    public abstract String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey k, Object v) { regQ(k, v, getCValueProductId(), "product_id"); }
    abstract protected ConditionValue getCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @param productName The value of productName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_Equal(String productName) {
        doSetProductName_Equal(fRES(productName));
    }

    protected void doSetProductName_Equal(String productName) {
        regProductName(CK_EQ, productName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @param productName The value of productName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotEqual(String productName) {
        doSetProductName_NotEqual(fRES(productName));
    }

    protected void doSetProductName_NotEqual(String productName) {
        regProductName(CK_NES, productName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @param productNameList The collection of productName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_InScope(Collection<String> productNameList) {
        doSetProductName_InScope(productNameList);
    }

    public void doSetProductName_InScope(Collection<String> productNameList) {
        regINS(CK_INS, cTL(productNameList), getCValueProductName(), "product_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @param productNameList The collection of productName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotInScope(Collection<String> productNameList) {
        doSetProductName_NotInScope(productNameList);
    }

    public void doSetProductName_NotInScope(Collection<String> productNameList) {
        regINS(CK_NINS, cTL(productNameList), getCValueProductName(), "product_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @param productName The value of productName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_PrefixSearch(String productName) {
        setProductName_LikeSearch(productName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)} <br />
     * <pre>e.g. setProductName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productName The value of productName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productName), getCValueProductName(), "product_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品名称)product_name: {IX, NotNull, varchar(50)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), getCValueProductName(), "product_name", likeSearchOption);
    }

    protected void regProductName(ConditionKey k, Object v) { regQ(k, v, getCValueProductName(), "product_name"); }
    abstract protected ConditionValue getCValueProductName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @param productHandleCode The value of productHandleCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_Equal(String productHandleCode) {
        doSetProductHandleCode_Equal(fRES(productHandleCode));
    }

    protected void doSetProductHandleCode_Equal(String productHandleCode) {
        regProductHandleCode(CK_EQ, productHandleCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @param productHandleCode The value of productHandleCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_NotEqual(String productHandleCode) {
        doSetProductHandleCode_NotEqual(fRES(productHandleCode));
    }

    protected void doSetProductHandleCode_NotEqual(String productHandleCode) {
        regProductHandleCode(CK_NES, productHandleCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @param productHandleCodeList The collection of productHandleCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_InScope(Collection<String> productHandleCodeList) {
        doSetProductHandleCode_InScope(productHandleCodeList);
    }

    public void doSetProductHandleCode_InScope(Collection<String> productHandleCodeList) {
        regINS(CK_INS, cTL(productHandleCodeList), getCValueProductHandleCode(), "product_handle_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @param productHandleCodeList The collection of productHandleCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_NotInScope(Collection<String> productHandleCodeList) {
        doSetProductHandleCode_NotInScope(productHandleCodeList);
    }

    public void doSetProductHandleCode_NotInScope(Collection<String> productHandleCodeList) {
        regINS(CK_NINS, cTL(productHandleCodeList), getCValueProductHandleCode(), "product_handle_code");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @param productHandleCode The value of productHandleCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_PrefixSearch(String productHandleCode) {
        setProductHandleCode_LikeSearch(productHandleCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)} <br />
     * <pre>e.g. setProductHandleCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productHandleCode The value of productHandleCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductHandleCode_LikeSearch(String productHandleCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productHandleCode), getCValueProductHandleCode(), "product_handle_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)}
     * @param productHandleCode The value of productHandleCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductHandleCode_NotLikeSearch(String productHandleCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productHandleCode), getCValueProductHandleCode(), "product_handle_code", likeSearchOption);
    }

    protected void regProductHandleCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductHandleCode(), "product_handle_code"); }
    abstract protected ConditionValue getCValueProductHandleCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @param productCategoryCode The value of productCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_Equal(String productCategoryCode) {
        doSetProductCategoryCode_Equal(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_Equal(String productCategoryCode) {
        regProductCategoryCode(CK_EQ, productCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @param productCategoryCode The value of productCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_NotEqual(String productCategoryCode) {
        doSetProductCategoryCode_NotEqual(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_NotEqual(String productCategoryCode) {
        regProductCategoryCode(CK_NES, productCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @param productCategoryCodeList The collection of productCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_InScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        regINS(CK_INS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "product_category_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @param productCategoryCodeList The collection of productCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_NotInScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        regINS(CK_NINS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "product_category_code");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @param productCategoryCode The value of productCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_PrefixSearch(String productCategoryCode) {
        setProductCategoryCode_LikeSearch(productCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category} <br />
     * <pre>e.g. setProductCategoryCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryCode The value of productCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryCode_LikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryCode), getCValueProductCategoryCode(), "product_category_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @param productCategoryCode The value of productCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryCode_NotLikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryCode), getCValueProductCategoryCode(), "product_category_code", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select product_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by my product_category_code, named 'productCategory'.
     * @param subQuery The sub-query of ProductCategory for 'in-scope'. (NotNull)
     */
    public void inScopeProductCategory(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_InScopeRelation_ProductCategory(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productCategory");
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductCategory(ProductCategoryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select product_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by my product_category_code, named 'productCategory'.
     * @param subQuery The sub-query of ProductCategory for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductCategory(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotInScopeRelation_ProductCategory(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productCategory");
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductCategory(ProductCategoryCQ subQuery);

    protected void regProductCategoryCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductCategoryCode(), "product_category_code"); }
    abstract protected ConditionValue getCValueProductCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, productStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, productStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), getCValueProductStatusCode(), "product_status_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_NotInScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regINS(CK_NINS, cTL(productStatusCodeList), getCValueProductStatusCode(), "product_status_code");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        setProductStatusCode_LikeSearch(productStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status} <br />
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "product_status_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "product_status_code", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select product_status_code from product_status where ...)} <br />
     * (商品ステータス)product_status by my product_status_code, named 'productStatus'.
     * @param subQuery The sub-query of ProductStatus for 'in-scope'. (NotNull)
     */
    public void inScopeProductStatus(SubQuery<ProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<ProductStatusCB>", subQuery);
        ProductStatusCB cb = new ProductStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_InScopeRelation_ProductStatus(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "product_status_code", "product_status_code", subQueryPropertyName, "productStatus");
    }
    public abstract String keepProductStatusCode_InScopeRelation_ProductStatus(ProductStatusCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select product_status_code from product_status where ...)} <br />
     * (商品ステータス)product_status by my product_status_code, named 'productStatus'.
     * @param subQuery The sub-query of ProductStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductStatus(SubQuery<ProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<ProductStatusCB>", subQuery);
        ProductStatusCB cb = new ProductStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotInScopeRelation_ProductStatus(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "product_status_code", "product_status_code", subQueryPropertyName, "productStatus");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_ProductStatus(ProductStatusCQ subQuery);

    protected void regProductStatusCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductStatusCode(), "product_status_code"); }
    abstract protected ConditionValue getCValueProductStatusCode();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPrice The value of regularPrice as equal. (NullAllowed: if null, no condition)
     */
    public void setRegularPrice_Equal(Integer regularPrice) {
        doSetRegularPrice_Equal(regularPrice);
    }

    protected void doSetRegularPrice_Equal(Integer regularPrice) {
        regRegularPrice(CK_EQ, regularPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPrice The value of regularPrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegularPrice_GreaterThan(Integer regularPrice) {
        regRegularPrice(CK_GT, regularPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPrice The value of regularPrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegularPrice_LessThan(Integer regularPrice) {
        regRegularPrice(CK_LT, regularPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPrice The value of regularPrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegularPrice_GreaterEqual(Integer regularPrice) {
        regRegularPrice(CK_GE, regularPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPrice The value of regularPrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegularPrice_LessEqual(Integer regularPrice) {
        regRegularPrice(CK_LE, regularPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param minNumber The min number of regularPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of regularPrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRegularPrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRegularPrice(), "regular_price", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPriceList The collection of regularPrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegularPrice_InScope(Collection<Integer> regularPriceList) {
        doSetRegularPrice_InScope(regularPriceList);
    }

    protected void doSetRegularPrice_InScope(Collection<Integer> regularPriceList) {
        regINS(CK_INS, cTL(regularPriceList), getCValueRegularPrice(), "regular_price");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * regular_price: {NotNull, int4(10)}
     * @param regularPriceList The collection of regularPrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegularPrice_NotInScope(Collection<Integer> regularPriceList) {
        doSetRegularPrice_NotInScope(regularPriceList);
    }

    protected void doSetRegularPrice_NotInScope(Collection<Integer> regularPriceList) {
        regINS(CK_NINS, cTL(regularPriceList), getCValueRegularPrice(), "regular_price");
    }

    protected void regRegularPrice(ConditionKey k, Object v) { regQ(k, v, getCValueRegularPrice(), "regular_price"); }
    abstract protected ConditionValue getCValueRegularPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRegisterDatetime(), "register_datetime", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setRegisterDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regRegisterDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterDatetime(), "register_datetime"); }
    abstract protected ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * register_user: {NotNull, varchar(200)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    public void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), getCValueRegisterUser(), "register_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * register_user: {NotNull, varchar(200)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    public void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), getCValueRegisterUser(), "register_user");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * register_user: {NotNull, varchar(200)} <br />
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), getCValueRegisterUser(), "register_user", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterUser(), "register_user"); }
    abstract protected ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotEqual(String registerProcess) {
        doSetRegisterProcess_NotEqual(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_NotEqual(String registerProcess) {
        regRegisterProcess(CK_NES, registerProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * register_process: {NotNull, varchar(200)}
     * @param registerProcessList The collection of registerProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_InScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_InScope(registerProcessList);
    }

    public void doSetRegisterProcess_InScope(Collection<String> registerProcessList) {
        regINS(CK_INS, cTL(registerProcessList), getCValueRegisterProcess(), "register_process");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * register_process: {NotNull, varchar(200)}
     * @param registerProcessList The collection of registerProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_NotInScope(registerProcessList);
    }

    public void doSetRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        regINS(CK_NINS, cTL(registerProcessList), getCValueRegisterProcess(), "register_process");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_PrefixSearch(String registerProcess) {
        setRegisterProcess_LikeSearch(registerProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * register_process: {NotNull, varchar(200)} <br />
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerProcess), getCValueRegisterProcess(), "register_process", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerProcess), getCValueRegisterProcess(), "register_process", likeSearchOption);
    }

    protected void regRegisterProcess(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterProcess(), "register_process"); }
    abstract protected ConditionValue getCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueUpdateDatetime(), "update_datetime", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setUpdateDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regUpdateDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateDatetime(), "update_datetime"); }
    abstract protected ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * update_user: {NotNull, varchar(200)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    public void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), getCValueUpdateUser(), "update_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * update_user: {NotNull, varchar(200)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    public void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), getCValueUpdateUser(), "update_user");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * update_user: {NotNull, varchar(200)} <br />
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), getCValueUpdateUser(), "update_user", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateUser(), "update_user"); }
    abstract protected ConditionValue getCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotEqual(String updateProcess) {
        doSetUpdateProcess_NotEqual(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_NotEqual(String updateProcess) {
        regUpdateProcess(CK_NES, updateProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * update_process: {NotNull, varchar(200)}
     * @param updateProcessList The collection of updateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_InScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_InScope(updateProcessList);
    }

    public void doSetUpdateProcess_InScope(Collection<String> updateProcessList) {
        regINS(CK_INS, cTL(updateProcessList), getCValueUpdateProcess(), "update_process");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * update_process: {NotNull, varchar(200)}
     * @param updateProcessList The collection of updateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_NotInScope(updateProcessList);
    }

    public void doSetUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        regINS(CK_NINS, cTL(updateProcessList), getCValueUpdateProcess(), "update_process");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_PrefixSearch(String updateProcess) {
        setUpdateProcess_LikeSearch(updateProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * update_process: {NotNull, varchar(200)} <br />
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateProcess), getCValueUpdateProcess(), "update_process", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateProcess), getCValueUpdateProcess(), "update_process", likeSearchOption);
    }

    protected void regUpdateProcess(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateProcess(), "update_process"); }
    abstract protected ConditionValue getCValueUpdateProcess();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "version_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "version_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * version_no: {NotNull, int8(19)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "version_no");
    }

    protected void regVersionNo(ConditionKey k, Object v) { regQ(k, v, getCValueVersionNo(), "version_no"); }
    abstract protected ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ProductCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<ProductCB>(new HpSSQSetupper<ProductCB>() {
            public void setup(String function, SubQuery<ProductCB> subQuery, HpSSQOption<ProductCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<ProductCB> subQuery, String operand, HpSSQOption<ProductCB> option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(ProductCQ subQuery);

    protected ProductCB xcreateScalarConditionCB() {
        ProductCB cb = new ProductCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ProductCB xcreateScalarConditionPartitionByCB() {
        ProductCB cb = new ProductCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<ProductCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "product_id", "product_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(ProductCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<ProductCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ProductCB>(new HpQDRSetupper<ProductCB>() {
            public void setup(String function, SubQuery<ProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<ProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "product_id", "product_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(ProductCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(ProductCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(ProductCQ subQuery);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.seasar.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return ProductCB.class.getName(); }
    protected String xabCQ() { return ProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
