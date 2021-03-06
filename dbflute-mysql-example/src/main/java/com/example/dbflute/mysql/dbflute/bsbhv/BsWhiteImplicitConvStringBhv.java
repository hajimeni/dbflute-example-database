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
package com.example.dbflute.mysql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_IMPLICIT_CONV_STRING as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_STRING_ID
 * 
 * [column]
 *     IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_NUMERIC
 * 
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_numeric
 * 
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvNumeric
 * 
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvNumericList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvStringBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_conv_string"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitConvStringDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitConvStringDbm getMyDBMeta() { return WhiteImplicitConvStringDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitConvString newMyEntity() { return new WhiteImplicitConvString(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitConvStringCB newMyConditionBean() { return new WhiteImplicitConvStringCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitConvStringBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvStringCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitConvStringCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitConvStringCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvString whiteImplicitConvString = whiteImplicitConvStringBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteImplicitConvString != null) {
     *     ... = whiteImplicitConvString.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectEntity(WhiteImplicitConvStringCB cb) {
        return doSelectEntity(cb, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> ENTITY doSelectEntity(final WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteImplicitConvStringCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvString whiteImplicitConvString = whiteImplicitConvStringBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvString.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectEntityWithDeletedCheck(WhiteImplicitConvStringCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> ENTITY doSelectEntityWithDeletedCheck(final WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitConvStringCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvStringId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectByPKValue(String implicitConvStringId) {
        return doSelectByPKValue(implicitConvStringId, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> ENTITY doSelectByPKValue(String implicitConvStringId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(implicitConvStringId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param implicitConvStringId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectByPKValueWithDeletedCheck(String implicitConvStringId) {
        return doSelectByPKValueWithDeletedCheck(implicitConvStringId, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> ENTITY doSelectByPKValueWithDeletedCheck(String implicitConvStringId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(implicitConvStringId), entityType);
    }

    private WhiteImplicitConvStringCB buildPKCB(String implicitConvStringId) {
        assertObjectNotNull("implicitConvStringId", implicitConvStringId);
        WhiteImplicitConvStringCB cb = newMyConditionBean();
        cb.query().setImplicitConvStringId_Equal(implicitConvStringId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitConvString&gt; whiteImplicitConvStringList = whiteImplicitConvStringBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteImplicitConvString whiteImplicitConvString : whiteImplicitConvStringList) {
     *     ... = whiteImplicitConvString.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvString> selectList(WhiteImplicitConvStringCB cb) {
        return doSelectList(cb, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> ListResultBean<ENTITY> doSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteImplicitConvStringCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvString&gt; page = whiteImplicitConvStringBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitConvString whiteImplicitConvString : page) {
     *     ... = whiteImplicitConvString.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvString> selectPage(WhiteImplicitConvStringCB cb) {
        return doSelectPage(cb, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteImplicitConvStringCB>() {
            public int callbackSelectCount(WhiteImplicitConvStringCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitConvString&gt;() {
     *     public void handle(WhiteImplicitConvString entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvString. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvStringCB cb, EntityRowHandler<WhiteImplicitConvString> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitConvString.class);
    }

    protected <ENTITY extends WhiteImplicitConvString> void doSelectCursor(WhiteImplicitConvStringCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteImplicitConvString>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteImplicitConvStringCB>() {
            public void callbackSelectCursor(WhiteImplicitConvStringCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitConvStringCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteImplicitConvStringCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitConvStringCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(WhiteImplicitConvString whiteImplicitConvString, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvString, conditionBeanSetupper);
        loadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvString), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitConvIntegerList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">loadWhiteImplicitConvIntegerList</span>(whiteImplicitConvStringList, new ConditionBeanSetupper&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void setup(WhiteImplicitConvIntegerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitConvString whiteImplicitConvString : whiteImplicitConvStringList) {
     *     ... = whiteImplicitConvString.<span style="color: #FD4747">getWhiteImplicitConvIntegerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setImplicitConvStringId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvStringId_Asc();
     * </pre>
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvString> whiteImplicitConvStringList, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvStringList, conditionBeanSetupper);
        loadWhiteImplicitConvIntegerList(whiteImplicitConvStringList, new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(WhiteImplicitConvString whiteImplicitConvString, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvString, loadReferrerOption);
        loadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvString), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvString> whiteImplicitConvStringList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvStringList, loadReferrerOption);
        if (whiteImplicitConvStringList.isEmpty()) { return; }
        final WhiteImplicitConvIntegerBhv referrerBhv = xgetBSFLR().select(WhiteImplicitConvIntegerBhv.class);
        helpLoadReferrerInternally(whiteImplicitConvStringList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitConvString, Integer, WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>() {
            public Integer getPKVal(WhiteImplicitConvString e)
            { if (e.getImplicitConvStringId() == null) { return null; }
              return Integer.valueOf(e.getImplicitConvStringId().toString()); }
            public void setRfLs(WhiteImplicitConvString e, List<WhiteImplicitConvInteger> ls)
            { e.setWhiteImplicitConvIntegerList(ls); }
            public WhiteImplicitConvIntegerCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitConvIntegerCB cb, List<Integer> ls)
            { cb.query().setImplicitConvStringId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitConvIntegerCB cb) { cb.query().addOrderBy_ImplicitConvStringId_Asc(); }
            public void spFKCol(WhiteImplicitConvIntegerCB cb) { cb.specify().columnImplicitConvStringId(); }
            public List<WhiteImplicitConvInteger> selRfLs(WhiteImplicitConvIntegerCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteImplicitConvInteger e) { return e.getImplicitConvStringId(); }
            public void setlcEt(WhiteImplicitConvInteger re, WhiteImplicitConvString le)
            { re.setWhiteImplicitConvString(le); }
            public String getRfPrNm() { return "whiteImplicitConvIntegerList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(WhiteImplicitConvString whiteImplicitConvString, ConditionBeanSetupper<WhiteImplicitConvNumericCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvString, conditionBeanSetupper);
        loadWhiteImplicitConvNumericList(xnewLRLs(whiteImplicitConvString), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitConvNumericList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">loadWhiteImplicitConvNumericList</span>(whiteImplicitConvStringList, new ConditionBeanSetupper&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void setup(WhiteImplicitConvNumericCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitConvString whiteImplicitConvString : whiteImplicitConvStringList) {
     *     ... = whiteImplicitConvString.<span style="color: #FD4747">getWhiteImplicitConvNumericList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setImplicitConvStringId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvStringId_Asc();
     * </pre>
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(List<WhiteImplicitConvString> whiteImplicitConvStringList, ConditionBeanSetupper<WhiteImplicitConvNumericCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvStringList, conditionBeanSetupper);
        loadWhiteImplicitConvNumericList(whiteImplicitConvStringList, new LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(WhiteImplicitConvString whiteImplicitConvString, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvString, loadReferrerOption);
        loadWhiteImplicitConvNumericList(xnewLRLs(whiteImplicitConvString), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(List<WhiteImplicitConvString> whiteImplicitConvStringList, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvStringList, loadReferrerOption);
        if (whiteImplicitConvStringList.isEmpty()) { return; }
        final WhiteImplicitConvNumericBhv referrerBhv = xgetBSFLR().select(WhiteImplicitConvNumericBhv.class);
        helpLoadReferrerInternally(whiteImplicitConvStringList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitConvString, java.math.BigDecimal, WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>() {
            public java.math.BigDecimal getPKVal(WhiteImplicitConvString e)
            { if (e.getImplicitConvStringId() == null) { return null; }
              return new java.math.BigDecimal(e.getImplicitConvStringId().toString()); }
            public void setRfLs(WhiteImplicitConvString e, List<WhiteImplicitConvNumeric> ls)
            { e.setWhiteImplicitConvNumericList(ls); }
            public WhiteImplicitConvNumericCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitConvNumericCB cb, List<java.math.BigDecimal> ls)
            { cb.query().setImplicitConvStringId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitConvNumericCB cb) { cb.query().addOrderBy_ImplicitConvStringId_Asc(); }
            public void spFKCol(WhiteImplicitConvNumericCB cb) { cb.specify().columnImplicitConvStringId(); }
            public List<WhiteImplicitConvNumeric> selRfLs(WhiteImplicitConvNumericCB cb) { return referrerBhv.selectList(cb); }
            public java.math.BigDecimal getFKVal(WhiteImplicitConvNumeric e) { return e.getImplicitConvStringId(); }
            public void setlcEt(WhiteImplicitConvNumeric re, WhiteImplicitConvString le)
            { re.setWhiteImplicitConvString(le); }
            public String getRfPrNm() { return "whiteImplicitConvNumericList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvInteger'.
     * @param whiteImplicitConvStringList The list of whiteImplicitConvString. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvInteger> pulloutWhiteImplicitConvInteger(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return helpPulloutInternally(whiteImplicitConvStringList, new InternalPulloutCallback<WhiteImplicitConvString, WhiteImplicitConvInteger>() {
            public WhiteImplicitConvInteger getFr(WhiteImplicitConvString e) { return e.getWhiteImplicitConvInteger(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitConvInteger e, List<WhiteImplicitConvString> ls)
            { e.setWhiteImplicitConvStringList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvNumeric'.
     * @param whiteImplicitConvStringList The list of whiteImplicitConvString. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvNumeric> pulloutWhiteImplicitConvNumeric(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return helpPulloutInternally(whiteImplicitConvStringList, new InternalPulloutCallback<WhiteImplicitConvString, WhiteImplicitConvNumeric>() {
            public WhiteImplicitConvNumeric getFr(WhiteImplicitConvString e) { return e.getWhiteImplicitConvNumeric(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitConvNumeric e, List<WhiteImplicitConvString> ls)
            { e.setWhiteImplicitConvStringList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvStringId.
     * @param whiteImplicitConvStringList The list of whiteImplicitConvString. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractImplicitConvStringIdList(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return helpExtractListInternally(whiteImplicitConvStringList, new InternalExtractCallback<WhiteImplicitConvString, String>() {
            public String getCV(WhiteImplicitConvString e) { return e.getImplicitConvStringId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvString.setFoo...(value);
     * whiteImplicitConvString.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.set...;</span>
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">insert</span>(whiteImplicitConvString);
     * ... = whiteImplicitConvString.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvString The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvString whiteImplicitConvString) {
        doInsert(whiteImplicitConvString, null);
    }

    protected void doInsert(WhiteImplicitConvString whiteImplicitConvString, InsertOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvString", whiteImplicitConvString);
        prepareInsertOption(option);
        delegateInsert(whiteImplicitConvString, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitConvStringCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * whiteImplicitConvString.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvString.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvString.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvStringBhv.<span style="color: #FD4747">update</span>(whiteImplicitConvString);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteImplicitConvString The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitConvString whiteImplicitConvString) {
        doUpdate(whiteImplicitConvString, null);
    }

    protected void doUpdate(WhiteImplicitConvString whiteImplicitConvString, final UpdateOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvString", whiteImplicitConvString);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteImplicitConvString, new InternalUpdateCallback<WhiteImplicitConvString>() {
            public int callbackDelegateUpdate(WhiteImplicitConvString entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitConvStringCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitConvStringCB createCBForVaryingUpdate() {
        WhiteImplicitConvStringCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitConvStringCB createCBForSpecifiedUpdate() {
        WhiteImplicitConvStringCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitConvString The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvString whiteImplicitConvString) {
        doInesrtOrUpdate(whiteImplicitConvString, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitConvString whiteImplicitConvString, final InsertOption<WhiteImplicitConvStringCB> insertOption, final UpdateOption<WhiteImplicitConvStringCB> updateOption) {
        helpInsertOrUpdateInternally(whiteImplicitConvString, new InternalInsertOrUpdateCallback<WhiteImplicitConvString, WhiteImplicitConvStringCB>() {
            public void callbackInsert(WhiteImplicitConvString entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteImplicitConvString entity) { doUpdate(entity, updateOption); }
            public WhiteImplicitConvStringCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitConvStringCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteImplicitConvStringCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteImplicitConvStringCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * whiteImplicitConvString.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvString.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvStringBhv.<span style="color: #FD4747">delete</span>(whiteImplicitConvString);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteImplicitConvString The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvString whiteImplicitConvString) {
        doDelete(whiteImplicitConvString, null);
    }

    protected void doDelete(WhiteImplicitConvString whiteImplicitConvString, final DeleteOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvString", whiteImplicitConvString);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteImplicitConvString, new InternalDeleteCallback<WhiteImplicitConvString>() {
            public int callbackDelegateDelete(WhiteImplicitConvString entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitConvStringCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     *     whiteImplicitConvString.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvString.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitConvStringList.add(whiteImplicitConvString);
     * }
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">batchInsert</span>(whiteImplicitConvStringList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        InsertOption<WhiteImplicitConvStringCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitConvStringList, option);
    }

    protected int[] doBatchInsert(List<WhiteImplicitConvString> whiteImplicitConvStringList, InsertOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvStringList", whiteImplicitConvStringList);
        prepareBatchInsertOption(whiteImplicitConvStringList, option);
        return delegateBatchInsert(whiteImplicitConvStringList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitConvString> whiteImplicitConvStringList, InsertOption<WhiteImplicitConvStringCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitConvStringList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     *     whiteImplicitConvString.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvString.setFooPrice(123);
     *     } else {
     *         whiteImplicitConvString.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitConvString.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitConvStringList.add(whiteImplicitConvString);
     * }
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvStringList);
     * </pre>
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        UpdateOption<WhiteImplicitConvStringCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitConvStringList, option);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvStringList", whiteImplicitConvStringList);
        prepareBatchUpdateOption(whiteImplicitConvStringList, option);
        return delegateBatchUpdate(whiteImplicitConvStringList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitConvString> whiteImplicitConvStringList, UpdateOption<WhiteImplicitConvStringCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitConvStringList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvStringList, new SpecifyQuery<WhiteImplicitConvStringCB>() {
     *     public void specify(WhiteImplicitConvStringCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvStringList, new SpecifyQuery<WhiteImplicitConvStringCB>() {
     *     public void specify(WhiteImplicitConvStringCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList, SpecifyQuery<WhiteImplicitConvStringCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitConvStringList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return doBatchDelete(whiteImplicitConvStringList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitConvString> whiteImplicitConvStringList, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvStringList", whiteImplicitConvStringList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteImplicitConvStringList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvString, WhiteImplicitConvStringCB&gt;() {
     *     public ConditionBean setup(whiteImplicitConvString entity, WhiteImplicitConvStringCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB> setupper, InsertOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteImplicitConvString entity = new WhiteImplicitConvString();
        WhiteImplicitConvStringCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteImplicitConvStringCB createCBForQueryInsert() {
        WhiteImplicitConvStringCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setPK...(value);</span>
     * whiteImplicitConvString.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setVersionNo(value);</span>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">queryUpdate</span>(whiteImplicitConvString, cb);
     * </pre>
     * @param whiteImplicitConvString The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvString whiteImplicitConvString, WhiteImplicitConvStringCB cb) {
        return doQueryUpdate(whiteImplicitConvString, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitConvString whiteImplicitConvString, WhiteImplicitConvStringCB cb, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertObjectNotNull("whiteImplicitConvString", whiteImplicitConvString); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitConvString, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteImplicitConvStringCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteImplicitConvStringCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">queryDelete</span>(whiteImplicitConvString, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvStringCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitConvStringCB cb, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteImplicitConvStringCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitConvStringCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvString.setFoo...(value);
     * whiteImplicitConvString.setBar...(value);
     * InsertOption<WhiteImplicitConvStringCB> option = new InsertOption<WhiteImplicitConvStringCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">varyingInsert</span>(whiteImplicitConvString, option);
     * ... = whiteImplicitConvString.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvString The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitConvString whiteImplicitConvString, InsertOption<WhiteImplicitConvStringCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitConvString, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * whiteImplicitConvString.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvString.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvString.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitConvStringCB&gt; option = new UpdateOption&lt;WhiteImplicitConvStringCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *         public void specify(WhiteImplicitConvStringCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitConvStringBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteImplicitConvString, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvString The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvString whiteImplicitConvString, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitConvString, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvString The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvString whiteImplicitConvString, InsertOption<WhiteImplicitConvStringCB> insertOption, UpdateOption<WhiteImplicitConvStringCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitConvString, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvString The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitConvString whiteImplicitConvString, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitConvString, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitConvString> whiteImplicitConvStringList, InsertOption<WhiteImplicitConvStringCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitConvStringList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitConvStringList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitConvString> whiteImplicitConvStringList, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitConvStringList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB> setupper, InsertOption<WhiteImplicitConvStringCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setPK...(value);</span>
     * whiteImplicitConvString.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setVersionNo(value);</span>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitConvStringCB&gt; option = new UpdateOption&lt;WhiteImplicitConvStringCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void specify(WhiteImplicitConvStringCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitConvStringBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteImplicitConvString, cb, option);
     * </pre>
     * @param whiteImplicitConvString The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvString whiteImplicitConvString, WhiteImplicitConvStringCB cb, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitConvString, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitConvStringCB cb, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<WhiteImplicitConvStringBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitConvStringCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitConvStringCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitConvString> void delegateSelectCursor(WhiteImplicitConvStringCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteImplicitConvString> List<ENTITY> delegateSelectList(WhiteImplicitConvStringCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitConvString e, InsertOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteImplicitConvString e, UpdateOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitConvString e, UpdateOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteImplicitConvString e, DeleteOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitConvString e, DeleteOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitConvString> ls, InsertOption<WhiteImplicitConvStringCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitConvString> ls, UpdateOption<WhiteImplicitConvStringCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitConvString> ls, UpdateOption<WhiteImplicitConvStringCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitConvString> ls, DeleteOption<WhiteImplicitConvStringCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitConvString> ls, DeleteOption<WhiteImplicitConvStringCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitConvString e, WhiteImplicitConvStringCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitConvString e, WhiteImplicitConvStringCB cb, UpdateOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitConvStringCB cb, DeleteOption<WhiteImplicitConvStringCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteImplicitConvString downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteImplicitConvString.class);
    }

    protected WhiteImplicitConvStringCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitConvStringCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitConvString> downcast(List<? extends Entity> entityList) {
        return (List<WhiteImplicitConvString>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitConvStringCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteImplicitConvStringCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitConvStringCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteImplicitConvStringCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitConvStringCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteImplicitConvStringCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB>)option;
    }
}
