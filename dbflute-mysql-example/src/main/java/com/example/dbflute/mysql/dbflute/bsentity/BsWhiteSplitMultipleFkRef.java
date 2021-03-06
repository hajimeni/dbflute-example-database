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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     FIRST_ID, SECOND_CODE
 * 
 * [column]
 *     FIRST_ID, SECOND_CODE, REF_NAME
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
 * Integer firstId = entity.getFirstId();
 * String secondCode = entity.getSecondCode();
 * String refName = entity.getRefName();
 * entity.setFirstId(firstId);
 * entity.setSecondCode(secondCode);
 * entity.setRefName(refName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkRef implements Entity, Serializable, Cloneable {

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
    /** FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _firstId;

    /** SECOND_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secondCode;

    /** REF_NAME: {NotNull, VARCHAR(200)} */
    protected String _refName;

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
        return "white_split_multiple_fk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSplitMultipleFkRef";
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
        if (getFirstId() == null) { return false; }
        if (getSecondCode() == null) { return false; }
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
        if (other == null || !(other instanceof BsWhiteSplitMultipleFkRef)) { return false; }
        BsWhiteSplitMultipleFkRef otherEntity = (BsWhiteSplitMultipleFkRef)other;
        if (!xSV(getFirstId(), otherEntity.getFirstId())) { return false; }
        if (!xSV(getSecondCode(), otherEntity.getSecondCode())) { return false; }
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
        result = xCH(result, getFirstId());
        result = xCH(result, getSecondCode());
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
        sb.append(delimiter).append(getFirstId());
        sb.append(delimiter).append(getSecondCode());
        sb.append(delimiter).append(getRefName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSplitMultipleFkRef clone() {
        try {
            return (WhiteSplitMultipleFkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFirstId() {
        return _firstId;
    }

    /**
     * [set] FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @param firstId The value of the column 'FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFirstId(Integer firstId) {
        __modifiedProperties.addPropertyName("firstId");
        this._firstId = firstId;
    }

    /**
     * [get] SECOND_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecondCode() {
        return _secondCode;
    }

    /**
     * [set] SECOND_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param secondCode The value of the column 'SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecondCode(String secondCode) {
        __modifiedProperties.addPropertyName("secondCode");
        this._secondCode = secondCode;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefName() {
        return _refName;
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR(200)} <br />
     * @param refName The value of the column 'REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefName(String refName) {
        __modifiedProperties.addPropertyName("refName");
        this._refName = refName;
    }
}
