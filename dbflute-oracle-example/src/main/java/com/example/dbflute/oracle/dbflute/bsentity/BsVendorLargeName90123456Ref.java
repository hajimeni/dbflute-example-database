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
 * The entity of VENDOR_LARGE_NAME_90123456_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_LARGE_NAME_90123_REF_ID
 * 
 * [column]
 *     VENDOR_LARGE_NAME_90123_REF_ID, VENDOR_LARGE_NAME_901_REF_NAME, VENDOR_LARGE_NAME_901234567_ID
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
 *     VENDOR_LARGE_NAME_901234567890
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorLargeName901234567890
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorLargeName90123RefId = entity.getVendorLargeName90123RefId();
 * String vendorLargeName901RefName = entity.getVendorLargeName901RefName();
 * Long vendorLargeName901234567Id = entity.getVendorLargeName901234567Id();
 * entity.setVendorLargeName90123RefId(vendorLargeName90123RefId);
 * entity.setVendorLargeName901RefName(vendorLargeName901RefName);
 * entity.setVendorLargeName901234567Id(vendorLargeName901234567Id);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName90123456Ref implements Entity, Serializable, Cloneable {

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
    /** VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _vendorLargeName90123RefId;

    /** VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} */
    protected String _vendorLargeName901RefName;

    /** VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890} */
    protected Long _vendorLargeName901234567Id;

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
        return "VENDOR_LARGE_NAME_90123456_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeName90123456Ref";
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
        if (getVendorLargeName90123RefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'. */
    protected VendorLargeName901234567890 _vendorLargeName901234567890;

    /**
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @return The entity of foreign property 'vendorLargeName901234567890'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeName901234567890 getVendorLargeName901234567890() {
        return _vendorLargeName901234567890;
    }

    /**
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @param vendorLargeName901234567890 The entity of foreign property 'vendorLargeName901234567890'. (NullAllowed)
     */
    public void setVendorLargeName901234567890(VendorLargeName901234567890 vendorLargeName901234567890) {
        _vendorLargeName901234567890 = vendorLargeName901234567890;
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
        if (other == null || !(other instanceof BsVendorLargeName90123456Ref)) { return false; }
        BsVendorLargeName90123456Ref otherEntity = (BsVendorLargeName90123456Ref)other;
        if (!xSV(getVendorLargeName90123RefId(), otherEntity.getVendorLargeName90123RefId())) { return false; }
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
        result = xCH(result, getVendorLargeName90123RefId());
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
        if (_vendorLargeName901234567890 != null)
        { sb.append(l).append(xbRDS(_vendorLargeName901234567890, "vendorLargeName901234567890")); }
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
        sb.append(delimiter).append(getVendorLargeName90123RefId());
        sb.append(delimiter).append(getVendorLargeName901RefName());
        sb.append(delimiter).append(getVendorLargeName901234567Id());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_vendorLargeName901234567890 != null) { sb.append(c).append("vendorLargeName901234567890"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorLargeName90123456Ref clone() {
        try {
            return (VendorLargeName90123456Ref)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_90123_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorLargeName90123RefId() {
        return _vendorLargeName90123RefId;
    }

    /**
     * [set] VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param vendorLargeName90123RefId The value of the column 'VENDOR_LARGE_NAME_90123_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName90123RefId(Long vendorLargeName90123RefId) {
        __modifiedProperties.addPropertyName("vendorLargeName90123RefId");
        this._vendorLargeName90123RefId = vendorLargeName90123RefId;
    }

    /**
     * [get] VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_901_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getVendorLargeName901RefName() {
        return _vendorLargeName901RefName;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)} <br />
     * @param vendorLargeName901RefName The value of the column 'VENDOR_LARGE_NAME_901_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setVendorLargeName901RefName(String vendorLargeName901RefName) {
        __modifiedProperties.addPropertyName("vendorLargeName901RefName");
        this._vendorLargeName901RefName = vendorLargeName901RefName;
    }

    /**
     * [get] VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890} <br />
     * @return The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorLargeName901234567Id() {
        return _vendorLargeName901234567Id;
    }

    /**
     * [set] VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890} <br />
     * @param vendorLargeName901234567Id The value of the column 'VENDOR_LARGE_NAME_901234567_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorLargeName901234567Id(Long vendorLargeName901234567Id) {
        __modifiedProperties.addPropertyName("vendorLargeName901234567Id");
        this._vendorLargeName901234567Id = vendorLargeName901234567Id;
    }
}
