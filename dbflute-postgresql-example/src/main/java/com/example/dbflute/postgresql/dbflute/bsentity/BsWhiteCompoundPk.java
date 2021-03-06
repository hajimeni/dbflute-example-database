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
 * The entity of white_compound_pk as TABLE. <br />
 * <pre>
 * [primary-key]
 *     pk_first_id, pk_second_id
 * 
 * [column]
 *     pk_first_id, pk_second_id, pk_name
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
 *     white_compound_pk_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteCompoundPkRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer pkFirstId = entity.getPkFirstId();
 * Integer pkSecondId = entity.getPkSecondId();
 * String pkName = entity.getPkName();
 * entity.setPkFirstId(pkFirstId);
 * entity.setPkSecondId(pkSecondId);
 * entity.setPkName(pkName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPk implements Entity, Serializable, Cloneable {

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
    /** pk_first_id: {PK, NotNull, int4(10)} */
    protected Integer _pkFirstId;

    /** pk_second_id: {PK, NotNull, int4(10)} */
    protected Integer _pkSecondId;

    /** pk_name: {NotNull, varchar(200)} */
    protected String _pkName;

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
        return "white_compound_pk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPk";
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
        if (getPkFirstId() == null) { return false; }
        if (getPkSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'. */
    protected List<WhiteCompoundPkRef> _whiteCompoundPkRefList;

    /**
     * white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRef> getWhiteCompoundPkRefList() {
        if (_whiteCompoundPkRefList == null) { _whiteCompoundPkRefList = newReferrerList(); }
        return _whiteCompoundPkRefList;
    }

    /**
     * white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'.
     * @param whiteCompoundPkRefList The entity list of referrer property 'whiteCompoundPkRefList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefList(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        _whiteCompoundPkRefList = whiteCompoundPkRefList;
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
        if (other == null || !(other instanceof BsWhiteCompoundPk)) { return false; }
        BsWhiteCompoundPk otherEntity = (BsWhiteCompoundPk)other;
        if (!xSV(getPkFirstId(), otherEntity.getPkFirstId())) { return false; }
        if (!xSV(getPkSecondId(), otherEntity.getPkSecondId())) { return false; }
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
        result = xCH(result, getPkFirstId());
        result = xCH(result, getPkSecondId());
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
        if (_whiteCompoundPkRefList != null) { for (Entity e : _whiteCompoundPkRefList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteCompoundPkRefList")); } } }
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
        sb.append(delimiter).append(getPkFirstId());
        sb.append(delimiter).append(getPkSecondId());
        sb.append(delimiter).append(getPkName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteCompoundPkRefList != null && !_whiteCompoundPkRefList.isEmpty())
        { sb.append(c).append("whiteCompoundPkRefList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteCompoundPk clone() {
        try {
            return (WhiteCompoundPk)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] pk_first_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'pk_first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkFirstId() {
        return _pkFirstId;
    }

    /**
     * [set] pk_first_id: {PK, NotNull, int4(10)} <br />
     * @param pkFirstId The value of the column 'pk_first_id'. (basically NotNull if update: for the constraint)
     */
    public void setPkFirstId(Integer pkFirstId) {
        __modifiedProperties.addPropertyName("pkFirstId");
        this._pkFirstId = pkFirstId;
    }

    /**
     * [get] pk_second_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'pk_second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkSecondId() {
        return _pkSecondId;
    }

    /**
     * [set] pk_second_id: {PK, NotNull, int4(10)} <br />
     * @param pkSecondId The value of the column 'pk_second_id'. (basically NotNull if update: for the constraint)
     */
    public void setPkSecondId(Integer pkSecondId) {
        __modifiedProperties.addPropertyName("pkSecondId");
        this._pkSecondId = pkSecondId;
    }

    /**
     * [get] pk_name: {NotNull, varchar(200)} <br />
     * @return The value of the column 'pk_name'. (basically NotNull if selected: for the constraint)
     */
    public String getPkName() {
        return _pkName;
    }

    /**
     * [set] pk_name: {NotNull, varchar(200)} <br />
     * @param pkName The value of the column 'pk_name'. (basically NotNull if update: for the constraint)
     */
    public void setPkName(String pkName) {
        __modifiedProperties.addPropertyName("pkName");
        this._pkName = pkName;
    }
}
