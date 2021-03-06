package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_compound_pk_ref as TABLE. <br />
 * <pre>
 * [primary-key]
 *     multiple_first_id, multiple_second_id
 * 
 * [column]
 *     multiple_first_id, multiple_second_id, ref_first_id, ref_second_id
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
 *     white_compound_pk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer multipleFirstId = entity.getMultipleFirstId();
 * Integer multipleSecondId = entity.getMultipleSecondId();
 * Integer refFirstId = entity.getRefFirstId();
 * Integer refSecondId = entity.getRefSecondId();
 * entity.setMultipleFirstId(multipleFirstId);
 * entity.setMultipleSecondId(multipleSecondId);
 * entity.setRefFirstId(refFirstId);
 * entity.setRefSecondId(refSecondId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRef implements Entity, Serializable, Cloneable {

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
    /** multiple_first_id: {PK, NotNull, int4(10)} */
    protected Integer _multipleFirstId;

    /** multiple_second_id: {PK, NotNull, int4(10)} */
    protected Integer _multipleSecondId;

    /** ref_first_id: {NotNull, int4(10), FK to white_compound_pk} */
    protected Integer _refFirstId;

    /** ref_second_id: {NotNull, int4(10), FK to white_compound_pk} */
    protected Integer _refSecondId;

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
        return "white_compound_pk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRef";
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
        if (getMultipleFirstId() == null) { return false; }
        if (getMultipleSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'. */
    protected WhiteCompoundPk _whiteCompoundPk;

    /**
     * white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * @return The entity of foreign property 'whiteCompoundPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPk getWhiteCompoundPk() {
        return _whiteCompoundPk;
    }

    /**
     * white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * @param whiteCompoundPk The entity of foreign property 'whiteCompoundPk'. (NullAllowed)
     */
    public void setWhiteCompoundPk(WhiteCompoundPk whiteCompoundPk) {
        _whiteCompoundPk = whiteCompoundPk;
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
        if (other == null || !(other instanceof BsWhiteCompoundPkRef)) { return false; }
        BsWhiteCompoundPkRef otherEntity = (BsWhiteCompoundPkRef)other;
        if (!xSV(getMultipleFirstId(), otherEntity.getMultipleFirstId())) { return false; }
        if (!xSV(getMultipleSecondId(), otherEntity.getMultipleSecondId())) { return false; }
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
        result = xCH(result, getMultipleFirstId());
        result = xCH(result, getMultipleSecondId());
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
        if (_whiteCompoundPk != null)
        { sb.append(l).append(xbRDS(_whiteCompoundPk, "whiteCompoundPk")); }
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
        sb.append(delimiter).append(getMultipleFirstId());
        sb.append(delimiter).append(getMultipleSecondId());
        sb.append(delimiter).append(getRefFirstId());
        sb.append(delimiter).append(getRefSecondId());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteCompoundPk != null) { sb.append(c).append("whiteCompoundPk"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteCompoundPkRef clone() {
        try {
            return (WhiteCompoundPkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] multiple_first_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'multiple_first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleFirstId() {
        return _multipleFirstId;
    }

    /**
     * [set] multiple_first_id: {PK, NotNull, int4(10)} <br />
     * @param multipleFirstId The value of the column 'multiple_first_id'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleFirstId(Integer multipleFirstId) {
        __modifiedProperties.addPropertyName("multipleFirstId");
        this._multipleFirstId = multipleFirstId;
    }

    /**
     * [get] multiple_second_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'multiple_second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleSecondId() {
        return _multipleSecondId;
    }

    /**
     * [set] multiple_second_id: {PK, NotNull, int4(10)} <br />
     * @param multipleSecondId The value of the column 'multiple_second_id'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleSecondId(Integer multipleSecondId) {
        __modifiedProperties.addPropertyName("multipleSecondId");
        this._multipleSecondId = multipleSecondId;
    }

    /**
     * [get] ref_first_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @return The value of the column 'ref_first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefFirstId() {
        return _refFirstId;
    }

    /**
     * [set] ref_first_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @param refFirstId The value of the column 'ref_first_id'. (basically NotNull if update: for the constraint)
     */
    public void setRefFirstId(Integer refFirstId) {
        __modifiedProperties.addPropertyName("refFirstId");
        this._refFirstId = refFirstId;
    }

    /**
     * [get] ref_second_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @return The value of the column 'ref_second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefSecondId() {
        return _refSecondId;
    }

    /**
     * [set] ref_second_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @param refSecondId The value of the column 'ref_second_id'. (basically NotNull if update: for the constraint)
     */
    public void setRefSecondId(Integer refSecondId) {
        __modifiedProperties.addPropertyName("refSecondId");
        this._refSecondId = refSecondId;
    }
}
