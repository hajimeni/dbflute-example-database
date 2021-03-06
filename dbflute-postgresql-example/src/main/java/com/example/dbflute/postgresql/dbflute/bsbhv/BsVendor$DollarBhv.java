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
 * The behavior of vendor_$_dollar as TABLE. <br />
 * <pre>
 * [primary key]
 *     vendor_$_dollar_id
 * 
 * [column]
 *     vendor_$_dollar_id, vendor_$_dollar_name
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
public abstract class BsVendor$DollarBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_$_dollar"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return Vendor$DollarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public Vendor$DollarDbm getMyDBMeta() { return Vendor$DollarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Vendor$Dollar newMyEntity() { return new Vendor$Dollar(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public Vendor$DollarCB newMyConditionBean() { return new Vendor$DollarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * int count = vendor$DollarBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(Vendor$DollarCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(Vendor$DollarCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(Vendor$DollarCB cb) { // called by selectPage(cb)
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * Vendor$Dollar vendor$Dollar = vendor$DollarBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendor$Dollar != null) {
     *     ... = vendor$Dollar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor$Dollar selectEntity(Vendor$DollarCB cb) {
        return doSelectEntity(cb, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> ENTITY doSelectEntity(final Vendor$DollarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, Vendor$DollarCB>() {
            public List<ENTITY> callbackSelectList(Vendor$DollarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * Vendor$Dollar vendor$Dollar = vendor$DollarBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendor$Dollar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor$Dollar selectEntityWithDeletedCheck(Vendor$DollarCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> ENTITY doSelectEntityWithDeletedCheck(final Vendor$DollarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, Vendor$DollarCB>() {
            public List<ENTITY> callbackSelectList(Vendor$DollarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendor$DollarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor$Dollar selectByPKValue(Integer vendor$DollarId) {
        return doSelectByPKValue(vendor$DollarId, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> ENTITY doSelectByPKValue(Integer vendor$DollarId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(vendor$DollarId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendor$DollarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor$Dollar selectByPKValueWithDeletedCheck(Integer vendor$DollarId) {
        return doSelectByPKValueWithDeletedCheck(vendor$DollarId, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> ENTITY doSelectByPKValueWithDeletedCheck(Integer vendor$DollarId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(vendor$DollarId), entityType);
    }

    private Vendor$DollarCB buildPKCB(Integer vendor$DollarId) {
        assertObjectNotNull("vendor$DollarId", vendor$DollarId);
        Vendor$DollarCB cb = newMyConditionBean();
        cb.query().setVendor$DollarId_Equal(vendor$DollarId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Vendor$Dollar&gt; vendor$DollarList = vendor$DollarBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Vendor$Dollar vendor$Dollar : vendor$DollarList) {
     *     ... = vendor$Dollar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Vendor$Dollar> selectList(Vendor$DollarCB cb) {
        return doSelectList(cb, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> ListResultBean<ENTITY> doSelectList(Vendor$DollarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, Vendor$DollarCB>() {
            public List<ENTITY> callbackSelectList(Vendor$DollarCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Vendor$Dollar&gt; page = vendor$DollarBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Vendor$Dollar vendor$Dollar : page) {
     *     ... = vendor$Dollar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Vendor$Dollar> selectPage(Vendor$DollarCB cb) {
        return doSelectPage(cb, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> PagingResultBean<ENTITY> doSelectPage(Vendor$DollarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, Vendor$DollarCB>() {
            public int callbackSelectCount(Vendor$DollarCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(Vendor$DollarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Vendor$Dollar&gt;() {
     *     public void handle(Vendor$Dollar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @param entityRowHandler The handler of entity row of Vendor$Dollar. (NotNull)
     */
    public void selectCursor(Vendor$DollarCB cb, EntityRowHandler<Vendor$Dollar> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Vendor$Dollar.class);
    }

    protected <ENTITY extends Vendor$Dollar> void doSelectCursor(Vendor$DollarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<Vendor$Dollar>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, Vendor$DollarCB>() {
            public void callbackSelectCursor(Vendor$DollarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(Vendor$DollarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendor$DollarBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(Vendor$DollarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<Vendor$DollarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends Vendor$DollarCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Extract the value list of (single) primary key vendor$DollarId.
     * @param vendor$DollarList The list of vendor$Dollar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractVendor$DollarIdList(List<Vendor$Dollar> vendor$DollarList) {
        return helpExtractListInternally(vendor$DollarList, new InternalExtractCallback<Vendor$Dollar, Integer>() {
            public Integer getCV(Vendor$Dollar e) { return e.getVendor$DollarId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor$Dollar.setFoo...(value);
     * vendor$Dollar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * vendor$DollarBhv.<span style="color: #FD4747">insert</span>(vendor$Dollar);
     * ... = vendor$Dollar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendor$Dollar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Vendor$Dollar vendor$Dollar) {
        doInsert(vendor$Dollar, null);
    }

    protected void doInsert(Vendor$Dollar vendor$Dollar, InsertOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$Dollar", vendor$Dollar);
        prepareInsertOption(option);
        delegateInsert(vendor$Dollar, option);
    }

    protected void prepareInsertOption(InsertOption<Vendor$DollarCB> option) {
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor$Dollar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendor$Dollar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendor$DollarBhv.<span style="color: #FD4747">update</span>(vendor$Dollar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendor$Dollar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final Vendor$Dollar vendor$Dollar) {
        doUpdate(vendor$Dollar, null);
    }

    protected void doUpdate(Vendor$Dollar vendor$Dollar, final UpdateOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$Dollar", vendor$Dollar);
        prepareUpdateOption(option);
        helpUpdateInternally(vendor$Dollar, new InternalUpdateCallback<Vendor$Dollar>() {
            public int callbackDelegateUpdate(Vendor$Dollar entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<Vendor$DollarCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected Vendor$DollarCB createCBForVaryingUpdate() {
        Vendor$DollarCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected Vendor$DollarCB createCBForSpecifiedUpdate() {
        Vendor$DollarCB cb = newMyConditionBean();
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
     * @param vendor$Dollar The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Vendor$Dollar vendor$Dollar) {
        doInesrtOrUpdate(vendor$Dollar, null, null);
    }

    protected void doInesrtOrUpdate(Vendor$Dollar vendor$Dollar, final InsertOption<Vendor$DollarCB> insertOption, final UpdateOption<Vendor$DollarCB> updateOption) {
        helpInsertOrUpdateInternally(vendor$Dollar, new InternalInsertOrUpdateCallback<Vendor$Dollar, Vendor$DollarCB>() {
            public void callbackInsert(Vendor$Dollar entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(Vendor$Dollar entity) { doUpdate(entity, updateOption); }
            public Vendor$DollarCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(Vendor$DollarCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<Vendor$DollarCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<Vendor$DollarCB>() : updateOption;
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendor$Dollar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendor$DollarBhv.<span style="color: #FD4747">delete</span>(vendor$Dollar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendor$Dollar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Vendor$Dollar vendor$Dollar) {
        doDelete(vendor$Dollar, null);
    }

    protected void doDelete(Vendor$Dollar vendor$Dollar, final DeleteOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$Dollar", vendor$Dollar);
        prepareDeleteOption(option);
        helpDeleteInternally(vendor$Dollar, new InternalDeleteCallback<Vendor$Dollar>() {
            public int callbackDelegateDelete(Vendor$Dollar entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<Vendor$DollarCB> option) {
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
     *     Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     *     vendor$Dollar.setFooName("foo");
     *     if (...) {
     *         vendor$Dollar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendor$DollarList.add(vendor$Dollar);
     * }
     * vendor$DollarBhv.<span style="color: #FD4747">batchInsert</span>(vendor$DollarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Vendor$Dollar> vendor$DollarList) {
        InsertOption<Vendor$DollarCB> option = createInsertUpdateOption();
        return doBatchInsert(vendor$DollarList, option);
    }

    protected int[] doBatchInsert(List<Vendor$Dollar> vendor$DollarList, InsertOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$DollarList", vendor$DollarList);
        prepareBatchInsertOption(vendor$DollarList, option);
        return delegateBatchInsert(vendor$DollarList, option);
    }

    protected void prepareBatchInsertOption(List<Vendor$Dollar> vendor$DollarList, InsertOption<Vendor$DollarCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendor$DollarList);
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
     *     Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     *     vendor$Dollar.setFooName("foo");
     *     if (...) {
     *         vendor$Dollar.setFooPrice(123);
     *     } else {
     *         vendor$Dollar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendor$Dollar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendor$DollarList.add(vendor$Dollar);
     * }
     * vendor$DollarBhv.<span style="color: #FD4747">batchUpdate</span>(vendor$DollarList);
     * </pre>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor$Dollar> vendor$DollarList) {
        UpdateOption<Vendor$DollarCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendor$DollarList, option);
    }

    protected int[] doBatchUpdate(List<Vendor$Dollar> vendor$DollarList, UpdateOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$DollarList", vendor$DollarList);
        prepareBatchUpdateOption(vendor$DollarList, option);
        return delegateBatchUpdate(vendor$DollarList, option);
    }

    protected void prepareBatchUpdateOption(List<Vendor$Dollar> vendor$DollarList, UpdateOption<Vendor$DollarCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendor$DollarList);
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
     * vendor$DollarBhv.<span style="color: #FD4747">batchUpdate</span>(vendor$DollarList, new SpecifyQuery<Vendor$DollarCB>() {
     *     public void specify(Vendor$DollarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendor$DollarBhv.<span style="color: #FD4747">batchUpdate</span>(vendor$DollarList, new SpecifyQuery<Vendor$DollarCB>() {
     *     public void specify(Vendor$DollarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor$Dollar> vendor$DollarList, SpecifyQuery<Vendor$DollarCB> updateColumnSpec) {
        return doBatchUpdate(vendor$DollarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Vendor$Dollar> vendor$DollarList) {
        return doBatchDelete(vendor$DollarList, null);
    }

    protected int[] doBatchDelete(List<Vendor$Dollar> vendor$DollarList, DeleteOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$DollarList", vendor$DollarList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendor$DollarList, option);
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
     * vendor$DollarBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Vendor$Dollar, Vendor$DollarCB&gt;() {
     *     public ConditionBean setup(vendor$Dollar entity, Vendor$DollarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB> setupper, InsertOption<Vendor$DollarCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        Vendor$Dollar entity = new Vendor$Dollar();
        Vendor$DollarCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected Vendor$DollarCB createCBForQueryInsert() {
        Vendor$DollarCB cb = newMyConditionBean();
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setPK...(value);</span>
     * vendor$Dollar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setVersionNo(value);</span>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #FD4747">queryUpdate</span>(vendor$Dollar, cb);
     * </pre>
     * @param vendor$Dollar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Vendor$Dollar vendor$Dollar, Vendor$DollarCB cb) {
        return doQueryUpdate(vendor$Dollar, cb, null);
    }

    protected int doQueryUpdate(Vendor$Dollar vendor$Dollar, Vendor$DollarCB cb, UpdateOption<Vendor$DollarCB> option) {
        assertObjectNotNull("vendor$Dollar", vendor$Dollar); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendor$Dollar, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (Vendor$DollarCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (Vendor$DollarCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #FD4747">queryDelete</span>(vendor$Dollar, cb);
     * </pre>
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(Vendor$DollarCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(Vendor$DollarCB cb, DeleteOption<Vendor$DollarCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((Vendor$DollarCB)cb); }
        else { return varyingQueryDelete((Vendor$DollarCB)cb, downcast(option)); }
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor$Dollar.setFoo...(value);
     * vendor$Dollar.setBar...(value);
     * InsertOption<Vendor$DollarCB> option = new InsertOption<Vendor$DollarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendor$DollarBhv.<span style="color: #FD4747">varyingInsert</span>(vendor$Dollar, option);
     * ... = vendor$Dollar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendor$Dollar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Vendor$Dollar vendor$Dollar, InsertOption<Vendor$DollarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendor$Dollar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor$Dollar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendor$Dollar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;Vendor$DollarCB&gt; option = new UpdateOption&lt;Vendor$DollarCB&gt;();
     *     option.self(new SpecifyQuery&lt;Vendor$DollarCB&gt;() {
     *         public void specify(Vendor$DollarCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendor$DollarBhv.<span style="color: #FD4747">varyingUpdate</span>(vendor$Dollar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor$Dollar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Vendor$Dollar vendor$Dollar, UpdateOption<Vendor$DollarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendor$Dollar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendor$Dollar The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Vendor$Dollar vendor$Dollar, InsertOption<Vendor$DollarCB> insertOption, UpdateOption<Vendor$DollarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendor$Dollar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendor$Dollar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Vendor$Dollar vendor$Dollar, DeleteOption<Vendor$DollarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendor$Dollar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Vendor$Dollar> vendor$DollarList, InsertOption<Vendor$DollarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendor$DollarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Vendor$Dollar> vendor$DollarList, UpdateOption<Vendor$DollarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendor$DollarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Vendor$Dollar> vendor$DollarList, DeleteOption<Vendor$DollarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendor$DollarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB> setupper, InsertOption<Vendor$DollarCB> option) {
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
     * Vendor$Dollar vendor$Dollar = new Vendor$Dollar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setPK...(value);</span>
     * vendor$Dollar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setVersionNo(value);</span>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;Vendor$DollarCB&gt; option = new UpdateOption&lt;Vendor$DollarCB&gt;();
     * option.self(new SpecifyQuery&lt;Vendor$DollarCB&gt;() {
     *     public void specify(Vendor$DollarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendor$DollarBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendor$Dollar, cb, option);
     * </pre>
     * @param vendor$Dollar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Vendor$Dollar vendor$Dollar, Vendor$DollarCB cb, UpdateOption<Vendor$DollarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendor$Dollar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Vendor$Dollar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(Vendor$DollarCB cb, DeleteOption<Vendor$DollarCB> option) {
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
    public OutsideSqlBasicExecutor<Vendor$DollarBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(Vendor$DollarCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(Vendor$DollarCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Vendor$Dollar> void delegateSelectCursor(Vendor$DollarCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends Vendor$Dollar> List<ENTITY> delegateSelectList(Vendor$DollarCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Vendor$Dollar e, InsertOption<Vendor$DollarCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(Vendor$Dollar e, UpdateOption<Vendor$DollarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(Vendor$Dollar e, UpdateOption<Vendor$DollarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(Vendor$Dollar e, DeleteOption<Vendor$DollarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(Vendor$Dollar e, DeleteOption<Vendor$DollarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<Vendor$Dollar> ls, InsertOption<Vendor$DollarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Vendor$Dollar> ls, UpdateOption<Vendor$DollarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Vendor$Dollar> ls, UpdateOption<Vendor$DollarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Vendor$Dollar> ls, DeleteOption<Vendor$DollarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Vendor$Dollar> ls, DeleteOption<Vendor$DollarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Vendor$Dollar e, Vendor$DollarCB inCB, ConditionBean resCB, InsertOption<Vendor$DollarCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Vendor$Dollar e, Vendor$DollarCB cb, UpdateOption<Vendor$DollarCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(Vendor$DollarCB cb, DeleteOption<Vendor$DollarCB> op)
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
    protected Vendor$Dollar downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, Vendor$Dollar.class);
    }

    protected Vendor$DollarCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, Vendor$DollarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Vendor$Dollar> downcast(List<? extends Entity> entityList) {
        return (List<Vendor$Dollar>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<Vendor$DollarCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<Vendor$DollarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<Vendor$DollarCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<Vendor$DollarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<Vendor$DollarCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<Vendor$DollarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<Vendor$Dollar, Vendor$DollarCB>)option;
    }
}
