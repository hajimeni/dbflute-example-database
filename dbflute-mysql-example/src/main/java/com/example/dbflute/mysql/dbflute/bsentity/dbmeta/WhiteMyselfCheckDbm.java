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
 * The DB meta of white_myself_check. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteMyselfCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteMyselfCheckDbm _instance = new WhiteMyselfCheckDbm();
    private WhiteMyselfCheckDbm() {}
    public static WhiteMyselfCheckDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMyselfCheckId(), "myselfCheckId");
        setupEpg(_epgMap, new EpgMyselfCheckName(), "myselfCheckName");
        setupEpg(_epgMap, new EpgMyselfId(), "myselfId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMyselfCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteMyselfCheck)e).getMyselfCheckId(); }
        public void write(Entity e, Object v) { ((WhiteMyselfCheck)e).setMyselfCheckId(cti(v)); }
    }
    public static class EpgMyselfCheckName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteMyselfCheck)e).getMyselfCheckName(); }
        public void write(Entity e, Object v) { ((WhiteMyselfCheck)e).setMyselfCheckName((String)v); }
    }
    public static class EpgMyselfId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteMyselfCheck)e).getMyselfId(); }
        public void write(Entity e, Object v) { ((WhiteMyselfCheck)e).setMyselfId(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_myself_check";
    protected final String _tablePropertyName = "whiteMyselfCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_MYSELF_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMyselfCheckId = cci("MYSELF_CHECK_ID", "MYSELF_CHECK_ID", null, null, true, "myselfCheckId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfCheckName = cci("MYSELF_CHECK_NAME", "MYSELF_CHECK_NAME", null, null, true, "myselfCheckName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, false, "myselfId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteMyself", null, null);

    public ColumnInfo columnMyselfCheckId() { return _columnMyselfCheckId; }
    public ColumnInfo columnMyselfCheckName() { return _columnMyselfCheckName; }
    public ColumnInfo columnMyselfId() { return _columnMyselfId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMyselfCheckId());
        ls.add(columnMyselfCheckName());
        ls.add(columnMyselfId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMyselfCheckId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteMyself() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMyselfId(), WhiteMyselfDbm.getInstance().columnMyselfId());
        return cfi("FK_WHITE_MYSELF_CHECK_SELF", "whiteMyself", this, WhiteMyselfDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "whiteMyselfCheckList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteMyselfCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteMyselfCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteMyselfCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteMyselfCheck> getEntityType() { return WhiteMyselfCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteMyselfCheck newMyEntity() { return new WhiteMyselfCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteMyselfCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteMyselfCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
