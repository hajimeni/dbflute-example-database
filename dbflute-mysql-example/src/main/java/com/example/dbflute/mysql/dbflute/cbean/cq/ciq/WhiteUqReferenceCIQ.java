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
package com.example.dbflute.mysql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.bs.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of white_uq_reference.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqReferenceCIQ extends AbstractBsWhiteUqReferenceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteUqReferenceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteUqReferenceCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteUqReferenceCQ myCQ) {
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
    protected ConditionValue getCValueUqReferenceId() { return _myCQ.getUqReferenceId(); }
    public String keepUqReferenceId_ExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUqReferenceId_NotExistsReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ sq)
    { return _myCQ.keepUqReferenceId_InScopeRelation_WhiteUqReferenceRefByFkToPkIdList(sq); }
    public String keepUqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ sq)
    { return _myCQ.keepUqReferenceId_NotInScopeRelation_WhiteUqReferenceRefByFkToPkIdList(sq); }
    public String keepUqReferenceId_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUqReferenceId_QueryDerivedReferrer_WhiteUqReferenceRefByFkToPkIdListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueUqReferenceCode() { return _myCQ.getUqReferenceCode(); }
    public String keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ sq)
    { return _myCQ.keepUqReferenceCode_InScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(sq); }
    public String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ sq)
    { return _myCQ.keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceRefByFkToUqCodeList(sq); }
    public String keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeList(WhiteUqReferenceRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceRefByFkToUqCodeListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(WhiteUqReferenceCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteUqReferenceCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteUqReferenceCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteUqReferenceCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteUqReferenceCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteUqReferenceCB.class.getName(); }
    protected String xinCQ() { return WhiteUqReferenceCQ.class.getName(); }
}