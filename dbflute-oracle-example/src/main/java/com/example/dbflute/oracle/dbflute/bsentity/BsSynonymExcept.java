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
 * The entity of SYNONYM_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     EXCEPT_ID
 * 
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     SYNONYM_REF_EXCEPT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     synonymRefExceptList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long exceptId = entity.getExceptId();
 * String exceptName = entity.getExceptName();
 * entity.setExceptId(exceptId);
 * entity.setExceptName(exceptName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymExcept implements Entity, Serializable, Cloneable {

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
    /** EXCEPT_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _exceptId;

    /** EXCEPT_NAME: {VARCHAR2(256)} */
    protected String _exceptName;

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
        return "SYNONYM_EXCEPT";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymExcept";
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
        if (getExceptId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'. */
    protected List<SynonymRefExcept> _synonymRefExceptList;

    /**
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * @return The entity list of referrer property 'synonymRefExceptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymRefExcept> getSynonymRefExceptList() {
        if (_synonymRefExceptList == null) { _synonymRefExceptList = newReferrerList(); }
        return _synonymRefExceptList;
    }

    /**
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * @param synonymRefExceptList The entity list of referrer property 'synonymRefExceptList'. (NullAllowed)
     */
    public void setSynonymRefExceptList(List<SynonymRefExcept> synonymRefExceptList) {
        _synonymRefExceptList = synonymRefExceptList;
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
        if (other == null || !(other instanceof BsSynonymExcept)) { return false; }
        BsSynonymExcept otherEntity = (BsSynonymExcept)other;
        if (!xSV(getExceptId(), otherEntity.getExceptId())) { return false; }
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
        result = xCH(result, getExceptId());
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
        if (_synonymRefExceptList != null) { for (Entity e : _synonymRefExceptList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "synonymRefExceptList")); } } }
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
        sb.append(delimiter).append(getExceptId());
        sb.append(delimiter).append(getExceptName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_synonymRefExceptList != null && !_synonymRefExceptList.isEmpty())
        { sb.append(c).append("synonymRefExceptList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public SynonymExcept clone() {
        try {
            return (SynonymExcept)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptId() {
        return _exceptId;
    }

    /**
     * [set] EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param exceptId The value of the column 'EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptId(Long exceptId) {
        __modifiedProperties.addPropertyName("exceptId");
        this._exceptId = exceptId;
    }

    /**
     * [get] EXCEPT_NAME: {VARCHAR2(256)} <br />
     * @return The value of the column 'EXCEPT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getExceptName() {
        return _exceptName;
    }

    /**
     * [set] EXCEPT_NAME: {VARCHAR2(256)} <br />
     * @param exceptName The value of the column 'EXCEPT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExceptName(String exceptName) {
        __modifiedProperties.addPropertyName("exceptName");
        this._exceptName = exceptName;
    }
}
