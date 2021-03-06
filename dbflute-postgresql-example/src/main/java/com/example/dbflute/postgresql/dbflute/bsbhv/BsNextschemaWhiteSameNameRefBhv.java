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
 * The behavior of nextschema.white_same_name_ref as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_ref_id
 * 
 * [column]
 *     same_name_ref_id, same_name_id, next_ref_date
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
 *     white_same_name
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSameName
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameNameRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "nextschema.white_same_name_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return NextschemaWhiteSameNameRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public NextschemaWhiteSameNameRefDbm getMyDBMeta() { return NextschemaWhiteSameNameRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public NextschemaWhiteSameNameRef newMyEntity() { return new NextschemaWhiteSameNameRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public NextschemaWhiteSameNameRefCB newMyConditionBean() { return new NextschemaWhiteSameNameRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteSameNameRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextschemaWhiteSameNameRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(NextschemaWhiteSameNameRefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(NextschemaWhiteSameNameRefCB cb) { // called by selectPage(cb)
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
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * NextschemaWhiteSameNameRef whiteSameNameRef = whiteSameNameRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSameNameRef != null) {
     *     ... = whiteSameNameRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameNameRef selectEntity(NextschemaWhiteSameNameRefCB cb) {
        return doSelectEntity(cb, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> ENTITY doSelectEntity(final NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, NextschemaWhiteSameNameRefCB>() {
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * NextschemaWhiteSameNameRef whiteSameNameRef = whiteSameNameRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameNameRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameNameRef selectEntityWithDeletedCheck(NextschemaWhiteSameNameRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> ENTITY doSelectEntityWithDeletedCheck(final NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, NextschemaWhiteSameNameRefCB>() {
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameNameRef selectByPKValue(Long sameNameRefId) {
        return doSelectByPKValue(sameNameRefId, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> ENTITY doSelectByPKValue(Long sameNameRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(sameNameRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sameNameRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameNameRef selectByPKValueWithDeletedCheck(Long sameNameRefId) {
        return doSelectByPKValueWithDeletedCheck(sameNameRefId, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> ENTITY doSelectByPKValueWithDeletedCheck(Long sameNameRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(sameNameRefId), entityType);
    }

    private NextschemaWhiteSameNameRefCB buildPKCB(Long sameNameRefId) {
        assertObjectNotNull("sameNameRefId", sameNameRefId);
        NextschemaWhiteSameNameRefCB cb = newMyConditionBean();
        cb.query().setSameNameRefId_Equal(sameNameRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;NextschemaWhiteSameNameRef&gt; whiteSameNameRefList = whiteSameNameRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (NextschemaWhiteSameNameRef whiteSameNameRef : whiteSameNameRefList) {
     *     ... = whiteSameNameRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextschemaWhiteSameNameRef> selectList(NextschemaWhiteSameNameRefCB cb) {
        return doSelectList(cb, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> ListResultBean<ENTITY> doSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, NextschemaWhiteSameNameRefCB>() {
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextschemaWhiteSameNameRef&gt; page = whiteSameNameRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (NextschemaWhiteSameNameRef whiteSameNameRef : page) {
     *     ... = whiteSameNameRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextschemaWhiteSameNameRef> selectPage(NextschemaWhiteSameNameRefCB cb) {
        return doSelectPage(cb, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> PagingResultBean<ENTITY> doSelectPage(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, NextschemaWhiteSameNameRefCB>() {
            public int callbackSelectCount(NextschemaWhiteSameNameRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextschemaWhiteSameNameRef&gt;() {
     *     public void handle(NextschemaWhiteSameNameRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param entityRowHandler The handler of entity row of NextschemaWhiteSameNameRef. (NotNull)
     */
    public void selectCursor(NextschemaWhiteSameNameRefCB cb, EntityRowHandler<NextschemaWhiteSameNameRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, NextschemaWhiteSameNameRef.class);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> void doSelectCursor(NextschemaWhiteSameNameRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<NextschemaWhiteSameNameRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, NextschemaWhiteSameNameRefCB>() {
            public void callbackSelectCursor(NextschemaWhiteSameNameRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSameNameRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextschemaWhiteSameNameRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<NextschemaWhiteSameNameRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends NextschemaWhiteSameNameRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'NextschemaWhiteSameName'.
     * @param whiteSameNameRefList The list of whiteSameNameRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextschemaWhiteSameName> pulloutWhiteSameName(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        return helpPulloutInternally(whiteSameNameRefList, new InternalPulloutCallback<NextschemaWhiteSameNameRef, NextschemaWhiteSameName>() {
            public NextschemaWhiteSameName getFr(NextschemaWhiteSameNameRef e) { return e.getWhiteSameName(); }
            public boolean hasRf() { return true; }
            public void setRfLs(NextschemaWhiteSameName e, List<NextschemaWhiteSameNameRef> ls)
            { e.setWhiteSameNameRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameRefId.
     * @param whiteSameNameRefList The list of whiteSameNameRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSameNameRefIdList(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        return helpExtractListInternally(whiteSameNameRefList, new InternalExtractCallback<NextschemaWhiteSameNameRef, Long>() {
            public Long getCV(NextschemaWhiteSameNameRef e) { return e.getSameNameRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRef.setFoo...(value);
     * whiteSameNameRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * whiteSameNameRefBhv.<span style="color: #FD4747">insert</span>(whiteSameNameRef);
     * ... = whiteSameNameRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameNameRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doInsert(whiteSameNameRef, null);
    }

    protected void doInsert(NextschemaWhiteSameNameRef whiteSameNameRef, InsertOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef);
        prepareInsertOption(option);
        delegateInsert(whiteSameNameRef, option);
    }

    protected void prepareInsertOption(InsertOption<NextschemaWhiteSameNameRefCB> option) {
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
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameRefBhv.<span style="color: #FD4747">update</span>(whiteSameNameRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteSameNameRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final NextschemaWhiteSameNameRef whiteSameNameRef) {
        doUpdate(whiteSameNameRef, null);
    }

    protected void doUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, final UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteSameNameRef, new InternalUpdateCallback<NextschemaWhiteSameNameRef>() {
            public int callbackDelegateUpdate(NextschemaWhiteSameNameRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected NextschemaWhiteSameNameRefCB createCBForVaryingUpdate() {
        NextschemaWhiteSameNameRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected NextschemaWhiteSameNameRefCB createCBForSpecifiedUpdate() {
        NextschemaWhiteSameNameRefCB cb = newMyConditionBean();
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
     * @param whiteSameNameRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doInesrtOrUpdate(whiteSameNameRef, null, null);
    }

    protected void doInesrtOrUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, final InsertOption<NextschemaWhiteSameNameRefCB> insertOption, final UpdateOption<NextschemaWhiteSameNameRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteSameNameRef, new InternalInsertOrUpdateCallback<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB>() {
            public void callbackInsert(NextschemaWhiteSameNameRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(NextschemaWhiteSameNameRef entity) { doUpdate(entity, updateOption); }
            public NextschemaWhiteSameNameRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(NextschemaWhiteSameNameRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<NextschemaWhiteSameNameRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<NextschemaWhiteSameNameRefCB>() : updateOption;
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
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameRefBhv.<span style="color: #FD4747">delete</span>(whiteSameNameRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteSameNameRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doDelete(whiteSameNameRef, null);
    }

    protected void doDelete(NextschemaWhiteSameNameRef whiteSameNameRef, final DeleteOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteSameNameRef, new InternalDeleteCallback<NextschemaWhiteSameNameRef>() {
            public int callbackDelegateDelete(NextschemaWhiteSameNameRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<NextschemaWhiteSameNameRefCB> option) {
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
     *     NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     *     whiteSameNameRef.setFooName("foo");
     *     if (...) {
     *         whiteSameNameRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameRefList.add(whiteSameNameRef);
     * }
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteSameNameRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        InsertOption<NextschemaWhiteSameNameRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteSameNameRefList, option);
    }

    protected int[] doBatchInsert(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, InsertOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRefList", whiteSameNameRefList);
        prepareBatchInsertOption(whiteSameNameRefList, option);
        return delegateBatchInsert(whiteSameNameRefList, option);
    }

    protected void prepareBatchInsertOption(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, InsertOption<NextschemaWhiteSameNameRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSameNameRefList);
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
     *     NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     *     whiteSameNameRef.setFooName("foo");
     *     if (...) {
     *         whiteSameNameRef.setFooPrice(123);
     *     } else {
     *         whiteSameNameRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameNameRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameRefList.add(whiteSameNameRef);
     * }
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameRefList);
     * </pre>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        UpdateOption<NextschemaWhiteSameNameRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteSameNameRefList, option);
    }

    protected int[] doBatchUpdate(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRefList", whiteSameNameRefList);
        prepareBatchUpdateOption(whiteSameNameRefList, option);
        return delegateBatchUpdate(whiteSameNameRefList, option);
    }

    protected void prepareBatchUpdateOption(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSameNameRefList);
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
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameRefList, new SpecifyQuery<NextschemaWhiteSameNameRefCB>() {
     *     public void specify(NextschemaWhiteSameNameRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameRefList, new SpecifyQuery<NextschemaWhiteSameNameRefCB>() {
     *     public void specify(NextschemaWhiteSameNameRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, SpecifyQuery<NextschemaWhiteSameNameRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteSameNameRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        return doBatchDelete(whiteSameNameRefList, null);
    }

    protected int[] doBatchDelete(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, DeleteOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRefList", whiteSameNameRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteSameNameRefList, option);
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
     * whiteSameNameRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB&gt;() {
     *     public ConditionBean setup(whiteSameNameRef entity, NextschemaWhiteSameNameRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> setupper, InsertOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        NextschemaWhiteSameNameRef entity = new NextschemaWhiteSameNameRef();
        NextschemaWhiteSameNameRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected NextschemaWhiteSameNameRefCB createCBForQueryInsert() {
        NextschemaWhiteSameNameRefCB cb = newMyConditionBean();
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
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSameNameRef, cb);
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, NextschemaWhiteSameNameRefCB cb) {
        return doQueryUpdate(whiteSameNameRef, cb, null);
    }

    protected int doQueryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, NextschemaWhiteSameNameRefCB cb, UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSameNameRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (NextschemaWhiteSameNameRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (NextschemaWhiteSameNameRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteSameNameRef, cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextschemaWhiteSameNameRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(NextschemaWhiteSameNameRefCB cb, DeleteOption<NextschemaWhiteSameNameRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((NextschemaWhiteSameNameRefCB)cb); }
        else { return varyingQueryDelete((NextschemaWhiteSameNameRefCB)cb, downcast(option)); }
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
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRef.setFoo...(value);
     * whiteSameNameRef.setBar...(value);
     * InsertOption<NextschemaWhiteSameNameRefCB> option = new InsertOption<NextschemaWhiteSameNameRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSameNameRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSameNameRef, option);
     * ... = whiteSameNameRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameNameRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextschemaWhiteSameNameRef whiteSameNameRef, InsertOption<NextschemaWhiteSameNameRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSameNameRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextschemaWhiteSameNameRefCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *         public void specify(NextschemaWhiteSameNameRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSameNameRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSameNameRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSameNameRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameNameRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, InsertOption<NextschemaWhiteSameNameRefCB> insertOption, UpdateOption<NextschemaWhiteSameNameRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSameNameRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameNameRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextschemaWhiteSameNameRef whiteSameNameRef, DeleteOption<NextschemaWhiteSameNameRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSameNameRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, InsertOption<NextschemaWhiteSameNameRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSameNameRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSameNameRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, DeleteOption<NextschemaWhiteSameNameRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSameNameRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> setupper, InsertOption<NextschemaWhiteSameNameRefCB> option) {
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
     * NextschemaWhiteSameNameRef whiteSameNameRef = new NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextschemaWhiteSameNameRefCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameRefCB&gt;();
     * option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void specify(NextschemaWhiteSameNameRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSameNameRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSameNameRef, cb, option);
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, NextschemaWhiteSameNameRefCB cb, UpdateOption<NextschemaWhiteSameNameRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSameNameRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextschemaWhiteSameNameRefCB cb, DeleteOption<NextschemaWhiteSameNameRefCB> option) {
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
    public OutsideSqlBasicExecutor<NextschemaWhiteSameNameRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(NextschemaWhiteSameNameRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(NextschemaWhiteSameNameRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends NextschemaWhiteSameNameRef> void delegateSelectCursor(NextschemaWhiteSameNameRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends NextschemaWhiteSameNameRef> List<ENTITY> delegateSelectList(NextschemaWhiteSameNameRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(NextschemaWhiteSameNameRef e, InsertOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(NextschemaWhiteSameNameRef e, UpdateOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(NextschemaWhiteSameNameRef e, UpdateOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(NextschemaWhiteSameNameRef e, DeleteOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(NextschemaWhiteSameNameRef e, DeleteOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<NextschemaWhiteSameNameRef> ls, InsertOption<NextschemaWhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<NextschemaWhiteSameNameRef> ls, UpdateOption<NextschemaWhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<NextschemaWhiteSameNameRef> ls, UpdateOption<NextschemaWhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<NextschemaWhiteSameNameRef> ls, DeleteOption<NextschemaWhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<NextschemaWhiteSameNameRef> ls, DeleteOption<NextschemaWhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(NextschemaWhiteSameNameRef e, NextschemaWhiteSameNameRefCB inCB, ConditionBean resCB, InsertOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(NextschemaWhiteSameNameRef e, NextschemaWhiteSameNameRefCB cb, UpdateOption<NextschemaWhiteSameNameRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(NextschemaWhiteSameNameRefCB cb, DeleteOption<NextschemaWhiteSameNameRefCB> op)
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
    protected NextschemaWhiteSameNameRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, NextschemaWhiteSameNameRef.class);
    }

    protected NextschemaWhiteSameNameRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, NextschemaWhiteSameNameRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<NextschemaWhiteSameNameRef> downcast(List<? extends Entity> entityList) {
        return (List<NextschemaWhiteSameNameRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<NextschemaWhiteSameNameRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<NextschemaWhiteSameNameRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<NextschemaWhiteSameNameRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<NextschemaWhiteSameNameRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<NextschemaWhiteSameNameRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<NextschemaWhiteSameNameRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB>)option;
    }
}
