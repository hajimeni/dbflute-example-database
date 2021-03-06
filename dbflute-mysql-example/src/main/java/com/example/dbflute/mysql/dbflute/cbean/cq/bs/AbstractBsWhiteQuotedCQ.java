/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_quoted.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteQuotedCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteQuotedCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_quoted";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as equal. (NullAllowed: if null, no condition)
     */
    public void setSelect_Equal(Integer select) {
        doSetSelect_Equal(select);
    }

    protected void doSetSelect_Equal(Integer select) {
        regSelect(CK_EQ, select);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSelect_GreaterThan(Integer select) {
        regSelect(CK_GT, select);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSelect_LessThan(Integer select) {
        regSelect(CK_LT, select);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSelect_GreaterEqual(Integer select) {
        regSelect(CK_GE, select);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param select The value of select as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSelect_LessEqual(Integer select) {
        regSelect(CK_LE, select);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param minNumber The min number of select. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of select. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSelect_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSelect(), "SELECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param selectList The collection of select as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelect_InScope(Collection<Integer> selectList) {
        doSetSelect_InScope(selectList);
    }

    protected void doSetSelect_InScope(Collection<Integer> selectList) {
        regINS(CK_INS, cTL(selectList), getCValueSelect(), "SELECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     * @param selectList The collection of select as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelect_NotInScope(Collection<Integer> selectList) {
        doSetSelect_NotInScope(selectList);
    }

    protected void doSetSelect_NotInScope(Collection<Integer> selectList) {
        regINS(CK_NINS, cTL(selectList), getCValueSelect(), "SELECT");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteQuotedRefList</span>(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteQuotedRefList for 'exists'. (NotNull)
     */
    public void existsWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteQuotedRefCB>", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelect_ExistsReferrer_WhiteQuotedRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "SELECT", "ORDER", subQueryPropertyName, "whiteQuotedRefList");
    }
    public abstract String keepSelect_ExistsReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteQuotedRefList</span>(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Select_NotExistsReferrer_WhiteQuotedRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteQuotedRefCB>", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelect_NotExistsReferrer_WhiteQuotedRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "SELECT", "ORDER", subQueryPropertyName, "whiteQuotedRefList");
    }
    public abstract String keepSelect_NotExistsReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * @param subQuery The sub-query of WhiteQuotedRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteQuotedRefCB>", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelect_InScopeRelation_WhiteQuotedRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "SELECT", "ORDER", subQueryPropertyName, "whiteQuotedRefList");
    }
    public abstract String keepSelect_InScopeRelation_WhiteQuotedRefList(WhiteQuotedRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ORDER from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * @param subQuery The sub-query of WhiteQuotedRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteQuotedRefList(SubQuery<WhiteQuotedRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteQuotedRefCB>", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelect_NotInScopeRelation_WhiteQuotedRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "SELECT", "ORDER", subQueryPropertyName, "whiteQuotedRefList");
    }
    public abstract String keepSelect_NotInScopeRelation_WhiteQuotedRefList(WhiteQuotedRefCQ subQuery);

    public void xsderiveWhiteQuotedRefList(String function, SubQuery<WhiteQuotedRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteQuotedRefCB>", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelect_SpecifyDerivedReferrer_WhiteQuotedRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "SELECT", "ORDER", subQueryPropertyName, "whiteQuotedRefList", aliasName, option);
    }
    public abstract String keepSelect_SpecifyDerivedReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_quoted_ref where ...)} <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteQuotedRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void query(WhiteQuotedRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteQuotedRefCB> derivedWhiteQuotedRefList() {
        return xcreateQDRFunctionWhiteQuotedRefList();
    }
    protected HpQDRFunction<WhiteQuotedRefCB> xcreateQDRFunctionWhiteQuotedRefList() {
        return new HpQDRFunction<WhiteQuotedRefCB>(new HpQDRSetupper<WhiteQuotedRefCB>() {
            public void setup(String function, SubQuery<WhiteQuotedRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteQuotedRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteQuotedRefList(String function, SubQuery<WhiteQuotedRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteQuotedRefCB>", subQuery);
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSelect_QueryDerivedReferrer_WhiteQuotedRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepSelect_QueryDerivedReferrer_WhiteQuotedRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "SELECT", "ORDER", subQueryPropertyName, "whiteQuotedRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepSelect_QueryDerivedReferrer_WhiteQuotedRefList(WhiteQuotedRefCQ subQuery);
    public abstract String keepSelect_QueryDerivedReferrer_WhiteQuotedRefListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     */
    public void setSelect_IsNull() { regSelect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SELECT: {PK, NotNull, INT(10)}
     */
    public void setSelect_IsNotNull() { regSelect(CK_ISNN, DOBJ); }

    protected void regSelect(ConditionKey k, Object v) { regQ(k, v, getCValueSelect(), "SELECT"); }
    abstract protected ConditionValue getCValueSelect();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_Equal(String from) {
        doSetFrom_Equal(fRES(from));
    }

    protected void doSetFrom_Equal(String from) {
        regFrom(CK_EQ, from);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_NotEqual(String from) {
        doSetFrom_NotEqual(fRES(from));
    }

    protected void doSetFrom_NotEqual(String from) {
        regFrom(CK_NES, from);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param fromList The collection of from as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_InScope(Collection<String> fromList) {
        doSetFrom_InScope(fromList);
    }

    public void doSetFrom_InScope(Collection<String> fromList) {
        regINS(CK_INS, cTL(fromList), getCValueFrom(), "FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param fromList The collection of from as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_NotInScope(Collection<String> fromList) {
        doSetFrom_NotInScope(fromList);
    }

    public void doSetFrom_NotInScope(Collection<String> fromList) {
        regINS(CK_NINS, cTL(fromList), getCValueFrom(), "FROM");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFrom_PrefixSearch(String from) {
        setFrom_LikeSearch(from, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)} <br />
     * <pre>e.g. setFrom_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param from The value of from as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFrom_LikeSearch(String from, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(from), getCValueFrom(), "FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FROM: {VARCHAR(200)}
     * @param from The value of from as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFrom_NotLikeSearch(String from, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(from), getCValueFrom(), "FROM", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     */
    public void setFrom_IsNull() { regFrom(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     */
    public void setFrom_IsNullOrEmpty() { regFrom(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * FROM: {VARCHAR(200)}
     */
    public void setFrom_IsNotNull() { regFrom(CK_ISNN, DOBJ); }

    protected void regFrom(ConditionKey k, Object v) { regQ(k, v, getCValueFrom(), "FROM"); }
    abstract protected ConditionValue getCValueFrom();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteQuotedCB&gt;() {
     *     public void query(WhiteQuotedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteQuotedCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteQuotedCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteQuotedCB>(new HpSSQSetupper<WhiteQuotedCB>() {
            public void setup(String function, SubQuery<WhiteQuotedCB> subQuery, HpSSQOption<WhiteQuotedCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteQuotedCB> subQuery, String operand, HpSSQOption<WhiteQuotedCB> option) {
        assertObjectNotNull("subQuery<WhiteQuotedCB>", subQuery);
        WhiteQuotedCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteQuotedCQ subQuery);

    protected WhiteQuotedCB xcreateScalarConditionCB() {
        WhiteQuotedCB cb = new WhiteQuotedCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteQuotedCB xcreateScalarConditionPartitionByCB() {
        WhiteQuotedCB cb = new WhiteQuotedCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteQuotedCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteQuotedCB>", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "SELECT", "SELECT", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteQuotedCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteQuotedCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteQuotedCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteQuotedCB>(new HpQDRSetupper<WhiteQuotedCB>() {
            public void setup(String function, SubQuery<WhiteQuotedCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteQuotedCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteQuotedCB>", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "SELECT", "SELECT", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteQuotedCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteQuotedCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteQuotedCB>", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteQuotedCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteQuotedCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteQuotedCB>", subQuery);
        WhiteQuotedCB cb = new WhiteQuotedCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteQuotedCQ subQuery);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteQuotedCB.class.getName(); }
    protected String xabCQ() { return WhiteQuotedCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
