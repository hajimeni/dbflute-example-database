package com.example.dbflute.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of OverloadPkgSpOverloadParameter. <br />
 * This is related to "<span style="color: #AD4747">OVERLOAD_PKG.SP_OVERLOAD_PARAMETER</span>".
 * @author oracleman
 */
public class BsOverloadPkgSpOverloadParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    // this procedure has overload parameters so you need to extend this class
    // and set up parameter annotations for one call of overload
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VInoutVarchar_PROCEDURE_PARAMETER = "inout, 2";
    public static final String VInNumber_PROCEDURE_PARAMETER = "in, 3";
    public static final String VOutNumber_PROCEDURE_PARAMETER = "out, 4";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarchar: {VARCHAR2 as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutVarchar: {VARCHAR2 as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VInoutVarchar: {VARCHAR2 as InOut}. */
    protected String _vInoutVarchar;

    /** The parameter of VInNumber: {NUMBER(22) as In}. */
    protected java.math.BigDecimal _vInNumber;

    /** The parameter of VOutNumber: {NUMBER(22) as Out}. */
    protected java.math.BigDecimal _vOutNumber;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of OverloadPkgSpOverloadParameter. <br />
     * This is related to "<span style="color: #AD4747">OVERLOAD_PKG.SP_OVERLOAD_PARAMETER</span>".
     */
    public BsOverloadPkgSpOverloadParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "OVERLOAD_PKG.SP_OVERLOAD_PARAMETER";
    }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() {
         return true; // as default
     }

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() {
         return false; // resolved by generator
     }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected String filterStringParameter(String value) {
        if (isEmptyStringParameterAllowed()) {
            return value;
        }
        return convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return ParameterUtil.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = getShortCharHandlingMode(propertyName, value, size);
        return ParameterUtil.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode getShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.RFILL;
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) {
        Object obj = DfCollectionUtil.newArrayList(elements);
        return (ArrayList<ELEMENT>)obj; // to avoid the warning between JDK6 and JDK7
    }

    @SuppressWarnings("unchecked")
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) {
        return (NUMBER)DfTypeUtil.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return DfTypeUtil.toBoolean(obj);
    }

    protected Date toUtilDate(Date date) {
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd HH:mm:ss"; // for Oracle
        return DfTypeUtil.toString(date, pattern);
    }

    protected String formatByteArray(byte[] bytes) {
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    private String xbuildColumnString() {
        final String c = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(c).append(_vInVarchar);
        sb.append(c).append(_vOutVarchar);
        sb.append(c).append(_vInoutVarchar);
        sb.append(c).append(_vInNumber);
        sb.append(c).append(_vOutNumber);
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarchar: {VARCHAR2 as In} <br />
     * @return The value of VInVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {VARCHAR2 as In} <br />
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutVarchar: {VARCHAR2 as Out} <br />
     * @return The value of VOutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {VARCHAR2 as Out} <br />
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VInoutVarchar: {VARCHAR2 as InOut} <br />
     * @return The value of VInoutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInoutVarchar() {
        return filterStringParameter(_vInoutVarchar);
    }

    /**
     * [set] VInoutVarchar: {VARCHAR2 as InOut} <br />
     * @param vInoutVarchar The value of VInoutVarchar. (NullAllowed)
     */
    public void setVInoutVarchar(String vInoutVarchar) {
        _vInoutVarchar = vInoutVarchar;
    }

    /**
     * [get] VInNumber: {NUMBER(22) as In} <br />
     * @return The value of VInNumber. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVInNumber() {
        return _vInNumber;
    }

    /**
     * [set] VInNumber: {NUMBER(22) as In} <br />
     * @param vInNumber The value of VInNumber. (NullAllowed)
     */
    public void setVInNumber(java.math.BigDecimal vInNumber) {
        _vInNumber = vInNumber;
    }

    /**
     * [get] VOutNumber: {NUMBER(22) as Out} <br />
     * @return The value of VOutNumber. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVOutNumber() {
        return _vOutNumber;
    }

    /**
     * [set] VOutNumber: {NUMBER(22) as Out} <br />
     * @param vOutNumber The value of VOutNumber. (NullAllowed)
     */
    public void setVOutNumber(java.math.BigDecimal vOutNumber) {
        _vOutNumber = vOutNumber;
    }

}
