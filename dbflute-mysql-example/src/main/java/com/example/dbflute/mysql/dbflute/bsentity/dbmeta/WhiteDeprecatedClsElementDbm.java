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
 * The DB meta of white_deprecated_cls_element. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDeprecatedClsElementDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDeprecatedClsElementDbm _instance = new WhiteDeprecatedClsElementDbm();
    private WhiteDeprecatedClsElementDbm() {}
    public static WhiteDeprecatedClsElementDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgDeprecatedClsElementCode(), "deprecatedClsElementCode");
        setupEpg(_epgMap, new EpgDeprecatedClsElementName(), "deprecatedClsElementName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public class EpgDeprecatedClsElementCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDeprecatedClsElement)e).getDeprecatedClsElementCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnDeprecatedClsElementCode();
            ccls(col, v);
            ((WhiteDeprecatedClsElement)e).setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType((CDef.DeprecatedMapCollaborationType)gcls(col, v));
        }
    }
    public static class EpgDeprecatedClsElementName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteDeprecatedClsElement)e).getDeprecatedClsElementName(); }
        public void write(Entity e, Object v) { ((WhiteDeprecatedClsElement)e).setDeprecatedClsElementName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_deprecated_cls_element";
    protected final String _tablePropertyName = "whiteDeprecatedClsElement";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DEPRECATED_CLS_ELEMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeprecatedClsElementCode = cci("DEPRECATED_CLS_ELEMENT_CODE", "DEPRECATED_CLS_ELEMENT_CODE", null, null, true, "deprecatedClsElementCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.DeprecatedMapCollaborationType);
    protected final ColumnInfo _columnDeprecatedClsElementName = cci("DEPRECATED_CLS_ELEMENT_NAME", "DEPRECATED_CLS_ELEMENT_NAME", null, null, false, "deprecatedClsElementName", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnDeprecatedClsElementCode() { return _columnDeprecatedClsElementCode; }
    public ColumnInfo columnDeprecatedClsElementName() { return _columnDeprecatedClsElementName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDeprecatedClsElementCode());
        ls.add(columnDeprecatedClsElementName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDeprecatedClsElementCode()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteDeprecatedClsElement"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteDeprecatedClsElementCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteDeprecatedClsElementBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDeprecatedClsElement> getEntityType() { return WhiteDeprecatedClsElement.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteDeprecatedClsElement newMyEntity() { return new WhiteDeprecatedClsElement(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteDeprecatedClsElement)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteDeprecatedClsElement)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
