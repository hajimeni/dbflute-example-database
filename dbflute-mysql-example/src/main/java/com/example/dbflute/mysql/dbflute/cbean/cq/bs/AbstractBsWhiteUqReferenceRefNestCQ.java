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
 * The abstract condition-query of white_uq_reference_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqReferenceRefNestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqReferenceRefNestCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_reference_ref_nest";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestId The value of uqReferenceRefNestId as equal. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefNestId_Equal(Long uqReferenceRefNestId) {
        doSetUqReferenceRefNestId_Equal(uqReferenceRefNestId);
    }

    protected void doSetUqReferenceRefNestId_Equal(Long uqReferenceRefNestId) {
        regUqReferenceRefNestId(CK_EQ, uqReferenceRefNestId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestId The value of uqReferenceRefNestId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefNestId_GreaterThan(Long uqReferenceRefNestId) {
        regUqReferenceRefNestId(CK_GT, uqReferenceRefNestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestId The value of uqReferenceRefNestId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefNestId_LessThan(Long uqReferenceRefNestId) {
        regUqReferenceRefNestId(CK_LT, uqReferenceRefNestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestId The value of uqReferenceRefNestId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefNestId_GreaterEqual(Long uqReferenceRefNestId) {
        regUqReferenceRefNestId(CK_GE, uqReferenceRefNestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestId The value of uqReferenceRefNestId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefNestId_LessEqual(Long uqReferenceRefNestId) {
        regUqReferenceRefNestId(CK_LE, uqReferenceRefNestId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqReferenceRefNestId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqReferenceRefNestId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqReferenceRefNestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqReferenceRefNestId(), "UQ_REFERENCE_REF_NEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestIdList The collection of uqReferenceRefNestId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceRefNestId_InScope(Collection<Long> uqReferenceRefNestIdList) {
        doSetUqReferenceRefNestId_InScope(uqReferenceRefNestIdList);
    }

    protected void doSetUqReferenceRefNestId_InScope(Collection<Long> uqReferenceRefNestIdList) {
        regINS(CK_INS, cTL(uqReferenceRefNestIdList), getCValueUqReferenceRefNestId(), "UQ_REFERENCE_REF_NEST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqReferenceRefNestIdList The collection of uqReferenceRefNestId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceRefNestId_NotInScope(Collection<Long> uqReferenceRefNestIdList) {
        doSetUqReferenceRefNestId_NotInScope(uqReferenceRefNestIdList);
    }

    protected void doSetUqReferenceRefNestId_NotInScope(Collection<Long> uqReferenceRefNestIdList) {
        regINS(CK_NINS, cTL(uqReferenceRefNestIdList), getCValueUqReferenceRefNestId(), "UQ_REFERENCE_REF_NEST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqReferenceRefNestId_IsNull() { regUqReferenceRefNestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqReferenceRefNestId_IsNotNull() { regUqReferenceRefNestId(CK_ISNN, DOBJ); }

    protected void regUqReferenceRefNestId(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceRefNestId(), "UQ_REFERENCE_REF_NEST_ID"); }
    abstract protected ConditionValue getCValueUqReferenceRefNestId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_Equal(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_EQ, compoundUqFirstCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_NotEqual(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_NES, compoundUqFirstCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_InScope(compoundUqFirstCodeList);
    }

    public void doSetCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_INS, cTL(compoundUqFirstCodeList), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_NotInScope(compoundUqFirstCodeList);
    }

    public void doSetCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_NINS, cTL(compoundUqFirstCodeList), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_PrefixSearch(String compoundUqFirstCode) {
        setCompoundUqFirstCode_LikeSearch(compoundUqFirstCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref} <br />
     * <pre>e.g. setCompoundUqFirstCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqFirstCode The value of compoundUqFirstCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_LikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqFirstCode), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_NotLikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqFirstCode), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    protected void regCompoundUqFirstCode(ConditionKey k, Object v) { regQ(k, v, getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE"); }
    abstract protected ConditionValue getCValueCompoundUqFirstCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_Equal(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_EQ, compoundUqSecondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_NotEqual(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_NES, compoundUqSecondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_InScope(compoundUqSecondCodeList);
    }

    public void doSetCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_INS, cTL(compoundUqSecondCodeList), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_NotInScope(compoundUqSecondCodeList);
    }

    public void doSetCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_NINS, cTL(compoundUqSecondCodeList), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_PrefixSearch(String compoundUqSecondCode) {
        setCompoundUqSecondCode_LikeSearch(compoundUqSecondCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref} <br />
     * <pre>e.g. setCompoundUqSecondCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqSecondCode The value of compoundUqSecondCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_LikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqSecondCode), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_NotLikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqSecondCode), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    protected void regCompoundUqSecondCode(ConditionKey k, Object v) { regQ(k, v, getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE"); }
    abstract protected ConditionValue getCValueCompoundUqSecondCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void query(WhiteUqReferenceRefNestCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceRefNestCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void query(WhiteUqReferenceRefNestCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceRefNestCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void query(WhiteUqReferenceRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceRefNestCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void query(WhiteUqReferenceRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceRefNestCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void query(WhiteUqReferenceRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceRefNestCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void query(WhiteUqReferenceRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqReferenceRefNestCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteUqReferenceRefNestCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteUqReferenceRefNestCB>(new HpSSQSetupper<WhiteUqReferenceRefNestCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceRefNestCB> subQuery, HpSSQOption<WhiteUqReferenceRefNestCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteUqReferenceRefNestCB> subQuery, String operand, HpSSQOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefNestCB>", subQuery);
        WhiteUqReferenceRefNestCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteUqReferenceRefNestCQ subQuery);

    protected WhiteUqReferenceRefNestCB xcreateScalarConditionCB() {
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteUqReferenceRefNestCB xcreateScalarConditionPartitionByCB() {
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteUqReferenceRefNestCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefNestCB>", subQuery);
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "UQ_REFERENCE_REF_NEST_ID", "UQ_REFERENCE_REF_NEST_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqReferenceRefNestCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqReferenceRefNestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteUqReferenceRefNestCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteUqReferenceRefNestCB>(new HpQDRSetupper<WhiteUqReferenceRefNestCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceRefNestCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteUqReferenceRefNestCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefNestCB>", subQuery);
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "UQ_REFERENCE_REF_NEST_ID", "UQ_REFERENCE_REF_NEST_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqReferenceRefNestCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqReferenceRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefNestCB>", subQuery);
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteUqReferenceRefNestCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteUqReferenceRefNestCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceRefNestCB>", subQuery);
        WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteUqReferenceRefNestCQ subQuery);

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
    protected String xabCB() { return WhiteUqReferenceRefNestCB.class.getName(); }
    protected String xabCQ() { return WhiteUqReferenceRefNestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
