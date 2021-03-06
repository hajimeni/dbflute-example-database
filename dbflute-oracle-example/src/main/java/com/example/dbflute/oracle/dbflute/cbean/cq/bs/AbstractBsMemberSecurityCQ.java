package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER_SECURITY.
 * @author oracleman
 */
public abstract class AbstractBsMemberSecurityCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberSecurityCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER_SECURITY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_InScopeRelation_Member(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery<MemberCB>", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMemberId_NotInScopeRelation_Member(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, NUMBER(16), FK to MEMBER}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberId(), "MEMBER_ID"); }
    abstract protected ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)}
     * @param loginPassword The value of loginPassword as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_Equal(String loginPassword) {
        doSetLoginPassword_Equal(fRES(loginPassword));
    }

    protected void doSetLoginPassword_Equal(String loginPassword) {
        regLoginPassword(CK_EQ, loginPassword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)}
     * @param loginPassword The value of loginPassword as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_NotEqual(String loginPassword) {
        doSetLoginPassword_NotEqual(fRES(loginPassword));
    }

    protected void doSetLoginPassword_NotEqual(String loginPassword) {
        regLoginPassword(CK_NES, loginPassword);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)}
     * @param loginPasswordList The collection of loginPassword as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_InScope(Collection<String> loginPasswordList) {
        doSetLoginPassword_InScope(loginPasswordList);
    }

    public void doSetLoginPassword_InScope(Collection<String> loginPasswordList) {
        regINS(CK_INS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)}
     * @param loginPasswordList The collection of loginPassword as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_NotInScope(Collection<String> loginPasswordList) {
        doSetLoginPassword_NotInScope(loginPasswordList);
    }

    public void doSetLoginPassword_NotInScope(Collection<String> loginPasswordList) {
        regINS(CK_NINS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)}
     * @param loginPassword The value of loginPassword as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginPassword_PrefixSearch(String loginPassword) {
        setLoginPassword_LikeSearch(loginPassword, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setLoginPassword_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginPassword The value of loginPassword as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoginPassword_LikeSearch(String loginPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_PASSWORD: {NotNull, VARCHAR2(50)}
     * @param loginPassword The value of loginPassword as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoginPassword_NotLikeSearch(String loginPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    protected void regLoginPassword(ConditionKey k, Object v) { regQ(k, v, getCValueLoginPassword(), "LOGIN_PASSWORD"); }
    abstract protected ConditionValue getCValueLoginPassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)}
     * @param reminderQuestion The value of reminderQuestion as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_Equal(String reminderQuestion) {
        doSetReminderQuestion_Equal(fRES(reminderQuestion));
    }

    protected void doSetReminderQuestion_Equal(String reminderQuestion) {
        regReminderQuestion(CK_EQ, reminderQuestion);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)}
     * @param reminderQuestion The value of reminderQuestion as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_NotEqual(String reminderQuestion) {
        doSetReminderQuestion_NotEqual(fRES(reminderQuestion));
    }

    protected void doSetReminderQuestion_NotEqual(String reminderQuestion) {
        regReminderQuestion(CK_NES, reminderQuestion);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)}
     * @param reminderQuestionList The collection of reminderQuestion as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_InScope(Collection<String> reminderQuestionList) {
        doSetReminderQuestion_InScope(reminderQuestionList);
    }

    public void doSetReminderQuestion_InScope(Collection<String> reminderQuestionList) {
        regINS(CK_INS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)}
     * @param reminderQuestionList The collection of reminderQuestion as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_NotInScope(Collection<String> reminderQuestionList) {
        doSetReminderQuestion_NotInScope(reminderQuestionList);
    }

    public void doSetReminderQuestion_NotInScope(Collection<String> reminderQuestionList) {
        regINS(CK_NINS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)}
     * @param reminderQuestion The value of reminderQuestion as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderQuestion_PrefixSearch(String reminderQuestion) {
        setReminderQuestion_LikeSearch(reminderQuestion, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setReminderQuestion_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderQuestion The value of reminderQuestion as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReminderQuestion_LikeSearch(String reminderQuestion, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REMINDER_QUESTION: {NotNull, VARCHAR2(50)}
     * @param reminderQuestion The value of reminderQuestion as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReminderQuestion_NotLikeSearch(String reminderQuestion, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", likeSearchOption);
    }

    protected void regReminderQuestion(ConditionKey k, Object v) { regQ(k, v, getCValueReminderQuestion(), "REMINDER_QUESTION"); }
    abstract protected ConditionValue getCValueReminderQuestion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)}
     * @param reminderAnswer The value of reminderAnswer as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_Equal(String reminderAnswer) {
        doSetReminderAnswer_Equal(fRES(reminderAnswer));
    }

    protected void doSetReminderAnswer_Equal(String reminderAnswer) {
        regReminderAnswer(CK_EQ, reminderAnswer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)}
     * @param reminderAnswer The value of reminderAnswer as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_NotEqual(String reminderAnswer) {
        doSetReminderAnswer_NotEqual(fRES(reminderAnswer));
    }

    protected void doSetReminderAnswer_NotEqual(String reminderAnswer) {
        regReminderAnswer(CK_NES, reminderAnswer);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)}
     * @param reminderAnswerList The collection of reminderAnswer as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_InScope(Collection<String> reminderAnswerList) {
        doSetReminderAnswer_InScope(reminderAnswerList);
    }

    public void doSetReminderAnswer_InScope(Collection<String> reminderAnswerList) {
        regINS(CK_INS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)}
     * @param reminderAnswerList The collection of reminderAnswer as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_NotInScope(Collection<String> reminderAnswerList) {
        doSetReminderAnswer_NotInScope(reminderAnswerList);
    }

    public void doSetReminderAnswer_NotInScope(Collection<String> reminderAnswerList) {
        regINS(CK_NINS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)}
     * @param reminderAnswer The value of reminderAnswer as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderAnswer_PrefixSearch(String reminderAnswer) {
        setReminderAnswer_LikeSearch(reminderAnswer, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setReminderAnswer_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderAnswer The value of reminderAnswer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReminderAnswer_LikeSearch(String reminderAnswer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REMINDER_ANSWER: {NotNull, VARCHAR2(50)}
     * @param reminderAnswer The value of reminderAnswer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReminderAnswer_NotLikeSearch(String reminderAnswer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", likeSearchOption);
    }

    protected void regReminderAnswer(ConditionKey k, Object v) { regQ(k, v, getCValueReminderAnswer(), "REMINDER_ANSWER"); }
    abstract protected ConditionValue getCValueReminderAnswer();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCount The value of reminderUseCount as equal. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_Equal(Integer reminderUseCount) {
        doSetReminderUseCount_Equal(reminderUseCount);
    }

    protected void doSetReminderUseCount_Equal(Integer reminderUseCount) {
        regReminderUseCount(CK_EQ, reminderUseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCount The value of reminderUseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_GreaterThan(Integer reminderUseCount) {
        regReminderUseCount(CK_GT, reminderUseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCount The value of reminderUseCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_LessThan(Integer reminderUseCount) {
        regReminderUseCount(CK_LT, reminderUseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCount The value of reminderUseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_GreaterEqual(Integer reminderUseCount) {
        regReminderUseCount(CK_GE, reminderUseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCount The value of reminderUseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReminderUseCount_LessEqual(Integer reminderUseCount) {
        regReminderUseCount(CK_LE, reminderUseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param minNumber The min number of reminderUseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reminderUseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReminderUseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueReminderUseCount(), "REMINDER_USE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCountList The collection of reminderUseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderUseCount_InScope(Collection<Integer> reminderUseCountList) {
        doSetReminderUseCount_InScope(reminderUseCountList);
    }

    protected void doSetReminderUseCount_InScope(Collection<Integer> reminderUseCountList) {
        regINS(CK_INS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REMINDER_USE_COUNT: {NotNull, NUMBER(7)}
     * @param reminderUseCountList The collection of reminderUseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReminderUseCount_NotInScope(Collection<Integer> reminderUseCountList) {
        doSetReminderUseCount_NotInScope(reminderUseCountList);
    }

    protected void doSetReminderUseCount_NotInScope(Collection<Integer> reminderUseCountList) {
        regINS(CK_NINS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    protected void regReminderUseCount(ConditionKey k, Object v) { regQ(k, v, getCValueReminderUseCount(), "REMINDER_USE_COUNT"); }
    abstract protected ConditionValue getCValueReminderUseCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_EQ,  fCTPD(registerDatetime));
    }

    protected void regRegisterDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    abstract protected ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    protected void regRegisterProcess(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterProcess(), "REGISTER_PROCESS"); }
    abstract protected ConditionValue getCValueRegisterProcess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterUser(), "REGISTER_USER"); }
    abstract protected ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_EQ,  fCTPD(updateDatetime));
    }

    protected void regUpdateDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    abstract protected ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    protected void regUpdateProcess(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateProcess(), "UPDATE_PROCESS"); }
    abstract protected ConditionValue getCValueUpdateProcess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateUser(), "UPDATE_USER"); }
    abstract protected ConditionValue getCValueUpdateUser();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey k, Object v) { regQ(k, v, getCValueVersionNo(), "VERSION_NO"); }
    abstract protected ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberSecurityCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MemberSecurityCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MemberSecurityCB>(new HpSSQSetupper<MemberSecurityCB>() {
            public void setup(String function, SubQuery<MemberSecurityCB> subQuery, HpSSQOption<MemberSecurityCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MemberSecurityCB> subQuery, String operand, HpSSQOption<MemberSecurityCB> option) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MemberSecurityCQ subQuery);

    protected MemberSecurityCB xcreateScalarConditionCB() {
        MemberSecurityCB cb = new MemberSecurityCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MemberSecurityCB xcreateScalarConditionPartitionByCB() {
        MemberSecurityCB cb = new MemberSecurityCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MemberSecurityCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MemberSecurityCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberSecurityCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MemberSecurityCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MemberSecurityCB>(new HpQDRSetupper<MemberSecurityCB>() {
            public void setup(String function, SubQuery<MemberSecurityCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MemberSecurityCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MemberSecurityCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MemberSecurityCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberSecurityCB> subQuery) {
        assertObjectNotNull("subQuery<MemberSecurityCB>", subQuery);
        MemberSecurityCB cb = new MemberSecurityCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MemberSecurityCQ subQuery);

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
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MemberSecurityCB.class.getName(); }
    protected String xabCQ() { return MemberSecurityCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
