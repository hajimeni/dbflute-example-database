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
package com.example.dbflute.mysql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of summary_withdrawal. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryWithdrawalDbm _instance = new SummaryWithdrawalDbm();
    private SummaryWithdrawalDbm() {}
    public static SummaryWithdrawalDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonText(), "withdrawalReasonText");
        setupEpg(_epgMap, new EpgWithdrawalReasonInputText(), "withdrawalReasonInputText");
        setupEpg(_epgMap, new EpgWithdrawalDatetime(), "withdrawalDatetime");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgMaxPurchasePrice(), "maxPurchasePrice");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getMemberId(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setMemberId(cti(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getMemberName(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setMemberName((String)v); }
    }
    public static class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getWithdrawalReasonCode(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setWithdrawalReasonCode((String)v); }
    }
    public static class EpgWithdrawalReasonText implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getWithdrawalReasonText(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setWithdrawalReasonText((String)v); }
    }
    public static class EpgWithdrawalReasonInputText implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getWithdrawalReasonInputText(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setWithdrawalReasonInputText((String)v); }
    }
    public static class EpgWithdrawalDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getWithdrawalDatetime(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setWithdrawalDatetime((java.sql.Timestamp)v); }
    }
    public class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnMemberStatusCode();
            ccls(col, v);
            ((SummaryWithdrawal)e).setMemberStatusCodeAsMemberStatus((CDef.MemberStatus)gcls(col, v));
        }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getMemberStatusName(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setMemberStatusName((String)v); }
    }
    public static class EpgMaxPurchasePrice implements PropertyGateway {
        public Object read(Entity e) { return ((SummaryWithdrawal)e).getMaxPurchasePrice(); }
        public void write(Entity e, Object v) { ((SummaryWithdrawal)e).setMaxPurchasePrice(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "summary_withdrawal";
    protected final String _tablePropertyName = "summaryWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUMMARY_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "VIEW";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", false, "memberName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, "会員のフルネームの名称。", null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, "退会理由コード", false, "withdrawalReasonCode", String.class, false, false, "CHAR", 3, 0, null, false, null, "退会した定型理由を参照するコード。\n何も言わずに退会する会員もいるので必須項目ではない。", null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, "退会理由テキスト", false, "withdrawalReasonText", String.class, false, false, "TEXT", 65535, 0, null, false, null, "退会理由の内容。テキスト形式なので目いっぱい書けるが、\nそうするとUI側できれいに見せるのが大変でしょうね。", null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, "退会理由入力テキスト", false, "withdrawalReasonInputText", String.class, false, false, "TEXT", 65535, 0, null, false, null, "会員がフリーテキストで入力できる退会理由。\nもう言いたいこと言ってもらう感じ。", null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, "退会日時", true, "withdrawalDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, "退会した瞬間の日時。\n正式会員日時と違い、こっちはone-to-oneの別テーブルで。", null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", false, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", false, "memberStatusName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMaxPurchasePrice = cci("MAX_PURCHASE_PRICE", "MAX_PURCHASE_PRICE", null, null, false, "maxPurchasePrice", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    public ColumnInfo columnMaxPurchasePrice() { return _columnMaxPurchasePrice; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnMaxPurchasePrice());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.SummaryWithdrawal"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.SummaryWithdrawalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.SummaryWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryWithdrawal> getEntityType() { return SummaryWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SummaryWithdrawal newMyEntity() { return new SummaryWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SummaryWithdrawal)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SummaryWithdrawal)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
