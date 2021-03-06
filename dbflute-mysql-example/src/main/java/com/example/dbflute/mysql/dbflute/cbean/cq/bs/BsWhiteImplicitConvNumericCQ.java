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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_implicit_conv_numeric.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvNumericCQ extends AbstractBsWhiteImplicitConvNumericCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvNumericCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvNumericCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_conv_numeric) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitConvNumericCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitConvNumericCIQ xcreateCIQ() {
        WhiteImplicitConvNumericCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitConvNumericCIQ xnewCIQ() {
        return new WhiteImplicitConvNumericCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_conv_numeric on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitConvNumericCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitConvNumericCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _implicitConvNumericId;
    public ConditionValue getImplicitConvNumericId() {
        if (_implicitConvNumericId == null) { _implicitConvNumericId = nCV(); }
        return _implicitConvNumericId;
    }
    protected ConditionValue getCValueImplicitConvNumericId() { return getImplicitConvNumericId(); }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList() { return _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerListMap.put(key, subQuery); return "implicitConvNumericId_ExistsReferrer_WhiteImplicitConvIntegerList." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList() { return _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringListMap.put(key, subQuery); return "implicitConvNumericId_ExistsReferrer_WhiteImplicitConvStringList." + key;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList() { return _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerListMap.put(key, subQuery); return "implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvIntegerList." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList() { return _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringListMap.put(key, subQuery); return "implicitConvNumericId_NotExistsReferrer_WhiteImplicitConvStringList." + key;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList() { return _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap.put(key, subQuery); return "implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList() { return _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap.put(key, subQuery); return "implicitConvNumericId_SpecifyDerivedReferrer_WhiteImplicitConvStringList." + key;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList() { return _implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerListMap == null) { _implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerListMap.put(key, subQuery); return "implicitConvNumericId_InScopeRelation_WhiteImplicitConvIntegerList." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList() { return _implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringListMap == null) { _implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringListMap.put(key, subQuery); return "implicitConvNumericId_InScopeRelation_WhiteImplicitConvStringList." + key;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList() { return _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerListMap == null) { _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerListMap.put(key, subQuery); return "implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvIntegerList." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList() { return _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringListMap == null) { _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringListMap.put(key, subQuery); return "implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvStringList." + key;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList() { return _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap.put(key, subQuery); return "implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerList." + key;
    }
    protected Map<String, Object> _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap;
    public Map<String, Object> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter() { return _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object parameterValue) {
        if (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap == null) { _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap.size() + 1);
        _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap.put(key, parameterValue); return "implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList() { return _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListMap.put(key, subQuery); return "implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringList." + key;
    }
    protected Map<String, Object> _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap;
    public Map<String, Object> getImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter() { return _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap; }
    public String keepImplicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object parameterValue) {
        if (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap == null) { _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap.size() + 1);
        _implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap.put(key, parameterValue); return "implicitConvNumericId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvNumericId_Asc() { regOBA("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvNumericId_Desc() { regOBD("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    protected ConditionValue _implicitConvIntegerId;
    public ConditionValue getImplicitConvIntegerId() {
        if (_implicitConvIntegerId == null) { _implicitConvIntegerId = nCV(); }
        return _implicitConvIntegerId;
    }
    protected ConditionValue getCValueImplicitConvIntegerId() { return getImplicitConvIntegerId(); }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger() { return _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap; }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap == null) { _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap.size() + 1);
        _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap.put(key, subQuery); return "implicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger." + key;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger() { return _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap; }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ subQuery) {
        if (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap == null) { _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap.size() + 1);
        _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap.put(key, subQuery); return "implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvIntegerId_Asc() { regOBA("IMPLICIT_CONV_INTEGER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvIntegerId_Desc() { regOBD("IMPLICIT_CONV_INTEGER_ID"); return this; }

    protected ConditionValue _implicitConvStringId;
    public ConditionValue getImplicitConvStringId() {
        if (_implicitConvStringId == null) { _implicitConvStringId = nCV(); }
        return _implicitConvStringId;
    }
    protected ConditionValue getCValueImplicitConvStringId() { return getImplicitConvStringId(); }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvString() { return _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap; }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap == null) { _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap.size() + 1);
        _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap.put(key, subQuery); return "implicitConvStringId_InScopeRelation_WhiteImplicitConvString." + key;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString() { return _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap; }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ subQuery) {
        if (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap == null) { _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap.size() + 1);
        _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap.put(key, subQuery); return "implicitConvStringId_NotInScopeRelation_WhiteImplicitConvString." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvStringId_Asc() { regOBA("IMPLICIT_CONV_STRING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvStringId_Desc() { regOBD("IMPLICIT_CONV_STRING_ID"); return this; }

    protected ConditionValue _implicitConvName;
    public ConditionValue getImplicitConvName() {
        if (_implicitConvName == null) { _implicitConvName = nCV(); }
        return _implicitConvName;
    }
    protected ConditionValue getCValueImplicitConvName() { return getImplicitConvName(); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvName_Asc() { regOBA("IMPLICIT_CONV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addOrderBy_ImplicitConvName_Desc() { regOBD("IMPLICIT_CONV_NAME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvNumericCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        WhiteImplicitConvNumericCQ baseQuery = (WhiteImplicitConvNumericCQ)baseQueryAsSuper;
        WhiteImplicitConvNumericCQ unionQuery = (WhiteImplicitConvNumericCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryWhiteImplicitConvInteger()) {
            unionQuery.queryWhiteImplicitConvInteger().reflectRelationOnUnionQuery(baseQuery.queryWhiteImplicitConvInteger(), unionQuery.queryWhiteImplicitConvInteger());
        }
        if (baseQuery.hasConditionQueryWhiteImplicitConvString()) {
            unionQuery.queryWhiteImplicitConvString().reflectRelationOnUnionQuery(baseQuery.queryWhiteImplicitConvString(), unionQuery.queryWhiteImplicitConvString());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvIntegerCQ queryWhiteImplicitConvInteger() {
        return getConditionQueryWhiteImplicitConvInteger();
    }
    protected WhiteImplicitConvIntegerCQ _conditionQueryWhiteImplicitConvInteger;
    public WhiteImplicitConvIntegerCQ getConditionQueryWhiteImplicitConvInteger() {
        if (_conditionQueryWhiteImplicitConvInteger == null) {
            _conditionQueryWhiteImplicitConvInteger = xcreateQueryWhiteImplicitConvInteger();
            xsetupOuterJoinWhiteImplicitConvInteger();
        }
        return _conditionQueryWhiteImplicitConvInteger;
    }
    protected WhiteImplicitConvIntegerCQ xcreateQueryWhiteImplicitConvInteger() {
        String nrp = resolveNextRelationPath("white_implicit_conv_numeric", "whiteImplicitConvInteger");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitConvIntegerCQ cq = new WhiteImplicitConvIntegerCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitConvInteger");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitConvInteger() {
        WhiteImplicitConvIntegerCQ cq = getConditionQueryWhiteImplicitConvInteger();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitConvInteger");
    }
    public boolean hasConditionQueryWhiteImplicitConvInteger() {
        return _conditionQueryWhiteImplicitConvInteger != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvStringCQ queryWhiteImplicitConvString() {
        return getConditionQueryWhiteImplicitConvString();
    }
    protected WhiteImplicitConvStringCQ _conditionQueryWhiteImplicitConvString;
    public WhiteImplicitConvStringCQ getConditionQueryWhiteImplicitConvString() {
        if (_conditionQueryWhiteImplicitConvString == null) {
            _conditionQueryWhiteImplicitConvString = xcreateQueryWhiteImplicitConvString();
            xsetupOuterJoinWhiteImplicitConvString();
        }
        return _conditionQueryWhiteImplicitConvString;
    }
    protected WhiteImplicitConvStringCQ xcreateQueryWhiteImplicitConvString() {
        String nrp = resolveNextRelationPath("white_implicit_conv_numeric", "whiteImplicitConvString");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitConvStringCQ cq = new WhiteImplicitConvStringCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitConvString");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitConvString() {
        WhiteImplicitConvStringCQ cq = getConditionQueryWhiteImplicitConvString();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitConvString");
    }
    public boolean hasConditionQueryWhiteImplicitConvString() {
        return _conditionQueryWhiteImplicitConvString != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteImplicitConvNumericCQ> _scalarConditionMap;
    public Map<String, WhiteImplicitConvNumericCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteImplicitConvNumericCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteImplicitConvNumericCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteImplicitConvNumericCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvNumericCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteImplicitConvNumericCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteImplicitConvNumericCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteImplicitConvNumericCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitConvNumericCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteImplicitConvNumericCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteImplicitConvNumericCQ> _myselfInScopeMap;
    public Map<String, WhiteImplicitConvNumericCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteImplicitConvNumericCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitConvNumericCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitConvNumericCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
