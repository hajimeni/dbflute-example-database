package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_REF_NEXT_TARGET as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_NEXT_TARGET_ID
 * 
 * [column]
 *     REF_NEXT_TARGET_ID, NEXT_TARGET_CODE
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
 *     NEXT_SCHEMA_PRODUCT_STATUS
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     nextSchemaProductStatus
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refNextTargetId = entity.getRefNextTargetId();
 * String nextTargetCode = entity.getNextTargetCode();
 * entity.setRefNextTargetId(refNextTargetId);
 * entity.setNextTargetCode(nextTargetCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefNextTarget implements Entity, Serializable, Cloneable {

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
    /** REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refNextTargetId;

    /** NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} */
    protected String _nextTargetCode;

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
        return "WHITE_REF_NEXT_TARGET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteRefNextTarget";
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
        if (getRefNextTargetId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'. */
    protected NextSchemaProductStatus _nextSchemaProductStatus;

    /**
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @return The entity of foreign property 'nextSchemaProductStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public NextSchemaProductStatus getNextSchemaProductStatus() {
        return _nextSchemaProductStatus;
    }

    /**
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @param nextSchemaProductStatus The entity of foreign property 'nextSchemaProductStatus'. (NullAllowed)
     */
    public void setNextSchemaProductStatus(NextSchemaProductStatus nextSchemaProductStatus) {
        _nextSchemaProductStatus = nextSchemaProductStatus;
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
        if (other == null || !(other instanceof BsWhiteRefNextTarget)) { return false; }
        BsWhiteRefNextTarget otherEntity = (BsWhiteRefNextTarget)other;
        if (!xSV(getRefNextTargetId(), otherEntity.getRefNextTargetId())) { return false; }
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
        result = xCH(result, getRefNextTargetId());
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
        if (_nextSchemaProductStatus != null)
        { sb.append(l).append(xbRDS(_nextSchemaProductStatus, "nextSchemaProductStatus")); }
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
        sb.append(delimiter).append(getRefNextTargetId());
        sb.append(delimiter).append(getNextTargetCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_nextSchemaProductStatus != null) { sb.append(c).append("nextSchemaProductStatus"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteRefNextTarget clone() {
        try {
            return (WhiteRefNextTarget)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_NEXT_TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefNextTargetId() {
        return _refNextTargetId;
    }

    /**
     * [set] REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refNextTargetId The value of the column 'REF_NEXT_TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefNextTargetId(Long refNextTargetId) {
        __modifiedProperties.addPropertyName("refNextTargetId");
        this._refNextTargetId = refNextTargetId;
    }

    /**
     * [get] NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br />
     * @return The value of the column 'NEXT_TARGET_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNextTargetCode() {
        return _nextTargetCode;
    }

    /**
     * [set] NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br />
     * @param nextTargetCode The value of the column 'NEXT_TARGET_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setNextTargetCode(String nextTargetCode) {
        __modifiedProperties.addPropertyName("nextTargetCode");
        this._nextTargetCode = nextTargetCode;
    }
}
