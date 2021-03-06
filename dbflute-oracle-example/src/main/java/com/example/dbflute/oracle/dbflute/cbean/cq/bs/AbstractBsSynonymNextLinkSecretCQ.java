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
 * The abstract condition-query of SYNONYM_NEXT_LINK_SECRET.
 * @author oracleman
 */
public abstract class AbstractBsSynonymNextLinkSecretCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymNextLinkSecretCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_NEXT_LINK_SECRET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_Equal(String secretCode) {
        doSetSecretCode_Equal(fRES(secretCode));
    }

    protected void doSetSecretCode_Equal(String secretCode) {
        regSecretCode(CK_EQ, hSC("SECRET_CODE", secretCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_NotEqual(String secretCode) {
        doSetSecretCode_NotEqual(fRES(secretCode));
    }

    protected void doSetSecretCode_NotEqual(String secretCode) {
        regSecretCode(CK_NES, hSC("SECRET_CODE", secretCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCodeList The collection of secretCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_InScope(Collection<String> secretCodeList) {
        doSetSecretCode_InScope(secretCodeList);
    }

    public void doSetSecretCode_InScope(Collection<String> secretCodeList) {
        regINS(CK_INS, cTL(secretCodeList), getCValueSecretCode(), "SECRET_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCodeList The collection of secretCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_NotInScope(Collection<String> secretCodeList) {
        doSetSecretCode_NotInScope(secretCodeList);
    }

    public void doSetSecretCode_NotInScope(Collection<String> secretCodeList) {
        regINS(CK_NINS, cTL(secretCodeList), getCValueSecretCode(), "SECRET_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_PrefixSearch(String secretCode) {
        setSecretCode_LikeSearch(secretCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setSecretCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretCode The value of secretCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretCode_LikeSearch(String secretCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretCode), getCValueSecretCode(), "SECRET_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretCode_NotLikeSearch(String secretCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretCode), getCValueSecretCode(), "SECRET_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretCode_IsNull() { regSecretCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretCode_IsNotNull() { regSecretCode(CK_ISNN, DOBJ); }

    protected void regSecretCode(ConditionKey k, Object v) { regQ(k, v, getCValueSecretCode(), "SECRET_CODE"); }
    abstract protected ConditionValue getCValueSecretCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_Equal(String secretName) {
        doSetSecretName_Equal(fRES(secretName));
    }

    protected void doSetSecretName_Equal(String secretName) {
        regSecretName(CK_EQ, secretName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_NotEqual(String secretName) {
        doSetSecretName_NotEqual(fRES(secretName));
    }

    protected void doSetSecretName_NotEqual(String secretName) {
        regSecretName(CK_NES, secretName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretNameList The collection of secretName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_InScope(Collection<String> secretNameList) {
        doSetSecretName_InScope(secretNameList);
    }

    public void doSetSecretName_InScope(Collection<String> secretNameList) {
        regINS(CK_INS, cTL(secretNameList), getCValueSecretName(), "SECRET_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretNameList The collection of secretName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_NotInScope(Collection<String> secretNameList) {
        doSetSecretName_NotInScope(secretNameList);
    }

    public void doSetSecretName_NotInScope(Collection<String> secretNameList) {
        regINS(CK_NINS, cTL(secretNameList), getCValueSecretName(), "SECRET_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_PrefixSearch(String secretName) {
        setSecretName_LikeSearch(secretName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setSecretName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretName The value of secretName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretName_LikeSearch(String secretName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretName), getCValueSecretName(), "SECRET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretName_NotLikeSearch(String secretName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretName), getCValueSecretName(), "SECRET_NAME", likeSearchOption);
    }

    protected void regSecretName(ConditionKey k, Object v) { regQ(k, v, getCValueSecretName(), "SECRET_NAME"); }
    abstract protected ConditionValue getCValueSecretName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_Equal(String secretAuthCode) {
        doSetSecretAuthCode_Equal(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_Equal(String secretAuthCode) {
        regSecretAuthCode(CK_EQ, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_NotEqual(String secretAuthCode) {
        doSetSecretAuthCode_NotEqual(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_NotEqual(String secretAuthCode) {
        regSecretAuthCode(CK_NES, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_InScope(secretAuthCodeList);
    }

    public void doSetSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        regINS(CK_INS, cTL(secretAuthCodeList), getCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_NotInScope(secretAuthCodeList);
    }

    public void doSetSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        regINS(CK_NINS, cTL(secretAuthCodeList), getCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_PrefixSearch(String secretAuthCode) {
        setSecretAuthCode_LikeSearch(secretAuthCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)} <br />
     * <pre>e.g. setSecretAuthCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretAuthCode The value of secretAuthCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretAuthCode_LikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretAuthCode), getCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretAuthCode_NotLikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretAuthCode), getCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNull() { regSecretAuthCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNullOrEmpty() { regSecretAuthCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNotNull() { regSecretAuthCode(CK_ISNN, DOBJ); }

    protected void regSecretAuthCode(ConditionKey k, Object v) { regQ(k, v, getCValueSecretAuthCode(), "SECRET_AUTH_CODE"); }
    abstract protected ConditionValue getCValueSecretAuthCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<SynonymNextLinkSecretCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<SynonymNextLinkSecretCB>(new HpSSQSetupper<SynonymNextLinkSecretCB>() {
            public void setup(String function, SubQuery<SynonymNextLinkSecretCB> subQuery, HpSSQOption<SynonymNextLinkSecretCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<SynonymNextLinkSecretCB> subQuery, String operand, HpSSQOption<SynonymNextLinkSecretCB> option) {
        assertObjectNotNull("subQuery<SynonymNextLinkSecretCB>", subQuery);
        SynonymNextLinkSecretCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(SynonymNextLinkSecretCQ subQuery);

    protected SynonymNextLinkSecretCB xcreateScalarConditionCB() {
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected SynonymNextLinkSecretCB xcreateScalarConditionPartitionByCB() {
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<SynonymNextLinkSecretCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SynonymNextLinkSecretCB>", subQuery);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "SECRET_CODE", "SECRET_CODE", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymNextLinkSecretCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymNextLinkSecretCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<SynonymNextLinkSecretCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<SynonymNextLinkSecretCB>(new HpQDRSetupper<SynonymNextLinkSecretCB>() {
            public void setup(String function, SubQuery<SynonymNextLinkSecretCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<SynonymNextLinkSecretCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SynonymNextLinkSecretCB>", subQuery);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "SECRET_CODE", "SECRET_CODE", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(SynonymNextLinkSecretCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymNextLinkSecretCB> subQuery) {
        assertObjectNotNull("subQuery<SynonymNextLinkSecretCB>", subQuery);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(SynonymNextLinkSecretCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SynonymNextLinkSecretCB> subQuery) {
        assertObjectNotNull("subQuery<SynonymNextLinkSecretCB>", subQuery);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(SynonymNextLinkSecretCQ subQuery);

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
    protected String xabCB() { return SynonymNextLinkSecretCB.class.getName(); }
    protected String xabCQ() { return SynonymNextLinkSecretCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
