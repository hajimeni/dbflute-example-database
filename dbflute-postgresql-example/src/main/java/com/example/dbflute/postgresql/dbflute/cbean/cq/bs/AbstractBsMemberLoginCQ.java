package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of member_login.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberLoginCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "member_login";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginId The value of memberLoginId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_Equal(Long memberLoginId) {
        doSetMemberLoginId_Equal(memberLoginId);
    }

    protected void doSetMemberLoginId_Equal(Long memberLoginId) {
        regMemberLoginId(CK_EQ, memberLoginId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginId The value of memberLoginId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_GreaterThan(Long memberLoginId) {
        regMemberLoginId(CK_GT, memberLoginId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginId The value of memberLoginId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_LessThan(Long memberLoginId) {
        regMemberLoginId(CK_LT, memberLoginId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginId The value of memberLoginId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_GreaterEqual(Long memberLoginId) {
        regMemberLoginId(CK_GE, memberLoginId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginId The value of memberLoginId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_LessEqual(Long memberLoginId) {
        regMemberLoginId(CK_LE, memberLoginId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of memberLoginId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberLoginId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberLoginId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberLoginId(), "member_login_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginIdList The collection of memberLoginId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberLoginId_InScope(Collection<Long> memberLoginIdList) {
        doSetMemberLoginId_InScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_InScope(Collection<Long> memberLoginIdList) {
        regINS(CK_INS, cTL(memberLoginIdList), getCValueMemberLoginId(), "member_login_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @param memberLoginIdList The collection of memberLoginId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberLoginId_NotInScope(Collection<Long> memberLoginIdList) {
        doSetMemberLoginId_NotInScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_NotInScope(Collection<Long> memberLoginIdList) {
        regINS(CK_NINS, cTL(memberLoginIdList), getCValueMemberLoginId(), "member_login_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setMemberLoginId_IsNull() { regMemberLoginId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setMemberLoginId_IsNotNull() { regMemberLoginId(CK_ISNN, DOBJ); }

    protected void regMemberLoginId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberLoginId(), "member_login_id"); }
    abstract protected ConditionValue getCValueMemberLoginId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "member_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "member_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "member_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select member_id from member where ...)} <br />
     * (会員)member by my member_id, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_Member(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "member_id", "member_id", subQueryPropertyName, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select member_id from member where ...)} <br />
     * (会員)member by my member_id, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_Member(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "member_id", "member_id", subQueryPropertyName, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ subQuery);

    protected void regMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberId(), "member_id"); }
    abstract protected ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @param loginDatetime The value of loginDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_Equal(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_EQ,  loginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @param loginDatetime The value of loginDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_GreaterThan(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_GT,  loginDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @param loginDatetime The value of loginDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_LessThan(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_LT,  loginDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @param loginDatetime The value of loginDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_GreaterEqual(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_GE,  loginDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * @param loginDatetime The value of loginDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_LessEqual(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_LE, loginDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * <pre>e.g. setLoginDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLoginDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueLoginDatetime(), "login_datetime", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)login_datetime: {UQ+, IX, NotNull, timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of loginDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of loginDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setLoginDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLoginDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regLoginDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueLoginDatetime(), "login_datetime"); }
    abstract protected ConditionValue getCValueLoginDatetime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as equal. (NullAllowed: if null, no condition)
     */
    protected void setMobileLoginFlg_Equal(Integer mobileLoginFlg) {
        doSetMobileLoginFlg_Equal(mobileLoginFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMobileLoginFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetMobileLoginFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setMobileLoginFlg_Equal_True() {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setMobileLoginFlg_Equal_False() {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetMobileLoginFlg_Equal(Integer mobileLoginFlg) {
        regMobileLoginFlg(CK_EQ, mobileLoginFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_InScope(Collection<Integer> mobileLoginFlgList) {
        doSetMobileLoginFlg_InScope(mobileLoginFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetMobileLoginFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetMobileLoginFlg_InScope(Collection<Integer> mobileLoginFlgList) {
        regINS(CK_INS, cTL(mobileLoginFlgList), getCValueMobileLoginFlg(), "mobile_login_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_NotInScope(Collection<Integer> mobileLoginFlgList) {
        doSetMobileLoginFlg_NotInScope(mobileLoginFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetMobileLoginFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetMobileLoginFlg_NotInScope(Collection<Integer> mobileLoginFlgList) {
        regINS(CK_NINS, cTL(mobileLoginFlgList), getCValueMobileLoginFlg(), "mobile_login_flg");
    }

    protected void regMobileLoginFlg(ConditionKey k, Object v) { regQ(k, v, getCValueMobileLoginFlg(), "mobile_login_flg"); }
    abstract protected ConditionValue getCValueMobileLoginFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_Equal(fRES(loginMemberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetLoginMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_Equal_Formalized() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_Equal_Withdrawal() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_Equal_Provisional() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_EQ, loginMemberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_NotEqual(fRES(loginMemberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetLoginMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_NotEqual_Formalized() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_NotEqual_Withdrawal() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_NotEqual_Provisional() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_NES, loginMemberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_InScope(loginMemberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetLoginMemberStatusCode_InScope(cTStrL(cdefList));
    }

    public void doSetLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_INS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "login_member_status_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_NotInScope(loginMemberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetLoginMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_NINS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "login_member_status_code");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select login_member_status_code from member_status where ...)} <br />
     * (会員ステータス)member_status by my login_member_status_code, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'in-scope'. (NotNull)
     */
    public void inScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MemberStatusCB>", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLoginMemberStatusCode_InScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "login_member_status_code", "member_status_code", subQueryPropertyName, "memberStatus");
    }
    public abstract String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select login_member_status_code from member_status where ...)} <br />
     * (会員ステータス)member_status by my login_member_status_code, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MemberStatusCB>", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "login_member_status_code", "member_status_code", subQueryPropertyName, "memberStatus");
    }
    public abstract String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery);

    protected void regLoginMemberStatusCode(ConditionKey k, Object v) { regQ(k, v, getCValueLoginMemberStatusCode(), "login_member_status_code"); }
    abstract protected ConditionValue getCValueLoginMemberStatusCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MemberLoginCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MemberLoginCB>(new HpSSQSetupper<MemberLoginCB>() {
            public void setup(String function, SubQuery<MemberLoginCB> subQuery, HpSSQOption<MemberLoginCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MemberLoginCB> subQuery, String operand, HpSSQOption<MemberLoginCB> option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MemberLoginCQ subQuery);

    protected MemberLoginCB xcreateScalarConditionCB() {
        MemberLoginCB cb = new MemberLoginCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MemberLoginCB xcreateScalarConditionPartitionByCB() {
        MemberLoginCB cb = new MemberLoginCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MemberLoginCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "member_login_id", "member_login_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MemberLoginCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MemberLoginCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MemberLoginCB>(new HpQDRSetupper<MemberLoginCB>() {
            public void setup(String function, SubQuery<MemberLoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MemberLoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "member_login_id", "member_login_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MemberLoginCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MemberLoginCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery<MemberLoginCB>", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MemberLoginCQ subQuery);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.seasar.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MemberLoginCB.class.getName(); }
    protected String xabCQ() { return MemberLoginCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
