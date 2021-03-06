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
 * The abstract condition-query of WHITE_REF_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteRefTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteRefTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_REF_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_Equal(Long refTargetId) {
        doSetRefTargetId_Equal(refTargetId);
    }

    protected void doSetRefTargetId_Equal(Long refTargetId) {
        regRefTargetId(CK_EQ, refTargetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_GreaterThan(Long refTargetId) {
        regRefTargetId(CK_GT, refTargetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_LessThan(Long refTargetId) {
        regRefTargetId(CK_LT, refTargetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_GreaterEqual(Long refTargetId) {
        regRefTargetId(CK_GE, refTargetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_LessEqual(Long refTargetId) {
        regRefTargetId(CK_LE, refTargetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refTargetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefTargetId(), "REF_TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetIdList The collection of refTargetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefTargetId_InScope(Collection<Long> refTargetIdList) {
        doSetRefTargetId_InScope(refTargetIdList);
    }

    protected void doSetRefTargetId_InScope(Collection<Long> refTargetIdList) {
        regINS(CK_INS, cTL(refTargetIdList), getCValueRefTargetId(), "REF_TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetIdList The collection of refTargetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefTargetId_NotInScope(Collection<Long> refTargetIdList) {
        doSetRefTargetId_NotInScope(refTargetIdList);
    }

    protected void doSetRefTargetId_NotInScope(Collection<Long> refTargetIdList) {
        regINS(CK_NINS, cTL(refTargetIdList), getCValueRefTargetId(), "REF_TARGET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefTargetId_IsNull() { regRefTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefTargetId_IsNotNull() { regRefTargetId(CK_ISNN, DOBJ); }

    protected void regRefTargetId(ConditionKey k, Object v) { regQ(k, v, getCValueRefTargetId(), "REF_TARGET_ID"); }
    abstract protected ConditionValue getCValueRefTargetId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
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
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterThan(Long targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessThan(Long targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterEqual(Long targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessEqual(Long targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param minNumber The min number of targetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of targetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
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
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetIdList The collection of targetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_NotInScope(Collection<Long> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Long> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), getCValueTargetId(), "TARGET_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TARGET_ID from WHITE_TARGET where ...)} <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param subQuery The sub-query of WhiteTarget for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteTarget(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_InScopeRelation_WhiteTarget(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteTarget");
    }
    public abstract String keepTargetId_InScopeRelation_WhiteTarget(WhiteTargetCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TARGET_ID from WHITE_TARGET where ...)} <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param subQuery The sub-query of WhiteTarget for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteTarget(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteTargetCB>", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepTargetId_NotInScopeRelation_WhiteTarget(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", subQueryPropertyName, "whiteTarget");
    }
    public abstract String keepTargetId_NotInScopeRelation_WhiteTarget(WhiteTargetCQ subQuery);

    protected void regTargetId(ConditionKey k, Object v) { regQ(k, v, getCValueTargetId(), "TARGET_ID"); }
    abstract protected ConditionValue getCValueTargetId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteRefTargetCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteRefTargetCB>(new HpSSQSetupper<WhiteRefTargetCB>() {
            public void setup(String function, SubQuery<WhiteRefTargetCB> subQuery, HpSSQOption<WhiteRefTargetCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteRefTargetCB> subQuery, String operand, HpSSQOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteRefTargetCQ subQuery);

    protected WhiteRefTargetCB xcreateScalarConditionCB() {
        WhiteRefTargetCB cb = new WhiteRefTargetCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteRefTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteRefTargetCB cb = new WhiteRefTargetCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteRefTargetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "REF_TARGET_ID", "REF_TARGET_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefTargetCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteRefTargetCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteRefTargetCB>(new HpQDRSetupper<WhiteRefTargetCB>() {
            public void setup(String function, SubQuery<WhiteRefTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteRefTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "REF_TARGET_ID", "REF_TARGET_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefTargetCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteRefTargetCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefTargetCB>", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteRefTargetCQ subQuery);

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
    protected String xabCB() { return WhiteRefTargetCB.class.getName(); }
    protected String xabCQ() { return WhiteRefTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
