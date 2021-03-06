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
 * The entity of WHITE_VARIANT_RELATION_MASTER_BAR as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MASTER_BAR_ID
 * 
 * [column]
 *     MASTER_BAR_ID, MASTER_BAR_NAME
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
 *     white_variant_relation_referrer
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long masterBarId = entity.getMasterBarId();
 * String masterBarName = entity.getMasterBarName();
 * entity.setMasterBarId(masterBarId);
 * entity.setMasterBarName(masterBarName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterBar implements Entity, Serializable, Cloneable {

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
    /** MASTER_BAR_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _masterBarId;

    /** MASTER_BAR_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterBarName;

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
        return "white_variant_relation_master_bar";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationMasterBar";
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
        if (getMasterBarId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'. */
    protected List<WhiteVariantRelationReferrer> _whiteVariantRelationReferrerAsVariantList;

    /**
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @return The entity list of referrer property 'whiteVariantRelationReferrerAsVariantList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteVariantRelationReferrer> getWhiteVariantRelationReferrerAsVariantList() {
        if (_whiteVariantRelationReferrerAsVariantList == null) { _whiteVariantRelationReferrerAsVariantList = newReferrerList(); }
        return _whiteVariantRelationReferrerAsVariantList;
    }

    /**
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @param whiteVariantRelationReferrerAsVariantList The entity list of referrer property 'whiteVariantRelationReferrerAsVariantList'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerAsVariantList) {
        _whiteVariantRelationReferrerAsVariantList = whiteVariantRelationReferrerAsVariantList;
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
        if (other == null || !(other instanceof BsWhiteVariantRelationMasterBar)) { return false; }
        BsWhiteVariantRelationMasterBar otherEntity = (BsWhiteVariantRelationMasterBar)other;
        if (!xSV(getMasterBarId(), otherEntity.getMasterBarId())) { return false; }
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
        result = xCH(result, getMasterBarId());
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
        if (_whiteVariantRelationReferrerAsVariantList != null) { for (Entity e : _whiteVariantRelationReferrerAsVariantList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteVariantRelationReferrerAsVariantList")); } } }
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
        sb.append(delimiter).append(getMasterBarId());
        sb.append(delimiter).append(getMasterBarName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteVariantRelationReferrerAsVariantList != null && !_whiteVariantRelationReferrerAsVariantList.isEmpty())
        { sb.append(c).append("whiteVariantRelationReferrerAsVariantList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteVariantRelationMasterBar clone() {
        try {
            return (WhiteVariantRelationMasterBar)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_BAR_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MASTER_BAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterBarId() {
        return _masterBarId;
    }

    /**
     * [set] MASTER_BAR_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param masterBarId The value of the column 'MASTER_BAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterBarId(Long masterBarId) {
        __modifiedProperties.addPropertyName("masterBarId");
        this._masterBarId = masterBarId;
    }

    /**
     * [get] MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MASTER_BAR_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterBarName() {
        return _masterBarName;
    }

    /**
     * [set] MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br />
     * @param masterBarName The value of the column 'MASTER_BAR_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterBarName(String masterBarName) {
        __modifiedProperties.addPropertyName("masterBarName");
        this._masterBarName = masterBarName;
    }
}
