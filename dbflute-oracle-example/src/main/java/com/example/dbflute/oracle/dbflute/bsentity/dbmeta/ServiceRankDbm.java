package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of SERVICE_RANK. (Singleton)
 * @author oracleman
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
    public static class EpgNewAcceptableFlg implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getNewAcceptableFlg(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setNewAcceptableFlg(ctb(v)); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getDescription(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setDescription((String)v); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity e) { return ((ServiceRank)e).getDisplayOrder(); }
        public void write(Entity e, Object v) { ((ServiceRank)e).setDisplayOrder(ctb(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SERVICE_RANK";
    protected final String _tablePropertyName = "serviceRank";
    protected final TableSqlName _tableSqlName = new TableSqlName("SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, null, true, "serviceRankCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "memberServiceList", null);
    protected final ColumnInfo _columnServiceRankName = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, null, true, "serviceRankName", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnServicePointIncidence = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, null, true, "servicePointIncidence", java.math.BigDecimal.class, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNewAcceptableFlg = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, null, true, "newAcceptableFlg", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, true, "description", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, true, "displayOrder", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, null);

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
        return cri("FK_MEMBER_SERVICE_RANK_CODE", "memberServiceList", this, MemberServiceDbm.getInstance(), map, false, "serviceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.ServiceRank"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.ServiceRankCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.ServiceRankBhv"; }

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
