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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_delimiter.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDelimiterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDelimiterCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_delimiter";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as equal. (NullAllowed: if null, no condition)
     */
    public void setDelimiterId_Equal(Long delimiterId) {
        doSetDelimiterId_Equal(delimiterId);
    }

    protected void doSetDelimiterId_Equal(Long delimiterId) {
        regDelimiterId(CK_EQ, delimiterId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDelimiterId_GreaterThan(Long delimiterId) {
        regDelimiterId(CK_GT, delimiterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDelimiterId_LessThan(Long delimiterId) {
        regDelimiterId(CK_LT, delimiterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDelimiterId_GreaterEqual(Long delimiterId) {
        regDelimiterId(CK_GE, delimiterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDelimiterId_LessEqual(Long delimiterId) {
        regDelimiterId(CK_LE, delimiterId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of delimiterId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of delimiterId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelimiterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDelimiterId(), "DELIMITER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterIdList The collection of delimiterId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDelimiterId_InScope(Collection<Long> delimiterIdList) {
        doSetDelimiterId_InScope(delimiterIdList);
    }

    protected void doSetDelimiterId_InScope(Collection<Long> delimiterIdList) {
        regINS(CK_INS, cTL(delimiterIdList), getCValueDelimiterId(), "DELIMITER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterIdList The collection of delimiterId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDelimiterId_NotInScope(Collection<Long> delimiterIdList) {
        doSetDelimiterId_NotInScope(delimiterIdList);
    }

    protected void doSetDelimiterId_NotInScope(Collection<Long> delimiterIdList) {
        regINS(CK_NINS, cTL(delimiterIdList), getCValueDelimiterId(), "DELIMITER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setDelimiterId_IsNull() { regDelimiterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setDelimiterId_IsNotNull() { regDelimiterId(CK_ISNN, DOBJ); }

    protected void regDelimiterId(ConditionKey k, Object v) { regQ(k, v, getCValueDelimiterId(), "DELIMITER_ID"); }
    abstract protected ConditionValue getCValueDelimiterId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as equal. (NullAllowed: if null, no condition)
     */
    public void setNumberNullable_Equal(Integer numberNullable) {
        doSetNumberNullable_Equal(numberNullable);
    }

    protected void doSetNumberNullable_Equal(Integer numberNullable) {
        regNumberNullable(CK_EQ, numberNullable);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumberNullable_GreaterThan(Integer numberNullable) {
        regNumberNullable(CK_GT, numberNullable);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumberNullable_LessThan(Integer numberNullable) {
        regNumberNullable(CK_LT, numberNullable);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumberNullable_GreaterEqual(Integer numberNullable) {
        regNumberNullable(CK_GE, numberNullable);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumberNullable_LessEqual(Integer numberNullable) {
        regNumberNullable(CK_LE, numberNullable);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param minNumber The min number of numberNullable. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numberNullable. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumberNullable_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumberNullable(), "NUMBER_NULLABLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullableList The collection of numberNullable as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberNullable_InScope(Collection<Integer> numberNullableList) {
        doSetNumberNullable_InScope(numberNullableList);
    }

    protected void doSetNumberNullable_InScope(Collection<Integer> numberNullableList) {
        regINS(CK_INS, cTL(numberNullableList), getCValueNumberNullable(), "NUMBER_NULLABLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullableList The collection of numberNullable as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumberNullable_NotInScope(Collection<Integer> numberNullableList) {
        doSetNumberNullable_NotInScope(numberNullableList);
    }

    protected void doSetNumberNullable_NotInScope(Collection<Integer> numberNullableList) {
        regINS(CK_NINS, cTL(numberNullableList), getCValueNumberNullable(), "NUMBER_NULLABLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     */
    public void setNumberNullable_IsNull() { regNumberNullable(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * NUMBER_NULLABLE: {INT(10)}
     */
    public void setNumberNullable_IsNotNull() { regNumberNullable(CK_ISNN, DOBJ); }

    protected void regNumberNullable(ConditionKey k, Object v) { regQ(k, v, getCValueNumberNullable(), "NUMBER_NULLABLE"); }
    abstract protected ConditionValue getCValueNumberNullable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_Equal(String stringConverted) {
        doSetStringConverted_Equal(fRES(stringConverted));
    }

    protected void doSetStringConverted_Equal(String stringConverted) {
        regStringConverted(CK_EQ, stringConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_NotEqual(String stringConverted) {
        doSetStringConverted_NotEqual(fRES(stringConverted));
    }

    protected void doSetStringConverted_NotEqual(String stringConverted) {
        regStringConverted(CK_NES, stringConverted);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_InScope(Collection<String> stringConvertedList) {
        doSetStringConverted_InScope(stringConvertedList);
    }

    public void doSetStringConverted_InScope(Collection<String> stringConvertedList) {
        regINS(CK_INS, cTL(stringConvertedList), getCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_NotInScope(Collection<String> stringConvertedList) {
        doSetStringConverted_NotInScope(stringConvertedList);
    }

    public void doSetStringConverted_NotInScope(Collection<String> stringConvertedList) {
        regINS(CK_NINS, cTL(stringConvertedList), getCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_PrefixSearch(String stringConverted) {
        setStringConverted_LikeSearch(stringConverted, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)} <br />
     * <pre>e.g. setStringConverted_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringConverted), getCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringConverted), getCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNull() { regStringConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNullOrEmpty() { regStringConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNotNull() { regStringConverted(CK_ISNN, DOBJ); }

    protected void regStringConverted(ConditionKey k, Object v) { regQ(k, v, getCValueStringConverted(), "STRING_CONVERTED"); }
    abstract protected ConditionValue getCValueStringConverted();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNonConverted_Equal(String stringNonConverted) {
        doSetStringNonConverted_Equal(fRES(stringNonConverted));
    }

    protected void doSetStringNonConverted_Equal(String stringNonConverted) {
        regStringNonConverted(CK_EQ, stringNonConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNonConverted_NotEqual(String stringNonConverted) {
        doSetStringNonConverted_NotEqual(fRES(stringNonConverted));
    }

    protected void doSetStringNonConverted_NotEqual(String stringNonConverted) {
        regStringNonConverted(CK_NES, stringNonConverted);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConvertedList The collection of stringNonConverted as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNonConverted_InScope(Collection<String> stringNonConvertedList) {
        doSetStringNonConverted_InScope(stringNonConvertedList);
    }

    public void doSetStringNonConverted_InScope(Collection<String> stringNonConvertedList) {
        regINS(CK_INS, cTL(stringNonConvertedList), getCValueStringNonConverted(), "STRING_NON_CONVERTED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConvertedList The collection of stringNonConverted as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNonConverted_NotInScope(Collection<String> stringNonConvertedList) {
        doSetStringNonConverted_NotInScope(stringNonConvertedList);
    }

    public void doSetStringNonConverted_NotInScope(Collection<String> stringNonConvertedList) {
        regINS(CK_NINS, cTL(stringNonConvertedList), getCValueStringNonConverted(), "STRING_NON_CONVERTED");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNonConverted_PrefixSearch(String stringNonConverted) {
        setStringNonConverted_LikeSearch(stringNonConverted, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)} <br />
     * <pre>e.g. setStringNonConverted_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringNonConverted The value of stringNonConverted as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringNonConverted_LikeSearch(String stringNonConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringNonConverted), getCValueStringNonConverted(), "STRING_NON_CONVERTED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringNonConverted_NotLikeSearch(String stringNonConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringNonConverted), getCValueStringNonConverted(), "STRING_NON_CONVERTED", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     */
    public void setStringNonConverted_IsNull() { regStringNonConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     */
    public void setStringNonConverted_IsNullOrEmpty() { regStringNonConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     */
    public void setStringNonConverted_IsNotNull() { regStringNonConverted(CK_ISNN, DOBJ); }

    protected void regStringNonConverted(ConditionKey k, Object v) { regQ(k, v, getCValueStringNonConverted(), "STRING_NON_CONVERTED"); }
    abstract protected ConditionValue getCValueStringNonConverted();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as equal. (NullAllowed: if null, no condition)
     */
    public void setDateDefault_Equal(java.util.Date dateDefault) {
        regDateDefault(CK_EQ,  fCTPD(dateDefault));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDateDefault_GreaterThan(java.util.Date dateDefault) {
        regDateDefault(CK_GT,  fCTPD(dateDefault));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDateDefault_LessThan(java.util.Date dateDefault) {
        regDateDefault(CK_LT,  fCTPD(dateDefault));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDateDefault_GreaterEqual(java.util.Date dateDefault) {
        regDateDefault(CK_GE,  fCTPD(dateDefault));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDateDefault_LessEqual(java.util.Date dateDefault) {
        regDateDefault(CK_LE, fCTPD(dateDefault));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * <pre>e.g. setDateDefault_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateDefault. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateDefault. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateDefault_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueDateDefault(), "DATE_DEFAULT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of dateDefault. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of dateDefault. (NullAllowed: if null, no to-condition)
     */
    public void setDateDefault_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDateDefault_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regDateDefault(ConditionKey k, Object v) { regQ(k, v, getCValueDateDefault(), "DATE_DEFAULT"); }
    abstract protected ConditionValue getCValueDateDefault();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDelimiterCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDelimiterCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDelimiterCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDelimiterCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDelimiterCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDelimiterCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteDelimiterCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteDelimiterCB>(new HpSSQSetupper<WhiteDelimiterCB>() {
            public void setup(String function, SubQuery<WhiteDelimiterCB> subQuery, HpSSQOption<WhiteDelimiterCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteDelimiterCB> subQuery, String operand, HpSSQOption<WhiteDelimiterCB> option) {
        assertObjectNotNull("subQuery<WhiteDelimiterCB>", subQuery);
        WhiteDelimiterCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteDelimiterCQ subQuery);

    protected WhiteDelimiterCB xcreateScalarConditionCB() {
        WhiteDelimiterCB cb = new WhiteDelimiterCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteDelimiterCB xcreateScalarConditionPartitionByCB() {
        WhiteDelimiterCB cb = new WhiteDelimiterCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteDelimiterCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteDelimiterCB>", subQuery);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "DELIMITER_ID", "DELIMITER_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDelimiterCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDelimiterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteDelimiterCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteDelimiterCB>(new HpQDRSetupper<WhiteDelimiterCB>() {
            public void setup(String function, SubQuery<WhiteDelimiterCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteDelimiterCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteDelimiterCB>", subQuery);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "DELIMITER_ID", "DELIMITER_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteDelimiterCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDelimiterCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteDelimiterCB>", subQuery);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteDelimiterCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteDelimiterCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteDelimiterCB>", subQuery);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteDelimiterCQ subQuery);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteDelimiterCB.class.getName(); }
    protected String xabCQ() { return WhiteDelimiterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
