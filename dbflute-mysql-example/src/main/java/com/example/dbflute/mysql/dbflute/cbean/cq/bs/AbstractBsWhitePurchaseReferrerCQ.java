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
 * The abstract condition-query of white_purchase_referrer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePurchaseReferrerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePurchaseReferrerCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_purchase_referrer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseReferrerId_Equal(Long purchaseReferrerId) {
        doSetPurchaseReferrerId_Equal(purchaseReferrerId);
    }

    protected void doSetPurchaseReferrerId_Equal(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_EQ, purchaseReferrerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseReferrerId_GreaterThan(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_GT, purchaseReferrerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseReferrerId_LessThan(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_LT, purchaseReferrerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseReferrerId_GreaterEqual(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_GE, purchaseReferrerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseReferrerId_LessEqual(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_LE, purchaseReferrerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param minNumber The min number of purchaseReferrerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseReferrerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseReferrerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerIdList The collection of purchaseReferrerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerId_InScope(Collection<Long> purchaseReferrerIdList) {
        doSetPurchaseReferrerId_InScope(purchaseReferrerIdList);
    }

    protected void doSetPurchaseReferrerId_InScope(Collection<Long> purchaseReferrerIdList) {
        regINS(CK_INS, cTL(purchaseReferrerIdList), getCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerIdList The collection of purchaseReferrerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerId_NotInScope(Collection<Long> purchaseReferrerIdList) {
        doSetPurchaseReferrerId_NotInScope(purchaseReferrerIdList);
    }

    protected void doSetPurchaseReferrerId_NotInScope(Collection<Long> purchaseReferrerIdList) {
        regINS(CK_NINS, cTL(purchaseReferrerIdList), getCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PURCHASE_REFERRER_ID from purchase where ...)} <br />
     * (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @param subQuery The sub-query of Purchase for 'in-scope'. (NotNull)
     */
    public void inScopePurchase(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPurchaseReferrerId_InScopeRelation_Purchase(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PURCHASE_REFERRER_ID", "PURCHASE_ID", subQueryPropertyName, "purchase");
    }
    public abstract String keepPurchaseReferrerId_InScopeRelation_Purchase(PurchaseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PURCHASE_REFERRER_ID from purchase where ...)} <br />
     * (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @param subQuery The sub-query of Purchase for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchase(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<PurchaseCB>", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPurchaseReferrerId_NotInScopeRelation_Purchase(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PURCHASE_REFERRER_ID", "PURCHASE_ID", subQueryPropertyName, "purchase");
    }
    public abstract String keepPurchaseReferrerId_NotInScopeRelation_Purchase(PurchaseCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     */
    public void setPurchaseReferrerId_IsNull() { regPurchaseReferrerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     */
    public void setPurchaseReferrerId_IsNotNull() { regPurchaseReferrerId(CK_ISNN, DOBJ); }

    protected void regPurchaseReferrerId(ConditionKey k, Object v) { regQ(k, v, getCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID"); }
    abstract protected ConditionValue getCValuePurchaseReferrerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_Equal(String purchaseReferrerName) {
        doSetPurchaseReferrerName_Equal(fRES(purchaseReferrerName));
    }

    protected void doSetPurchaseReferrerName_Equal(String purchaseReferrerName) {
        regPurchaseReferrerName(CK_EQ, purchaseReferrerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_NotEqual(String purchaseReferrerName) {
        doSetPurchaseReferrerName_NotEqual(fRES(purchaseReferrerName));
    }

    protected void doSetPurchaseReferrerName_NotEqual(String purchaseReferrerName) {
        regPurchaseReferrerName(CK_NES, purchaseReferrerName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerNameList The collection of purchaseReferrerName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_InScope(Collection<String> purchaseReferrerNameList) {
        doSetPurchaseReferrerName_InScope(purchaseReferrerNameList);
    }

    public void doSetPurchaseReferrerName_InScope(Collection<String> purchaseReferrerNameList) {
        regINS(CK_INS, cTL(purchaseReferrerNameList), getCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerNameList The collection of purchaseReferrerName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_NotInScope(Collection<String> purchaseReferrerNameList) {
        doSetPurchaseReferrerName_NotInScope(purchaseReferrerNameList);
    }

    public void doSetPurchaseReferrerName_NotInScope(Collection<String> purchaseReferrerNameList) {
        regINS(CK_NINS, cTL(purchaseReferrerNameList), getCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_PrefixSearch(String purchaseReferrerName) {
        setPurchaseReferrerName_LikeSearch(purchaseReferrerName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setPurchaseReferrerName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseReferrerName The value of purchaseReferrerName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseReferrerName_LikeSearch(String purchaseReferrerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseReferrerName), getCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseReferrerName_NotLikeSearch(String purchaseReferrerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseReferrerName), getCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME", likeSearchOption);
    }

    protected void regPurchaseReferrerName(ConditionKey k, Object v) { regQ(k, v, getCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME"); }
    abstract protected ConditionValue getCValuePurchaseReferrerName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePurchaseReferrerCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePurchaseReferrerCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePurchaseReferrerCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePurchaseReferrerCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePurchaseReferrerCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePurchaseReferrerCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhitePurchaseReferrerCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhitePurchaseReferrerCB>(new HpSSQSetupper<WhitePurchaseReferrerCB>() {
            public void setup(String function, SubQuery<WhitePurchaseReferrerCB> subQuery, HpSSQOption<WhitePurchaseReferrerCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhitePurchaseReferrerCB> subQuery, String operand, HpSSQOption<WhitePurchaseReferrerCB> option) {
        assertObjectNotNull("subQuery<WhitePurchaseReferrerCB>", subQuery);
        WhitePurchaseReferrerCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhitePurchaseReferrerCQ subQuery);

    protected WhitePurchaseReferrerCB xcreateScalarConditionCB() {
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhitePurchaseReferrerCB xcreateScalarConditionPartitionByCB() {
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhitePurchaseReferrerCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhitePurchaseReferrerCB>", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "PURCHASE_REFERRER_ID", "PURCHASE_REFERRER_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePurchaseReferrerCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePurchaseReferrerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhitePurchaseReferrerCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhitePurchaseReferrerCB>(new HpQDRSetupper<WhitePurchaseReferrerCB>() {
            public void setup(String function, SubQuery<WhitePurchaseReferrerCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhitePurchaseReferrerCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhitePurchaseReferrerCB>", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "PURCHASE_REFERRER_ID", "PURCHASE_REFERRER_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhitePurchaseReferrerCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePurchaseReferrerCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePurchaseReferrerCB>", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhitePurchaseReferrerCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhitePurchaseReferrerCB> subQuery) {
        assertObjectNotNull("subQuery<WhitePurchaseReferrerCB>", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhitePurchaseReferrerCQ subQuery);

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
    protected String xabCB() { return WhitePurchaseReferrerCB.class.getName(); }
    protected String xabCQ() { return WhitePurchaseReferrerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
