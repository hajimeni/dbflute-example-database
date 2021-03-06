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
 * The entity of SYNONYM_REF_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     REF_EXCEPT_ID
 * 
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
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
 *     SYNONYM_EXCEPT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     synonymExcept
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refExceptId = entity.getRefExceptId();
 * Long exceptId = entity.getExceptId();
 * entity.setRefExceptId(refExceptId);
 * entity.setExceptId(exceptId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymRefExcept implements Entity, Serializable, Cloneable {

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
    /** REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refExceptId;

    /** EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT} */
    protected Long _exceptId;

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
        return "SYNONYM_REF_EXCEPT";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymRefExcept";
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
        if (getRefExceptId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'. */
    protected SynonymExcept _synonymExcept;

    /**
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @return The entity of foreign property 'synonymExcept'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public SynonymExcept getSynonymExcept() {
        return _synonymExcept;
    }

    /**
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @param synonymExcept The entity of foreign property 'synonymExcept'. (NullAllowed)
     */
    public void setSynonymExcept(SynonymExcept synonymExcept) {
        _synonymExcept = synonymExcept;
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
        if (other == null || !(other instanceof BsSynonymRefExcept)) { return false; }
        BsSynonymRefExcept otherEntity = (BsSynonymRefExcept)other;
        if (!xSV(getRefExceptId(), otherEntity.getRefExceptId())) { return false; }
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
        result = xCH(result, getRefExceptId());
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
        if (_synonymExcept != null)
        { sb.append(l).append(xbRDS(_synonymExcept, "synonymExcept")); }
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
        sb.append(delimiter).append(getRefExceptId());
        sb.append(delimiter).append(getExceptId());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_synonymExcept != null) { sb.append(c).append("synonymExcept"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public SynonymRefExcept clone() {
        try {
            return (SynonymRefExcept)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefExceptId() {
        return _refExceptId;
    }

    /**
     * [set] REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refExceptId The value of the column 'REF_EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefExceptId(Long refExceptId) {
        __modifiedProperties.addPropertyName("refExceptId");
        this._refExceptId = refExceptId;
    }

    /**
     * [get] EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT} <br />
     * @return The value of the column 'EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptId() {
        return _exceptId;
    }

    /**
     * [set] EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT} <br />
     * @param exceptId The value of the column 'EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptId(Long exceptId) {
        __modifiedProperties.addPropertyName("exceptId");
        this._exceptId = exceptId;
    }
}
