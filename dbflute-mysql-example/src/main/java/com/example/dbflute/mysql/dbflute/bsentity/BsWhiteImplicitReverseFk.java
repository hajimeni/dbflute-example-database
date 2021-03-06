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
 * The entity of WHITE_IMPLICIT_REVERSE_FK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 * 
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_ID, WHITE_IMPLICIT_REVERSE_FK_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     WHITE_IMPLICIT_REVERSE_FK_REF(WithImplicitReverseFK), WHITE_IMPLICIT_REVERSE_FK_SUPPRESS(SuppressImplicitReverseFK)
 * 
 * [referrer table]
 *     white_implicit_reverse_fk_ref
 * 
 * [foreign property]
 *     whiteImplicitReverseFkRefWithImplicitReverseFK, whiteImplicitReverseFkSuppressSuppressImplicitReverseFK
 * 
 * [referrer property]
 *     whiteImplicitReverseFkRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer whiteImplicitReverseFkId = entity.getWhiteImplicitReverseFkId();
 * String whiteImplicitReverseFkName = entity.getWhiteImplicitReverseFkName();
 * entity.setWhiteImplicitReverseFkId(whiteImplicitReverseFkId);
 * entity.setWhiteImplicitReverseFkName(whiteImplicitReverseFkName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFk implements Entity, Serializable, Cloneable {

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
    /** WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF} */
    protected Integer _whiteImplicitReverseFkId;

    /** WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} */
    protected String _whiteImplicitReverseFkName;

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
        return "white_implicit_reverse_fk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitReverseFk";
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
        if (getWhiteImplicitReverseFkId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'. */
    protected WhiteImplicitReverseFkRef _whiteImplicitReverseFkRefWithImplicitReverseFK;

    /**
     * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @return The entity of foreign property 'whiteImplicitReverseFkRefWithImplicitReverseFK'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitReverseFkRef getWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        return _whiteImplicitReverseFkRefWithImplicitReverseFK;
    }

    /**
     * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @param whiteImplicitReverseFkRefWithImplicitReverseFK The entity of foreign property 'whiteImplicitReverseFkRefWithImplicitReverseFK'. (NullAllowed)
     */
    public void setWhiteImplicitReverseFkRefWithImplicitReverseFK(WhiteImplicitReverseFkRef whiteImplicitReverseFkRefWithImplicitReverseFK) {
        _whiteImplicitReverseFkRefWithImplicitReverseFK = whiteImplicitReverseFkRefWithImplicitReverseFK;
    }

    /** white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. */
    protected WhiteImplicitReverseFkSuppress _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;

    /**
     * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @return The entity of foreign property 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitReverseFkSuppress getWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        return _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }

    /**
     * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @param whiteImplicitReverseFkSuppressSuppressImplicitReverseFK The entity of foreign property 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. (NullAllowed)
     */
    public void setWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppressSuppressImplicitReverseFK) {
        _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK = whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. */
    protected List<WhiteImplicitReverseFkRef> _whiteImplicitReverseFkRefList;

    /**
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The entity list of referrer property 'whiteImplicitReverseFkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitReverseFkRef> getWhiteImplicitReverseFkRefList() {
        if (_whiteImplicitReverseFkRefList == null) { _whiteImplicitReverseFkRefList = newReferrerList(); }
        return _whiteImplicitReverseFkRefList;
    }

    /**
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param whiteImplicitReverseFkRefList The entity list of referrer property 'whiteImplicitReverseFkRefList'. (NullAllowed)
     */
    public void setWhiteImplicitReverseFkRefList(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        _whiteImplicitReverseFkRefList = whiteImplicitReverseFkRefList;
    }

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
        if (other == null || !(other instanceof BsWhiteImplicitReverseFk)) { return false; }
        BsWhiteImplicitReverseFk otherEntity = (BsWhiteImplicitReverseFk)other;
        if (!xSV(getWhiteImplicitReverseFkId(), otherEntity.getWhiteImplicitReverseFkId())) { return false; }
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
        result = xCH(result, getWhiteImplicitReverseFkId());
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
        if (_whiteImplicitReverseFkRefWithImplicitReverseFK != null)
        { sb.append(l).append(xbRDS(_whiteImplicitReverseFkRefWithImplicitReverseFK, "whiteImplicitReverseFkRefWithImplicitReverseFK")); }
        if (_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK != null)
        { sb.append(l).append(xbRDS(_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK, "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK")); }
        if (_whiteImplicitReverseFkRefList != null) { for (Entity e : _whiteImplicitReverseFkRefList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteImplicitReverseFkRefList")); } } }
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
        sb.append(delimiter).append(getWhiteImplicitReverseFkId());
        sb.append(delimiter).append(getWhiteImplicitReverseFkName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteImplicitReverseFkRefWithImplicitReverseFK != null) { sb.append(c).append("whiteImplicitReverseFkRefWithImplicitReverseFK"); }
        if (_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK != null) { sb.append(c).append("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK"); }
        if (_whiteImplicitReverseFkRefList != null && !_whiteImplicitReverseFkRefList.isEmpty())
        { sb.append(c).append("whiteImplicitReverseFkRefList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteImplicitReverseFk clone() {
        try {
            return (WhiteImplicitReverseFk)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF} <br />
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkId() {
        return _whiteImplicitReverseFkId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF} <br />
     * @param whiteImplicitReverseFkId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkId(Integer whiteImplicitReverseFkId) {
        __modifiedProperties.addPropertyName("whiteImplicitReverseFkId");
        this._whiteImplicitReverseFkId = whiteImplicitReverseFkId;
    }

    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWhiteImplicitReverseFkName() {
        return _whiteImplicitReverseFkName;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} <br />
     * @param whiteImplicitReverseFkName The value of the column 'WHITE_IMPLICIT_REVERSE_FK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkName(String whiteImplicitReverseFkName) {
        __modifiedProperties.addPropertyName("whiteImplicitReverseFkName");
        this._whiteImplicitReverseFkName = whiteImplicitReverseFkName;
    }
}
