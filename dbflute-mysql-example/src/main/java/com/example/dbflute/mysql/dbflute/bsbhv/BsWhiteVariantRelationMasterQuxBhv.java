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
 * The behavior of WHITE_VARIANT_RELATION_MASTER_QUX as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_QUX_ID
 * 
 * [column]
 *     MASTER_QUX_ID, MASTER_QUX_NAME, QUX_TYPE_CODE
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
public abstract class BsWhiteVariantRelationMasterQuxBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_variant_relation_master_qux"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteVariantRelationMasterQuxDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationMasterQuxDbm getMyDBMeta() { return WhiteVariantRelationMasterQuxDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationMasterQux newMyEntity() { return new WhiteVariantRelationMasterQux(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationMasterQuxCB newMyConditionBean() { return new WhiteVariantRelationMasterQuxCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteVariantRelationMasterQuxCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteVariantRelationMasterQuxCB cb) { // called by selectPage(cb)
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
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationMasterQux != null) {
     *     ... = whiteVariantRelationMasterQux.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectEntity(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectEntity(cb, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectEntity(final WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteVariantRelationMasterQuxCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterQux.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectEntityWithDeletedCheck(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectEntityWithDeletedCheck(final WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteVariantRelationMasterQuxCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param masterQuxId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectByPKValue(Long masterQuxId) {
        return doSelectByPKValue(masterQuxId, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectByPKValue(Long masterQuxId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(masterQuxId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param masterQuxId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectByPKValueWithDeletedCheck(Long masterQuxId) {
        return doSelectByPKValueWithDeletedCheck(masterQuxId, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectByPKValueWithDeletedCheck(Long masterQuxId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(masterQuxId), entityType);
    }

    private WhiteVariantRelationMasterQuxCB buildPKCB(Long masterQuxId) {
        assertObjectNotNull("masterQuxId", masterQuxId);
        WhiteVariantRelationMasterQuxCB cb = newMyConditionBean();
        cb.query().setMasterQuxId_Equal(masterQuxId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterQux&gt; whiteVariantRelationMasterQuxList = whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterQux whiteVariantRelationMasterQux : whiteVariantRelationMasterQuxList) {
     *     ... = whiteVariantRelationMasterQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterQux> selectList(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectList(cb, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ListResultBean<ENTITY> doSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteVariantRelationMasterQuxCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterQux&gt; page = whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterQux whiteVariantRelationMasterQux : page) {
     *     ... = whiteVariantRelationMasterQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterQux> selectPage(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectPage(cb, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> PagingResultBean<ENTITY> doSelectPage(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteVariantRelationMasterQuxCB>() {
            public int callbackSelectCount(WhiteVariantRelationMasterQuxCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterQux&gt;() {
     *     public void handle(WhiteVariantRelationMasterQux entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterQux. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<WhiteVariantRelationMasterQux> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteVariantRelationMasterQux.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> void doSelectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteVariantRelationMasterQux>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteVariantRelationMasterQuxCB>() {
            public void callbackSelectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterQuxCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteVariantRelationMasterQuxCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteVariantRelationMasterQuxCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Extract the value list of (single) primary key masterQuxId.
     * @param whiteVariantRelationMasterQuxList The list of whiteVariantRelationMasterQux. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterQuxIdList(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        return helpExtractListInternally(whiteVariantRelationMasterQuxList, new InternalExtractCallback<WhiteVariantRelationMasterQux, Long>() {
            public Long getCV(WhiteVariantRelationMasterQux e) { return e.getMasterQuxId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterQux.setFoo...(value);
     * whiteVariantRelationMasterQux.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.set...;</span>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">insert</span>(whiteVariantRelationMasterQux);
     * ... = whiteVariantRelationMasterQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterQux The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doInsert(whiteVariantRelationMasterQux, null);
    }

    protected void doInsert(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQux", whiteVariantRelationMasterQux);
        prepareInsertOption(option);
        delegateInsert(whiteVariantRelationMasterQux, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteVariantRelationMasterQuxCB> option) {
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * whiteVariantRelationMasterQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterQux.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">update</span>(whiteVariantRelationMasterQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doUpdate(whiteVariantRelationMasterQux, null);
    }

    protected void doUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, final UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQux", whiteVariantRelationMasterQux);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteVariantRelationMasterQux, new InternalUpdateCallback<WhiteVariantRelationMasterQux>() {
            public int callbackDelegateUpdate(WhiteVariantRelationMasterQux entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteVariantRelationMasterQuxCB createCBForVaryingUpdate() {
        WhiteVariantRelationMasterQuxCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteVariantRelationMasterQuxCB createCBForSpecifiedUpdate() {
        WhiteVariantRelationMasterQuxCB cb = newMyConditionBean();
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
     * @param whiteVariantRelationMasterQux The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doInesrtOrUpdate(whiteVariantRelationMasterQux, null, null);
    }

    protected void doInesrtOrUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, final InsertOption<WhiteVariantRelationMasterQuxCB> insertOption, final UpdateOption<WhiteVariantRelationMasterQuxCB> updateOption) {
        helpInsertOrUpdateInternally(whiteVariantRelationMasterQux, new InternalInsertOrUpdateCallback<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB>() {
            public void callbackInsert(WhiteVariantRelationMasterQux entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteVariantRelationMasterQux entity) { doUpdate(entity, updateOption); }
            public WhiteVariantRelationMasterQuxCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteVariantRelationMasterQuxCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteVariantRelationMasterQuxCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteVariantRelationMasterQuxCB>() : updateOption;
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * whiteVariantRelationMasterQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterQux.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">delete</span>(whiteVariantRelationMasterQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doDelete(whiteVariantRelationMasterQux, null);
    }

    protected void doDelete(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, final DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQux", whiteVariantRelationMasterQux);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteVariantRelationMasterQux, new InternalDeleteCallback<WhiteVariantRelationMasterQux>() {
            public int callbackDelegateDelete(WhiteVariantRelationMasterQux entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
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
     *     WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     *     whiteVariantRelationMasterQux.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterQux.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterQuxList.add(whiteVariantRelationMasterQux);
     * }
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">batchInsert</span>(whiteVariantRelationMasterQuxList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        InsertOption<WhiteVariantRelationMasterQuxCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteVariantRelationMasterQuxList, option);
    }

    protected int[] doBatchInsert(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQuxList", whiteVariantRelationMasterQuxList);
        prepareBatchInsertOption(whiteVariantRelationMasterQuxList, option);
        return delegateBatchInsert(whiteVariantRelationMasterQuxList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterQuxList);
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
     *     WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     *     whiteVariantRelationMasterQux.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterQux.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterQux.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterQuxList.add(whiteVariantRelationMasterQux);
     * }
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterQuxList);
     * </pre>
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        UpdateOption<WhiteVariantRelationMasterQuxCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteVariantRelationMasterQuxList, option);
    }

    protected int[] doBatchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQuxList", whiteVariantRelationMasterQuxList);
        prepareBatchUpdateOption(whiteVariantRelationMasterQuxList, option);
        return delegateBatchUpdate(whiteVariantRelationMasterQuxList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterQuxList);
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
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterQuxList, new SpecifyQuery<WhiteVariantRelationMasterQuxCB>() {
     *     public void specify(WhiteVariantRelationMasterQuxCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterQuxList, new SpecifyQuery<WhiteVariantRelationMasterQuxCB>() {
     *     public void specify(WhiteVariantRelationMasterQuxCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, SpecifyQuery<WhiteVariantRelationMasterQuxCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationMasterQuxList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        return doBatchDelete(whiteVariantRelationMasterQuxList, null);
    }

    protected int[] doBatchDelete(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQuxList", whiteVariantRelationMasterQuxList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteVariantRelationMasterQuxList, option);
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
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB&gt;() {
     *     public ConditionBean setup(whiteVariantRelationMasterQux entity, WhiteVariantRelationMasterQuxCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> setupper, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteVariantRelationMasterQux entity = new WhiteVariantRelationMasterQux();
        WhiteVariantRelationMasterQuxCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteVariantRelationMasterQuxCB createCBForQueryInsert() {
        WhiteVariantRelationMasterQuxCB cb = newMyConditionBean();
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setPK...(value);</span>
     * whiteVariantRelationMasterQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setVersionNo(value);</span>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">queryUpdate</span>(whiteVariantRelationMasterQux, cb);
     * </pre>
     * @param whiteVariantRelationMasterQux The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterQux, cb, null);
    }

    protected int doQueryUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB cb, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterQux", whiteVariantRelationMasterQux); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteVariantRelationMasterQux, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteVariantRelationMasterQuxCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteVariantRelationMasterQuxCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">queryDelete</span>(whiteVariantRelationMasterQux, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterQuxCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteVariantRelationMasterQuxCB cb, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteVariantRelationMasterQuxCB)cb); }
        else { return varyingQueryDelete((WhiteVariantRelationMasterQuxCB)cb, downcast(option)); }
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterQux.setFoo...(value);
     * whiteVariantRelationMasterQux.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterQuxCB> option = new InsertOption<WhiteVariantRelationMasterQuxCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">varyingInsert</span>(whiteVariantRelationMasterQux, option);
     * ... = whiteVariantRelationMasterQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationMasterQux, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * whiteVariantRelationMasterQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterQux.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterQuxCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteVariantRelationMasterQux, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationMasterQux, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterQux The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, InsertOption<WhiteVariantRelationMasterQuxCB> insertOption, UpdateOption<WhiteVariantRelationMasterQuxCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteVariantRelationMasterQux, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterQux The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationMasterQux, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationMasterQuxList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationMasterQuxList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationMasterQuxList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> setupper, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setPK...(value);</span>
     * whiteVariantRelationMasterQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setVersionNo(value);</span>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterQuxCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterQux, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterQux The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB cb, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationMasterQux, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterQuxCB cb, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterQuxBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteVariantRelationMasterQuxCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteVariantRelationMasterQuxCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteVariantRelationMasterQux> void delegateSelectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteVariantRelationMasterQux> List<ENTITY> delegateSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteVariantRelationMasterQux e, InsertOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteVariantRelationMasterQux e, UpdateOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteVariantRelationMasterQux e, UpdateOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteVariantRelationMasterQux e, DeleteOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteVariantRelationMasterQux e, DeleteOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteVariantRelationMasterQux> ls, InsertOption<WhiteVariantRelationMasterQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteVariantRelationMasterQux> ls, UpdateOption<WhiteVariantRelationMasterQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteVariantRelationMasterQux> ls, UpdateOption<WhiteVariantRelationMasterQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteVariantRelationMasterQux> ls, DeleteOption<WhiteVariantRelationMasterQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteVariantRelationMasterQux> ls, DeleteOption<WhiteVariantRelationMasterQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteVariantRelationMasterQux e, WhiteVariantRelationMasterQuxCB inCB, ConditionBean resCB, InsertOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteVariantRelationMasterQux e, WhiteVariantRelationMasterQuxCB cb, UpdateOption<WhiteVariantRelationMasterQuxCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteVariantRelationMasterQuxCB cb, DeleteOption<WhiteVariantRelationMasterQuxCB> op)
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
    protected WhiteVariantRelationMasterQux downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteVariantRelationMasterQux.class);
    }

    protected WhiteVariantRelationMasterQuxCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteVariantRelationMasterQuxCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteVariantRelationMasterQux> downcast(List<? extends Entity> entityList) {
        return (List<WhiteVariantRelationMasterQux>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationMasterQuxCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteVariantRelationMasterQuxCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationMasterQuxCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteVariantRelationMasterQuxCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationMasterQuxCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteVariantRelationMasterQuxCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB>)option;
    }
}
