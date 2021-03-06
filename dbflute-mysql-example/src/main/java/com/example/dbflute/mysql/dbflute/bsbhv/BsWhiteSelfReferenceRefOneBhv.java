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
 * The behavior of WHITE_SELF_REFERENCE_REF_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 * 
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_REF_ONE_NAME
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
 *     white_self_reference, WHITE_SELF_REFERENCE(AsDirectParent)
 * 
 * [referrer table]
 *     white_self_reference
 * 
 * [foreign property]
 *     whiteSelfReference, whiteSelfReferenceAsDirectParent
 * 
 * [referrer property]
 *     whiteSelfReferenceByParentIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceRefOneBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_self_reference_ref_one"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSelfReferenceRefOneDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSelfReferenceRefOneDbm getMyDBMeta() { return WhiteSelfReferenceRefOneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSelfReferenceRefOne newMyEntity() { return new WhiteSelfReferenceRefOne(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSelfReferenceRefOneCB newMyConditionBean() { return new WhiteSelfReferenceRefOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * int count = whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSelfReferenceRefOneCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSelfReferenceRefOneCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSelfReferenceRefOneCB cb) { // called by selectPage(cb)
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
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSelfReferenceRefOne != null) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReferenceRefOne selectEntity(WhiteSelfReferenceRefOneCB cb) {
        return doSelectEntity(cb, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> ENTITY doSelectEntity(final WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteSelfReferenceRefOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSelfReferenceRefOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReferenceRefOne selectEntityWithDeletedCheck(WhiteSelfReferenceRefOneCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> ENTITY doSelectEntityWithDeletedCheck(final WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSelfReferenceRefOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param selfReferenceId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReferenceRefOne selectByPKValue(Long selfReferenceId) {
        return doSelectByPKValue(selfReferenceId, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> ENTITY doSelectByPKValue(Long selfReferenceId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(selfReferenceId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param selfReferenceId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReferenceRefOne selectByPKValueWithDeletedCheck(Long selfReferenceId) {
        return doSelectByPKValueWithDeletedCheck(selfReferenceId, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> ENTITY doSelectByPKValueWithDeletedCheck(Long selfReferenceId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(selfReferenceId), entityType);
    }

    private WhiteSelfReferenceRefOneCB buildPKCB(Long selfReferenceId) {
        assertObjectNotNull("selfReferenceId", selfReferenceId);
        WhiteSelfReferenceRefOneCB cb = newMyConditionBean();
        cb.query().setSelfReferenceId_Equal(selfReferenceId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSelfReferenceRefOne&gt; whiteSelfReferenceRefOneList = whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : whiteSelfReferenceRefOneList) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSelfReferenceRefOne> selectList(WhiteSelfReferenceRefOneCB cb) {
        return doSelectList(cb, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> ListResultBean<ENTITY> doSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteSelfReferenceRefOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSelfReferenceRefOne&gt; page = whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : page) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSelfReferenceRefOne> selectPage(WhiteSelfReferenceRefOneCB cb) {
        return doSelectPage(cb, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> PagingResultBean<ENTITY> doSelectPage(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteSelfReferenceRefOneCB>() {
            public int callbackSelectCount(WhiteSelfReferenceRefOneCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSelfReferenceRefOne&gt;() {
     *     public void handle(WhiteSelfReferenceRefOne entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSelfReferenceRefOne. (NotNull)
     */
    public void selectCursor(WhiteSelfReferenceRefOneCB cb, EntityRowHandler<WhiteSelfReferenceRefOne> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSelfReferenceRefOne.class);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> void doSelectCursor(WhiteSelfReferenceRefOneCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteSelfReferenceRefOne>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteSelfReferenceRefOneCB>() {
            public void callbackSelectCursor(WhiteSelfReferenceRefOneCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSelfReferenceRefOneCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteSelfReferenceRefOneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSelfReferenceRefOneCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param whiteSelfReferenceRefOne The entity of whiteSelfReferenceRefOne. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSelfReferenceByParentIdList(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, ConditionBeanSetupper<WhiteSelfReferenceCB> conditionBeanSetupper) {
        xassLRArg(whiteSelfReferenceRefOne, conditionBeanSetupper);
        loadWhiteSelfReferenceByParentIdList(xnewLRLs(whiteSelfReferenceRefOne), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteSelfReferenceByParentIdList with the set-upper for condition-bean of referrer. <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">loadWhiteSelfReferenceByParentIdList</span>(whiteSelfReferenceRefOneList, new ConditionBeanSetupper&lt;WhiteSelfReferenceCB&gt;() {
     *     public void setup(WhiteSelfReferenceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : whiteSelfReferenceRefOneList) {
     *     ... = whiteSelfReferenceRefOne.<span style="color: #FD4747">getWhiteSelfReferenceByParentIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParentId_InScope(pkList);
     * cb.query().addOrderBy_ParentId_Asc();
     * </pre>
     * @param whiteSelfReferenceRefOneList The entity list of whiteSelfReferenceRefOne. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSelfReferenceByParentIdList(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, ConditionBeanSetupper<WhiteSelfReferenceCB> conditionBeanSetupper) {
        xassLRArg(whiteSelfReferenceRefOneList, conditionBeanSetupper);
        loadWhiteSelfReferenceByParentIdList(whiteSelfReferenceRefOneList, new LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSelfReferenceRefOne The entity of whiteSelfReferenceRefOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSelfReferenceByParentIdList(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> loadReferrerOption) {
        xassLRArg(whiteSelfReferenceRefOne, loadReferrerOption);
        loadWhiteSelfReferenceByParentIdList(xnewLRLs(whiteSelfReferenceRefOne), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteSelfReferenceRefOneList The entity list of whiteSelfReferenceRefOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSelfReferenceByParentIdList(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> loadReferrerOption) {
        xassLRArg(whiteSelfReferenceRefOneList, loadReferrerOption);
        if (whiteSelfReferenceRefOneList.isEmpty()) { return; }
        final WhiteSelfReferenceBhv referrerBhv = xgetBSFLR().select(WhiteSelfReferenceBhv.class);
        helpLoadReferrerInternally(whiteSelfReferenceRefOneList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteSelfReferenceRefOne, Long, WhiteSelfReferenceCB, WhiteSelfReference>() {
            public Long getPKVal(WhiteSelfReferenceRefOne e)
            { return e.getSelfReferenceId(); }
            public void setRfLs(WhiteSelfReferenceRefOne e, List<WhiteSelfReference> ls)
            { e.setWhiteSelfReferenceByParentIdList(ls); }
            public WhiteSelfReferenceCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSelfReferenceCB cb, List<Long> ls)
            { cb.query().setParentId_InScope(ls); }
            public void qyOdFKAsc(WhiteSelfReferenceCB cb) { cb.query().addOrderBy_ParentId_Asc(); }
            public void spFKCol(WhiteSelfReferenceCB cb) { cb.specify().columnParentId(); }
            public List<WhiteSelfReference> selRfLs(WhiteSelfReferenceCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteSelfReference e) { return e.getParentId(); }
            public void setlcEt(WhiteSelfReference re, WhiteSelfReferenceRefOne le)
            { re.setWhiteSelfReferenceRefOneByParentId(le); }
            public String getRfPrNm() { return "whiteSelfReferenceByParentIdList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSelfReference'.
     * @param whiteSelfReferenceRefOneList The list of whiteSelfReferenceRefOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReference> pulloutWhiteSelfReference(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return helpPulloutInternally(whiteSelfReferenceRefOneList, new InternalPulloutCallback<WhiteSelfReferenceRefOne, WhiteSelfReference>() {
            public WhiteSelfReference getFr(WhiteSelfReferenceRefOne e) { return e.getWhiteSelfReference(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSelfReference e, List<WhiteSelfReferenceRefOne> ls)
            { if (!ls.isEmpty()) { e.setWhiteSelfReferenceRefOneAsOne(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteSelfReference'.
     * @param whiteSelfReferenceRefOneList The list of whiteSelfReferenceRefOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReference> pulloutWhiteSelfReferenceAsDirectParent(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return helpPulloutInternally(whiteSelfReferenceRefOneList, new InternalPulloutCallback<WhiteSelfReferenceRefOne, WhiteSelfReference>() {
            public WhiteSelfReference getFr(WhiteSelfReferenceRefOne e) { return e.getWhiteSelfReferenceAsDirectParent(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteSelfReference e, List<WhiteSelfReferenceRefOne> ls)
            { throw new UnsupportedOperationException(); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key selfReferenceId.
     * @param whiteSelfReferenceRefOneList The list of whiteSelfReferenceRefOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSelfReferenceIdList(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return helpExtractListInternally(whiteSelfReferenceRefOneList, new InternalExtractCallback<WhiteSelfReferenceRefOne, Long>() {
            public Long getCV(WhiteSelfReferenceRefOne e) { return e.getSelfReferenceId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReferenceRefOne.setFoo...(value);
     * whiteSelfReferenceRefOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">insert</span>(whiteSelfReferenceRefOne);
     * ... = whiteSelfReferenceRefOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSelfReferenceRefOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doInsert(whiteSelfReferenceRefOne, null);
    }

    protected void doInsert(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, InsertOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOne", whiteSelfReferenceRefOne);
        prepareInsertOption(option);
        delegateInsert(whiteSelfReferenceRefOne, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteSelfReferenceRefOneCB> option) {
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
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * whiteSelfReferenceRefOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReferenceRefOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSelfReferenceRefOne.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">update</span>(whiteSelfReferenceRefOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doUpdate(whiteSelfReferenceRefOne, null);
    }

    protected void doUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, final UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOne", whiteSelfReferenceRefOne);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteSelfReferenceRefOne, new InternalUpdateCallback<WhiteSelfReferenceRefOne>() {
            public int callbackDelegateUpdate(WhiteSelfReferenceRefOne entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSelfReferenceRefOneCB createCBForVaryingUpdate() {
        WhiteSelfReferenceRefOneCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSelfReferenceRefOneCB createCBForSpecifiedUpdate() {
        WhiteSelfReferenceRefOneCB cb = newMyConditionBean();
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
     * @param whiteSelfReferenceRefOne The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doInesrtOrUpdate(whiteSelfReferenceRefOne, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, final InsertOption<WhiteSelfReferenceRefOneCB> insertOption, final UpdateOption<WhiteSelfReferenceRefOneCB> updateOption) {
        helpInsertOrUpdateInternally(whiteSelfReferenceRefOne, new InternalInsertOrUpdateCallback<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB>() {
            public void callbackInsert(WhiteSelfReferenceRefOne entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteSelfReferenceRefOne entity) { doUpdate(entity, updateOption); }
            public WhiteSelfReferenceRefOneCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSelfReferenceRefOneCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteSelfReferenceRefOneCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteSelfReferenceRefOneCB>() : updateOption;
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
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * whiteSelfReferenceRefOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSelfReferenceRefOne.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">delete</span>(whiteSelfReferenceRefOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doDelete(whiteSelfReferenceRefOne, null);
    }

    protected void doDelete(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, final DeleteOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOne", whiteSelfReferenceRefOne);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteSelfReferenceRefOne, new InternalDeleteCallback<WhiteSelfReferenceRefOne>() {
            public int callbackDelegateDelete(WhiteSelfReferenceRefOne entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSelfReferenceRefOneCB> option) {
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
     *     WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     *     whiteSelfReferenceRefOne.setFooName("foo");
     *     if (...) {
     *         whiteSelfReferenceRefOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSelfReferenceRefOneList.add(whiteSelfReferenceRefOne);
     * }
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">batchInsert</span>(whiteSelfReferenceRefOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        InsertOption<WhiteSelfReferenceRefOneCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteSelfReferenceRefOneList, option);
    }

    protected int[] doBatchInsert(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, InsertOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOneList", whiteSelfReferenceRefOneList);
        prepareBatchInsertOption(whiteSelfReferenceRefOneList, option);
        return delegateBatchInsert(whiteSelfReferenceRefOneList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, InsertOption<WhiteSelfReferenceRefOneCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSelfReferenceRefOneList);
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
     *     WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     *     whiteSelfReferenceRefOne.setFooName("foo");
     *     if (...) {
     *         whiteSelfReferenceRefOne.setFooPrice(123);
     *     } else {
     *         whiteSelfReferenceRefOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSelfReferenceRefOneList.add(whiteSelfReferenceRefOne);
     * }
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSelfReferenceRefOneList);
     * </pre>
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        UpdateOption<WhiteSelfReferenceRefOneCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteSelfReferenceRefOneList, option);
    }

    protected int[] doBatchUpdate(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOneList", whiteSelfReferenceRefOneList);
        prepareBatchUpdateOption(whiteSelfReferenceRefOneList, option);
        return delegateBatchUpdate(whiteSelfReferenceRefOneList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSelfReferenceRefOneList);
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
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSelfReferenceRefOneList, new SpecifyQuery<WhiteSelfReferenceRefOneCB>() {
     *     public void specify(WhiteSelfReferenceRefOneCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSelfReferenceRefOneList, new SpecifyQuery<WhiteSelfReferenceRefOneCB>() {
     *     public void specify(WhiteSelfReferenceRefOneCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, SpecifyQuery<WhiteSelfReferenceRefOneCB> updateColumnSpec) {
        return doBatchUpdate(whiteSelfReferenceRefOneList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return doBatchDelete(whiteSelfReferenceRefOneList, null);
    }

    protected int[] doBatchDelete(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, DeleteOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOneList", whiteSelfReferenceRefOneList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteSelfReferenceRefOneList, option);
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
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB&gt;() {
     *     public ConditionBean setup(whiteSelfReferenceRefOne entity, WhiteSelfReferenceRefOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> setupper, InsertOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteSelfReferenceRefOne entity = new WhiteSelfReferenceRefOne();
        WhiteSelfReferenceRefOneCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteSelfReferenceRefOneCB createCBForQueryInsert() {
        WhiteSelfReferenceRefOneCB cb = newMyConditionBean();
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
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setPK...(value);</span>
     * whiteSelfReferenceRefOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setVersionNo(value);</span>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSelfReferenceRefOne, cb);
     * </pre>
     * @param whiteSelfReferenceRefOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB cb) {
        return doQueryUpdate(whiteSelfReferenceRefOne, cb, null);
    }

    protected int doQueryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB cb, UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        assertObjectNotNull("whiteSelfReferenceRefOne", whiteSelfReferenceRefOne); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSelfReferenceRefOne, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteSelfReferenceRefOneCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteSelfReferenceRefOneCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">queryDelete</span>(whiteSelfReferenceRefOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSelfReferenceRefOneCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSelfReferenceRefOneCB cb, DeleteOption<WhiteSelfReferenceRefOneCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteSelfReferenceRefOneCB)cb); }
        else { return varyingQueryDelete((WhiteSelfReferenceRefOneCB)cb, downcast(option)); }
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
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReferenceRefOne.setFoo...(value);
     * whiteSelfReferenceRefOne.setBar...(value);
     * InsertOption<WhiteSelfReferenceRefOneCB> option = new InsertOption<WhiteSelfReferenceRefOneCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSelfReferenceRefOne, option);
     * ... = whiteSelfReferenceRefOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, InsertOption<WhiteSelfReferenceRefOneCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSelfReferenceRefOne, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * whiteSelfReferenceRefOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReferenceRefOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSelfReferenceRefOne.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *         public void specify(WhiteSelfReferenceRefOneCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSelfReferenceRefOne, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSelfReferenceRefOne, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSelfReferenceRefOne The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, InsertOption<WhiteSelfReferenceRefOneCB> insertOption, UpdateOption<WhiteSelfReferenceRefOneCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSelfReferenceRefOne, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSelfReferenceRefOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, DeleteOption<WhiteSelfReferenceRefOneCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSelfReferenceRefOne, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, InsertOption<WhiteSelfReferenceRefOneCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSelfReferenceRefOneList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSelfReferenceRefOneList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, DeleteOption<WhiteSelfReferenceRefOneCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSelfReferenceRefOneList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> setupper, InsertOption<WhiteSelfReferenceRefOneCB> option) {
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
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setPK...(value);</span>
     * whiteSelfReferenceRefOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setVersionNo(value);</span>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void specify(WhiteSelfReferenceRefOneCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSelfReferenceRefOneBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSelfReferenceRefOne, cb, option);
     * </pre>
     * @param whiteSelfReferenceRefOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB cb, UpdateOption<WhiteSelfReferenceRefOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSelfReferenceRefOne, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSelfReferenceRefOneCB cb, DeleteOption<WhiteSelfReferenceRefOneCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSelfReferenceRefOneBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSelfReferenceRefOneCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSelfReferenceRefOneCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSelfReferenceRefOne> void delegateSelectCursor(WhiteSelfReferenceRefOneCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteSelfReferenceRefOne> List<ENTITY> delegateSelectList(WhiteSelfReferenceRefOneCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSelfReferenceRefOne e, InsertOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteSelfReferenceRefOne e, UpdateOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteSelfReferenceRefOne e, UpdateOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteSelfReferenceRefOne e, DeleteOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteSelfReferenceRefOne e, DeleteOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteSelfReferenceRefOne> ls, InsertOption<WhiteSelfReferenceRefOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSelfReferenceRefOne> ls, UpdateOption<WhiteSelfReferenceRefOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSelfReferenceRefOne> ls, UpdateOption<WhiteSelfReferenceRefOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSelfReferenceRefOne> ls, DeleteOption<WhiteSelfReferenceRefOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSelfReferenceRefOne> ls, DeleteOption<WhiteSelfReferenceRefOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSelfReferenceRefOne e, WhiteSelfReferenceRefOneCB inCB, ConditionBean resCB, InsertOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSelfReferenceRefOne e, WhiteSelfReferenceRefOneCB cb, UpdateOption<WhiteSelfReferenceRefOneCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteSelfReferenceRefOneCB cb, DeleteOption<WhiteSelfReferenceRefOneCB> op)
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
    protected WhiteSelfReferenceRefOne downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteSelfReferenceRefOne.class);
    }

    protected WhiteSelfReferenceRefOneCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSelfReferenceRefOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSelfReferenceRefOne> downcast(List<? extends Entity> entityList) {
        return (List<WhiteSelfReferenceRefOne>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSelfReferenceRefOneCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteSelfReferenceRefOneCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSelfReferenceRefOneCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteSelfReferenceRefOneCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSelfReferenceRefOneCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteSelfReferenceRefOneCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB>)option;
    }
}
