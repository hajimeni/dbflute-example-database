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
package com.example.dbflute.mysql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_PG_RESERV_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, CLASS
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_pg_reserv
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whitePgReserv
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer refId = entity.getRefId();
 * Integer classSynonym = entity.getClassSynonym();
 * entity.setRefId(refId);
 * entity.setClassSynonym(classSynonym);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservRef implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** REF_ID: {PK, NotNull, INT(10)} */
    protected Integer _refId;

    /** ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} */
    protected Integer _classSynonym;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_pg_reserv_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePgReservRef";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_pg_reserv by my CLASS, named 'whitePgReserv'. */
    protected WhitePgReserv _whitePgReserv;

    /**
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @return The entity of foreign property 'whitePgReserv'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePgReserv getWhitePgReserv() {
        return _whitePgReserv;
    }

    /**
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @param whitePgReserv The entity of foreign property 'whitePgReserv'. (NullAllowed)
     */
    public void setWhitePgReserv(WhitePgReserv whitePgReserv) {
        _whitePgReserv = whitePgReserv;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhitePgReservRef)) { return false; }
        BsWhitePgReservRef otherEntity = (BsWhitePgReservRef)other;
        if (!xSV(getRefId(), otherEntity.getRefId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getRefId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_whitePgReserv != null)
        { sb.append(l).append(xbRDS(_whitePgReserv, "whitePgReserv")); }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getRefId());
        sb.append(delimiter).append(getClassSynonym());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whitePgReserv != null) { sb.append(c).append("whitePgReserv"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePgReservRef clone() {
        try {
            return (WhitePgReservRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefId() {
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, INT(10)} <br />
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Integer refId) {
        __modifiedProperties.addPropertyName("refId");
        this._refId = refId;
    }

    /**
     * [get] ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} <br />
     * @return The value of the column 'CLASS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getClassSynonym() {
        return _classSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} <br />
     * @param classSynonym The value of the column 'CLASS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClassSynonym(Integer classSynonym) {
        __modifiedProperties.addPropertyName("classSynonym");
        this._classSynonym = classSynonym;
    }
}
