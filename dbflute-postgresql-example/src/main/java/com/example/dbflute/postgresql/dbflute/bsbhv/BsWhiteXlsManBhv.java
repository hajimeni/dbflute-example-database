package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of white_xls_man as TABLE. <br />
 * <pre>
 * [primary key]
 *     xls_man_id
 * 
 * [column]
 *     xls_man_id, string_converted, timestamp_zero_default_millis, timestamp_zero_prefix_millis, timestamp_zero_suffix_millis
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
public abstract class BsWhiteXlsManBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_xls_man"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteXlsManDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteXlsManDbm getMyDBMeta() { return WhiteXlsManDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteXlsMan newMyEntity() { return new WhiteXlsMan(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteXlsManCB newMyConditionBean() { return new WhiteXlsManCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * int count = whiteXlsManBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteXlsManCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteXlsManCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteXlsManCB cb) { // called by selectPage(cb)
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
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * WhiteXlsMan whiteXlsMan = whiteXlsManBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteXlsMan != null) {
     *     ... = whiteXlsMan.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectEntity(WhiteXlsManCB cb) {
        return doSelectEntity(cb, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectEntity(final WhiteXlsManCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteXlsManCB>() {
            public List<ENTITY> callbackSelectList(WhiteXlsManCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * WhiteXlsMan whiteXlsMan = whiteXlsManBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteXlsMan.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectEntityWithDeletedCheck(WhiteXlsManCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectEntityWithDeletedCheck(final WhiteXlsManCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteXlsManCB>() {
            public List<ENTITY> callbackSelectList(WhiteXlsManCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param xlsManId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectByPKValue(Long xlsManId) {
        return doSelectByPKValue(xlsManId, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectByPKValue(Long xlsManId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(xlsManId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param xlsManId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectByPKValueWithDeletedCheck(Long xlsManId) {
        return doSelectByPKValueWithDeletedCheck(xlsManId, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectByPKValueWithDeletedCheck(Long xlsManId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(xlsManId), entityType);
    }

    private WhiteXlsManCB buildPKCB(Long xlsManId) {
        assertObjectNotNull("xlsManId", xlsManId);
        WhiteXlsManCB cb = newMyConditionBean();
        cb.query().setXlsManId_Equal(xlsManId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteXlsMan&gt; whiteXlsManList = whiteXlsManBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteXlsMan whiteXlsMan : whiteXlsManList) {
     *     ... = whiteXlsMan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteXlsMan> selectList(WhiteXlsManCB cb) {
        return doSelectList(cb, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> ListResultBean<ENTITY> doSelectList(WhiteXlsManCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteXlsManCB>() {
            public List<ENTITY> callbackSelectList(WhiteXlsManCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteXlsMan&gt; page = whiteXlsManBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteXlsMan whiteXlsMan : page) {
     *     ... = whiteXlsMan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteXlsMan> selectPage(WhiteXlsManCB cb) {
        return doSelectPage(cb, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> PagingResultBean<ENTITY> doSelectPage(WhiteXlsManCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteXlsManCB>() {
            public int callbackSelectCount(WhiteXlsManCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteXlsManCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * whiteXlsManBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteXlsMan&gt;() {
     *     public void handle(WhiteXlsMan entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteXlsMan. (NotNull)
     */
    public void selectCursor(WhiteXlsManCB cb, EntityRowHandler<WhiteXlsMan> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteXlsMan.class);
    }

    protected <ENTITY extends WhiteXlsMan> void doSelectCursor(WhiteXlsManCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteXlsMan>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteXlsManCB>() {
            public void callbackSelectCursor(WhiteXlsManCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteXlsManCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteXlsManBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteXlsManCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteXlsManCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteXlsManCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Extract the value list of (single) primary key xlsManId.
     * @param whiteXlsManList The list of whiteXlsMan. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractXlsManIdList(List<WhiteXlsMan> whiteXlsManList) {
        return helpExtractListInternally(whiteXlsManList, new InternalExtractCallback<WhiteXlsMan, Long>() {
            public Long getCV(WhiteXlsMan e) { return e.getXlsManId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteXlsMan.setFoo...(value);
     * whiteXlsMan.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.set...;</span>
     * whiteXlsManBhv.<span style="color: #FD4747">insert</span>(whiteXlsMan);
     * ... = whiteXlsMan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteXlsMan The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteXlsMan whiteXlsMan) {
        doInsert(whiteXlsMan, null);
    }

    protected void doInsert(WhiteXlsMan whiteXlsMan, InsertOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsMan", whiteXlsMan);
        prepareInsertOption(option);
        delegateInsert(whiteXlsMan, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteXlsManCB> option) {
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * whiteXlsMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteXlsMan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteXlsMan.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteXlsManBhv.<span style="color: #FD4747">update</span>(whiteXlsMan);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteXlsMan The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteXlsMan whiteXlsMan) {
        doUpdate(whiteXlsMan, null);
    }

    protected void doUpdate(WhiteXlsMan whiteXlsMan, final UpdateOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsMan", whiteXlsMan);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteXlsMan, new InternalUpdateCallback<WhiteXlsMan>() {
            public int callbackDelegateUpdate(WhiteXlsMan entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteXlsManCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteXlsManCB createCBForVaryingUpdate() {
        WhiteXlsManCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteXlsManCB createCBForSpecifiedUpdate() {
        WhiteXlsManCB cb = newMyConditionBean();
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
     * @param whiteXlsMan The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteXlsMan whiteXlsMan) {
        doInesrtOrUpdate(whiteXlsMan, null, null);
    }

    protected void doInesrtOrUpdate(WhiteXlsMan whiteXlsMan, final InsertOption<WhiteXlsManCB> insertOption, final UpdateOption<WhiteXlsManCB> updateOption) {
        helpInsertOrUpdateInternally(whiteXlsMan, new InternalInsertOrUpdateCallback<WhiteXlsMan, WhiteXlsManCB>() {
            public void callbackInsert(WhiteXlsMan entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteXlsMan entity) { doUpdate(entity, updateOption); }
            public WhiteXlsManCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteXlsManCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteXlsManCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteXlsManCB>() : updateOption;
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * whiteXlsMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteXlsMan.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteXlsManBhv.<span style="color: #FD4747">delete</span>(whiteXlsMan);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteXlsMan The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteXlsMan whiteXlsMan) {
        doDelete(whiteXlsMan, null);
    }

    protected void doDelete(WhiteXlsMan whiteXlsMan, final DeleteOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsMan", whiteXlsMan);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteXlsMan, new InternalDeleteCallback<WhiteXlsMan>() {
            public int callbackDelegateDelete(WhiteXlsMan entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteXlsManCB> option) {
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
     *     WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     *     whiteXlsMan.setFooName("foo");
     *     if (...) {
     *         whiteXlsMan.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteXlsManList.add(whiteXlsMan);
     * }
     * whiteXlsManBhv.<span style="color: #FD4747">batchInsert</span>(whiteXlsManList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteXlsMan> whiteXlsManList) {
        InsertOption<WhiteXlsManCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteXlsManList, option);
    }

    protected int[] doBatchInsert(List<WhiteXlsMan> whiteXlsManList, InsertOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsManList", whiteXlsManList);
        prepareBatchInsertOption(whiteXlsManList, option);
        return delegateBatchInsert(whiteXlsManList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteXlsMan> whiteXlsManList, InsertOption<WhiteXlsManCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteXlsManList);
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
     *     WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     *     whiteXlsMan.setFooName("foo");
     *     if (...) {
     *         whiteXlsMan.setFooPrice(123);
     *     } else {
     *         whiteXlsMan.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteXlsMan.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteXlsManList.add(whiteXlsMan);
     * }
     * whiteXlsManBhv.<span style="color: #FD4747">batchUpdate</span>(whiteXlsManList);
     * </pre>
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteXlsMan> whiteXlsManList) {
        UpdateOption<WhiteXlsManCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteXlsManList, option);
    }

    protected int[] doBatchUpdate(List<WhiteXlsMan> whiteXlsManList, UpdateOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsManList", whiteXlsManList);
        prepareBatchUpdateOption(whiteXlsManList, option);
        return delegateBatchUpdate(whiteXlsManList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteXlsMan> whiteXlsManList, UpdateOption<WhiteXlsManCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteXlsManList);
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
     * whiteXlsManBhv.<span style="color: #FD4747">batchUpdate</span>(whiteXlsManList, new SpecifyQuery<WhiteXlsManCB>() {
     *     public void specify(WhiteXlsManCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteXlsManBhv.<span style="color: #FD4747">batchUpdate</span>(whiteXlsManList, new SpecifyQuery<WhiteXlsManCB>() {
     *     public void specify(WhiteXlsManCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteXlsMan> whiteXlsManList, SpecifyQuery<WhiteXlsManCB> updateColumnSpec) {
        return doBatchUpdate(whiteXlsManList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteXlsMan> whiteXlsManList) {
        return doBatchDelete(whiteXlsManList, null);
    }

    protected int[] doBatchDelete(List<WhiteXlsMan> whiteXlsManList, DeleteOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsManList", whiteXlsManList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteXlsManList, option);
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
     * whiteXlsManBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteXlsMan, WhiteXlsManCB&gt;() {
     *     public ConditionBean setup(whiteXlsMan entity, WhiteXlsManCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> setupper, InsertOption<WhiteXlsManCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteXlsMan entity = new WhiteXlsMan();
        WhiteXlsManCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteXlsManCB createCBForQueryInsert() {
        WhiteXlsManCB cb = newMyConditionBean();
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setPK...(value);</span>
     * whiteXlsMan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setVersionNo(value);</span>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * whiteXlsManBhv.<span style="color: #FD4747">queryUpdate</span>(whiteXlsMan, cb);
     * </pre>
     * @param whiteXlsMan The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteXlsMan whiteXlsMan, WhiteXlsManCB cb) {
        return doQueryUpdate(whiteXlsMan, cb, null);
    }

    protected int doQueryUpdate(WhiteXlsMan whiteXlsMan, WhiteXlsManCB cb, UpdateOption<WhiteXlsManCB> option) {
        assertObjectNotNull("whiteXlsMan", whiteXlsMan); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteXlsMan, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteXlsManCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteXlsManCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * whiteXlsManBhv.<span style="color: #FD4747">queryDelete</span>(whiteXlsMan, cb);
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteXlsManCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteXlsManCB cb, DeleteOption<WhiteXlsManCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteXlsManCB)cb); }
        else { return varyingQueryDelete((WhiteXlsManCB)cb, downcast(option)); }
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteXlsMan.setFoo...(value);
     * whiteXlsMan.setBar...(value);
     * InsertOption<WhiteXlsManCB> option = new InsertOption<WhiteXlsManCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteXlsManBhv.<span style="color: #FD4747">varyingInsert</span>(whiteXlsMan, option);
     * ... = whiteXlsMan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteXlsMan The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteXlsMan whiteXlsMan, InsertOption<WhiteXlsManCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteXlsMan, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * whiteXlsMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteXlsMan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteXlsMan.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteXlsManCB&gt; option = new UpdateOption&lt;WhiteXlsManCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteXlsManCB&gt;() {
     *         public void specify(WhiteXlsManCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteXlsManBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteXlsMan, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteXlsMan The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteXlsMan whiteXlsMan, UpdateOption<WhiteXlsManCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteXlsMan, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteXlsMan The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteXlsMan whiteXlsMan, InsertOption<WhiteXlsManCB> insertOption, UpdateOption<WhiteXlsManCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteXlsMan, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteXlsMan The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteXlsMan whiteXlsMan, DeleteOption<WhiteXlsManCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteXlsMan, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteXlsMan> whiteXlsManList, InsertOption<WhiteXlsManCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteXlsManList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteXlsMan> whiteXlsManList, UpdateOption<WhiteXlsManCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteXlsManList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteXlsMan> whiteXlsManList, DeleteOption<WhiteXlsManCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteXlsManList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> setupper, InsertOption<WhiteXlsManCB> option) {
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setPK...(value);</span>
     * whiteXlsMan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setVersionNo(value);</span>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteXlsManCB&gt; option = new UpdateOption&lt;WhiteXlsManCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteXlsManCB&gt;() {
     *     public void specify(WhiteXlsManCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteXlsManBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteXlsMan, cb, option);
     * </pre>
     * @param whiteXlsMan The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteXlsMan whiteXlsMan, WhiteXlsManCB cb, UpdateOption<WhiteXlsManCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteXlsMan, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteXlsManCB cb, DeleteOption<WhiteXlsManCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteXlsManBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteXlsManCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteXlsManCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteXlsMan> void delegateSelectCursor(WhiteXlsManCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteXlsMan> List<ENTITY> delegateSelectList(WhiteXlsManCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteXlsMan e, InsertOption<WhiteXlsManCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteXlsMan e, UpdateOption<WhiteXlsManCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteXlsMan e, UpdateOption<WhiteXlsManCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteXlsMan e, DeleteOption<WhiteXlsManCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteXlsMan e, DeleteOption<WhiteXlsManCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteXlsMan> ls, InsertOption<WhiteXlsManCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteXlsMan> ls, UpdateOption<WhiteXlsManCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteXlsMan> ls, UpdateOption<WhiteXlsManCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteXlsMan> ls, DeleteOption<WhiteXlsManCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteXlsMan> ls, DeleteOption<WhiteXlsManCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteXlsMan e, WhiteXlsManCB inCB, ConditionBean resCB, InsertOption<WhiteXlsManCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteXlsMan e, WhiteXlsManCB cb, UpdateOption<WhiteXlsManCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteXlsManCB cb, DeleteOption<WhiteXlsManCB> op)
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
    protected WhiteXlsMan downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteXlsMan.class);
    }

    protected WhiteXlsManCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteXlsManCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteXlsMan> downcast(List<? extends Entity> entityList) {
        return (List<WhiteXlsMan>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteXlsManCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteXlsManCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteXlsManCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteXlsManCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteXlsManCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteXlsManCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB>)option;
    }
}
