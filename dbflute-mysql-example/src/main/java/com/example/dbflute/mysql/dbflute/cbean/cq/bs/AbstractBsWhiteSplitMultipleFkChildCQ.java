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
 * The abstract condition-query of white_split_multiple_fk_child.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkChildCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkChildCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_split_multiple_fk_child";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as equal. (NullAllowed: if null, no condition)
     */
    public void setChildId_Equal(Long childId) {
        doSetChildId_Equal(childId);
    }

    protected void doSetChildId_Equal(Long childId) {
        regChildId(CK_EQ, childId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setChildId_GreaterThan(Long childId) {
        regChildId(CK_GT, childId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setChildId_LessThan(Long childId) {
        regChildId(CK_LT, childId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setChildId_GreaterEqual(Long childId) {
        regChildId(CK_GE, childId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setChildId_LessEqual(Long childId) {
        regChildId(CK_LE, childId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of childId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of childId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChildId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueChildId(), "CHILD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childIdList The collection of childId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildId_InScope(Collection<Long> childIdList) {
        doSetChildId_InScope(childIdList);
    }

    protected void doSetChildId_InScope(Collection<Long> childIdList) {
        regINS(CK_INS, cTL(childIdList), getCValueChildId(), "CHILD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childIdList The collection of childId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildId_NotInScope(Collection<Long> childIdList) {
        doSetChildId_NotInScope(childIdList);
    }

    protected void doSetChildId_NotInScope(Collection<Long> childIdList) {
        regINS(CK_NINS, cTL(childIdList), getCValueChildId(), "CHILD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setChildId_IsNull() { regChildId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setChildId_IsNotNull() { regChildId(CK_ISNN, DOBJ); }

    protected void regChildId(ConditionKey k, Object v) { regQ(k, v, getCValueChildId(), "CHILD_ID"); }
    abstract protected ConditionValue getCValueChildId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as equal. (NullAllowed: if null, no condition)
     */
    public void setBaseId_Equal(Long baseId) {
        doSetBaseId_Equal(baseId);
    }

    protected void doSetBaseId_Equal(Long baseId) {
        regBaseId(CK_EQ, baseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBaseId_GreaterThan(Long baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBaseId_LessThan(Long baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBaseId_GreaterEqual(Long baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBaseId_LessEqual(Long baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param minNumber The min number of baseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of baseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseIdList The collection of baseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBaseId_InScope(Collection<Long> baseIdList) {
        doSetBaseId_InScope(baseIdList);
    }

    protected void doSetBaseId_InScope(Collection<Long> baseIdList) {
        regINS(CK_INS, cTL(baseIdList), getCValueBaseId(), "BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseIdList The collection of baseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBaseId_NotInScope(Collection<Long> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Long> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), getCValueBaseId(), "BASE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BASE_ID from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkBase for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSplitMultipleFkBase(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_InScopeRelation_WhiteSplitMultipleFkBase(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkBase");
    }
    public abstract String keepBaseId_InScopeRelation_WhiteSplitMultipleFkBase(WhiteSplitMultipleFkBaseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BASE_ID from white_split_multiple_fk_base where ...)} <br />
     * white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @param subQuery The sub-query of WhiteSplitMultipleFkBase for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSplitMultipleFkBase(SubQuery<WhiteSplitMultipleFkBaseCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkBaseCB>", subQuery);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkBase(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BASE_ID", "BASE_ID", subQueryPropertyName, "whiteSplitMultipleFkBase");
    }
    public abstract String keepBaseId_NotInScopeRelation_WhiteSplitMultipleFkBase(WhiteSplitMultipleFkBaseCQ subQuery);

    protected void regBaseId(ConditionKey k, Object v) { regQ(k, v, getCValueBaseId(), "BASE_ID"); }
    abstract protected ConditionValue getCValueBaseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildName_Equal(String childName) {
        doSetChildName_Equal(fRES(childName));
    }

    protected void doSetChildName_Equal(String childName) {
        regChildName(CK_EQ, childName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildName_NotEqual(String childName) {
        doSetChildName_NotEqual(fRES(childName));
    }

    protected void doSetChildName_NotEqual(String childName) {
        regChildName(CK_NES, childName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childNameList The collection of childName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildName_InScope(Collection<String> childNameList) {
        doSetChildName_InScope(childNameList);
    }

    public void doSetChildName_InScope(Collection<String> childNameList) {
        regINS(CK_INS, cTL(childNameList), getCValueChildName(), "CHILD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childNameList The collection of childName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildName_NotInScope(Collection<String> childNameList) {
        doSetChildName_NotInScope(childNameList);
    }

    public void doSetChildName_NotInScope(Collection<String> childNameList) {
        regINS(CK_NINS, cTL(childNameList), getCValueChildName(), "CHILD_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setChildName_PrefixSearch(String childName) {
        setChildName_LikeSearch(childName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setChildName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param childName The value of childName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setChildName_LikeSearch(String childName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(childName), getCValueChildName(), "CHILD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setChildName_NotLikeSearch(String childName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(childName), getCValueChildName(), "CHILD_NAME", likeSearchOption);
    }

    protected void regChildName(ConditionKey k, Object v) { regQ(k, v, getCValueChildName(), "CHILD_NAME"); }
    abstract protected ConditionValue getCValueChildName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkChildCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkChildCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkChildCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkChildCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkChildCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSplitMultipleFkChildCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteSplitMultipleFkChildCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteSplitMultipleFkChildCB>(new HpSSQSetupper<WhiteSplitMultipleFkChildCB>() {
            public void setup(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, HpSSQOption<WhiteSplitMultipleFkChildCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String operand, HpSSQOption<WhiteSplitMultipleFkChildCB> option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkChildCQ subQuery);

    protected WhiteSplitMultipleFkChildCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteSplitMultipleFkChildCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "CHILD_ID", "CHILD_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSplitMultipleFkChildCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkChildCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteSplitMultipleFkChildCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteSplitMultipleFkChildCB>(new HpQDRSetupper<WhiteSplitMultipleFkChildCB>() {
            public void setup(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteSplitMultipleFkChildCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "CHILD_ID", "CHILD_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteSplitMultipleFkChildCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteSplitMultipleFkChildCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSplitMultipleFkChildCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSplitMultipleFkChildCB>", subQuery);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteSplitMultipleFkChildCQ subQuery);

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
    protected String xabCB() { return WhiteSplitMultipleFkChildCB.class.getName(); }
    protected String xabCQ() { return WhiteSplitMultipleFkChildCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
