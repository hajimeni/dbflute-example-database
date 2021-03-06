package com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of VendorUnsupportedAlias. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorUnsupportedAliasDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorUnsupportedAliasDbm _instance = new VendorUnsupportedAliasDbm();
    private VendorUnsupportedAliasDbm() {}
    public static VendorUnsupportedAliasDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgHyphen_exists(), "hyphen_exists");
        setupEpg(_epgMap, new EpgSpace_exists(), "space_exists");
        setupEpg(_epgMap, new EpgDollar$exists(), "dollar$exists");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorUnsupportedAlias)e).getVendorCheckId(); }
        public void write(Entity e, Object v) { ((VendorUnsupportedAlias)e).setVendorCheckId(ctl(v)); }
    }
    public static class EpgHyphen_exists implements PropertyGateway {
        public Object read(Entity e) { return ((VendorUnsupportedAlias)e).getHyphen_exists(); }
        public void write(Entity e, Object v) { ((VendorUnsupportedAlias)e).setHyphen_exists((String)v); }
    }
    public static class EpgSpace_exists implements PropertyGateway {
        public Object read(Entity e) { return ((VendorUnsupportedAlias)e).getSpace_exists(); }
        public void write(Entity e, Object v) { ((VendorUnsupportedAlias)e).setSpace_exists(cti(v)); }
    }
    public static class EpgDollar$exists implements PropertyGateway {
        public Object read(Entity e) { return ((VendorUnsupportedAlias)e).getDollar$exists(); }
        public void write(Entity e, Object v) { ((VendorUnsupportedAlias)e).setDollar$exists((java.util.Date)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VendorUnsupportedAlias";
    protected final String _tablePropertyName = "vendorUnsupportedAlias";
    protected final TableSqlName _tableSqlName = new TableSqlName("VendorUnsupportedAlias", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, false, "vendorCheckId", Long.class, false, false, "numeric", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnHyphen_exists = cci("HYPHEN-EXISTS", "\"HYPHEN-EXISTS\"", null, null, false, "hyphen_exists", String.class, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSpace_exists = cci("SPACE EXISTS", "\"SPACE EXISTS\"", null, null, false, "space_exists", Integer.class, false, false, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDollar$exists = cci("DOLLAR$EXISTS", "DOLLAR$EXISTS", null, null, false, "dollar$exists", java.util.Date.class, false, false, "date", 13, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnHyphen_exists() { return _columnHyphen_exists; }
    public ColumnInfo columnSpace_exists() { return _columnSpace_exists; }
    public ColumnInfo columnDollar$exists() { return _columnDollar$exists; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnHyphen_exists());
        ls.add(columnSpace_exists());
        ls.add(columnDollar$exists());
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
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.customize.VendorUnsupportedAlias"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorUnsupportedAlias> getEntityType() { return VendorUnsupportedAlias.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorUnsupportedAlias newMyEntity() { return new VendorUnsupportedAlias(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorUnsupportedAlias)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorUnsupportedAlias)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
