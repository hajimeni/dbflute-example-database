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
 * The behavior of WHITE_VARIANT_RELATION_MASTER_CORGE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_CORGE_ID
 * 
 * [column]
 *     MASTER_CORGE_ID, MASTER_CORGE_NAME, CORGE_TYPE_CODE
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
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterCorgeBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_variant_relation_master_corge"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteVariantRelationMasterCorgeDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationMasterCorgeDbm getMyDBMeta() { return WhiteVariantRelationMasterCorgeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationMasterCorge newMyEntity() { return new WhiteVariantRelationMasterCorge(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationMasterCorgeCB newMyConditionBean() { return new WhiteVariantRelationMasterCorgeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterCorgeCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteVariantRelationMasterCorgeCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteVariantRelationMasterCorgeCB cb) { // called by selectPage(cb)
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
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationMasterCorge != null) {
     *     ... = whiteVariantRelationMasterCorge.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterCorge selectEntity(WhiteVariantRelationMasterCorgeCB cb) {
        return doSelectEntity(cb, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> ENTITY doSelectEntity(final WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteVariantRelationMasterCorgeCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterCorge.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterCorge selectEntityWithDeletedCheck(WhiteVariantRelationMasterCorgeCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> ENTITY doSelectEntityWithDeletedCheck(final WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteVariantRelationMasterCorgeCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param masterCorgeId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterCorge selectByPKValue(Long masterCorgeId) {
        return doSelectByPKValue(masterCorgeId, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> ENTITY doSelectByPKValue(Long masterCorgeId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(masterCorgeId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param masterCorgeId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterCorge selectByPKValueWithDeletedCheck(Long masterCorgeId) {
        return doSelectByPKValueWithDeletedCheck(masterCorgeId, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> ENTITY doSelectByPKValueWithDeletedCheck(Long masterCorgeId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(masterCorgeId), entityType);
    }

    private WhiteVariantRelationMasterCorgeCB buildPKCB(Long masterCorgeId) {
        assertObjectNotNull("masterCorgeId", masterCorgeId);
        WhiteVariantRelationMasterCorgeCB cb = newMyConditionBean();
        cb.query().setMasterCorgeId_Equal(masterCorgeId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterCorge&gt; whiteVariantRelationMasterCorgeList = whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge : whiteVariantRelationMasterCorgeList) {
     *     ... = whiteVariantRelationMasterCorge.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterCorge> selectList(WhiteVariantRelationMasterCorgeCB cb) {
        return doSelectList(cb, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> ListResultBean<ENTITY> doSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteVariantRelationMasterCorgeCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterCorge&gt; page = whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge : page) {
     *     ... = whiteVariantRelationMasterCorge.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterCorge> selectPage(WhiteVariantRelationMasterCorgeCB cb) {
        return doSelectPage(cb, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> PagingResultBean<ENTITY> doSelectPage(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteVariantRelationMasterCorgeCB>() {
            public int callbackSelectCount(WhiteVariantRelationMasterCorgeCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterCorge&gt;() {
     *     public void handle(WhiteVariantRelationMasterCorge entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterCorge. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterCorgeCB cb, EntityRowHandler<WhiteVariantRelationMasterCorge> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteVariantRelationMasterCorge.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterCorge> void doSelectCursor(WhiteVariantRelationMasterCorgeCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteVariantRelationMasterCorge>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteVariantRelationMasterCorgeCB>() {
            public void callbackSelectCursor(WhiteVariantRelationMasterCorgeCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterCorgeCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteVariantRelationMasterCorgeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteVariantRelationMasterCorgeCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key masterCorgeId.
     * @param whiteVariantRelationMasterCorgeList The list of whiteVariantRelationMasterCorge. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterCorgeIdList(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList) {
        return helpExtractListInternally(whiteVariantRelationMasterCorgeList, new InternalExtractCallback<WhiteVariantRelationMasterCorge, Long>() {
            public Long getCV(WhiteVariantRelationMasterCorge e) { return e.getMasterCorgeId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterCorge.setFoo...(value);
     * whiteVariantRelationMasterCorge.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.set...;</span>
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">insert</span>(whiteVariantRelationMasterCorge);
     * ... = whiteVariantRelationMasterCorge.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterCorge The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge) {
        doInsert(whiteVariantRelationMasterCorge, null);
    }

    protected void doInsert(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorge", whiteVariantRelationMasterCorge);
        prepareInsertOption(option);
        delegateInsert(whiteVariantRelationMasterCorge, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
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
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * whiteVariantRelationMasterCorge.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterCorge.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterCorge.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">update</span>(whiteVariantRelationMasterCorge);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteVariantRelationMasterCorge The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge) {
        doUpdate(whiteVariantRelationMasterCorge, null);
    }

    protected void doUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, final UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorge", whiteVariantRelationMasterCorge);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteVariantRelationMasterCorge, new InternalUpdateCallback<WhiteVariantRelationMasterCorge>() {
            public int callbackDelegateUpdate(WhiteVariantRelationMasterCorge entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteVariantRelationMasterCorgeCB createCBForVaryingUpdate() {
        WhiteVariantRelationMasterCorgeCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteVariantRelationMasterCorgeCB createCBForSpecifiedUpdate() {
        WhiteVariantRelationMasterCorgeCB cb = newMyConditionBean();
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
     * @param whiteVariantRelationMasterCorge The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge) {
        doInesrtOrUpdate(whiteVariantRelationMasterCorge, null, null);
    }

    protected void doInesrtOrUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, final InsertOption<WhiteVariantRelationMasterCorgeCB> insertOption, final UpdateOption<WhiteVariantRelationMasterCorgeCB> updateOption) {
        helpInsertOrUpdateInternally(whiteVariantRelationMasterCorge, new InternalInsertOrUpdateCallback<WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB>() {
            public void callbackInsert(WhiteVariantRelationMasterCorge entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteVariantRelationMasterCorge entity) { doUpdate(entity, updateOption); }
            public WhiteVariantRelationMasterCorgeCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteVariantRelationMasterCorgeCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteVariantRelationMasterCorgeCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteVariantRelationMasterCorgeCB>() : updateOption;
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
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * whiteVariantRelationMasterCorge.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterCorge.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">delete</span>(whiteVariantRelationMasterCorge);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteVariantRelationMasterCorge The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge) {
        doDelete(whiteVariantRelationMasterCorge, null);
    }

    protected void doDelete(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, final DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorge", whiteVariantRelationMasterCorge);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteVariantRelationMasterCorge, new InternalDeleteCallback<WhiteVariantRelationMasterCorge>() {
            public int callbackDelegateDelete(WhiteVariantRelationMasterCorge entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
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
     *     WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     *     whiteVariantRelationMasterCorge.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterCorge.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterCorgeList.add(whiteVariantRelationMasterCorge);
     * }
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">batchInsert</span>(whiteVariantRelationMasterCorgeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList) {
        InsertOption<WhiteVariantRelationMasterCorgeCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteVariantRelationMasterCorgeList, option);
    }

    protected int[] doBatchInsert(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorgeList", whiteVariantRelationMasterCorgeList);
        prepareBatchInsertOption(whiteVariantRelationMasterCorgeList, option);
        return delegateBatchInsert(whiteVariantRelationMasterCorgeList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterCorgeList);
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
     *     WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     *     whiteVariantRelationMasterCorge.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterCorge.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterCorge.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterCorgeList.add(whiteVariantRelationMasterCorge);
     * }
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterCorgeList);
     * </pre>
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList) {
        UpdateOption<WhiteVariantRelationMasterCorgeCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteVariantRelationMasterCorgeList, option);
    }

    protected int[] doBatchUpdate(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorgeList", whiteVariantRelationMasterCorgeList);
        prepareBatchUpdateOption(whiteVariantRelationMasterCorgeList, option);
        return delegateBatchUpdate(whiteVariantRelationMasterCorgeList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterCorgeList);
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
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterCorgeList, new SpecifyQuery<WhiteVariantRelationMasterCorgeCB>() {
     *     public void specify(WhiteVariantRelationMasterCorgeCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterCorgeList, new SpecifyQuery<WhiteVariantRelationMasterCorgeCB>() {
     *     public void specify(WhiteVariantRelationMasterCorgeCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, SpecifyQuery<WhiteVariantRelationMasterCorgeCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationMasterCorgeList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList) {
        return doBatchDelete(whiteVariantRelationMasterCorgeList, null);
    }

    protected int[] doBatchDelete(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorgeList", whiteVariantRelationMasterCorgeList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteVariantRelationMasterCorgeList, option);
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
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public ConditionBean setup(whiteVariantRelationMasterCorge entity, WhiteVariantRelationMasterCorgeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB> setupper, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteVariantRelationMasterCorge entity = new WhiteVariantRelationMasterCorge();
        WhiteVariantRelationMasterCorgeCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteVariantRelationMasterCorgeCB createCBForQueryInsert() {
        WhiteVariantRelationMasterCorgeCB cb = newMyConditionBean();
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
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setPK...(value);</span>
     * whiteVariantRelationMasterCorge.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setVersionNo(value);</span>
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">queryUpdate</span>(whiteVariantRelationMasterCorge, cb);
     * </pre>
     * @param whiteVariantRelationMasterCorge The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterCorge, cb, null);
    }

    protected int doQueryUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB cb, UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterCorge", whiteVariantRelationMasterCorge); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteVariantRelationMasterCorge, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteVariantRelationMasterCorgeCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteVariantRelationMasterCorgeCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">queryDelete</span>(whiteVariantRelationMasterCorge, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterCorgeCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteVariantRelationMasterCorgeCB cb, DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteVariantRelationMasterCorgeCB)cb); }
        else { return varyingQueryDelete((WhiteVariantRelationMasterCorgeCB)cb, downcast(option)); }
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
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterCorge.setFoo...(value);
     * whiteVariantRelationMasterCorge.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterCorgeCB> option = new InsertOption<WhiteVariantRelationMasterCorgeCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">varyingInsert</span>(whiteVariantRelationMasterCorge, option);
     * ... = whiteVariantRelationMasterCorge.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterCorge The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationMasterCorge, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * whiteVariantRelationMasterCorge.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterCorge.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterCorge.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterCorgeCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterCorgeCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterCorgeCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteVariantRelationMasterCorge, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterCorge The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationMasterCorge, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterCorge The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, InsertOption<WhiteVariantRelationMasterCorgeCB> insertOption, UpdateOption<WhiteVariantRelationMasterCorgeCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteVariantRelationMasterCorge, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterCorge The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationMasterCorge, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationMasterCorgeList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationMasterCorgeList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterCorgeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeList, DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationMasterCorgeList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB> setupper, InsertOption<WhiteVariantRelationMasterCorgeCB> option) {
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
     * WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge = new WhiteVariantRelationMasterCorge();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setPK...(value);</span>
     * whiteVariantRelationMasterCorge.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterCorge.setVersionNo(value);</span>
     * WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterCorgeCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterCorgeCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterCorgeCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterCorgeBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterCorge, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterCorge The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB cb, UpdateOption<WhiteVariantRelationMasterCorgeCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationMasterCorge, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterCorge. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterCorgeCB cb, DeleteOption<WhiteVariantRelationMasterCorgeCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterCorgeBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteVariantRelationMasterCorgeCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteVariantRelationMasterCorgeCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteVariantRelationMasterCorge> void delegateSelectCursor(WhiteVariantRelationMasterCorgeCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteVariantRelationMasterCorge> List<ENTITY> delegateSelectList(WhiteVariantRelationMasterCorgeCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteVariantRelationMasterCorge e, InsertOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteVariantRelationMasterCorge e, UpdateOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteVariantRelationMasterCorge e, UpdateOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteVariantRelationMasterCorge e, DeleteOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteVariantRelationMasterCorge e, DeleteOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteVariantRelationMasterCorge> ls, InsertOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteVariantRelationMasterCorge> ls, UpdateOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteVariantRelationMasterCorge> ls, UpdateOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteVariantRelationMasterCorge> ls, DeleteOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteVariantRelationMasterCorge> ls, DeleteOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteVariantRelationMasterCorge e, WhiteVariantRelationMasterCorgeCB inCB, ConditionBean resCB, InsertOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteVariantRelationMasterCorge e, WhiteVariantRelationMasterCorgeCB cb, UpdateOption<WhiteVariantRelationMasterCorgeCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteVariantRelationMasterCorgeCB cb, DeleteOption<WhiteVariantRelationMasterCorgeCB> op)
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
    protected WhiteVariantRelationMasterCorge downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteVariantRelationMasterCorge.class);
    }

    protected WhiteVariantRelationMasterCorgeCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteVariantRelationMasterCorgeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteVariantRelationMasterCorge> downcast(List<? extends Entity> entityList) {
        return (List<WhiteVariantRelationMasterCorge>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationMasterCorgeCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteVariantRelationMasterCorgeCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationMasterCorgeCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteVariantRelationMasterCorgeCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationMasterCorgeCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteVariantRelationMasterCorgeCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteVariantRelationMasterCorge, WhiteVariantRelationMasterCorgeCB>)option;
    }
}
