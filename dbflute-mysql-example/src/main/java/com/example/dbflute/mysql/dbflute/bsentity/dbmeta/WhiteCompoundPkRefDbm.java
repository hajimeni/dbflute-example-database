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
 * The DB meta of white_compound_pk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefDbm _instance = new WhiteCompoundPkRefDbm();
    private WhiteCompoundPkRefDbm() {}
    public static WhiteCompoundPkRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMultipleFirstId(), "multipleFirstId");
        setupEpg(_epgMap, new EpgMultipleSecondId(), "multipleSecondId");
        setupEpg(_epgMap, new EpgRefFirstId(), "refFirstId");
        setupEpg(_epgMap, new EpgRefSecondId(), "refSecondId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMultipleFirstId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRef)e).getMultipleFirstId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRef)e).setMultipleFirstId(cti(v)); }
    }
    public static class EpgMultipleSecondId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRef)e).getMultipleSecondId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRef)e).setMultipleSecondId(cti(v)); }
    }
    public static class EpgRefFirstId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRef)e).getRefFirstId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRef)e).setRefFirstId(cti(v)); }
    }
    public static class EpgRefSecondId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteCompoundPkRef)e).getRefSecondId(); }
        public void write(Entity e, Object v) { ((WhiteCompoundPkRef)e).setRefSecondId(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_ref";
    protected final String _tablePropertyName = "whiteCompoundPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMultipleFirstId = cci("MULTIPLE_FIRST_ID", "MULTIPLE_FIRST_ID", null, null, true, "multipleFirstId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, "whiteCompoundPkRefNestByQuxMultipleIdList,whiteCompoundPkRefNestByFooMultipleIdList", null);
    protected final ColumnInfo _columnMultipleSecondId = cci("MULTIPLE_SECOND_ID", "MULTIPLE_SECOND_ID", null, null, true, "multipleSecondId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, "whiteCompoundPkRefNestByQuxMultipleIdList,whiteCompoundPkRefNestByFooMultipleIdList", null);
    protected final ColumnInfo _columnRefFirstId = cci("REF_FIRST_ID", "REF_FIRST_ID", null, null, true, "refFirstId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPk", null, null);
    protected final ColumnInfo _columnRefSecondId = cci("REF_SECOND_ID", "REF_SECOND_ID", null, null, true, "refSecondId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPk", null, null);

    public ColumnInfo columnMultipleFirstId() { return _columnMultipleFirstId; }
    public ColumnInfo columnMultipleSecondId() { return _columnMultipleSecondId; }
    public ColumnInfo columnRefFirstId() { return _columnRefFirstId; }
    public ColumnInfo columnRefSecondId() { return _columnRefSecondId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        ls.add(columnRefFirstId());
        ls.add(columnRefSecondId());
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
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMultipleFirstId());
        ls.add(columnMultipleSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteCompoundPk() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnRefFirstId(), WhiteCompoundPkDbm.getInstance().columnPkFirstId());
        map.put(columnRefSecondId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF", "whiteCompoundPk", this, WhiteCompoundPkDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteCompoundPkRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteCompoundPkRefNestByQuxMultipleIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnMultipleFirstId(), WhiteCompoundPkRefNestDbm.getInstance().columnBarMultipleId());
        map.put(columnMultipleSecondId(), WhiteCompoundPkRefNestDbm.getInstance().columnQuxMultipleId());
        return cri("FK_WHITE_COMPOUND_PK_REF_NEST_BAR_QUX", "whiteCompoundPkRefNestByQuxMultipleIdList", this, WhiteCompoundPkRefNestDbm.getInstance(), map, false, "whiteCompoundPkRefByQuxMultipleId");
    }
    public ReferrerInfo referrerWhiteCompoundPkRefNestByFooMultipleIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnMultipleFirstId(), WhiteCompoundPkRefNestDbm.getInstance().columnFooMultipleId());
        map.put(columnMultipleSecondId(), WhiteCompoundPkRefNestDbm.getInstance().columnBarMultipleId());
        return cri("FK_WHITE_COMPOUND_PK_REF_NEST_FOO_BAR", "whiteCompoundPkRefNestByFooMultipleIdList", this, WhiteCompoundPkRefNestDbm.getInstance(), map, false, "whiteCompoundPkRefByFooMultipleId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRef> getEntityType() { return WhiteCompoundPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteCompoundPkRef newMyEntity() { return new WhiteCompoundPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteCompoundPkRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
