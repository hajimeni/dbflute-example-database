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
 * The DB meta of white_line_sep_comment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteLineSepCommentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteLineSepCommentDbm _instance = new WhiteLineSepCommentDbm();
    private WhiteLineSepCommentDbm() {}
    public static WhiteLineSepCommentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgLineSepCommentCode(), "lineSepCommentCode");
        setupEpg(_epgMap, new EpgLineSepCommentName(), "lineSepCommentName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public class EpgLineSepCommentCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteLineSepComment)e).getLineSepCommentCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnLineSepCommentCode();
            ccls(col, v);
            ((WhiteLineSepComment)e).setLineSepCommentCodeAsLineSepCommentCls((CDef.LineSepCommentCls)gcls(col, v));
        }
    }
    public static class EpgLineSepCommentName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteLineSepComment)e).getLineSepCommentName(); }
        public void write(Entity e, Object v) { ((WhiteLineSepComment)e).setLineSepCommentName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_line_sep_comment";
    protected final String _tablePropertyName = "whiteLineSepComment";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_LINE_SEP_COMMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLineSepCommentCode = cci("LINE_SEP_COMMENT_CODE", "LINE_SEP_COMMENT_CODE", null, null, true, "lineSepCommentCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.LineSepCommentCls);
    protected final ColumnInfo _columnLineSepCommentName = cci("LINE_SEP_COMMENT_NAME", "LINE_SEP_COMMENT_NAME", null, null, false, "lineSepCommentName", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnLineSepCommentCode() { return _columnLineSepCommentCode; }
    public ColumnInfo columnLineSepCommentName() { return _columnLineSepCommentName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLineSepCommentCode());
        ls.add(columnLineSepCommentName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLineSepCommentCode()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteLineSepComment"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteLineSepCommentCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteLineSepCommentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteLineSepComment> getEntityType() { return WhiteLineSepComment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteLineSepComment newMyEntity() { return new WhiteLineSepComment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteLineSepComment)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteLineSepComment)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
