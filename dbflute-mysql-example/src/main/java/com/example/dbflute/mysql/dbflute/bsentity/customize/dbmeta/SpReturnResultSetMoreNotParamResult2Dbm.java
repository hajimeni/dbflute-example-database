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
package com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

/**
 * The DB meta of SpReturnResultSetMoreNotParamResult2. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpReturnResultSetMoreNotParamResult2Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpReturnResultSetMoreNotParamResult2Dbm _instance = new SpReturnResultSetMoreNotParamResult2Dbm();
    private SpReturnResultSetMoreNotParamResult2Dbm() {}
    public static SpReturnResultSetMoreNotParamResult2Dbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetMoreNotParamResult2)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnMemberStatusCode();
            ccls(col, v);
            ((SpReturnResultSetMoreNotParamResult2)e).setMemberStatusCodeAsMemberStatus((CDef.MemberStatus)gcls(col, v));
        }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetMoreNotParamResult2)e).getMemberStatusName(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetMoreNotParamResult2)e).setMemberStatusName((String)v); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetMoreNotParamResult2)e).getDescription(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetMoreNotParamResult2)e).setDescription((String)v); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity e) { return ((SpReturnResultSetMoreNotParamResult2)e).getDisplayOrder(); }
        public void write(Entity e, Object v) { ((SpReturnResultSetMoreNotParamResult2)e).setDisplayOrder(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpReturnResultSetMoreNotParamResult2";
    protected final String _tablePropertyName = "spReturnResultSetMoreNotParamResult2";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpReturnResultSetMoreNotParamResult2", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", false, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, "会員ステータスを識別するコード。", null, null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", false, "memberStatusName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", false, "description", String.class, false, false, "VARCHAR", 200, 0, null, false, null, "会員ステータスそれぞれの説明。\n気の利いた説明があるとディベロッパーがとても助かる。", null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", false, "displayOrder", Integer.class, false, false, "INT", 11, 0, null, false, null, "UI上のステータスの表示順を示すNO。\n並べるときは、このカラムに対して昇順のソート条件にする。", null, null, null);

    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult2"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpReturnResultSetMoreNotParamResult2> getEntityType() { return SpReturnResultSetMoreNotParamResult2.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SpReturnResultSetMoreNotParamResult2 newMyEntity() { return new SpReturnResultSetMoreNotParamResult2(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SpReturnResultSetMoreNotParamResult2)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SpReturnResultSetMoreNotParamResult2)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
