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
 * The abstract condition-query of next_schema_product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsNextSchemaProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextSchemaProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "next_schema_product";
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
     * {exists (select NEXT_SCHEMA_PRODUCT_ID from white_same_name where ...)} <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteSameNameList</span>(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSameNameList for 'exists'. (NotNull)
     */
    public void existsWhiteSameNameList(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_ExistsReferrer_WhiteSameNameList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "product_id", "NEXT_SCHEMA_PRODUCT_ID", subQueryPropertyName, "whiteSameNameList");
    }
    public abstract String keepProductId_ExistsReferrer_WhiteSameNameList(WhiteSameNameCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select NEXT_SCHEMA_PRODUCT_ID from white_same_name where ...)} <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteSameNameList</span>(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductId_NotExistsReferrer_WhiteSameNameList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSameNameList(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_NotExistsReferrer_WhiteSameNameList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "product_id", "NEXT_SCHEMA_PRODUCT_ID", subQueryPropertyName, "whiteSameNameList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhiteSameNameList(WhiteSameNameCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_SCHEMA_PRODUCT_ID from white_same_name where ...)} <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameAsOne'.
     * @param subQuery The sub-query of WhiteSameNameList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSameNameList(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_InScopeRelation_WhiteSameNameList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "product_id", "NEXT_SCHEMA_PRODUCT_ID", subQueryPropertyName, "whiteSameNameList");
    }
    public abstract String keepProductId_InScopeRelation_WhiteSameNameList(WhiteSameNameCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_SCHEMA_PRODUCT_ID from white_same_name where ...)} <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameAsOne'.
     * @param subQuery The sub-query of WhiteSameNameList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSameNameList(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_NotInScopeRelation_WhiteSameNameList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "product_id", "NEXT_SCHEMA_PRODUCT_ID", subQueryPropertyName, "whiteSameNameList");
    }
    public abstract String keepProductId_NotInScopeRelation_WhiteSameNameList(WhiteSameNameCQ subQuery);

    public void xsderiveWhiteSameNameList(String function, SubQuery<WhiteSameNameCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_SpecifyDerivedReferrer_WhiteSameNameList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "product_id", "NEXT_SCHEMA_PRODUCT_ID", subQueryPropertyName, "whiteSameNameList", aliasName, option);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_same_name where ...)} <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteSameNameList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameCB> derivedWhiteSameNameList() {
        return xcreateQDRFunctionWhiteSameNameList();
    }
    protected HpQDRFunction<WhiteSameNameCB> xcreateQDRFunctionWhiteSameNameList() {
        return new HpQDRFunction<WhiteSameNameCB>(new HpQDRSetupper<WhiteSameNameCB>() {
            public void setup(String function, SubQuery<WhiteSameNameCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteSameNameList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteSameNameList(String function, SubQuery<WhiteSameNameCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductId_QueryDerivedReferrer_WhiteSameNameList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductId_QueryDerivedReferrer_WhiteSameNameListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "product_id", "NEXT_SCHEMA_PRODUCT_ID", subQueryPropertyName, "whiteSameNameList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ subQuery);
    public abstract String keepProductId_QueryDerivedReferrer_WhiteSameNameListParameter(Object parameterValue);

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
     * product_name: {NotNull, varchar(200)}
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
     * product_name: {NotNull, varchar(200)}
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
     * product_name: {NotNull, varchar(200)}
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
     * product_name: {NotNull, varchar(200)}
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
     * product_name: {NotNull, varchar(200)}
     * @param productName The value of productName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_PrefixSearch(String productName) {
        setProductName_LikeSearch(productName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * product_name: {NotNull, varchar(200)} <br />
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
     * product_name: {NotNull, varchar(200)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), getCValueProductName(), "product_name", likeSearchOption);
    }

    protected void regProductName(ConditionKey k, Object v) { regQ(k, v, getCValueProductName(), "product_name"); }
    abstract protected ConditionValue getCValueProductName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<NextSchemaProductCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<NextSchemaProductCB>(new HpSSQSetupper<NextSchemaProductCB>() {
            public void setup(String function, SubQuery<NextSchemaProductCB> subQuery, HpSSQOption<NextSchemaProductCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<NextSchemaProductCB> subQuery, String operand, HpSSQOption<NextSchemaProductCB> option) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(NextSchemaProductCQ subQuery);

    protected NextSchemaProductCB xcreateScalarConditionCB() {
        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected NextSchemaProductCB xcreateScalarConditionPartitionByCB() {
        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<NextSchemaProductCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "product_id", "product_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(NextSchemaProductCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<NextSchemaProductCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<NextSchemaProductCB>(new HpQDRSetupper<NextSchemaProductCB>() {
            public void setup(String function, SubQuery<NextSchemaProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<NextSchemaProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "product_id", "product_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(NextSchemaProductCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(NextSchemaProductCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(NextSchemaProductCQ subQuery);

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
    protected String xabCB() { return NextSchemaProductCB.class.getName(); }
    protected String xabCQ() { return NextSchemaProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
