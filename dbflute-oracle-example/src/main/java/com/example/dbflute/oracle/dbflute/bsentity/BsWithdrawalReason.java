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
 * The entity of WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 * 
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     SYNONYM_MEMBER_WITHDRAWAL, MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     synonymMemberWithdrawalList, memberWithdrawalList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonText = entity.getWithdrawalReasonText();
 * Long displayOrder = entity.getDisplayOrder();
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonText(withdrawalReasonText);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWithdrawalReason implements Entity, Serializable, Cloneable {

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
    /** WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} */
    protected String _withdrawalReasonCode;

    /** WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)} */
    protected String _withdrawalReasonText;

    /** DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} */
    protected Long _displayOrder;

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
        return "WITHDRAWAL_REASON";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "withdrawalReason";
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
        if (getWithdrawalReasonCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'. */
    protected List<SynonymMemberWithdrawal> _synonymMemberWithdrawalList;

    /**
     * SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'.
     * @return The entity list of referrer property 'synonymMemberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymMemberWithdrawal> getSynonymMemberWithdrawalList() {
        if (_synonymMemberWithdrawalList == null) { _synonymMemberWithdrawalList = newReferrerList(); }
        return _synonymMemberWithdrawalList;
    }

    /**
     * SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'.
     * @param synonymMemberWithdrawalList The entity list of referrer property 'synonymMemberWithdrawalList'. (NullAllowed)
     */
    public void setSynonymMemberWithdrawalList(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        _synonymMemberWithdrawalList = synonymMemberWithdrawalList;
    }

    /** MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'. */
    protected List<MemberWithdrawal> _memberWithdrawalList;

    /**
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @return The entity list of referrer property 'memberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberWithdrawal> getMemberWithdrawalList() {
        if (_memberWithdrawalList == null) { _memberWithdrawalList = newReferrerList(); }
        return _memberWithdrawalList;
    }

    /**
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @param memberWithdrawalList The entity list of referrer property 'memberWithdrawalList'. (NullAllowed)
     */
    public void setMemberWithdrawalList(List<MemberWithdrawal> memberWithdrawalList) {
        _memberWithdrawalList = memberWithdrawalList;
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
        if (other == null || !(other instanceof BsWithdrawalReason)) { return false; }
        BsWithdrawalReason otherEntity = (BsWithdrawalReason)other;
        if (!xSV(getWithdrawalReasonCode(), otherEntity.getWithdrawalReasonCode())) { return false; }
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
        result = xCH(result, getWithdrawalReasonCode());
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
        if (_synonymMemberWithdrawalList != null) { for (Entity e : _synonymMemberWithdrawalList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "synonymMemberWithdrawalList")); } } }
        if (_memberWithdrawalList != null) { for (Entity e : _memberWithdrawalList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "memberWithdrawalList")); } } }
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
        sb.append(delimiter).append(getWithdrawalReasonCode());
        sb.append(delimiter).append(getWithdrawalReasonText());
        sb.append(delimiter).append(getDisplayOrder());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_synonymMemberWithdrawalList != null && !_synonymMemberWithdrawalList.isEmpty())
        { sb.append(c).append("synonymMemberWithdrawalList"); }
        if (_memberWithdrawalList != null && !_memberWithdrawalList.isEmpty())
        { sb.append(c).append("memberWithdrawalList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WithdrawalReason clone() {
        try {
            return (WithdrawalReason)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonCode() {
        return _withdrawalReasonCode;
    }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.addPropertyName("withdrawalReasonCode");
        this._withdrawalReasonCode = withdrawalReasonCode;
    }

    /** The value type annotation. {NotNull, CLOB(4000)} */
    public static String withdrawalReasonText_VALUE_TYPE = "stringClobType";

    /**
     * [get] WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonText() {
        return _withdrawalReasonText;
    }

    /**
     * [set] WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)} <br />
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonText(String withdrawalReasonText) {
        __modifiedProperties.addPropertyName("withdrawalReasonText");
        this._withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Long getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Long displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        this._displayOrder = displayOrder;
    }
}
