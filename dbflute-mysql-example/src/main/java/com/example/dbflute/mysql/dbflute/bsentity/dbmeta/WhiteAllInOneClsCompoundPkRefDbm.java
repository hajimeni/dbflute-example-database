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
 * The DB meta of white_all_in_one_cls_compound_pk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteAllInOneClsCompoundPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteAllInOneClsCompoundPkRefDbm _instance = new WhiteAllInOneClsCompoundPkRefDbm();
    private WhiteAllInOneClsCompoundPkRefDbm() {}
    public static WhiteAllInOneClsCompoundPkRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgFooCode(), "fooCode");
        setupEpg(_epgMap, new EpgBarCode(), "barCode");
        setupEpg(_epgMap, new EpgQuxCode(), "quxCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgFooCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteAllInOneClsCompoundPkRef)e).getFooCode(); }
        public void write(Entity e, Object v) { ((WhiteAllInOneClsCompoundPkRef)e).setFooCode((String)v); }
    }
    public static class EpgBarCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteAllInOneClsCompoundPkRef)e).getBarCode(); }
        public void write(Entity e, Object v) { ((WhiteAllInOneClsCompoundPkRef)e).setBarCode((String)v); }
    }
    public static class EpgQuxCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteAllInOneClsCompoundPkRef)e).getQuxCode(); }
        public void write(Entity e, Object v) { ((WhiteAllInOneClsCompoundPkRef)e).setQuxCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_all_in_one_cls_compound_pk_ref";
    protected final String _tablePropertyName = "whiteAllInOneClsCompoundPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooCode = cci("FOO_CODE", "FOO_CODE", null, null, true, "fooCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, "whiteAllInOneClsElementAsFoo", null, null);
    protected final ColumnInfo _columnBarCode = cci("BAR_CODE", "BAR_CODE", null, null, true, "barCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, "whiteAllInOneClsElementAsBar", null, null);
    protected final ColumnInfo _columnQuxCode = cci("QUX_CODE", "QUX_CODE", null, null, true, "quxCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnFooCode() { return _columnFooCode; }
    public ColumnInfo columnBarCode() { return _columnBarCode; }
    public ColumnInfo columnQuxCode() { return _columnQuxCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooCode());
        ls.add(columnBarCode());
        ls.add(columnQuxCode());
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
        ls.add(columnFooCode());
        ls.add(columnBarCode());
        ls.add(columnQuxCode());
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
    public ForeignInfo foreignWhiteAllInOneClsElementAsFoo() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnFooCode(), WhiteAllInOneClsElementDbm.getInstance().columnClsElementCode());
        return cfi("FK_WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF_FOO_TEST", "whiteAllInOneClsElementAsFoo", this, WhiteAllInOneClsElementDbm.getInstance(), map, 0, false, false, false, true, "$$foreignAlias$$.CLS_CATEGORY_CODE = 'FOO'", null, false, null);
    }
    public ForeignInfo foreignWhiteAllInOneClsElementAsBar() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBarCode(), WhiteAllInOneClsElementDbm.getInstance().columnClsElementCode());
        return cfi("FK_WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF_BAR_TEST", "whiteAllInOneClsElementAsBar", this, WhiteAllInOneClsElementDbm.getInstance(), map, 1, false, false, false, true, "$$foreignAlias$$.CLS_CATEGORY_CODE = 'BAR'", null, false, null);
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteAllInOneClsCompoundPkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteAllInOneClsCompoundPkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteAllInOneClsCompoundPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteAllInOneClsCompoundPkRef> getEntityType() { return WhiteAllInOneClsCompoundPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteAllInOneClsCompoundPkRef newMyEntity() { return new WhiteAllInOneClsCompoundPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteAllInOneClsCompoundPkRef)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteAllInOneClsCompoundPkRef)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
