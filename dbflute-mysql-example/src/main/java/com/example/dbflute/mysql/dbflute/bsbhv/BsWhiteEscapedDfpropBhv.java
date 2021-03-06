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
 * The behavior of WHITE_ESCAPED_DFPROP as TABLE. <br />
 * <pre>
 * [primary key]
 *     ESCAPED_DFPROP_CODE
 * 
 * [column]
 *     ESCAPED_DFPROP_CODE, ESCAPED_DFPROP_NAME
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
public abstract class BsWhiteEscapedDfpropBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_escaped_dfprop"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteEscapedDfpropDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteEscapedDfpropDbm getMyDBMeta() { return WhiteEscapedDfpropDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteEscapedDfprop newMyEntity() { return new WhiteEscapedDfprop(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteEscapedDfpropCB newMyConditionBean() { return new WhiteEscapedDfpropCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * int count = whiteEscapedDfpropBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteEscapedDfpropCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteEscapedDfpropCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteEscapedDfpropCB cb) { // called by selectPage(cb)
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
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * WhiteEscapedDfprop whiteEscapedDfprop = whiteEscapedDfpropBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteEscapedDfprop != null) {
     *     ... = whiteEscapedDfprop.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedDfprop selectEntity(WhiteEscapedDfpropCB cb) {
        return doSelectEntity(cb, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> ENTITY doSelectEntity(final WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteEscapedDfpropCB>() {
            public List<ENTITY> callbackSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * WhiteEscapedDfprop whiteEscapedDfprop = whiteEscapedDfpropBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteEscapedDfprop.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedDfprop selectEntityWithDeletedCheck(WhiteEscapedDfpropCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> ENTITY doSelectEntityWithDeletedCheck(final WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteEscapedDfpropCB>() {
            public List<ENTITY> callbackSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param escapedDfpropCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedDfprop selectByPKValue(String escapedDfpropCode) {
        return doSelectByPKValue(escapedDfpropCode, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> ENTITY doSelectByPKValue(String escapedDfpropCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(escapedDfpropCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param escapedDfpropCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedDfprop selectByPKValueWithDeletedCheck(String escapedDfpropCode) {
        return doSelectByPKValueWithDeletedCheck(escapedDfpropCode, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> ENTITY doSelectByPKValueWithDeletedCheck(String escapedDfpropCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(escapedDfpropCode), entityType);
    }

    private WhiteEscapedDfpropCB buildPKCB(String escapedDfpropCode) {
        assertObjectNotNull("escapedDfpropCode", escapedDfpropCode);
        WhiteEscapedDfpropCB cb = newMyConditionBean();
        cb.query().setEscapedDfpropCode_Equal(escapedDfpropCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteEscapedDfprop&gt; whiteEscapedDfpropList = whiteEscapedDfpropBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteEscapedDfprop whiteEscapedDfprop : whiteEscapedDfpropList) {
     *     ... = whiteEscapedDfprop.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteEscapedDfprop> selectList(WhiteEscapedDfpropCB cb) {
        return doSelectList(cb, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> ListResultBean<ENTITY> doSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteEscapedDfpropCB>() {
            public List<ENTITY> callbackSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteEscapedDfprop&gt; page = whiteEscapedDfpropBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteEscapedDfprop whiteEscapedDfprop : page) {
     *     ... = whiteEscapedDfprop.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteEscapedDfprop> selectPage(WhiteEscapedDfpropCB cb) {
        return doSelectPage(cb, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> PagingResultBean<ENTITY> doSelectPage(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteEscapedDfpropCB>() {
            public int callbackSelectCount(WhiteEscapedDfpropCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteEscapedDfprop&gt;() {
     *     public void handle(WhiteEscapedDfprop entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteEscapedDfprop. (NotNull)
     */
    public void selectCursor(WhiteEscapedDfpropCB cb, EntityRowHandler<WhiteEscapedDfprop> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteEscapedDfprop.class);
    }

    protected <ENTITY extends WhiteEscapedDfprop> void doSelectCursor(WhiteEscapedDfpropCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteEscapedDfprop>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteEscapedDfpropCB>() {
            public void callbackSelectCursor(WhiteEscapedDfpropCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteEscapedDfpropCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteEscapedDfpropCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteEscapedDfpropCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Extract the value list of (single) primary key escapedDfpropCode.
     * @param whiteEscapedDfpropList The list of whiteEscapedDfprop. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractEscapedDfpropCodeList(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        return helpExtractListInternally(whiteEscapedDfpropList, new InternalExtractCallback<WhiteEscapedDfprop, String>() {
            public String getCV(WhiteEscapedDfprop e) { return e.getEscapedDfpropCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteEscapedDfprop.setFoo...(value);
     * whiteEscapedDfprop.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">insert</span>(whiteEscapedDfprop);
     * ... = whiteEscapedDfprop.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteEscapedDfprop The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteEscapedDfprop whiteEscapedDfprop) {
        doInsert(whiteEscapedDfprop, null);
    }

    protected void doInsert(WhiteEscapedDfprop whiteEscapedDfprop, InsertOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfprop", whiteEscapedDfprop);
        prepareInsertOption(option);
        delegateInsert(whiteEscapedDfprop, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteEscapedDfpropCB> option) {
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
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * whiteEscapedDfprop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteEscapedDfprop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteEscapedDfprop.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteEscapedDfpropBhv.<span style="color: #FD4747">update</span>(whiteEscapedDfprop);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteEscapedDfprop The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteEscapedDfprop whiteEscapedDfprop) {
        doUpdate(whiteEscapedDfprop, null);
    }

    protected void doUpdate(WhiteEscapedDfprop whiteEscapedDfprop, final UpdateOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfprop", whiteEscapedDfprop);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteEscapedDfprop, new InternalUpdateCallback<WhiteEscapedDfprop>() {
            public int callbackDelegateUpdate(WhiteEscapedDfprop entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteEscapedDfpropCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteEscapedDfpropCB createCBForVaryingUpdate() {
        WhiteEscapedDfpropCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteEscapedDfpropCB createCBForSpecifiedUpdate() {
        WhiteEscapedDfpropCB cb = newMyConditionBean();
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
     * @param whiteEscapedDfprop The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteEscapedDfprop whiteEscapedDfprop) {
        doInesrtOrUpdate(whiteEscapedDfprop, null, null);
    }

    protected void doInesrtOrUpdate(WhiteEscapedDfprop whiteEscapedDfprop, final InsertOption<WhiteEscapedDfpropCB> insertOption, final UpdateOption<WhiteEscapedDfpropCB> updateOption) {
        helpInsertOrUpdateInternally(whiteEscapedDfprop, new InternalInsertOrUpdateCallback<WhiteEscapedDfprop, WhiteEscapedDfpropCB>() {
            public void callbackInsert(WhiteEscapedDfprop entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteEscapedDfprop entity) { doUpdate(entity, updateOption); }
            public WhiteEscapedDfpropCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteEscapedDfpropCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteEscapedDfpropCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteEscapedDfpropCB>() : updateOption;
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
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * whiteEscapedDfprop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteEscapedDfprop.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteEscapedDfpropBhv.<span style="color: #FD4747">delete</span>(whiteEscapedDfprop);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteEscapedDfprop The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteEscapedDfprop whiteEscapedDfprop) {
        doDelete(whiteEscapedDfprop, null);
    }

    protected void doDelete(WhiteEscapedDfprop whiteEscapedDfprop, final DeleteOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfprop", whiteEscapedDfprop);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteEscapedDfprop, new InternalDeleteCallback<WhiteEscapedDfprop>() {
            public int callbackDelegateDelete(WhiteEscapedDfprop entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteEscapedDfpropCB> option) {
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
     *     WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     *     whiteEscapedDfprop.setFooName("foo");
     *     if (...) {
     *         whiteEscapedDfprop.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteEscapedDfpropList.add(whiteEscapedDfprop);
     * }
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">batchInsert</span>(whiteEscapedDfpropList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        InsertOption<WhiteEscapedDfpropCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteEscapedDfpropList, option);
    }

    protected int[] doBatchInsert(List<WhiteEscapedDfprop> whiteEscapedDfpropList, InsertOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfpropList", whiteEscapedDfpropList);
        prepareBatchInsertOption(whiteEscapedDfpropList, option);
        return delegateBatchInsert(whiteEscapedDfpropList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteEscapedDfprop> whiteEscapedDfpropList, InsertOption<WhiteEscapedDfpropCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteEscapedDfpropList);
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
     *     WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     *     whiteEscapedDfprop.setFooName("foo");
     *     if (...) {
     *         whiteEscapedDfprop.setFooPrice(123);
     *     } else {
     *         whiteEscapedDfprop.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteEscapedDfprop.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteEscapedDfpropList.add(whiteEscapedDfprop);
     * }
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">batchUpdate</span>(whiteEscapedDfpropList);
     * </pre>
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        UpdateOption<WhiteEscapedDfpropCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteEscapedDfpropList, option);
    }

    protected int[] doBatchUpdate(List<WhiteEscapedDfprop> whiteEscapedDfpropList, UpdateOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfpropList", whiteEscapedDfpropList);
        prepareBatchUpdateOption(whiteEscapedDfpropList, option);
        return delegateBatchUpdate(whiteEscapedDfpropList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteEscapedDfprop> whiteEscapedDfpropList, UpdateOption<WhiteEscapedDfpropCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteEscapedDfpropList);
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
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">batchUpdate</span>(whiteEscapedDfpropList, new SpecifyQuery<WhiteEscapedDfpropCB>() {
     *     public void specify(WhiteEscapedDfpropCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">batchUpdate</span>(whiteEscapedDfpropList, new SpecifyQuery<WhiteEscapedDfpropCB>() {
     *     public void specify(WhiteEscapedDfpropCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteEscapedDfprop> whiteEscapedDfpropList, SpecifyQuery<WhiteEscapedDfpropCB> updateColumnSpec) {
        return doBatchUpdate(whiteEscapedDfpropList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        return doBatchDelete(whiteEscapedDfpropList, null);
    }

    protected int[] doBatchDelete(List<WhiteEscapedDfprop> whiteEscapedDfpropList, DeleteOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfpropList", whiteEscapedDfpropList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteEscapedDfpropList, option);
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
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteEscapedDfprop, WhiteEscapedDfpropCB&gt;() {
     *     public ConditionBean setup(whiteEscapedDfprop entity, WhiteEscapedDfpropCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB> setupper, InsertOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteEscapedDfprop entity = new WhiteEscapedDfprop();
        WhiteEscapedDfpropCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteEscapedDfpropCB createCBForQueryInsert() {
        WhiteEscapedDfpropCB cb = newMyConditionBean();
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
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setPK...(value);</span>
     * whiteEscapedDfprop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setVersionNo(value);</span>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">queryUpdate</span>(whiteEscapedDfprop, cb);
     * </pre>
     * @param whiteEscapedDfprop The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WhiteEscapedDfpropCB cb) {
        return doQueryUpdate(whiteEscapedDfprop, cb, null);
    }

    protected int doQueryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WhiteEscapedDfpropCB cb, UpdateOption<WhiteEscapedDfpropCB> option) {
        assertObjectNotNull("whiteEscapedDfprop", whiteEscapedDfprop); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteEscapedDfprop, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteEscapedDfpropCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteEscapedDfpropCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">queryDelete</span>(whiteEscapedDfprop, cb);
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteEscapedDfpropCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteEscapedDfpropCB cb, DeleteOption<WhiteEscapedDfpropCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteEscapedDfpropCB)cb); }
        else { return varyingQueryDelete((WhiteEscapedDfpropCB)cb, downcast(option)); }
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
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteEscapedDfprop.setFoo...(value);
     * whiteEscapedDfprop.setBar...(value);
     * InsertOption<WhiteEscapedDfpropCB> option = new InsertOption<WhiteEscapedDfpropCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">varyingInsert</span>(whiteEscapedDfprop, option);
     * ... = whiteEscapedDfprop.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteEscapedDfprop The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteEscapedDfprop whiteEscapedDfprop, InsertOption<WhiteEscapedDfpropCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteEscapedDfprop, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * whiteEscapedDfprop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteEscapedDfprop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteEscapedDfprop.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteEscapedDfpropCB&gt; option = new UpdateOption&lt;WhiteEscapedDfpropCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *         public void specify(WhiteEscapedDfpropCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteEscapedDfpropBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteEscapedDfprop, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedDfprop The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteEscapedDfprop whiteEscapedDfprop, UpdateOption<WhiteEscapedDfpropCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteEscapedDfprop, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteEscapedDfprop The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteEscapedDfprop whiteEscapedDfprop, InsertOption<WhiteEscapedDfpropCB> insertOption, UpdateOption<WhiteEscapedDfpropCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteEscapedDfprop, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteEscapedDfprop The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteEscapedDfprop whiteEscapedDfprop, DeleteOption<WhiteEscapedDfpropCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteEscapedDfprop, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteEscapedDfprop> whiteEscapedDfpropList, InsertOption<WhiteEscapedDfpropCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteEscapedDfpropList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteEscapedDfprop> whiteEscapedDfpropList, UpdateOption<WhiteEscapedDfpropCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteEscapedDfpropList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteEscapedDfprop> whiteEscapedDfpropList, DeleteOption<WhiteEscapedDfpropCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteEscapedDfpropList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB> setupper, InsertOption<WhiteEscapedDfpropCB> option) {
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
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setPK...(value);</span>
     * whiteEscapedDfprop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setVersionNo(value);</span>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteEscapedDfpropCB&gt; option = new UpdateOption&lt;WhiteEscapedDfpropCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void specify(WhiteEscapedDfpropCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteEscapedDfpropBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteEscapedDfprop, cb, option);
     * </pre>
     * @param whiteEscapedDfprop The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WhiteEscapedDfpropCB cb, UpdateOption<WhiteEscapedDfpropCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteEscapedDfprop, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteEscapedDfpropCB cb, DeleteOption<WhiteEscapedDfpropCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteEscapedDfpropBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteEscapedDfpropCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteEscapedDfpropCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteEscapedDfprop> void delegateSelectCursor(WhiteEscapedDfpropCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteEscapedDfprop> List<ENTITY> delegateSelectList(WhiteEscapedDfpropCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteEscapedDfprop e, InsertOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteEscapedDfprop e, UpdateOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteEscapedDfprop e, UpdateOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteEscapedDfprop e, DeleteOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteEscapedDfprop e, DeleteOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteEscapedDfprop> ls, InsertOption<WhiteEscapedDfpropCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteEscapedDfprop> ls, UpdateOption<WhiteEscapedDfpropCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteEscapedDfprop> ls, UpdateOption<WhiteEscapedDfpropCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteEscapedDfprop> ls, DeleteOption<WhiteEscapedDfpropCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteEscapedDfprop> ls, DeleteOption<WhiteEscapedDfpropCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteEscapedDfprop e, WhiteEscapedDfpropCB inCB, ConditionBean resCB, InsertOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteEscapedDfprop e, WhiteEscapedDfpropCB cb, UpdateOption<WhiteEscapedDfpropCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteEscapedDfpropCB cb, DeleteOption<WhiteEscapedDfpropCB> op)
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
    protected WhiteEscapedDfprop downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteEscapedDfprop.class);
    }

    protected WhiteEscapedDfpropCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteEscapedDfpropCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteEscapedDfprop> downcast(List<? extends Entity> entityList) {
        return (List<WhiteEscapedDfprop>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteEscapedDfpropCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteEscapedDfpropCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteEscapedDfpropCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteEscapedDfpropCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteEscapedDfpropCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteEscapedDfpropCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB>)option;
    }
}
