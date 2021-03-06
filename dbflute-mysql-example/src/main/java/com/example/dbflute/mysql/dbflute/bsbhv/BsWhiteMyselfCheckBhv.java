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
 * The behavior of WHITE_MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_CHECK_ID
 * 
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     white_myself
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteMyself
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyselfCheckBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_myself_check"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteMyselfCheckDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteMyselfCheckDbm getMyDBMeta() { return WhiteMyselfCheckDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteMyselfCheck newMyEntity() { return new WhiteMyselfCheck(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteMyselfCheckCB newMyConditionBean() { return new WhiteMyselfCheckCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * int count = whiteMyselfCheckBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteMyselfCheckCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteMyselfCheckCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteMyselfCheckCB cb) { // called by selectPage(cb)
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
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * WhiteMyselfCheck whiteMyselfCheck = whiteMyselfCheckBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteMyselfCheck != null) {
     *     ... = whiteMyselfCheck.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyselfCheck selectEntity(WhiteMyselfCheckCB cb) {
        return doSelectEntity(cb, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> ENTITY doSelectEntity(final WhiteMyselfCheckCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteMyselfCheckCB>() {
            public List<ENTITY> callbackSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * WhiteMyselfCheck whiteMyselfCheck = whiteMyselfCheckBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteMyselfCheck.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyselfCheck selectEntityWithDeletedCheck(WhiteMyselfCheckCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> ENTITY doSelectEntityWithDeletedCheck(final WhiteMyselfCheckCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteMyselfCheckCB>() {
            public List<ENTITY> callbackSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param myselfCheckId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyselfCheck selectByPKValue(Integer myselfCheckId) {
        return doSelectByPKValue(myselfCheckId, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> ENTITY doSelectByPKValue(Integer myselfCheckId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(myselfCheckId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param myselfCheckId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyselfCheck selectByPKValueWithDeletedCheck(Integer myselfCheckId) {
        return doSelectByPKValueWithDeletedCheck(myselfCheckId, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> ENTITY doSelectByPKValueWithDeletedCheck(Integer myselfCheckId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(myselfCheckId), entityType);
    }

    private WhiteMyselfCheckCB buildPKCB(Integer myselfCheckId) {
        assertObjectNotNull("myselfCheckId", myselfCheckId);
        WhiteMyselfCheckCB cb = newMyConditionBean();
        cb.query().setMyselfCheckId_Equal(myselfCheckId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteMyselfCheck&gt; whiteMyselfCheckList = whiteMyselfCheckBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteMyselfCheck whiteMyselfCheck : whiteMyselfCheckList) {
     *     ... = whiteMyselfCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteMyselfCheck> selectList(WhiteMyselfCheckCB cb) {
        return doSelectList(cb, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> ListResultBean<ENTITY> doSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteMyselfCheckCB>() {
            public List<ENTITY> callbackSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteMyselfCheck&gt; page = whiteMyselfCheckBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteMyselfCheck whiteMyselfCheck : page) {
     *     ... = whiteMyselfCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteMyselfCheck> selectPage(WhiteMyselfCheckCB cb) {
        return doSelectPage(cb, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> PagingResultBean<ENTITY> doSelectPage(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteMyselfCheckCB>() {
            public int callbackSelectCount(WhiteMyselfCheckCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * whiteMyselfCheckBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteMyselfCheck&gt;() {
     *     public void handle(WhiteMyselfCheck entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteMyselfCheck. (NotNull)
     */
    public void selectCursor(WhiteMyselfCheckCB cb, EntityRowHandler<WhiteMyselfCheck> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteMyselfCheck.class);
    }

    protected <ENTITY extends WhiteMyselfCheck> void doSelectCursor(WhiteMyselfCheckCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteMyselfCheck>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteMyselfCheckCB>() {
            public void callbackSelectCursor(WhiteMyselfCheckCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteMyselfCheckBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteMyselfCheckCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteMyselfCheckCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteMyselfCheckCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'WhiteMyself'.
     * @param whiteMyselfCheckList The list of whiteMyselfCheck. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteMyself> pulloutWhiteMyself(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        return helpPulloutInternally(whiteMyselfCheckList, new InternalPulloutCallback<WhiteMyselfCheck, WhiteMyself>() {
            public WhiteMyself getFr(WhiteMyselfCheck e) { return e.getWhiteMyself(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteMyself e, List<WhiteMyselfCheck> ls)
            { e.setWhiteMyselfCheckList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key myselfCheckId.
     * @param whiteMyselfCheckList The list of whiteMyselfCheck. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMyselfCheckIdList(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        return helpExtractListInternally(whiteMyselfCheckList, new InternalExtractCallback<WhiteMyselfCheck, Integer>() {
            public Integer getCV(WhiteMyselfCheck e) { return e.getMyselfCheckId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteMyselfCheck.setFoo...(value);
     * whiteMyselfCheck.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.set...;</span>
     * whiteMyselfCheckBhv.<span style="color: #FD4747">insert</span>(whiteMyselfCheck);
     * ... = whiteMyselfCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteMyselfCheck The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteMyselfCheck whiteMyselfCheck) {
        doInsert(whiteMyselfCheck, null);
    }

    protected void doInsert(WhiteMyselfCheck whiteMyselfCheck, InsertOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheck", whiteMyselfCheck);
        prepareInsertOption(option);
        delegateInsert(whiteMyselfCheck, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteMyselfCheckCB> option) {
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
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * whiteMyselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteMyselfCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteMyselfCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteMyselfCheckBhv.<span style="color: #FD4747">update</span>(whiteMyselfCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteMyselfCheck The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteMyselfCheck whiteMyselfCheck) {
        doUpdate(whiteMyselfCheck, null);
    }

    protected void doUpdate(WhiteMyselfCheck whiteMyselfCheck, final UpdateOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheck", whiteMyselfCheck);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteMyselfCheck, new InternalUpdateCallback<WhiteMyselfCheck>() {
            public int callbackDelegateUpdate(WhiteMyselfCheck entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteMyselfCheckCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteMyselfCheckCB createCBForVaryingUpdate() {
        WhiteMyselfCheckCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteMyselfCheckCB createCBForSpecifiedUpdate() {
        WhiteMyselfCheckCB cb = newMyConditionBean();
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
     * @param whiteMyselfCheck The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteMyselfCheck whiteMyselfCheck) {
        doInesrtOrUpdate(whiteMyselfCheck, null, null);
    }

    protected void doInesrtOrUpdate(WhiteMyselfCheck whiteMyselfCheck, final InsertOption<WhiteMyselfCheckCB> insertOption, final UpdateOption<WhiteMyselfCheckCB> updateOption) {
        helpInsertOrUpdateInternally(whiteMyselfCheck, new InternalInsertOrUpdateCallback<WhiteMyselfCheck, WhiteMyselfCheckCB>() {
            public void callbackInsert(WhiteMyselfCheck entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteMyselfCheck entity) { doUpdate(entity, updateOption); }
            public WhiteMyselfCheckCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteMyselfCheckCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteMyselfCheckCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteMyselfCheckCB>() : updateOption;
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
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * whiteMyselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteMyselfCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteMyselfCheckBhv.<span style="color: #FD4747">delete</span>(whiteMyselfCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteMyselfCheck The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteMyselfCheck whiteMyselfCheck) {
        doDelete(whiteMyselfCheck, null);
    }

    protected void doDelete(WhiteMyselfCheck whiteMyselfCheck, final DeleteOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheck", whiteMyselfCheck);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteMyselfCheck, new InternalDeleteCallback<WhiteMyselfCheck>() {
            public int callbackDelegateDelete(WhiteMyselfCheck entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteMyselfCheckCB> option) {
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
     *     WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     *     whiteMyselfCheck.setFooName("foo");
     *     if (...) {
     *         whiteMyselfCheck.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteMyselfCheckList.add(whiteMyselfCheck);
     * }
     * whiteMyselfCheckBhv.<span style="color: #FD4747">batchInsert</span>(whiteMyselfCheckList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        InsertOption<WhiteMyselfCheckCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteMyselfCheckList, option);
    }

    protected int[] doBatchInsert(List<WhiteMyselfCheck> whiteMyselfCheckList, InsertOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheckList", whiteMyselfCheckList);
        prepareBatchInsertOption(whiteMyselfCheckList, option);
        return delegateBatchInsert(whiteMyselfCheckList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteMyselfCheck> whiteMyselfCheckList, InsertOption<WhiteMyselfCheckCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteMyselfCheckList);
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
     *     WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     *     whiteMyselfCheck.setFooName("foo");
     *     if (...) {
     *         whiteMyselfCheck.setFooPrice(123);
     *     } else {
     *         whiteMyselfCheck.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteMyselfCheck.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteMyselfCheckList.add(whiteMyselfCheck);
     * }
     * whiteMyselfCheckBhv.<span style="color: #FD4747">batchUpdate</span>(whiteMyselfCheckList);
     * </pre>
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        UpdateOption<WhiteMyselfCheckCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteMyselfCheckList, option);
    }

    protected int[] doBatchUpdate(List<WhiteMyselfCheck> whiteMyselfCheckList, UpdateOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheckList", whiteMyselfCheckList);
        prepareBatchUpdateOption(whiteMyselfCheckList, option);
        return delegateBatchUpdate(whiteMyselfCheckList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteMyselfCheck> whiteMyselfCheckList, UpdateOption<WhiteMyselfCheckCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteMyselfCheckList);
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
     * whiteMyselfCheckBhv.<span style="color: #FD4747">batchUpdate</span>(whiteMyselfCheckList, new SpecifyQuery<WhiteMyselfCheckCB>() {
     *     public void specify(WhiteMyselfCheckCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteMyselfCheckBhv.<span style="color: #FD4747">batchUpdate</span>(whiteMyselfCheckList, new SpecifyQuery<WhiteMyselfCheckCB>() {
     *     public void specify(WhiteMyselfCheckCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteMyselfCheck> whiteMyselfCheckList, SpecifyQuery<WhiteMyselfCheckCB> updateColumnSpec) {
        return doBatchUpdate(whiteMyselfCheckList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        return doBatchDelete(whiteMyselfCheckList, null);
    }

    protected int[] doBatchDelete(List<WhiteMyselfCheck> whiteMyselfCheckList, DeleteOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheckList", whiteMyselfCheckList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteMyselfCheckList, option);
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
     * whiteMyselfCheckBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteMyselfCheck, WhiteMyselfCheckCB&gt;() {
     *     public ConditionBean setup(whiteMyselfCheck entity, WhiteMyselfCheckCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteMyselfCheck, WhiteMyselfCheckCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteMyselfCheck, WhiteMyselfCheckCB> setupper, InsertOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteMyselfCheck entity = new WhiteMyselfCheck();
        WhiteMyselfCheckCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteMyselfCheckCB createCBForQueryInsert() {
        WhiteMyselfCheckCB cb = newMyConditionBean();
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
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setPK...(value);</span>
     * whiteMyselfCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setVersionNo(value);</span>
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * whiteMyselfCheckBhv.<span style="color: #FD4747">queryUpdate</span>(whiteMyselfCheck, cb);
     * </pre>
     * @param whiteMyselfCheck The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteMyselfCheck whiteMyselfCheck, WhiteMyselfCheckCB cb) {
        return doQueryUpdate(whiteMyselfCheck, cb, null);
    }

    protected int doQueryUpdate(WhiteMyselfCheck whiteMyselfCheck, WhiteMyselfCheckCB cb, UpdateOption<WhiteMyselfCheckCB> option) {
        assertObjectNotNull("whiteMyselfCheck", whiteMyselfCheck); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteMyselfCheck, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteMyselfCheckCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteMyselfCheckCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * whiteMyselfCheckBhv.<span style="color: #FD4747">queryDelete</span>(whiteMyselfCheck, cb);
     * </pre>
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteMyselfCheckCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteMyselfCheckCB cb, DeleteOption<WhiteMyselfCheckCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteMyselfCheckCB)cb); }
        else { return varyingQueryDelete((WhiteMyselfCheckCB)cb, downcast(option)); }
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
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteMyselfCheck.setFoo...(value);
     * whiteMyselfCheck.setBar...(value);
     * InsertOption<WhiteMyselfCheckCB> option = new InsertOption<WhiteMyselfCheckCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteMyselfCheckBhv.<span style="color: #FD4747">varyingInsert</span>(whiteMyselfCheck, option);
     * ... = whiteMyselfCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteMyselfCheck The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteMyselfCheck whiteMyselfCheck, InsertOption<WhiteMyselfCheckCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteMyselfCheck, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * whiteMyselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteMyselfCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteMyselfCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteMyselfCheckCB&gt; option = new UpdateOption&lt;WhiteMyselfCheckCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteMyselfCheckCB&gt;() {
     *         public void specify(WhiteMyselfCheckCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteMyselfCheckBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteMyselfCheck, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteMyselfCheck The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteMyselfCheck whiteMyselfCheck, UpdateOption<WhiteMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteMyselfCheck, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteMyselfCheck The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteMyselfCheck whiteMyselfCheck, InsertOption<WhiteMyselfCheckCB> insertOption, UpdateOption<WhiteMyselfCheckCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteMyselfCheck, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteMyselfCheck The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteMyselfCheck whiteMyselfCheck, DeleteOption<WhiteMyselfCheckCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteMyselfCheck, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteMyselfCheck> whiteMyselfCheckList, InsertOption<WhiteMyselfCheckCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteMyselfCheckList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteMyselfCheck> whiteMyselfCheckList, UpdateOption<WhiteMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteMyselfCheckList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteMyselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteMyselfCheck> whiteMyselfCheckList, DeleteOption<WhiteMyselfCheckCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteMyselfCheckList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteMyselfCheck, WhiteMyselfCheckCB> setupper, InsertOption<WhiteMyselfCheckCB> option) {
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
     * WhiteMyselfCheck whiteMyselfCheck = new WhiteMyselfCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setPK...(value);</span>
     * whiteMyselfCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteMyselfCheck.setVersionNo(value);</span>
     * WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteMyselfCheckCB&gt; option = new UpdateOption&lt;WhiteMyselfCheckCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void specify(WhiteMyselfCheckCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteMyselfCheckBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteMyselfCheck, cb, option);
     * </pre>
     * @param whiteMyselfCheck The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteMyselfCheck whiteMyselfCheck, WhiteMyselfCheckCB cb, UpdateOption<WhiteMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteMyselfCheck, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteMyselfCheck. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteMyselfCheckCB cb, DeleteOption<WhiteMyselfCheckCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteMyselfCheckBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteMyselfCheckCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteMyselfCheckCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteMyselfCheck> void delegateSelectCursor(WhiteMyselfCheckCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteMyselfCheck> List<ENTITY> delegateSelectList(WhiteMyselfCheckCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteMyselfCheck e, InsertOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteMyselfCheck e, UpdateOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteMyselfCheck e, UpdateOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteMyselfCheck e, DeleteOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteMyselfCheck e, DeleteOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteMyselfCheck> ls, InsertOption<WhiteMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteMyselfCheck> ls, UpdateOption<WhiteMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteMyselfCheck> ls, UpdateOption<WhiteMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteMyselfCheck> ls, DeleteOption<WhiteMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteMyselfCheck> ls, DeleteOption<WhiteMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteMyselfCheck e, WhiteMyselfCheckCB inCB, ConditionBean resCB, InsertOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteMyselfCheck e, WhiteMyselfCheckCB cb, UpdateOption<WhiteMyselfCheckCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteMyselfCheckCB cb, DeleteOption<WhiteMyselfCheckCB> op)
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
    protected WhiteMyselfCheck downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteMyselfCheck.class);
    }

    protected WhiteMyselfCheckCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteMyselfCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteMyselfCheck> downcast(List<? extends Entity> entityList) {
        return (List<WhiteMyselfCheck>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteMyselfCheckCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteMyselfCheckCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteMyselfCheckCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteMyselfCheckCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteMyselfCheckCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteMyselfCheckCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteMyselfCheck, WhiteMyselfCheckCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteMyselfCheck, WhiteMyselfCheckCB>)option;
    }
}
