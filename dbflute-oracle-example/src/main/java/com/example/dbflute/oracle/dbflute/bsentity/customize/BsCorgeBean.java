package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of CORGE_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     CORGE_ID, CORGE_NAME, CORGE_DECIMAL, CORGE_DATE, CORGE_TIMESTAMP, CORGE_CLOB
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
 * Integer corgeId = entity.getCorgeId();
 * String corgeName = entity.getCorgeName();
 * java.math.BigDecimal corgeDecimal = entity.getCorgeDecimal();
 * java.util.Date corgeDate = entity.getCorgeDate();
 * java.sql.Timestamp corgeTimestamp = entity.getCorgeTimestamp();
 * String corgeClob = entity.getCorgeClob();
 * entity.setCorgeId(corgeId);
 * entity.setCorgeName(corgeName);
 * entity.setCorgeDecimal(corgeDecimal);
 * entity.setCorgeDate(corgeDate);
 * entity.setCorgeTimestamp(corgeTimestamp);
 * entity.setCorgeClob(corgeClob);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsCorgeBean implements Entity, Serializable, Cloneable {

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
    /** CORGE_ID: {NUMBER(8)} */
    protected Integer _corgeId;

    /** CORGE_NAME: {VARCHAR2(20)} */
    protected String _corgeName;

    /** CORGE_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _corgeDecimal;

    /** CORGE_DATE: {DATE} */
    protected java.util.Date _corgeDate;

    /** CORGE_TIMESTAMP: {TIMESTAMP} */
    protected java.sql.Timestamp _corgeTimestamp;

    /** CORGE_CLOB: {CLOB} */
    protected String _corgeClob;

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
        return "CORGE_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "corgeBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.CorgeBeanDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (other == null || !(other instanceof BsCorgeBean)) { return false; }
        BsCorgeBean otherEntity = (BsCorgeBean)other;
        if (!xSV(getCorgeId(), otherEntity.getCorgeId())) { return false; }
        if (!xSV(getCorgeName(), otherEntity.getCorgeName())) { return false; }
        if (!xSV(getCorgeDecimal(), otherEntity.getCorgeDecimal())) { return false; }
        if (!xSV(getCorgeDate(), otherEntity.getCorgeDate())) { return false; }
        if (!xSV(getCorgeTimestamp(), otherEntity.getCorgeTimestamp())) { return false; }
        if (!xSV(getCorgeClob(), otherEntity.getCorgeClob())) { return false; }
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
        result = xCH(result, getCorgeId());
        result = xCH(result, getCorgeName());
        result = xCH(result, getCorgeDecimal());
        result = xCH(result, getCorgeDate());
        result = xCH(result, getCorgeTimestamp());
        result = xCH(result, getCorgeClob());
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
        sb.append(delimiter).append(getCorgeId());
        sb.append(delimiter).append(getCorgeName());
        sb.append(delimiter).append(getCorgeDecimal());
        sb.append(delimiter).append(xfUD(getCorgeDate()));
        sb.append(delimiter).append(getCorgeTimestamp());
        sb.append(delimiter).append(getCorgeClob());
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
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public CorgeBean clone() {
        try {
            return (CorgeBean)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CORGE_ID: {NUMBER(8)} <br />
     * @return The value of the column 'CORGE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCorgeId() {
        return _corgeId;
    }

    /**
     * [set] CORGE_ID: {NUMBER(8)} <br />
     * @param corgeId The value of the column 'CORGE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeId(Integer corgeId) {
        __modifiedProperties.addPropertyName("corgeId");
        this._corgeId = corgeId;
    }

    /**
     * [get] CORGE_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'CORGE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCorgeName() {
        return _corgeName;
    }

    /**
     * [set] CORGE_NAME: {VARCHAR2(20)} <br />
     * @param corgeName The value of the column 'CORGE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeName(String corgeName) {
        __modifiedProperties.addPropertyName("corgeName");
        this._corgeName = corgeName;
    }

    /**
     * [get] CORGE_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'CORGE_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCorgeDecimal() {
        return _corgeDecimal;
    }

    /**
     * [set] CORGE_DECIMAL: {NUMBER(5, 3)} <br />
     * @param corgeDecimal The value of the column 'CORGE_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeDecimal(java.math.BigDecimal corgeDecimal) {
        __modifiedProperties.addPropertyName("corgeDecimal");
        this._corgeDecimal = corgeDecimal;
    }

    /**
     * [get] CORGE_DATE: {DATE} <br />
     * @return The value of the column 'CORGE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getCorgeDate() {
        return _corgeDate;
    }

    /**
     * [set] CORGE_DATE: {DATE} <br />
     * @param corgeDate The value of the column 'CORGE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeDate(java.util.Date corgeDate) {
        __modifiedProperties.addPropertyName("corgeDate");
        this._corgeDate = corgeDate;
    }

    /**
     * [get] CORGE_TIMESTAMP: {TIMESTAMP} <br />
     * @return The value of the column 'CORGE_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCorgeTimestamp() {
        return _corgeTimestamp;
    }

    /**
     * [set] CORGE_TIMESTAMP: {TIMESTAMP} <br />
     * @param corgeTimestamp The value of the column 'CORGE_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeTimestamp(java.sql.Timestamp corgeTimestamp) {
        __modifiedProperties.addPropertyName("corgeTimestamp");
        this._corgeTimestamp = corgeTimestamp;
    }

    /** The value type annotation. {CLOB} */
    public static String corgeClob_VALUE_TYPE = "stringClobType";

    /**
     * [get] CORGE_CLOB: {CLOB} <br />
     * @return The value of the column 'CORGE_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getCorgeClob() {
        return _corgeClob;
    }

    /**
     * [set] CORGE_CLOB: {CLOB} <br />
     * @param corgeClob The value of the column 'CORGE_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeClob(String corgeClob) {
        __modifiedProperties.addPropertyName("corgeClob");
        this._corgeClob = corgeClob;
    }
}
