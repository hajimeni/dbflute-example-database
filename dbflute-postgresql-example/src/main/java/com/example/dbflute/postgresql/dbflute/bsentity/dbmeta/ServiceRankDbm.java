package com.example.dbflute.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The DB meta of service_rank. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ServiceRankDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ServiceRankDbm _instance = new ServiceRankDbm();
    private ServiceRankDbm() {}
    public static ServiceRankDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgServiceRankName(), "serviceRankName");
        setupEpg(_epgMap, new EpgServicePointIncidence(), "servicePointIncidence");
        setupEpg(_epgMap, new EpgNewAcceptableFlg(), "newAcceptableFlg");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgServiceRankCode implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getServiceRankCode(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setServiceRankCode((String)v); }
    }
    public static class EpgServiceRankName implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getServiceRankName(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setServiceRankName((String)v); }
    }
    public static class EpgServicePointIncidence implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getServicePointIncidence(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setServicePointIncidence(ctb(v)); }
    }
    public class EpgNewAcceptableFlg implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getNewAcceptableFlg(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnNewAcceptableFlg();
            ((ServiceRank)e).setNewAcceptableFlgAsFlg((CDef.Flg)gcls(col, v));
        }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getDescription(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setDescription((String)v); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getDisplayOrder(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setDisplayOrder(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "service_rank";
    protected final String _tablePropertyName = "serviceRank";
    protected final TableSqlName _tableSqlName = new TableSqlName("service_rank", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "サービスランク";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のサービスレベルを表現するランク。\n（ゴールドとかプラチナとか）";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnServiceRankCode = cci("service_rank_code", "service_rank_code", null, "サービスランクコード", true, "serviceRankCode", String.class, true, false, "bpchar", 3, 0, null, false, null, "サービスランクを識別するコード。", null, "memberServiceList", null);
    protected final ColumnInfo _columnServiceRankName = cci("service_rank_name", "service_rank_name", null, "サービスランク名称", true, "serviceRankName", String.class, false, false, "varchar", 50, 0, null, false, null, "サービスランクの名称。\n（ゴールドとかプラチナとか基本的には威厳のある名前）", null, null, null);
    protected final ColumnInfo _columnServicePointIncidence = cci("service_point_incidence", "service_point_incidence", null, "サービスポイント発生率", true, "servicePointIncidence", java.math.BigDecimal.class, false, false, "numeric", 5, 3, null, false, null, "購入ごとのサービスポイントの発生率。\n購入価格にこの値をかけた数が発生ポイント。\nExampleDBとして数少ない貴重な小数点ありのカラム。", null, null, null);
    protected final ColumnInfo _columnNewAcceptableFlg = cci("new_acceptable_flg", "new_acceptable_flg", null, "新規受け入れ可能フラグ", true, "newAcceptableFlg", Integer.class, false, false, "int4", 10, 0, null, false, null, "このランクへの新規受け入れができるかどうか。", null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, "説明", true, "description", String.class, false, false, "varchar", 200, 0, null, false, null, "ランクに関する業務的な説明。", null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, "表示順", true, "displayOrder", Integer.class, false, false, "int4", 10, 0, null, false, null, "UI上の表示順を表現する番号。", null, null, null);

    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    public ColumnInfo columnServiceRankName() { return _columnServiceRankName; }
    public ColumnInfo columnServicePointIncidence() { return _columnServicePointIncidence; }
    public ColumnInfo columnNewAcceptableFlg() { return _columnNewAcceptableFlg; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnServiceRankCode());
        ls.add(columnServiceRankName());
        ls.add(columnServicePointIncidence());
        ls.add(columnNewAcceptableFlg());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnServiceRankCode()); }
    public boolean hasPrimaryKey() { return true; }
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
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnServiceRankCode(), MemberServiceDbm.getInstance().columnServiceRankCode());
        return cri("fk_member_service_service_rank_code", "memberServiceList", this, MemberServiceDbm.getInstance(), map, false, "serviceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.ServiceRank"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.ServiceRankCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.ServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ServiceRank> getEntityType() { return ServiceRank.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public ServiceRank newMyEntity() { return new ServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((ServiceRank)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((ServiceRank)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
