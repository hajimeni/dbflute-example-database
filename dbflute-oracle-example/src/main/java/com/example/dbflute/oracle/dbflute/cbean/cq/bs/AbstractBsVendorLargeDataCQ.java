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
 * The abstract condition-query of VENDOR_LARGE_DATA.
 * @author oracleman
 */
public abstract class AbstractBsVendorLargeDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_LARGE_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as equal. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_Equal(Long largeDataId) {
        doSetLargeDataId_Equal(largeDataId);
    }

    protected void doSetLargeDataId_Equal(Long largeDataId) {
        regLargeDataId(CK_EQ, largeDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterThan(Long largeDataId) {
        regLargeDataId(CK_GT, largeDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessThan(Long largeDataId) {
        regLargeDataId(CK_LT, largeDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterEqual(Long largeDataId) {
        regLargeDataId(CK_GE, largeDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessEqual(Long largeDataId) {
        regLargeDataId(CK_LE, largeDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param minNumber The min number of largeDataId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of largeDataId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLargeDataId(), "LARGE_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataIdList The collection of largeDataId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_InScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_InScope(largeDataIdList);
    }

    protected void doSetLargeDataId_InScope(Collection<Long> largeDataIdList) {
        regINS(CK_INS, cTL(largeDataIdList), getCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataIdList The collection of largeDataId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_NotInScope(largeDataIdList);
    }

    protected void doSetLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        regINS(CK_NINS, cTL(largeDataIdList), getCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select LARGE_DATA_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsVendorLargeDataRefList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorLargeDataRefList for 'exists'. (NotNull)
     */
    public void existsVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select LARGE_DATA_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorLargeDataRefList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LargeDataId_NotExistsReferrer_VendorLargeDataRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LARGE_DATA_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_InScopeRelation_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_InScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LARGE_DATA_ID from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ subQuery);

    public void xsderiveVendorLargeDataRefList(String function, SubQuery<VendorLargeDataRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeDataRefList", aliasName, option);
    }
    public abstract String keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_LARGE_DATA_REF where ...)} <br />
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedVendorLargeDataRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataRefCB> derivedVendorLargeDataRefList() {
        return xcreateQDRFunctionVendorLargeDataRefList();
    }
    protected HpQDRFunction<VendorLargeDataRefCB> xcreateQDRFunctionVendorLargeDataRefList() {
        return new HpQDRFunction<VendorLargeDataRefCB>(new HpQDRSetupper<VendorLargeDataRefCB>() {
            public void setup(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveVendorLargeDataRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveVendorLargeDataRefList(String function, SubQuery<VendorLargeDataRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataRefCB>", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "vendorLargeDataRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ subQuery);
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     */
    public void setLargeDataId_IsNull() { regLargeDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     */
    public void setLargeDataId_IsNotNull() { regLargeDataId(CK_ISNN, DOBJ); }

    protected void regLargeDataId(ConditionKey k, Object v) { regQ(k, v, getCValueLargeDataId(), "LARGE_DATA_ID"); }
    abstract protected ConditionValue getCValueLargeDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_Equal(String stringIndex) {
        doSetStringIndex_Equal(fRES(stringIndex));
    }

    protected void doSetStringIndex_Equal(String stringIndex) {
        regStringIndex(CK_EQ, stringIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_NotEqual(String stringIndex) {
        doSetStringIndex_NotEqual(fRES(stringIndex));
    }

    protected void doSetStringIndex_NotEqual(String stringIndex) {
        regStringIndex(CK_NES, stringIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndexList The collection of stringIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_InScope(Collection<String> stringIndexList) {
        doSetStringIndex_InScope(stringIndexList);
    }

    public void doSetStringIndex_InScope(Collection<String> stringIndexList) {
        regINS(CK_INS, cTL(stringIndexList), getCValueStringIndex(), "STRING_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndexList The collection of stringIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_NotInScope(Collection<String> stringIndexList) {
        doSetStringIndex_NotInScope(stringIndexList);
    }

    public void doSetStringIndex_NotInScope(Collection<String> stringIndexList) {
        regINS(CK_NINS, cTL(stringIndexList), getCValueStringIndex(), "STRING_INDEX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_PrefixSearch(String stringIndex) {
        setStringIndex_LikeSearch(stringIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br />
     * <pre>e.g. setStringIndex_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringIndex The value of stringIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringIndex_LikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringIndex), getCValueStringIndex(), "STRING_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringIndex_NotLikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringIndex), getCValueStringIndex(), "STRING_INDEX", likeSearchOption);
    }

    protected void regStringIndex(ConditionKey k, Object v) { regQ(k, v, getCValueStringIndex(), "STRING_INDEX"); }
    abstract protected ConditionValue getCValueStringIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_Equal(String stringNoIndex) {
        doSetStringNoIndex_Equal(fRES(stringNoIndex));
    }

    protected void doSetStringNoIndex_Equal(String stringNoIndex) {
        regStringNoIndex(CK_EQ, stringNoIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_NotEqual(String stringNoIndex) {
        doSetStringNoIndex_NotEqual(fRES(stringNoIndex));
    }

    protected void doSetStringNoIndex_NotEqual(String stringNoIndex) {
        regStringNoIndex(CK_NES, stringNoIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndexList The collection of stringNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_InScope(stringNoIndexList);
    }

    public void doSetStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        regINS(CK_INS, cTL(stringNoIndexList), getCValueStringNoIndex(), "STRING_NO_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndexList The collection of stringNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_NotInScope(stringNoIndexList);
    }

    public void doSetStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        regINS(CK_NINS, cTL(stringNoIndexList), getCValueStringNoIndex(), "STRING_NO_INDEX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_PrefixSearch(String stringNoIndex) {
        setStringNoIndex_LikeSearch(stringNoIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br />
     * <pre>e.g. setStringNoIndex_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringNoIndex The value of stringNoIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringNoIndex_LikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringNoIndex), getCValueStringNoIndex(), "STRING_NO_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringNoIndex_NotLikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringNoIndex), getCValueStringNoIndex(), "STRING_NO_INDEX", likeSearchOption);
    }

    protected void regStringNoIndex(ConditionKey k, Object v) { regQ(k, v, getCValueStringNoIndex(), "STRING_NO_INDEX"); }
    abstract protected ConditionValue getCValueStringNoIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_Equal(String stringUniqueIndex) {
        doSetStringUniqueIndex_Equal(fRES(stringUniqueIndex));
    }

    protected void doSetStringUniqueIndex_Equal(String stringUniqueIndex) {
        regStringUniqueIndex(CK_EQ, stringUniqueIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_NotEqual(String stringUniqueIndex) {
        doSetStringUniqueIndex_NotEqual(fRES(stringUniqueIndex));
    }

    protected void doSetStringUniqueIndex_NotEqual(String stringUniqueIndex) {
        regStringUniqueIndex(CK_NES, stringUniqueIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_InScope(stringUniqueIndexList);
    }

    public void doSetStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_INS, cTL(stringUniqueIndexList), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_NotInScope(stringUniqueIndexList);
    }

    public void doSetStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_NINS, cTL(stringUniqueIndexList), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_PrefixSearch(String stringUniqueIndex) {
        setStringUniqueIndex_LikeSearch(stringUniqueIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br />
     * <pre>e.g. setStringUniqueIndex_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringUniqueIndex The value of stringUniqueIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringUniqueIndex_LikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringUniqueIndex), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringUniqueIndex_NotLikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringUniqueIndex), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX", likeSearchOption);
    }

    protected void regStringUniqueIndex(ConditionKey k, Object v) { regQ(k, v, getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX"); }
    abstract protected ConditionValue getCValueStringUniqueIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_Equal(Integer intflgIndex) {
        doSetIntflgIndex_Equal(intflgIndex);
    }

    protected void doSetIntflgIndex_Equal(Integer intflgIndex) {
        regIntflgIndex(CK_EQ, intflgIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_GreaterThan(Integer intflgIndex) {
        regIntflgIndex(CK_GT, intflgIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_LessThan(Integer intflgIndex) {
        regIntflgIndex(CK_LT, intflgIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_GreaterEqual(Integer intflgIndex) {
        regIntflgIndex(CK_GE, intflgIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_LessEqual(Integer intflgIndex) {
        regIntflgIndex(CK_LE, intflgIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param minNumber The min number of intflgIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of intflgIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIntflgIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueIntflgIndex(), "INTFLG_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndexList The collection of intflgIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_InScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        regINS(CK_INS, cTL(intflgIndexList), getCValueIntflgIndex(), "INTFLG_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndexList The collection of intflgIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_NotInScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        regINS(CK_NINS, cTL(intflgIndexList), getCValueIntflgIndex(), "INTFLG_INDEX");
    }

    protected void regIntflgIndex(ConditionKey k, Object v) { regQ(k, v, getCValueIntflgIndex(), "INTFLG_INDEX"); }
    abstract protected ConditionValue getCValueIntflgIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_Equal(Integer numericIntegerIndex) {
        doSetNumericIntegerIndex_Equal(numericIntegerIndex);
    }

    protected void doSetNumericIntegerIndex_Equal(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_EQ, numericIntegerIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_GreaterThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GT, numericIntegerIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_LessThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LT, numericIntegerIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_GreaterEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GE, numericIntegerIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_LessEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LE, numericIntegerIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param minNumber The min number of numericIntegerIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numericIntegerIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_InScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_INS, cTL(numericIntegerIndexList), getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_NotInScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_NINS, cTL(numericIntegerIndexList), getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX");
    }

    protected void regNumericIntegerIndex(ConditionKey k, Object v) { regQ(k, v, getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX"); }
    abstract protected ConditionValue getCValueNumericIntegerIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_Equal(Integer numericIntegerNoIndex) {
        doSetNumericIntegerNoIndex_Equal(numericIntegerNoIndex);
    }

    protected void doSetNumericIntegerNoIndex_Equal(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_EQ, numericIntegerNoIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_GreaterThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GT, numericIntegerNoIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_LessThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LT, numericIntegerNoIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_GreaterEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GE, numericIntegerNoIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_LessEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LE, numericIntegerNoIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param minNumber The min number of numericIntegerNoIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numericIntegerNoIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerNoIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_InScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_INS, cTL(numericIntegerNoIndexList), getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_NotInScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_NINS, cTL(numericIntegerNoIndexList), getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX");
    }

    protected void regNumericIntegerNoIndex(ConditionKey k, Object v) { regQ(k, v, getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX"); }
    abstract protected ConditionValue getCValueNumericIntegerNoIndex();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorLargeDataCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorLargeDataCB>(new HpSSQSetupper<VendorLargeDataCB>() {
            public void setup(String function, SubQuery<VendorLargeDataCB> subQuery, HpSSQOption<VendorLargeDataCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorLargeDataCB> subQuery, String operand, HpSSQOption<VendorLargeDataCB> option) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorLargeDataCQ subQuery);

    protected VendorLargeDataCB xcreateScalarConditionCB() {
        VendorLargeDataCB cb = new VendorLargeDataCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorLargeDataCB xcreateScalarConditionPartitionByCB() {
        VendorLargeDataCB cb = new VendorLargeDataCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorLargeDataCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeDataCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorLargeDataCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorLargeDataCB>(new HpQDRSetupper<VendorLargeDataCB>() {
            public void setup(String function, SubQuery<VendorLargeDataCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorLargeDataCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeDataCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeDataCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorLargeDataCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorLargeDataCB> subQuery) {
        assertObjectNotNull("subQuery<VendorLargeDataCB>", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorLargeDataCQ subQuery);

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
    protected String xabCB() { return VendorLargeDataCB.class.getName(); }
    protected String xabCQ() { return VendorLargeDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
