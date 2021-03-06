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
 * The behavior of WHITE_COMPOUND_PK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary key]
 *     COMPOUND_PK_REF_NEST_ID
 * 
 * [column]
 *     COMPOUND_PK_REF_NEST_ID, FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, QUX_MULTIPLE_ID
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
 *     white_compound_pk_ref
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPkRefByQuxMultipleId, whiteCompoundPkRefByFooMultipleId
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefNestBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_pk_ref_nest"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteCompoundPkRefNestDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundPkRefNestDbm getMyDBMeta() { return WhiteCompoundPkRefNestDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundPkRefNest newMyEntity() { return new WhiteCompoundPkRefNest(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundPkRefNestCB newMyConditionBean() { return new WhiteCompoundPkRefNestCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkRefNestBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkRefNestCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundPkRefNestCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundPkRefNestCB cb) { // called by selectPage(cb)
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
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = whiteCompoundPkRefNestBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteCompoundPkRefNest != null) {
     *     ... = whiteCompoundPkRefNest.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefNest selectEntity(WhiteCompoundPkRefNestCB cb) {
        return doSelectEntity(cb, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> ENTITY doSelectEntity(final WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteCompoundPkRefNestCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = whiteCompoundPkRefNestBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRefNest.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefNest selectEntityWithDeletedCheck(WhiteCompoundPkRefNestCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> ENTITY doSelectEntityWithDeletedCheck(final WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundPkRefNestCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param compoundPkRefNestId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefNest selectByPKValue(Integer compoundPkRefNestId) {
        return doSelectByPKValue(compoundPkRefNestId, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> ENTITY doSelectByPKValue(Integer compoundPkRefNestId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(compoundPkRefNestId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param compoundPkRefNestId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefNest selectByPKValueWithDeletedCheck(Integer compoundPkRefNestId) {
        return doSelectByPKValueWithDeletedCheck(compoundPkRefNestId, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> ENTITY doSelectByPKValueWithDeletedCheck(Integer compoundPkRefNestId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(compoundPkRefNestId), entityType);
    }

    private WhiteCompoundPkRefNestCB buildPKCB(Integer compoundPkRefNestId) {
        assertObjectNotNull("compoundPkRefNestId", compoundPkRefNestId);
        WhiteCompoundPkRefNestCB cb = newMyConditionBean();
        cb.query().setCompoundPkRefNestId_Equal(compoundPkRefNestId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundPkRefNest&gt; whiteCompoundPkRefNestList = whiteCompoundPkRefNestBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteCompoundPkRefNest whiteCompoundPkRefNest : whiteCompoundPkRefNestList) {
     *     ... = whiteCompoundPkRefNest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRefNest> selectList(WhiteCompoundPkRefNestCB cb) {
        return doSelectList(cb, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> ListResultBean<ENTITY> doSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteCompoundPkRefNestCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRefNest&gt; page = whiteCompoundPkRefNestBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPkRefNest whiteCompoundPkRefNest : page) {
     *     ... = whiteCompoundPkRefNest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRefNest> selectPage(WhiteCompoundPkRefNestCB cb) {
        return doSelectPage(cb, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteCompoundPkRefNestCB>() {
            public int callbackSelectCount(WhiteCompoundPkRefNestCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPkRefNest&gt;() {
     *     public void handle(WhiteCompoundPkRefNest entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPkRefNest. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkRefNestCB cb, EntityRowHandler<WhiteCompoundPkRefNest> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteCompoundPkRefNest.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefNest> void doSelectCursor(WhiteCompoundPkRefNestCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteCompoundPkRefNest>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteCompoundPkRefNestCB>() {
            public void callbackSelectCursor(WhiteCompoundPkRefNestCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkRefNestCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteCompoundPkRefNestCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundPkRefNestCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteCompoundPkRef'.
     * @param whiteCompoundPkRefNestList The list of whiteCompoundPkRefNest. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPkRef> pulloutWhiteCompoundPkRefByQuxMultipleId(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList) {
        return helpPulloutInternally(whiteCompoundPkRefNestList, new InternalPulloutCallback<WhiteCompoundPkRefNest, WhiteCompoundPkRef>() {
            public WhiteCompoundPkRef getFr(WhiteCompoundPkRefNest e) { return e.getWhiteCompoundPkRefByQuxMultipleId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundPkRef e, List<WhiteCompoundPkRefNest> ls)
            { e.setWhiteCompoundPkRefNestByQuxMultipleIdList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteCompoundPkRef'.
     * @param whiteCompoundPkRefNestList The list of whiteCompoundPkRefNest. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPkRef> pulloutWhiteCompoundPkRefByFooMultipleId(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList) {
        return helpPulloutInternally(whiteCompoundPkRefNestList, new InternalPulloutCallback<WhiteCompoundPkRefNest, WhiteCompoundPkRef>() {
            public WhiteCompoundPkRef getFr(WhiteCompoundPkRefNest e) { return e.getWhiteCompoundPkRefByFooMultipleId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundPkRef e, List<WhiteCompoundPkRefNest> ls)
            { e.setWhiteCompoundPkRefNestByFooMultipleIdList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key compoundPkRefNestId.
     * @param whiteCompoundPkRefNestList The list of whiteCompoundPkRefNest. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractCompoundPkRefNestIdList(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList) {
        return helpExtractListInternally(whiteCompoundPkRefNestList, new InternalExtractCallback<WhiteCompoundPkRefNest, Integer>() {
            public Integer getCV(WhiteCompoundPkRefNest e) { return e.getCompoundPkRefNestId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRefNest.setFoo...(value);
     * whiteCompoundPkRefNest.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.set...;</span>
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">insert</span>(whiteCompoundPkRefNest);
     * ... = whiteCompoundPkRefNest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPkRefNest The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPkRefNest whiteCompoundPkRefNest) {
        doInsert(whiteCompoundPkRefNest, null);
    }

    protected void doInsert(WhiteCompoundPkRefNest whiteCompoundPkRefNest, InsertOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNest", whiteCompoundPkRefNest);
        prepareInsertOption(option);
        delegateInsert(whiteCompoundPkRefNest, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundPkRefNestCB> option) {
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
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * whiteCompoundPkRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRefNest.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefNestBhv.<span style="color: #FD4747">update</span>(whiteCompoundPkRefNest);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteCompoundPkRefNest The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundPkRefNest whiteCompoundPkRefNest) {
        doUpdate(whiteCompoundPkRefNest, null);
    }

    protected void doUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, final UpdateOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNest", whiteCompoundPkRefNest);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteCompoundPkRefNest, new InternalUpdateCallback<WhiteCompoundPkRefNest>() {
            public int callbackDelegateUpdate(WhiteCompoundPkRefNest entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundPkRefNestCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteCompoundPkRefNestCB createCBForVaryingUpdate() {
        WhiteCompoundPkRefNestCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteCompoundPkRefNestCB createCBForSpecifiedUpdate() {
        WhiteCompoundPkRefNestCB cb = newMyConditionBean();
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
     * @param whiteCompoundPkRefNest The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest) {
        doInesrtOrUpdate(whiteCompoundPkRefNest, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, final InsertOption<WhiteCompoundPkRefNestCB> insertOption, final UpdateOption<WhiteCompoundPkRefNestCB> updateOption) {
        helpInsertOrUpdateInternally(whiteCompoundPkRefNest, new InternalInsertOrUpdateCallback<WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB>() {
            public void callbackInsert(WhiteCompoundPkRefNest entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteCompoundPkRefNest entity) { doUpdate(entity, updateOption); }
            public WhiteCompoundPkRefNestCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundPkRefNestCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteCompoundPkRefNestCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteCompoundPkRefNestCB>() : updateOption;
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
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * whiteCompoundPkRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRefNest.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefNestBhv.<span style="color: #FD4747">delete</span>(whiteCompoundPkRefNest);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteCompoundPkRefNest The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPkRefNest whiteCompoundPkRefNest) {
        doDelete(whiteCompoundPkRefNest, null);
    }

    protected void doDelete(WhiteCompoundPkRefNest whiteCompoundPkRefNest, final DeleteOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNest", whiteCompoundPkRefNest);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteCompoundPkRefNest, new InternalDeleteCallback<WhiteCompoundPkRefNest>() {
            public int callbackDelegateDelete(WhiteCompoundPkRefNest entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundPkRefNestCB> option) {
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
     *     WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     *     whiteCompoundPkRefNest.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRefNest.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkRefNestList.add(whiteCompoundPkRefNest);
     * }
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">batchInsert</span>(whiteCompoundPkRefNestList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList) {
        InsertOption<WhiteCompoundPkRefNestCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundPkRefNestList, option);
    }

    protected int[] doBatchInsert(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, InsertOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNestList", whiteCompoundPkRefNestList);
        prepareBatchInsertOption(whiteCompoundPkRefNestList, option);
        return delegateBatchInsert(whiteCompoundPkRefNestList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, InsertOption<WhiteCompoundPkRefNestCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundPkRefNestList);
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
     *     WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     *     whiteCompoundPkRefNest.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRefNest.setFooPrice(123);
     *     } else {
     *         whiteCompoundPkRefNest.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkRefNestList.add(whiteCompoundPkRefNest);
     * }
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefNestList);
     * </pre>
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList) {
        UpdateOption<WhiteCompoundPkRefNestCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundPkRefNestList, option);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, UpdateOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNestList", whiteCompoundPkRefNestList);
        prepareBatchUpdateOption(whiteCompoundPkRefNestList, option);
        return delegateBatchUpdate(whiteCompoundPkRefNestList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, UpdateOption<WhiteCompoundPkRefNestCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundPkRefNestList);
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
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefNestList, new SpecifyQuery<WhiteCompoundPkRefNestCB>() {
     *     public void specify(WhiteCompoundPkRefNestCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefNestList, new SpecifyQuery<WhiteCompoundPkRefNestCB>() {
     *     public void specify(WhiteCompoundPkRefNestCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, SpecifyQuery<WhiteCompoundPkRefNestCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundPkRefNestList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList) {
        return doBatchDelete(whiteCompoundPkRefNestList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, DeleteOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNestList", whiteCompoundPkRefNestList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteCompoundPkRefNestList, option);
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
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB&gt;() {
     *     public ConditionBean setup(whiteCompoundPkRefNest entity, WhiteCompoundPkRefNestCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB> setupper, InsertOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteCompoundPkRefNest entity = new WhiteCompoundPkRefNest();
        WhiteCompoundPkRefNestCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteCompoundPkRefNestCB createCBForQueryInsert() {
        WhiteCompoundPkRefNestCB cb = newMyConditionBean();
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
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setPK...(value);</span>
     * whiteCompoundPkRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setVersionNo(value);</span>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">queryUpdate</span>(whiteCompoundPkRefNest, cb);
     * </pre>
     * @param whiteCompoundPkRefNest The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, WhiteCompoundPkRefNestCB cb) {
        return doQueryUpdate(whiteCompoundPkRefNest, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, WhiteCompoundPkRefNestCB cb, UpdateOption<WhiteCompoundPkRefNestCB> option) {
        assertObjectNotNull("whiteCompoundPkRefNest", whiteCompoundPkRefNest); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundPkRefNest, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteCompoundPkRefNestCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteCompoundPkRefNestCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">queryDelete</span>(whiteCompoundPkRefNest, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkRefNestCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundPkRefNestCB cb, DeleteOption<WhiteCompoundPkRefNestCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteCompoundPkRefNestCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundPkRefNestCB)cb, downcast(option)); }
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
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRefNest.setFoo...(value);
     * whiteCompoundPkRefNest.setBar...(value);
     * InsertOption<WhiteCompoundPkRefNestCB> option = new InsertOption<WhiteCompoundPkRefNestCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">varyingInsert</span>(whiteCompoundPkRefNest, option);
     * ... = whiteCompoundPkRefNest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPkRefNest The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPkRefNest whiteCompoundPkRefNest, InsertOption<WhiteCompoundPkRefNestCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundPkRefNest, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * whiteCompoundPkRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRefNest.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkRefNestCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefNestCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *         public void specify(WhiteCompoundPkRefNestCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkRefNestBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteCompoundPkRefNest, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefNest The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, UpdateOption<WhiteCompoundPkRefNestCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundPkRefNest, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPkRefNest The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, InsertOption<WhiteCompoundPkRefNestCB> insertOption, UpdateOption<WhiteCompoundPkRefNestCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteCompoundPkRefNest, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPkRefNest The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPkRefNest whiteCompoundPkRefNest, DeleteOption<WhiteCompoundPkRefNestCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundPkRefNest, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, InsertOption<WhiteCompoundPkRefNestCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundPkRefNestList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, UpdateOption<WhiteCompoundPkRefNestCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundPkRefNestList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestList, DeleteOption<WhiteCompoundPkRefNestCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundPkRefNestList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB> setupper, InsertOption<WhiteCompoundPkRefNestCB> option) {
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
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = new WhiteCompoundPkRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setPK...(value);</span>
     * whiteCompoundPkRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefNest.setVersionNo(value);</span>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkRefNestCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefNestCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void specify(WhiteCompoundPkRefNestCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkRefNestBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteCompoundPkRefNest, cb, option);
     * </pre>
     * @param whiteCompoundPkRefNest The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRefNest whiteCompoundPkRefNest, WhiteCompoundPkRefNestCB cb, UpdateOption<WhiteCompoundPkRefNestCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundPkRefNest, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundPkRefNest. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkRefNestCB cb, DeleteOption<WhiteCompoundPkRefNestCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundPkRefNestBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundPkRefNestCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundPkRefNestCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundPkRefNest> void delegateSelectCursor(WhiteCompoundPkRefNestCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteCompoundPkRefNest> List<ENTITY> delegateSelectList(WhiteCompoundPkRefNestCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundPkRefNest e, InsertOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteCompoundPkRefNest e, UpdateOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundPkRefNest e, UpdateOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteCompoundPkRefNest e, DeleteOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundPkRefNest e, DeleteOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundPkRefNest> ls, InsertOption<WhiteCompoundPkRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundPkRefNest> ls, UpdateOption<WhiteCompoundPkRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundPkRefNest> ls, UpdateOption<WhiteCompoundPkRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundPkRefNest> ls, DeleteOption<WhiteCompoundPkRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundPkRefNest> ls, DeleteOption<WhiteCompoundPkRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundPkRefNest e, WhiteCompoundPkRefNestCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundPkRefNest e, WhiteCompoundPkRefNestCB cb, UpdateOption<WhiteCompoundPkRefNestCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundPkRefNestCB cb, DeleteOption<WhiteCompoundPkRefNestCB> op)
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
    protected WhiteCompoundPkRefNest downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteCompoundPkRefNest.class);
    }

    protected WhiteCompoundPkRefNestCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundPkRefNestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundPkRefNest> downcast(List<? extends Entity> entityList) {
        return (List<WhiteCompoundPkRefNest>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundPkRefNestCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteCompoundPkRefNestCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundPkRefNestCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteCompoundPkRefNestCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundPkRefNestCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteCompoundPkRefNestCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteCompoundPkRefNest, WhiteCompoundPkRefNestCB>)option;
    }
}
