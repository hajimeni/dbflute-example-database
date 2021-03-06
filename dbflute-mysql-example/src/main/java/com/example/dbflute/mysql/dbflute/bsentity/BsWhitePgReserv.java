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
 * The entity of WHITE_PG_RESERV as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CLASS
 * 
 * [column]
 *     CLASS, CASE, PACKAGE, DEFAULT, NEW, NATIVE, VOID, PUBLIC, PROTECTED, PRIVATE, INTERFACE, ABSTRACT, FINAL, FINALLY, RETURN, DOUBLE, FLOAT, SHORT, TYPE, RESERV_NAME
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
 *     white_pg_reserv_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whitePgReservRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer classSynonym = entity.getClassSynonym();
 * Integer caseSynonym = entity.getCaseSynonym();
 * Integer packageSynonym = entity.getPackageSynonym();
 * Integer defaultSynonym = entity.getDefaultSynonym();
 * Integer newSynonym = entity.getNewSynonym();
 * Integer nativeSynonym = entity.getNativeSynonym();
 * Integer voidSynonym = entity.getVoidSynonym();
 * Integer publicSynonym = entity.getPublicSynonym();
 * Integer protectedSynonym = entity.getProtectedSynonym();
 * Integer privateSynonym = entity.getPrivateSynonym();
 * Integer interfaceSynonym = entity.getInterfaceSynonym();
 * Integer abstractSynonym = entity.getAbstractSynonym();
 * Integer finalSynonym = entity.getFinalSynonym();
 * Integer finallySynonym = entity.getFinallySynonym();
 * Integer returnSynonym = entity.getReturnSynonym();
 * Integer doubleSynonym = entity.getDoubleSynonym();
 * Integer floatSynonym = entity.getFloatSynonym();
 * Integer shortSynonym = entity.getShortSynonym();
 * String type = entity.getType();
 * String reservName = entity.getReservName();
 * entity.setClassSynonym(classSynonym);
 * entity.setCaseSynonym(caseSynonym);
 * entity.setPackageSynonym(packageSynonym);
 * entity.setDefaultSynonym(defaultSynonym);
 * entity.setNewSynonym(newSynonym);
 * entity.setNativeSynonym(nativeSynonym);
 * entity.setVoidSynonym(voidSynonym);
 * entity.setPublicSynonym(publicSynonym);
 * entity.setProtectedSynonym(protectedSynonym);
 * entity.setPrivateSynonym(privateSynonym);
 * entity.setInterfaceSynonym(interfaceSynonym);
 * entity.setAbstractSynonym(abstractSynonym);
 * entity.setFinalSynonym(finalSynonym);
 * entity.setFinallySynonym(finallySynonym);
 * entity.setReturnSynonym(returnSynonym);
 * entity.setDoubleSynonym(doubleSynonym);
 * entity.setFloatSynonym(floatSynonym);
 * entity.setShortSynonym(shortSynonym);
 * entity.setType(type);
 * entity.setReservName(reservName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReserv implements Entity, Serializable, Cloneable {

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
    /** ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)} */
    protected Integer _classSynonym;

    /** ((using DBFlute synonym))CASE: {INT(10)} */
    protected Integer _caseSynonym;

    /** ((using DBFlute synonym))PACKAGE: {INT(10)} */
    protected Integer _packageSynonym;

    /** ((using DBFlute synonym))DEFAULT: {INT(10)} */
    protected Integer _defaultSynonym;

    /** ((using DBFlute synonym))NEW: {INT(10)} */
    protected Integer _newSynonym;

    /** ((using DBFlute synonym))NATIVE: {INT(10)} */
    protected Integer _nativeSynonym;

    /** ((using DBFlute synonym))VOID: {INT(10)} */
    protected Integer _voidSynonym;

    /** ((using DBFlute synonym))PUBLIC: {INT(10)} */
    protected Integer _publicSynonym;

    /** ((using DBFlute synonym))PROTECTED: {INT(10)} */
    protected Integer _protectedSynonym;

    /** ((using DBFlute synonym))PRIVATE: {INT(10)} */
    protected Integer _privateSynonym;

    /** ((using DBFlute synonym))INTERFACE: {INT(10)} */
    protected Integer _interfaceSynonym;

    /** ((using DBFlute synonym))ABSTRACT: {INT(10)} */
    protected Integer _abstractSynonym;

    /** ((using DBFlute synonym))FINAL: {INT(10)} */
    protected Integer _finalSynonym;

    /** ((using DBFlute synonym))FINALLY: {INT(10)} */
    protected Integer _finallySynonym;

    /** ((using DBFlute synonym))RETURN: {INT(10)} */
    protected Integer _returnSynonym;

    /** ((using DBFlute synonym))DOUBLE: {INT(10)} */
    protected Integer _doubleSynonym;

    /** ((using DBFlute synonym))FLOAT: {INT(10)} */
    protected Integer _floatSynonym;

    /** ((using DBFlute synonym))SHORT: {INT(10)} */
    protected Integer _shortSynonym;

    /** TYPE: {CHAR(3)} */
    protected String _type;

    /** RESERV_NAME: {NotNull, VARCHAR(32)} */
    protected String _reservName;

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
        return "white_pg_reserv";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePgReserv";
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
        if (getClassSynonym() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'. */
    protected List<WhitePgReservRef> _whitePgReservRefList;

    /**
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * @return The entity list of referrer property 'whitePgReservRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePgReservRef> getWhitePgReservRefList() {
        if (_whitePgReservRefList == null) { _whitePgReservRefList = newReferrerList(); }
        return _whitePgReservRefList;
    }

    /**
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * @param whitePgReservRefList The entity list of referrer property 'whitePgReservRefList'. (NullAllowed)
     */
    public void setWhitePgReservRefList(List<WhitePgReservRef> whitePgReservRefList) {
        _whitePgReservRefList = whitePgReservRefList;
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
        if (other == null || !(other instanceof BsWhitePgReserv)) { return false; }
        BsWhitePgReserv otherEntity = (BsWhitePgReserv)other;
        if (!xSV(getClassSynonym(), otherEntity.getClassSynonym())) { return false; }
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
        result = xCH(result, getClassSynonym());
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
        if (_whitePgReservRefList != null) { for (Entity e : _whitePgReservRefList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whitePgReservRefList")); } } }
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
        sb.append(delimiter).append(getClassSynonym());
        sb.append(delimiter).append(getCaseSynonym());
        sb.append(delimiter).append(getPackageSynonym());
        sb.append(delimiter).append(getDefaultSynonym());
        sb.append(delimiter).append(getNewSynonym());
        sb.append(delimiter).append(getNativeSynonym());
        sb.append(delimiter).append(getVoidSynonym());
        sb.append(delimiter).append(getPublicSynonym());
        sb.append(delimiter).append(getProtectedSynonym());
        sb.append(delimiter).append(getPrivateSynonym());
        sb.append(delimiter).append(getInterfaceSynonym());
        sb.append(delimiter).append(getAbstractSynonym());
        sb.append(delimiter).append(getFinalSynonym());
        sb.append(delimiter).append(getFinallySynonym());
        sb.append(delimiter).append(getReturnSynonym());
        sb.append(delimiter).append(getDoubleSynonym());
        sb.append(delimiter).append(getFloatSynonym());
        sb.append(delimiter).append(getShortSynonym());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getReservName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whitePgReservRefList != null && !_whitePgReservRefList.isEmpty())
        { sb.append(c).append("whitePgReservRefList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePgReserv clone() {
        try {
            return (WhitePgReserv)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'CLASS'. (basically NotNull if selected: for the constraint)
     */
    public Integer getClassSynonym() {
        return _classSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)} <br />
     * @param classSynonym The value of the column 'CLASS'. (basically NotNull if update: for the constraint)
     */
    public void setClassSynonym(Integer classSynonym) {
        __modifiedProperties.addPropertyName("classSynonym");
        this._classSynonym = classSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))CASE: {INT(10)} <br />
     * @return The value of the column 'CASE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCaseSynonym() {
        return _caseSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CASE: {INT(10)} <br />
     * @param caseSynonym The value of the column 'CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseSynonym(Integer caseSynonym) {
        __modifiedProperties.addPropertyName("caseSynonym");
        this._caseSynonym = caseSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PACKAGE: {INT(10)} <br />
     * @return The value of the column 'PACKAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPackageSynonym() {
        return _packageSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PACKAGE: {INT(10)} <br />
     * @param packageSynonym The value of the column 'PACKAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackageSynonym(Integer packageSynonym) {
        __modifiedProperties.addPropertyName("packageSynonym");
        this._packageSynonym = packageSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))DEFAULT: {INT(10)} <br />
     * @return The value of the column 'DEFAULT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDefaultSynonym() {
        return _defaultSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))DEFAULT: {INT(10)} <br />
     * @param defaultSynonym The value of the column 'DEFAULT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefaultSynonym(Integer defaultSynonym) {
        __modifiedProperties.addPropertyName("defaultSynonym");
        this._defaultSynonym = defaultSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))NEW: {INT(10)} <br />
     * @return The value of the column 'NEW'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNewSynonym() {
        return _newSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))NEW: {INT(10)} <br />
     * @param newSynonym The value of the column 'NEW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNewSynonym(Integer newSynonym) {
        __modifiedProperties.addPropertyName("newSynonym");
        this._newSynonym = newSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))NATIVE: {INT(10)} <br />
     * @return The value of the column 'NATIVE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNativeSynonym() {
        return _nativeSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))NATIVE: {INT(10)} <br />
     * @param nativeSynonym The value of the column 'NATIVE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNativeSynonym(Integer nativeSynonym) {
        __modifiedProperties.addPropertyName("nativeSynonym");
        this._nativeSynonym = nativeSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))VOID: {INT(10)} <br />
     * @return The value of the column 'VOID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getVoidSynonym() {
        return _voidSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))VOID: {INT(10)} <br />
     * @param voidSynonym The value of the column 'VOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVoidSynonym(Integer voidSynonym) {
        __modifiedProperties.addPropertyName("voidSynonym");
        this._voidSynonym = voidSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PUBLIC: {INT(10)} <br />
     * @return The value of the column 'PUBLIC'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPublicSynonym() {
        return _publicSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PUBLIC: {INT(10)} <br />
     * @param publicSynonym The value of the column 'PUBLIC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublicSynonym(Integer publicSynonym) {
        __modifiedProperties.addPropertyName("publicSynonym");
        this._publicSynonym = publicSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PROTECTED: {INT(10)} <br />
     * @return The value of the column 'PROTECTED'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getProtectedSynonym() {
        return _protectedSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PROTECTED: {INT(10)} <br />
     * @param protectedSynonym The value of the column 'PROTECTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProtectedSynonym(Integer protectedSynonym) {
        __modifiedProperties.addPropertyName("protectedSynonym");
        this._protectedSynonym = protectedSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PRIVATE: {INT(10)} <br />
     * @return The value of the column 'PRIVATE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPrivateSynonym() {
        return _privateSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PRIVATE: {INT(10)} <br />
     * @param privateSynonym The value of the column 'PRIVATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrivateSynonym(Integer privateSynonym) {
        __modifiedProperties.addPropertyName("privateSynonym");
        this._privateSynonym = privateSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))INTERFACE: {INT(10)} <br />
     * @return The value of the column 'INTERFACE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getInterfaceSynonym() {
        return _interfaceSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))INTERFACE: {INT(10)} <br />
     * @param interfaceSynonym The value of the column 'INTERFACE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInterfaceSynonym(Integer interfaceSynonym) {
        __modifiedProperties.addPropertyName("interfaceSynonym");
        this._interfaceSynonym = interfaceSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))ABSTRACT: {INT(10)} <br />
     * @return The value of the column 'ABSTRACT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAbstractSynonym() {
        return _abstractSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))ABSTRACT: {INT(10)} <br />
     * @param abstractSynonym The value of the column 'ABSTRACT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbstractSynonym(Integer abstractSynonym) {
        __modifiedProperties.addPropertyName("abstractSynonym");
        this._abstractSynonym = abstractSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))FINAL: {INT(10)} <br />
     * @return The value of the column 'FINAL'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFinalSynonym() {
        return _finalSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))FINAL: {INT(10)} <br />
     * @param finalSynonym The value of the column 'FINAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFinalSynonym(Integer finalSynonym) {
        __modifiedProperties.addPropertyName("finalSynonym");
        this._finalSynonym = finalSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))FINALLY: {INT(10)} <br />
     * @return The value of the column 'FINALLY'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFinallySynonym() {
        return _finallySynonym;
    }

    /**
     * [set] ((using DBFlute synonym))FINALLY: {INT(10)} <br />
     * @param finallySynonym The value of the column 'FINALLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFinallySynonym(Integer finallySynonym) {
        __modifiedProperties.addPropertyName("finallySynonym");
        this._finallySynonym = finallySynonym;
    }

    /**
     * [get] ((using DBFlute synonym))RETURN: {INT(10)} <br />
     * @return The value of the column 'RETURN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getReturnSynonym() {
        return _returnSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))RETURN: {INT(10)} <br />
     * @param returnSynonym The value of the column 'RETURN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReturnSynonym(Integer returnSynonym) {
        __modifiedProperties.addPropertyName("returnSynonym");
        this._returnSynonym = returnSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))DOUBLE: {INT(10)} <br />
     * @return The value of the column 'DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDoubleSynonym() {
        return _doubleSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))DOUBLE: {INT(10)} <br />
     * @param doubleSynonym The value of the column 'DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDoubleSynonym(Integer doubleSynonym) {
        __modifiedProperties.addPropertyName("doubleSynonym");
        this._doubleSynonym = doubleSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))FLOAT: {INT(10)} <br />
     * @return The value of the column 'FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFloatSynonym() {
        return _floatSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))FLOAT: {INT(10)} <br />
     * @param floatSynonym The value of the column 'FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloatSynonym(Integer floatSynonym) {
        __modifiedProperties.addPropertyName("floatSynonym");
        this._floatSynonym = floatSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))SHORT: {INT(10)} <br />
     * @return The value of the column 'SHORT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShortSynonym() {
        return _shortSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))SHORT: {INT(10)} <br />
     * @param shortSynonym The value of the column 'SHORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShortSynonym(Integer shortSynonym) {
        __modifiedProperties.addPropertyName("shortSynonym");
        this._shortSynonym = shortSynonym;
    }

    /**
     * [get] TYPE: {CHAR(3)} <br />
     * @return The value of the column 'TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getType() {
        return _type;
    }

    /**
     * [set] TYPE: {CHAR(3)} <br />
     * @param type The value of the column 'TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setType(String type) {
        __modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /**
     * [get] RESERV_NAME: {NotNull, VARCHAR(32)} <br />
     * @return The value of the column 'RESERV_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReservName() {
        return _reservName;
    }

    /**
     * [set] RESERV_NAME: {NotNull, VARCHAR(32)} <br />
     * @param reservName The value of the column 'RESERV_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReservName(String reservName) {
        __modifiedProperties.addPropertyName("reservName");
        this._reservName = reservName;
    }
}
