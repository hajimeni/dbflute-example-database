package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of nextschema.white_same_name_ref as TABLE. <br />
 * <pre>
 * [primary-key]
 *     same_name_ref_id
 * 
 * [column]
 *     same_name_ref_id, same_name_id, next_ref_date
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
 *     white_same_name
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSameName
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long sameNameRefId = entity.getSameNameRefId();
 * Integer sameNameId = entity.getSameNameId();
 * java.util.Date nextRefDate = entity.getNextRefDate();
 * entity.setSameNameRefId(sameNameRefId);
 * entity.setSameNameId(sameNameId);
 * entity.setNextRefDate(nextRefDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameNameRef implements Entity, Serializable, Cloneable {

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
    /** same_name_ref_id: {PK, NotNull, int8(19)} */
    protected Long _sameNameRefId;

    /** same_name_id: {NotNull, int4(10), FK to white_same_name} */
    protected Integer _sameNameId;

    /** next_ref_date: {date(13)} */
    protected java.util.Date _nextRefDate;

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
        return "nextschema.white_same_name_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSameNameRef";
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
        if (getSameNameRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** nextschema.white_same_name by my same_name_id, named 'whiteSameName'. */
    protected NextschemaWhiteSameName _whiteSameName;

    /**
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The entity of foreign property 'whiteSameName'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public NextschemaWhiteSameName getWhiteSameName() {
        return _whiteSameName;
    }

    /**
     * nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @param whiteSameName The entity of foreign property 'whiteSameName'. (NullAllowed)
     */
    public void setWhiteSameName(NextschemaWhiteSameName whiteSameName) {
        _whiteSameName = whiteSameName;
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
        if (other == null || !(other instanceof BsNextschemaWhiteSameNameRef)) { return false; }
        BsNextschemaWhiteSameNameRef otherEntity = (BsNextschemaWhiteSameNameRef)other;
        if (!xSV(getSameNameRefId(), otherEntity.getSameNameRefId())) { return false; }
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
        result = xCH(result, getSameNameRefId());
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
        if (_whiteSameName != null)
        { sb.append(l).append(xbRDS(_whiteSameName, "whiteSameName")); }
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
        sb.append(delimiter).append(getSameNameRefId());
        sb.append(delimiter).append(getSameNameId());
        sb.append(delimiter).append(xfUD(getNextRefDate()));
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return InternalUtil.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteSameName != null) { sb.append(c).append("whiteSameName"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public NextschemaWhiteSameNameRef clone() {
        try {
            return (NextschemaWhiteSameNameRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_ref_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'same_name_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameRefId() {
        return _sameNameRefId;
    }

    /**
     * [set] same_name_ref_id: {PK, NotNull, int8(19)} <br />
     * @param sameNameRefId The value of the column 'same_name_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameRefId(Long sameNameRefId) {
        __modifiedProperties.addPropertyName("sameNameRefId");
        this._sameNameRefId = sameNameRefId;
    }

    /**
     * [get] same_name_id: {NotNull, int4(10), FK to white_same_name} <br />
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameId() {
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {NotNull, int4(10), FK to white_same_name} <br />
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Integer sameNameId) {
        __modifiedProperties.addPropertyName("sameNameId");
        this._sameNameId = sameNameId;
    }

    /**
     * [get] next_ref_date: {date(13)} <br />
     * @return The value of the column 'next_ref_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getNextRefDate() {
        return _nextRefDate;
    }

    /**
     * [set] next_ref_date: {date(13)} <br />
     * @param nextRefDate The value of the column 'next_ref_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNextRefDate(java.util.Date nextRefDate) {
        __modifiedProperties.addPropertyName("nextRefDate");
        this._nextRefDate = nextRefDate;
    }
}
