package com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The DB meta of SpResultSetParameterWithCurMember. (Singleton)
 * @author oracleman
 */
public class SpResultSetParameterWithCurMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpResultSetParameterWithCurMemberDbm _instance = new SpResultSetParameterWithCurMemberDbm();
    private SpResultSetParameterWithCurMemberDbm() {}
    public static SpResultSetParameterWithCurMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMember)e).getMemberId(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMember)e).setMemberId(ctl(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMember)e).getMemberName(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMember)e).setMemberName((String)v); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMember)e).getBirthdate(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMember)e).setBirthdate((java.util.Date)v); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMember)e).getFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMember)e).setFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((SpResultSetParameterWithCurMember)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((SpResultSetParameterWithCurMember)e).setMemberStatusCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpResultSetParameterWithCurMember";
    protected final String _tablePropertyName = "spResultSetParameterWithCurMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpResultSetParameterWithCurMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, false, "memberId", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, false, "memberName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, false, "birthdate", java.util.Date.class, false, false, "DATE", 7, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 11, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, false, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterWithCurMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpResultSetParameterWithCurMember> getEntityType() { return SpResultSetParameterWithCurMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SpResultSetParameterWithCurMember newMyEntity() { return new SpResultSetParameterWithCurMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SpResultSetParameterWithCurMember)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SpResultSetParameterWithCurMember)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
