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
 * The DB meta of white_variant_relation_master_foo. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterFooDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationMasterFooDbm _instance = new WhiteVariantRelationMasterFooDbm();
    private WhiteVariantRelationMasterFooDbm() {}
    public static WhiteVariantRelationMasterFooDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMasterFooId(), "masterFooId");
        setupEpg(_epgMap, new EpgMasterFooName(), "masterFooName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMasterFooId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationMasterFoo)e).getMasterFooId(); }
        public void write(Entity e, Object v) { ((WhiteVariantRelationMasterFoo)e).setMasterFooId(ctl(v)); }
    }
    public static class EpgMasterFooName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteVariantRelationMasterFoo)e).getMasterFooName(); }
        public void write(Entity e, Object v) { ((WhiteVariantRelationMasterFoo)e).setMasterFooName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_master_foo";
    protected final String _tablePropertyName = "whiteVariantRelationMasterFoo";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_MASTER_FOO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMasterFooId = cci("MASTER_FOO_ID", "MASTER_FOO_ID", null, null, true, "masterFooId", Long.class, true, false, "BIGINT", 19, 0, null, false, null, null, null, "whiteVariantRelationReferrerAsVariantList", null);
    protected final ColumnInfo _columnMasterFooName = cci("MASTER_FOO_NAME", "MASTER_FOO_NAME", null, null, true, "masterFooName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMasterFooId() { return _columnMasterFooId; }
    public ColumnInfo columnMasterFooName() { return _columnMasterFooName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMasterFooId());
        ls.add(columnMasterFooName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMasterFooId()); }
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
    public ReferrerInfo referrerWhiteVariantRelationReferrerAsVariantList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMasterFooId(), WhiteVariantRelationReferrerDbm.getInstance().columnVariantMasterId());
        return cri("FK_WHITE_VARIANT_RELATION_FOO", "whiteVariantRelationReferrerAsVariantList", this, WhiteVariantRelationReferrerDbm.getInstance(), map, false, "whiteVariantRelationMasterFooAsVariant");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteVariantRelationMasterFoo"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteVariantRelationMasterFooCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteVariantRelationMasterFooBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationMasterFoo> getEntityType() { return WhiteVariantRelationMasterFoo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteVariantRelationMasterFoo newMyEntity() { return new WhiteVariantRelationMasterFoo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationMasterFoo)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteVariantRelationMasterFoo)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
