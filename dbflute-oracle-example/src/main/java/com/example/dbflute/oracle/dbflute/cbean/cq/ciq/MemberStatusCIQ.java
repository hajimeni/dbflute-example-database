package com.example.dbflute.oracle.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.bs.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of MEMBER_STATUS.
 * @author oracleman
 */
public class MemberStatusCIQ extends AbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMemberStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberStatusCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMemberStatusCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueMemberStatusCode() { return _myCQ.getMemberStatusCode(); }
    public String keepMemberStatusCode_ExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_ExistsReferrer_SynonymMemberList(SynonymMemberCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_ExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MemberCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_SynonymMemberList(SynonymMemberCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MemberCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_InScopeRelation_MemberVendorSynonymList(MemberVendorSynonymCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberVendorSynonymList(sq); }
    public String keepMemberStatusCode_InScopeRelation_SynonymMemberList(SynonymMemberCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_SynonymMemberList(sq); }
    public String keepMemberStatusCode_InScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_SynonymMemberLoginList(sq); }
    public String keepMemberStatusCode_InScopeRelation_VendorSynonymMemberList(VendorSynonymMemberCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_VendorSynonymMemberList(sq); }
    public String keepMemberStatusCode_InScopeRelation_MemberList(MemberCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberList(sq); }
    public String keepMemberStatusCode_InScopeRelation_MemberLoginList(MemberLoginCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberLoginList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberVendorSynonymList(MemberVendorSynonymCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberVendorSynonymList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_SynonymMemberList(SynonymMemberCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_SynonymMemberList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_SynonymMemberLoginList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_VendorSynonymMemberList(VendorSynonymMemberCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_VendorSynonymMemberList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberList(MemberCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberLoginList(MemberLoginCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberLoginList(sq); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MemberCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MemberCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueMemberStatusName() { return _myCQ.getMemberStatusName(); }
    protected ConditionValue getCValueDescription() { return _myCQ.getDescription(); }
    protected ConditionValue getCValueDisplayOrder() { return _myCQ.getDisplayOrder(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(MemberStatusCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MemberStatusCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MemberStatusCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MemberStatusCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MemberStatusCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MemberStatusCB.class.getName(); }
    protected String xinCQ() { return MemberStatusCQ.class.getName(); }
}
