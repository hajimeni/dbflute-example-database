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

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of summary_withdrawal.
 * @author DBFlute(AutoGenerator)
 */
public class BsSummaryWithdrawalCQ extends AbstractBsSummaryWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SummaryWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryWithdrawalCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from summary_withdrawal) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SummaryWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SummaryWithdrawalCIQ xcreateCIQ() {
        SummaryWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SummaryWithdrawalCIQ xnewCIQ() {
        return new SummaryWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join summary_withdrawal on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SummaryWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SummaryWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName() {
        if (_memberName == null) { _memberName = nCV(); }
        return _memberName;
    }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員名称)MEMBER_NAME: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員名称)MEMBER_NAME: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue getWithdrawalReasonCode() {
        if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
        return _withdrawalReasonCode;
    }
    protected ConditionValue getCValueWithdrawalReasonCode() { return getWithdrawalReasonCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue getWithdrawalReasonText() {
        if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
        return _withdrawalReasonText;
    }
    protected ConditionValue getCValueWithdrawalReasonText() { return getWithdrawalReasonText(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonText_Asc() { regOBA("WITHDRAWAL_REASON_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonText_Desc() { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue getWithdrawalReasonInputText() {
        if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
        return _withdrawalReasonInputText;
    }
    protected ConditionValue getCValueWithdrawalReasonInputText() { return getWithdrawalReasonInputText(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue getWithdrawalDatetime() {
        if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
        return _withdrawalDatetime;
    }
    protected ConditionValue getCValueWithdrawalDatetime() { return getWithdrawalDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (退会日時)WITHDRAWAL_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("WITHDRAWAL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会日時)WITHDRAWAL_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("WITHDRAWAL_DATETIME"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue getMemberStatusName() {
        if (_memberStatusName == null) { _memberStatusName = nCV(); }
        return _memberStatusName;
    }
    protected ConditionValue getCValueMemberStatusName() { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _maxPurchasePrice;
    public ConditionValue getMaxPurchasePrice() {
        if (_maxPurchasePrice == null) { _maxPurchasePrice = nCV(); }
        return _maxPurchasePrice;
    }
    protected ConditionValue getCValueMaxPurchasePrice() { return getMaxPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * MAX_PURCHASE_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MaxPurchasePrice_Asc() { regOBA("MAX_PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MAX_PURCHASE_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MaxPurchasePrice_Desc() { regOBD("MAX_PURCHASE_PRICE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SummaryWithdrawalCB.class.getName(); }
    protected String xCQ() { return SummaryWithdrawalCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}