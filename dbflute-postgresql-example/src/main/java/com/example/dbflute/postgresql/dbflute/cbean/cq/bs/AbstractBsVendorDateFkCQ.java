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
 * The abstract condition-query of vendor_date_fk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorDateFkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorDateFkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_date_fk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as equal. (NullAllowed: if null, no condition)
     */
    public void setBarId_Equal(Integer barId) {
        doSetBarId_Equal(barId);
    }

    protected void doSetBarId_Equal(Integer barId) {
        regBarId(CK_EQ, barId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBarId_GreaterThan(Integer barId) {
        regBarId(CK_GT, barId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBarId_LessThan(Integer barId) {
        regBarId(CK_LT, barId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBarId_GreaterEqual(Integer barId) {
        regBarId(CK_GE, barId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBarId_LessEqual(Integer barId) {
        regBarId(CK_LE, barId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of barId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of barId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBarId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBarId(), "bar_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barIdList The collection of barId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarId_InScope(Collection<Integer> barIdList) {
        doSetBarId_InScope(barIdList);
    }

    protected void doSetBarId_InScope(Collection<Integer> barIdList) {
        regINS(CK_INS, cTL(barIdList), getCValueBarId(), "bar_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     * @param barIdList The collection of barId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarId_NotInScope(Collection<Integer> barIdList) {
        doSetBarId_NotInScope(barIdList);
    }

    protected void doSetBarId_NotInScope(Collection<Integer> barIdList) {
        regINS(CK_NINS, cTL(barIdList), getCValueBarId(), "bar_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     */
    public void setBarId_IsNull() { regBarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, int4(10)}
     */
    public void setBarId_IsNotNull() { regBarId(CK_ISNN, DOBJ); }

    protected void regBarId(ConditionKey k, Object v) { regQ(k, v, getCValueBarId(), "bar_id"); }
    abstract protected ConditionValue getCValueBarId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as equal. (NullAllowed: if null, no condition)
     */
    public void setBarDate_Equal(java.util.Date barDate) {
        regBarDate(CK_EQ,  fCTPD(barDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBarDate_GreaterThan(java.util.Date barDate) {
        regBarDate(CK_GT,  fCTPD(barDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBarDate_LessThan(java.util.Date barDate) {
        regBarDate(CK_LT,  fCTPD(barDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBarDate_GreaterEqual(java.util.Date barDate) {
        regBarDate(CK_GE,  fCTPD(barDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBarDate_LessEqual(java.util.Date barDate) {
        regBarDate(CK_LE, fCTPD(barDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * <pre>e.g. setBarDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of barDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of barDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBarDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueBarDate(), "bar_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of barDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of barDate. (NullAllowed: if null, no to-condition)
     */
    public void setBarDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setBarDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDateList The collection of barDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarDate_InScope(Collection<java.util.Date> barDateList) {
        doSetBarDate_InScope(barDateList);
    }

    protected void doSetBarDate_InScope(Collection<java.util.Date> barDateList) {
        regINS(CK_INS, cTL(barDateList), getCValueBarDate(), "bar_date");
    }

    protected void regBarDate(ConditionKey k, Object v) { regQ(k, v, getCValueBarDate(), "bar_date"); }
    abstract protected ConditionValue getCValueBarDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorDateFkCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorDateFkCB>(new HpSSQSetupper<VendorDateFkCB>() {
            public void setup(String function, SubQuery<VendorDateFkCB> subQuery, HpSSQOption<VendorDateFkCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorDateFkCB> subQuery, String operand, HpSSQOption<VendorDateFkCB> option) {
        assertObjectNotNull("subQuery<VendorDateFkCB>", subQuery);
        VendorDateFkCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorDateFkCQ subQuery);

    protected VendorDateFkCB xcreateScalarConditionCB() {
        VendorDateFkCB cb = new VendorDateFkCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorDateFkCB xcreateScalarConditionPartitionByCB() {
        VendorDateFkCB cb = new VendorDateFkCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorDateFkCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorDateFkCB>", subQuery);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "bar_id", "bar_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorDateFkCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorDateFkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorDateFkCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorDateFkCB>(new HpQDRSetupper<VendorDateFkCB>() {
            public void setup(String function, SubQuery<VendorDateFkCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorDateFkCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorDateFkCB>", subQuery);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "bar_id", "bar_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorDateFkCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorDateFkCB> subQuery) {
        assertObjectNotNull("subQuery<VendorDateFkCB>", subQuery);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorDateFkCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorDateFkCB> subQuery) {
        assertObjectNotNull("subQuery<VendorDateFkCB>", subQuery);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorDateFkCQ subQuery);

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
    protected String xabCB() { return VendorDateFkCB.class.getName(); }
    protected String xabCQ() { return VendorDateFkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
