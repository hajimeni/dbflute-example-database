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
 * The DB meta of white_table_except_gen_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteTableExceptGenRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTableExceptGenRefDbm _instance = new WhiteTableExceptGenRefDbm();
    private WhiteTableExceptGenRefDbm() {}
    public static WhiteTableExceptGenRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgGenRefId(), "genRefId");
        setupEpg(_epgMap, new EpgGenRefName(), "genRefName");
        setupEpg(_epgMap, new EpgGenOnlyId(), "genOnlyId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgGenRefId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTableExceptGenRef)e).getGenRefId(); }
        public void write(Entity e, Object v) { ((WhiteTableExceptGenRef)e).setGenRefId(ctl(v)); }
    }
    public static class EpgGenRefName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTableExceptGenRef)e).getGenRefName(); }
        public void write(Entity e, Object v) { ((WhiteTableExceptGenRef)e).setGenRefName((String)v); }
    }
    public static class EpgGenOnlyId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteTableExceptGenRef)e).getGenOnlyId(); }
        public void write(Entity e, Object v) { ((WhiteTableExceptGenRef)e).setGenOnlyId(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_table_except_gen_ref";
    protected final String _tablePropertyName = "whiteTableExceptGenRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_TABLE_EXCEPT_GEN_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGenRefId = cci("GEN_REF_ID", "GEN_REF_ID", null, null, true, "genRefId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGenRefName = cci("GEN_REF_NAME", "GEN_REF_NAME", null, null, true, "genRefName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGenOnlyId = cci("GEN_ONLY_ID", "GEN_ONLY_ID", null, null, false, "genOnlyId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnGenRefId() { return _columnGenRefId; }
    public ColumnInfo columnGenRefName() { return _columnGenRefName; }
    public ColumnInfo columnGenOnlyId() { return _columnGenOnlyId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGenRefId());
        ls.add(columnGenRefName());
        ls.add(columnGenOnlyId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGenRefId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteTableExceptGenRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteTableExceptGenRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteTableExceptGenRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTableExceptGenRef> getEntityType() { return WhiteTableExceptGenRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteTableExceptGenRef newMyEntity() { return new WhiteTableExceptGenRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteTableExceptGenRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteTableExceptGenRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
