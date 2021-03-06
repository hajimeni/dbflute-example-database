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
 * The abstract condition-query of nextschema.white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsNextschemaWhiteSameNameRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextschemaWhiteSameNameRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "nextschema.white_same_name_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_Equal(Long sameNameRefId) {
        doSetSameNameRefId_Equal(sameNameRefId);
    }

    protected void doSetSameNameRefId_Equal(Long sameNameRefId) {
        regSameNameRefId(CK_EQ, sameNameRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_GreaterThan(Long sameNameRefId) {
        regSameNameRefId(CK_GT, sameNameRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_LessThan(Long sameNameRefId) {
        regSameNameRefId(CK_LT, sameNameRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_GreaterEqual(Long sameNameRefId) {
        regSameNameRefId(CK_GE, sameNameRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_LessEqual(Long sameNameRefId) {
        regSameNameRefId(CK_LE, sameNameRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of sameNameRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameRefId(), "same_name_ref_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefIdList The collection of sameNameRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameRefId_InScope(Collection<Long> sameNameRefIdList) {
        doSetSameNameRefId_InScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_InScope(Collection<Long> sameNameRefIdList) {
        regINS(CK_INS, cTL(sameNameRefIdList), getCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefIdList The collection of sameNameRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameRefId_NotInScope(Collection<Long> sameNameRefIdList) {
        doSetSameNameRefId_NotInScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_NotInScope(Collection<Long> sameNameRefIdList) {
        regINS(CK_NINS, cTL(sameNameRefIdList), getCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameRefId_IsNull() { regSameNameRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameRefId_IsNotNull() { regSameNameRefId(CK_ISNN, DOBJ); }

    protected void regSameNameRefId(ConditionKey k, Object v) { regQ(k, v, getCValueSameNameRefId(), "same_name_ref_id"); }
    abstract protected ConditionValue getCValueSameNameRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_Equal(Integer sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Integer sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterThan(Integer sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessThan(Integer sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterEqual(Integer sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessEqual(Integer sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_InScope(Collection<Integer> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Integer> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_NotInScope(Collection<Integer> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Integer> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select same_name_id from nextschema.white_same_name where ...)} <br />
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @param subQuery The sub-query of WhiteSameName for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSameName(SubQuery<NextschemaWhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameCB>", subQuery);
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_InScopeRelation_WhiteSameName(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameName");
    }
    public abstract String keepSameNameId_InScopeRelation_WhiteSameName(NextschemaWhiteSameNameCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select same_name_id from nextschema.white_same_name where ...)} <br />
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @param subQuery The sub-query of WhiteSameName for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSameName(SubQuery<NextschemaWhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameCB>", subQuery);
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_NotInScopeRelation_WhiteSameName(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameName");
    }
    public abstract String keepSameNameId_NotInScopeRelation_WhiteSameName(NextschemaWhiteSameNameCQ subQuery);

    protected void regSameNameId(ConditionKey k, Object v) { regQ(k, v, getCValueSameNameId(), "same_name_id"); }
    abstract protected ConditionValue getCValueSameNameId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as equal. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_Equal(java.util.Date nextRefDate) {
        regNextRefDate(CK_EQ,  fCTPD(nextRefDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_GreaterThan(java.util.Date nextRefDate) {
        regNextRefDate(CK_GT,  fCTPD(nextRefDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_LessThan(java.util.Date nextRefDate) {
        regNextRefDate(CK_LT,  fCTPD(nextRefDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_GreaterEqual(java.util.Date nextRefDate) {
        regNextRefDate(CK_GE,  fCTPD(nextRefDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_LessEqual(java.util.Date nextRefDate) {
        regNextRefDate(CK_LE, fCTPD(nextRefDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * <pre>e.g. setNextRefDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nextRefDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nextRefDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setNextRefDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueNextRefDate(), "next_ref_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of nextRefDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of nextRefDate. (NullAllowed: if null, no to-condition)
     */
    public void setNextRefDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setNextRefDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     */
    public void setNextRefDate_IsNull() { regNextRefDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * next_ref_date: {date(13)}
     */
    public void setNextRefDate_IsNotNull() { regNextRefDate(CK_ISNN, DOBJ); }

    protected void regNextRefDate(ConditionKey k, Object v) { regQ(k, v, getCValueNextRefDate(), "next_ref_date"); }
    abstract protected ConditionValue getCValueNextRefDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<NextschemaWhiteSameNameRefCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<NextschemaWhiteSameNameRefCB>(new HpSSQSetupper<NextschemaWhiteSameNameRefCB>() {
            public void setup(String function, SubQuery<NextschemaWhiteSameNameRefCB> subQuery, HpSSQOption<NextschemaWhiteSameNameRefCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<NextschemaWhiteSameNameRefCB> subQuery, String operand, HpSSQOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameRefCB>", subQuery);
        NextschemaWhiteSameNameRefCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(NextschemaWhiteSameNameRefCQ subQuery);

    protected NextschemaWhiteSameNameRefCB xcreateScalarConditionCB() {
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected NextschemaWhiteSameNameRefCB xcreateScalarConditionPartitionByCB() {
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<NextschemaWhiteSameNameRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameRefCB>", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "same_name_ref_id", "same_name_ref_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(NextschemaWhiteSameNameRefCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextschemaWhiteSameNameRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<NextschemaWhiteSameNameRefCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<NextschemaWhiteSameNameRefCB>(new HpQDRSetupper<NextschemaWhiteSameNameRefCB>() {
            public void setup(String function, SubQuery<NextschemaWhiteSameNameRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<NextschemaWhiteSameNameRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameRefCB>", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "same_name_ref_id", "same_name_ref_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(NextschemaWhiteSameNameRefCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<NextschemaWhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameRefCB>", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(NextschemaWhiteSameNameRefCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<NextschemaWhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery<NextschemaWhiteSameNameRefCB>", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(NextschemaWhiteSameNameRefCQ subQuery);

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
    protected String xabCB() { return NextschemaWhiteSameNameRefCB.class.getName(); }
    protected String xabCQ() { return NextschemaWhiteSameNameRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
