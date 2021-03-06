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
 * The abstract condition-query of WHITE_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as equal. (NullAllowed: if null, no condition)
     */
    public void setTargetId_Equal(Long targetId) {
        doSetTargetId_Equal(targetId);
    }

    protected void doSetTargetId_Equal(Long targetId) {
        regTargetId(CK_EQ, targetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterThan(Long targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessThan(Long targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterEqual(Long targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessEqual(Long targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of targetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of targetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetIdList The collection of targetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_InScope(Collection<Long> targetIdList) {
        doSetTargetId_InScope(targetIdList);
    }

    protected void doSetTargetId_InScope(Collection<Long> targetIdList) {
        regINS(CK_INS, cTL(targetIdList), getCValueTargetId(), "TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetIdList The collection of targetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_NotInScope(Collection<Long> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Long> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), getCValueTargetId(), "TARGET_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteRefTargetList</span>(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteRefTargetList for 'exists'. (NotNull)
     */
    public void existsWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_ExistsReferrer_WhiteRefTargetList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteRefTargetList");
    }
    public abstract String keepTargetId_ExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteRefTargetList</span>(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of TargetId_NotExistsReferrer_WhiteRefTargetList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_NotExistsReferrer_WhiteRefTargetList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteRefTargetList");
    }
    public abstract String keepTargetId_NotExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefTargetList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_InScopeRelation_WhiteRefTargetList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteRefTargetList");
    }
    public abstract String keepTargetId_InScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefTargetList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_NotInScopeRelation_WhiteRefTargetList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteRefTargetList");
    }
    public abstract String keepTargetId_NotInScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ subQuery);

    public void xsderiveWhiteRefTargetList(String function, SubQuery<WhiteRefTargetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteRefTargetList", aliasName, option);
    }
    public abstract String keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteRefTargetList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteRefTargetCB> derivedWhiteRefTargetList() {
        return xcreateQDRFunctionWhiteRefTargetList();
    }
    protected HpQDRFunction<WhiteRefTargetCB> xcreateQDRFunctionWhiteRefTargetList() {
        return new HpQDRFunction<WhiteRefTargetCB>(new HpQDRSetupper<WhiteRefTargetCB>() {
            public void setup(String function, SubQuery<WhiteRefTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteRefTargetList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteRefTargetList(String function, SubQuery<WhiteRefTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteRefTargetList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ subQuery);
    public abstract String keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setTargetId_IsNull() { regTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setTargetId_IsNotNull() { regTargetId(CK_ISNN, DOBJ); }

    protected void regTargetId(ConditionKey k, Object v) { regQ(k, v, getCValueTargetId(), "TARGET_ID"); }
    abstract protected ConditionValue getCValueTargetId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_Equal(String targetName) {
        doSetTargetName_Equal(fRES(targetName));
    }

    protected void doSetTargetName_Equal(String targetName) {
        regTargetName(CK_EQ, targetName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_NotEqual(String targetName) {
        doSetTargetName_NotEqual(fRES(targetName));
    }

    protected void doSetTargetName_NotEqual(String targetName) {
        regTargetName(CK_NES, targetName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetNameList The collection of targetName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_InScope(Collection<String> targetNameList) {
        doSetTargetName_InScope(targetNameList);
    }

    public void doSetTargetName_InScope(Collection<String> targetNameList) {
        regINS(CK_INS, cTL(targetNameList), getCValueTargetName(), "TARGET_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetNameList The collection of targetName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_NotInScope(Collection<String> targetNameList) {
        doSetTargetName_NotInScope(targetNameList);
    }

    public void doSetTargetName_NotInScope(Collection<String> targetNameList) {
        regINS(CK_NINS, cTL(targetNameList), getCValueTargetName(), "TARGET_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_PrefixSearch(String targetName) {
        setTargetName_LikeSearch(targetName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)} <br />
     * <pre>e.g. setTargetName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param targetName The value of targetName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTargetName_LikeSearch(String targetName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(targetName), getCValueTargetName(), "TARGET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTargetName_NotLikeSearch(String targetName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(targetName), getCValueTargetName(), "TARGET_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNull() { regTargetName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNullOrEmpty() { regTargetName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNotNull() { regTargetName(CK_ISNN, DOBJ); }

    protected void regTargetName(ConditionKey k, Object v) { regQ(k, v, getCValueTargetName(), "TARGET_NAME"); }
    abstract protected ConditionValue getCValueTargetName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteTargetCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteTargetCB>(new HpSSQSetupper<WhiteTargetCB>() {
            public void setup(String function, SubQuery<WhiteTargetCB> subQuery, HpSSQOption<WhiteTargetCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteTargetCB> subQuery, String operand, HpSSQOption<WhiteTargetCB> option) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteTargetCQ subQuery);

    protected WhiteTargetCB xcreateScalarConditionCB() {
        WhiteTargetCB cb = new WhiteTargetCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteTargetCB cb = new WhiteTargetCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteTargetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTargetCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteTargetCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteTargetCB>(new HpQDRSetupper<WhiteTargetCB>() {
            public void setup(String function, SubQuery<WhiteTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteTargetCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteTargetCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteTargetCQ subQuery);

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
    protected String xabCB() { return WhiteTargetCB.class.getName(); }
    protected String xabCQ() { return WhiteTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
