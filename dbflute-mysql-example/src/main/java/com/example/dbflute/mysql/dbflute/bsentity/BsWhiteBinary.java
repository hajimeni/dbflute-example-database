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
 * The entity of WHITE_BINARY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BINARY_ID
 * 
 * [column]
 *     BINARY_ID, BINARY_DATA, BLOB_DATA
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BINARY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long binaryId = entity.getBinaryId();
 * byte[] binaryData = entity.getBinaryData();
 * byte[] blobData = entity.getBlobData();
 * entity.setBinaryId(binaryId);
 * entity.setBinaryData(binaryData);
 * entity.setBlobData(blobData);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBinary implements Entity, Serializable, Cloneable {

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
    /** BINARY_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _binaryId;

    /** BINARY_DATA: {BINARY(1)} */
    protected byte[] _binaryData;

    /** BLOB_DATA: {BLOB(65535)} */
    protected byte[] _blobData;

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
        return "white_binary";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteBinary";
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
        if (getBinaryId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (other == null || !(other instanceof BsWhiteBinary)) { return false; }
        BsWhiteBinary otherEntity = (BsWhiteBinary)other;
        if (!xSV(getBinaryId(), otherEntity.getBinaryId())) { return false; }
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
        result = xCH(result, getBinaryId());
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
        return sb.toString();
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
        sb.append(delimiter).append(getBinaryId());
        sb.append(delimiter).append(xfBA(getBinaryData()));
        sb.append(delimiter).append(xfBA(getBlobData()));
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return InternalUtil.toString(bytes);
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteBinary clone() {
        try {
            return (WhiteBinary)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BINARY_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'BINARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBinaryId() {
        return _binaryId;
    }

    /**
     * [set] BINARY_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param binaryId The value of the column 'BINARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBinaryId(Long binaryId) {
        __modifiedProperties.addPropertyName("binaryId");
        this._binaryId = binaryId;
    }

    /**
     * [get] BINARY_DATA: {BINARY(1)} <br />
     * @return The value of the column 'BINARY_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getBinaryData() {
        return _binaryData;
    }

    /**
     * [set] BINARY_DATA: {BINARY(1)} <br />
     * @param binaryData The value of the column 'BINARY_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBinaryData(byte[] binaryData) {
        __modifiedProperties.addPropertyName("binaryData");
        this._binaryData = binaryData;
    }

    /**
     * [get] BLOB_DATA: {BLOB(65535)} <br />
     * @return The value of the column 'BLOB_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getBlobData() {
        return _blobData;
    }

    /**
     * [set] BLOB_DATA: {BLOB(65535)} <br />
     * @param blobData The value of the column 'BLOB_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlobData(byte[] blobData) {
        __modifiedProperties.addPropertyName("blobData");
        this._blobData = blobData;
    }
}
