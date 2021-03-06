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
 * The entity of WHITE_UQ_REFERENCE_REF_NEST as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_REFERENCE_REF_NEST_ID
 * 
 * [column]
 *     UQ_REFERENCE_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_reference_ref
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqReferenceRef
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqReferenceRefNestId = entity.getUqReferenceRefNestId();
 * String compoundUqFirstCode = entity.getCompoundUqFirstCode();
 * String compoundUqSecondCode = entity.getCompoundUqSecondCode();
 * entity.setUqReferenceRefNestId(uqReferenceRefNestId);
 * entity.setCompoundUqFirstCode(compoundUqFirstCode);
 * entity.setCompoundUqSecondCode(compoundUqSecondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceRefNest implements Entity, Serializable, Cloneable {

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
    /** UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqReferenceRefNestId;

    /** COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref} */
    protected String _compoundUqSecondCode;

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
        return "white_uq_reference_ref_nest";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqReferenceRefNest";
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
        if (getUqReferenceRefNestId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_uq_reference_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRef'. */
    protected WhiteUqReferenceRef _whiteUqReferenceRef;

    /**
     * white_uq_reference_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRef'.
     * @return The entity of foreign property 'whiteUqReferenceRef'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqReferenceRef getWhiteUqReferenceRef() {
        return _whiteUqReferenceRef;
    }

    /**
     * white_uq_reference_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRef'.
     * @param whiteUqReferenceRef The entity of foreign property 'whiteUqReferenceRef'. (NullAllowed)
     */
    public void setWhiteUqReferenceRef(WhiteUqReferenceRef whiteUqReferenceRef) {
        _whiteUqReferenceRef = whiteUqReferenceRef;
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
        if (other == null || !(other instanceof BsWhiteUqReferenceRefNest)) { return false; }
        BsWhiteUqReferenceRefNest otherEntity = (BsWhiteUqReferenceRefNest)other;
        if (!xSV(getUqReferenceRefNestId(), otherEntity.getUqReferenceRefNestId())) { return false; }
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
        result = xCH(result, getUqReferenceRefNestId());
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
        if (_whiteUqReferenceRef != null)
        { sb.append(l).append(xbRDS(_whiteUqReferenceRef, "whiteUqReferenceRef")); }
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
        sb.append(delimiter).append(getUqReferenceRefNestId());
        sb.append(delimiter).append(getCompoundUqFirstCode());
        sb.append(delimiter).append(getCompoundUqSecondCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqReferenceRef != null) { sb.append(c).append("whiteUqReferenceRef"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqReferenceRefNest clone() {
        try {
            return (WhiteUqReferenceRefNest)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_REFERENCE_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqReferenceRefNestId() {
        return _uqReferenceRefNestId;
    }

    /**
     * [set] UQ_REFERENCE_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param uqReferenceRefNestId The value of the column 'UQ_REFERENCE_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqReferenceRefNestId(Long uqReferenceRefNestId) {
        __modifiedProperties.addPropertyName("uqReferenceRefNestId");
        this._uqReferenceRefNestId = uqReferenceRefNestId;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref} <br />
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_ref} <br />
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        __modifiedProperties.addPropertyName("compoundUqFirstCode");
        this._compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref} <br />
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_reference_ref} <br />
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        __modifiedProperties.addPropertyName("compoundUqSecondCode");
        this._compoundUqSecondCode = compoundUqSecondCode;
    }
}
