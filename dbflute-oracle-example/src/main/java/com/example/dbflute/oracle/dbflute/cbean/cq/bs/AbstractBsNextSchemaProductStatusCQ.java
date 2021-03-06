package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public abstract class AbstractBsNextSchemaProductStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextSchemaProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "NEXT_SCHEMA_PRODUCT_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_NotInScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regINS(CK_NINS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        setProductStatusCode_LikeSearch(productStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteRefNextTargetList</span>(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteRefNextTargetList for 'exists'. (NotNull)
     */
    public void existsWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", subQueryPropertyName, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsNextSchemaProductList</span>(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextSchemaProductList for 'exists'. (NotNull)
     */
    public void existsNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_ExistsReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_NextSchemaProductList(NextSchemaProductCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteRefNextTargetList</span>(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", subQueryPropertyName, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsNextSchemaProductList</span>(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductStatusCode_NotExistsReferrer_NextSchemaProductList for 'not exists'. (NotNull)
     */
    public void notExistsNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(NextSchemaProductCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefNextTargetList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", subQueryPropertyName, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * @param subQuery The sub-query of NextSchemaProductList for 'in-scope'. (NotNull)
     */
    public void inScopeNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_InScopeRelation_NextSchemaProductList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_InScopeRelation_NextSchemaProductList(NextSchemaProductCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefNextTargetList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", subQueryPropertyName, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * @param subQuery The sub-query of NextSchemaProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(NextSchemaProductCQ subQuery);

    public void xsderiveWhiteRefNextTargetList(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", subQueryPropertyName, "whiteRefNextTargetList", aliasName, option);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ subQuery);

    public void xsderiveNextSchemaProductList(String function, SubQuery<NextSchemaProductCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductList", aliasName, option);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteRefNextTargetList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextTargetCB> derivedWhiteRefNextTargetList() {
        return xcreateQDRFunctionWhiteRefNextTargetList();
    }
    protected HpQDRFunction<WhiteRefNextTargetCB> xcreateQDRFunctionWhiteRefNextTargetList() {
        return new HpQDRFunction<WhiteRefNextTargetCB>(new HpQDRSetupper<WhiteRefNextTargetCB>() {
            public void setup(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteRefNextTargetList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteRefNextTargetList(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", subQueryPropertyName, "whiteRefNextTargetList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ subQuery);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedNextSchemaProductList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductCB> derivedNextSchemaProductList() {
        return xcreateQDRFunctionNextSchemaProductList();
    }
    protected HpQDRFunction<NextSchemaProductCB> xcreateQDRFunctionNextSchemaProductList() {
        return new HpQDRFunction<NextSchemaProductCB>(new HpQDRSetupper<NextSchemaProductCB>() {
            public void setup(String function, SubQuery<NextSchemaProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveNextSchemaProductList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveNextSchemaProductList(String function, SubQuery<NextSchemaProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ subQuery);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNull() { regProductStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNotNull() { regProductStatusCode(CK_ISNN, DOBJ); }

    protected void regProductStatusCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    abstract protected ConditionValue getCValueProductStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_Equal(String productStatusName) {
        doSetProductStatusName_Equal(fRES(productStatusName));
    }

    protected void doSetProductStatusName_Equal(String productStatusName) {
        regProductStatusName(CK_EQ, productStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotEqual(String productStatusName) {
        doSetProductStatusName_NotEqual(fRES(productStatusName));
    }

    protected void doSetProductStatusName_NotEqual(String productStatusName) {
        regProductStatusName(CK_NES, productStatusName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusNameList The collection of productStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_InScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_InScope(productStatusNameList);
    }

    public void doSetProductStatusName_InScope(Collection<String> productStatusNameList) {
        regINS(CK_INS, cTL(productStatusNameList), getCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusNameList The collection of productStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotInScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_NotInScope(productStatusNameList);
    }

    public void doSetProductStatusName_NotInScope(Collection<String> productStatusNameList) {
        regINS(CK_NINS, cTL(productStatusNameList), getCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_PrefixSearch(String productStatusName) {
        setProductStatusName_LikeSearch(productStatusName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusName_LikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusName), getCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusName_NotLikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusName), getCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    protected void regProductStatusName(ConditionKey k, Object v) { regQ(k, v, getCValueProductStatusName(), "PRODUCT_STATUS_NAME"); }
    abstract protected ConditionValue getCValueProductStatusName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<NextSchemaProductStatusCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<NextSchemaProductStatusCB>(new HpSSQSetupper<NextSchemaProductStatusCB>() {
            public void setup(String function, SubQuery<NextSchemaProductStatusCB> subQuery, HpSSQOption<NextSchemaProductStatusCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<NextSchemaProductStatusCB> subQuery, String operand, HpSSQOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(NextSchemaProductStatusCQ subQuery);

    protected NextSchemaProductStatusCB xcreateScalarConditionCB() {
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected NextSchemaProductStatusCB xcreateScalarConditionPartitionByCB() {
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<NextSchemaProductStatusCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(NextSchemaProductStatusCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<NextSchemaProductStatusCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<NextSchemaProductStatusCB>(new HpQDRSetupper<NextSchemaProductStatusCB>() {
            public void setup(String function, SubQuery<NextSchemaProductStatusCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<NextSchemaProductStatusCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(NextSchemaProductStatusCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(NextSchemaProductStatusCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(NextSchemaProductStatusCQ subQuery);

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
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return NextSchemaProductStatusCB.class.getName(); }
    protected String xabCQ() { return NextSchemaProductStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
