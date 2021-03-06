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
 * The behavior of vendor_uuid_bar as TABLE. <br />
 * <pre>
 * [primary key]
 *     bar_id
 * 
 * [column]
 *     bar_id, bar_name
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
 *     vendor_uuid_foo
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorUuidFooList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidBarBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_uuid_bar"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorUuidBarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorUuidBarDbm getMyDBMeta() { return VendorUuidBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorUuidBar newMyEntity() { return new VendorUuidBar(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorUuidBarCB newMyConditionBean() { return new VendorUuidBarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * int count = vendorUuidBarBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorUuidBarCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorUuidBarCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorUuidBarCB cb) { // called by selectPage(cb)
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
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * VendorUuidBar vendorUuidBar = vendorUuidBarBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorUuidBar != null) {
     *     ... = vendorUuidBar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectEntity(VendorUuidBarCB cb) {
        return doSelectEntity(cb, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> ENTITY doSelectEntity(final VendorUuidBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorUuidBarCB>() {
            public List<ENTITY> callbackSelectList(VendorUuidBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * VendorUuidBar vendorUuidBar = vendorUuidBarBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorUuidBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectEntityWithDeletedCheck(VendorUuidBarCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> ENTITY doSelectEntityWithDeletedCheck(final VendorUuidBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorUuidBarCB>() {
            public List<ENTITY> callbackSelectList(VendorUuidBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param barId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectByPKValue(java.util.UUID barId) {
        return doSelectByPKValue(barId, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> ENTITY doSelectByPKValue(java.util.UUID barId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(barId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param barId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectByPKValueWithDeletedCheck(java.util.UUID barId) {
        return doSelectByPKValueWithDeletedCheck(barId, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> ENTITY doSelectByPKValueWithDeletedCheck(java.util.UUID barId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(barId), entityType);
    }

    private VendorUuidBarCB buildPKCB(java.util.UUID barId) {
        assertObjectNotNull("barId", barId);
        VendorUuidBarCB cb = newMyConditionBean();
        cb.query().setBarId_Equal(barId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorUuidBar&gt; vendorUuidBarList = vendorUuidBarBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorUuidBar vendorUuidBar : vendorUuidBarList) {
     *     ... = vendorUuidBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorUuidBar> selectList(VendorUuidBarCB cb) {
        return doSelectList(cb, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> ListResultBean<ENTITY> doSelectList(VendorUuidBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorUuidBarCB>() {
            public List<ENTITY> callbackSelectList(VendorUuidBarCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorUuidBar&gt; page = vendorUuidBarBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorUuidBar vendorUuidBar : page) {
     *     ... = vendorUuidBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorUuidBar> selectPage(VendorUuidBarCB cb) {
        return doSelectPage(cb, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> PagingResultBean<ENTITY> doSelectPage(VendorUuidBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorUuidBarCB>() {
            public int callbackSelectCount(VendorUuidBarCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorUuidBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * vendorUuidBarBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorUuidBar&gt;() {
     *     public void handle(VendorUuidBar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorUuidBar. (NotNull)
     */
    public void selectCursor(VendorUuidBarCB cb, EntityRowHandler<VendorUuidBar> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorUuidBar.class);
    }

    protected <ENTITY extends VendorUuidBar> void doSelectCursor(VendorUuidBarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorUuidBar>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorUuidBarCB>() {
            public void callbackSelectCursor(VendorUuidBarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorUuidBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorUuidBarBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorUuidBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorUuidBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorUuidBarCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param vendorUuidBar The entity of vendorUuidBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorUuidFooList(VendorUuidBar vendorUuidBar, ConditionBeanSetupper<VendorUuidFooCB> conditionBeanSetupper) {
        xassLRArg(vendorUuidBar, conditionBeanSetupper);
        loadVendorUuidFooList(xnewLRLs(vendorUuidBar), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorUuidFooList with the set-upper for condition-bean of referrer. <br />
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * <pre>
     * vendorUuidBarBhv.<span style="color: #FD4747">loadVendorUuidFooList</span>(vendorUuidBarList, new ConditionBeanSetupper&lt;VendorUuidFooCB&gt;() {
     *     public void setup(VendorUuidFooCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorUuidBar vendorUuidBar : vendorUuidBarList) {
     *     ... = vendorUuidBar.<span style="color: #FD4747">getVendorUuidFooList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBarId_InScope(pkList);
     * cb.query().addOrderBy_BarId_Asc();
     * </pre>
     * @param vendorUuidBarList The entity list of vendorUuidBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorUuidFooList(List<VendorUuidBar> vendorUuidBarList, ConditionBeanSetupper<VendorUuidFooCB> conditionBeanSetupper) {
        xassLRArg(vendorUuidBarList, conditionBeanSetupper);
        loadVendorUuidFooList(vendorUuidBarList, new LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorUuidBar The entity of vendorUuidBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorUuidFooList(VendorUuidBar vendorUuidBar, LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo> loadReferrerOption) {
        xassLRArg(vendorUuidBar, loadReferrerOption);
        loadVendorUuidFooList(xnewLRLs(vendorUuidBar), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorUuidBarList The entity list of vendorUuidBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorUuidFooList(List<VendorUuidBar> vendorUuidBarList, LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo> loadReferrerOption) {
        xassLRArg(vendorUuidBarList, loadReferrerOption);
        if (vendorUuidBarList.isEmpty()) { return; }
        final VendorUuidFooBhv referrerBhv = xgetBSFLR().select(VendorUuidFooBhv.class);
        helpLoadReferrerInternally(vendorUuidBarList, loadReferrerOption, new InternalLoadReferrerCallback<VendorUuidBar, java.util.UUID, VendorUuidFooCB, VendorUuidFoo>() {
            public java.util.UUID getPKVal(VendorUuidBar e)
            { return e.getBarId(); }
            public void setRfLs(VendorUuidBar e, List<VendorUuidFoo> ls)
            { e.setVendorUuidFooList(ls); }
            public VendorUuidFooCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorUuidFooCB cb, List<java.util.UUID> ls)
            { cb.query().setBarId_InScope(ls); }
            public void qyOdFKAsc(VendorUuidFooCB cb) { cb.query().addOrderBy_BarId_Asc(); }
            public void spFKCol(VendorUuidFooCB cb) { cb.specify().columnBarId(); }
            public List<VendorUuidFoo> selRfLs(VendorUuidFooCB cb) { return referrerBhv.selectList(cb); }
            public java.util.UUID getFKVal(VendorUuidFoo e) { return e.getBarId(); }
            public void setlcEt(VendorUuidFoo re, VendorUuidBar le)
            { re.setVendorUuidBar(le); }
            public String getRfPrNm() { return "vendorUuidFooList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key barId.
     * @param vendorUuidBarList The list of vendorUuidBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.UUID> extractBarIdList(List<VendorUuidBar> vendorUuidBarList) {
        return helpExtractListInternally(vendorUuidBarList, new InternalExtractCallback<VendorUuidBar, java.util.UUID>() {
            public java.util.UUID getCV(VendorUuidBar e) { return e.getBarId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidBar.setFoo...(value);
     * vendorUuidBar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * vendorUuidBarBhv.<span style="color: #FD4747">insert</span>(vendorUuidBar);
     * ... = vendorUuidBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorUuidBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorUuidBar vendorUuidBar) {
        doInsert(vendorUuidBar, null);
    }

    protected void doInsert(VendorUuidBar vendorUuidBar, InsertOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBar", vendorUuidBar);
        prepareInsertOption(option);
        delegateInsert(vendorUuidBar, option);
    }

    protected void prepareInsertOption(InsertOption<VendorUuidBarCB> option) {
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
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * vendorUuidBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorUuidBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorUuidBarBhv.<span style="color: #FD4747">update</span>(vendorUuidBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorUuidBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorUuidBar vendorUuidBar) {
        doUpdate(vendorUuidBar, null);
    }

    protected void doUpdate(VendorUuidBar vendorUuidBar, final UpdateOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBar", vendorUuidBar);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorUuidBar, new InternalUpdateCallback<VendorUuidBar>() {
            public int callbackDelegateUpdate(VendorUuidBar entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorUuidBarCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorUuidBarCB createCBForVaryingUpdate() {
        VendorUuidBarCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorUuidBarCB createCBForSpecifiedUpdate() {
        VendorUuidBarCB cb = newMyConditionBean();
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
     * @param vendorUuidBar The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorUuidBar vendorUuidBar) {
        doInesrtOrUpdate(vendorUuidBar, null, null);
    }

    protected void doInesrtOrUpdate(VendorUuidBar vendorUuidBar, final InsertOption<VendorUuidBarCB> insertOption, final UpdateOption<VendorUuidBarCB> updateOption) {
        helpInsertOrUpdateInternally(vendorUuidBar, new InternalInsertOrUpdateCallback<VendorUuidBar, VendorUuidBarCB>() {
            public void callbackInsert(VendorUuidBar entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorUuidBar entity) { doUpdate(entity, updateOption); }
            public VendorUuidBarCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorUuidBarCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorUuidBarCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorUuidBarCB>() : updateOption;
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
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * vendorUuidBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorUuidBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorUuidBarBhv.<span style="color: #FD4747">delete</span>(vendorUuidBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorUuidBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorUuidBar vendorUuidBar) {
        doDelete(vendorUuidBar, null);
    }

    protected void doDelete(VendorUuidBar vendorUuidBar, final DeleteOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBar", vendorUuidBar);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorUuidBar, new InternalDeleteCallback<VendorUuidBar>() {
            public int callbackDelegateDelete(VendorUuidBar entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorUuidBarCB> option) {
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
     *     VendorUuidBar vendorUuidBar = new VendorUuidBar();
     *     vendorUuidBar.setFooName("foo");
     *     if (...) {
     *         vendorUuidBar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorUuidBarList.add(vendorUuidBar);
     * }
     * vendorUuidBarBhv.<span style="color: #FD4747">batchInsert</span>(vendorUuidBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorUuidBar> vendorUuidBarList) {
        InsertOption<VendorUuidBarCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorUuidBarList, option);
    }

    protected int[] doBatchInsert(List<VendorUuidBar> vendorUuidBarList, InsertOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBarList", vendorUuidBarList);
        prepareBatchInsertOption(vendorUuidBarList, option);
        return delegateBatchInsert(vendorUuidBarList, option);
    }

    protected void prepareBatchInsertOption(List<VendorUuidBar> vendorUuidBarList, InsertOption<VendorUuidBarCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorUuidBarList);
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
     *     VendorUuidBar vendorUuidBar = new VendorUuidBar();
     *     vendorUuidBar.setFooName("foo");
     *     if (...) {
     *         vendorUuidBar.setFooPrice(123);
     *     } else {
     *         vendorUuidBar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorUuidBar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorUuidBarList.add(vendorUuidBar);
     * }
     * vendorUuidBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorUuidBarList);
     * </pre>
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorUuidBar> vendorUuidBarList) {
        UpdateOption<VendorUuidBarCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorUuidBarList, option);
    }

    protected int[] doBatchUpdate(List<VendorUuidBar> vendorUuidBarList, UpdateOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBarList", vendorUuidBarList);
        prepareBatchUpdateOption(vendorUuidBarList, option);
        return delegateBatchUpdate(vendorUuidBarList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorUuidBar> vendorUuidBarList, UpdateOption<VendorUuidBarCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorUuidBarList);
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
     * vendorUuidBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorUuidBarList, new SpecifyQuery<VendorUuidBarCB>() {
     *     public void specify(VendorUuidBarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorUuidBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorUuidBarList, new SpecifyQuery<VendorUuidBarCB>() {
     *     public void specify(VendorUuidBarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorUuidBar> vendorUuidBarList, SpecifyQuery<VendorUuidBarCB> updateColumnSpec) {
        return doBatchUpdate(vendorUuidBarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorUuidBar> vendorUuidBarList) {
        return doBatchDelete(vendorUuidBarList, null);
    }

    protected int[] doBatchDelete(List<VendorUuidBar> vendorUuidBarList, DeleteOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBarList", vendorUuidBarList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorUuidBarList, option);
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
     * vendorUuidBarBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorUuidBar, VendorUuidBarCB&gt;() {
     *     public ConditionBean setup(vendorUuidBar entity, VendorUuidBarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB> setupper, InsertOption<VendorUuidBarCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorUuidBar entity = new VendorUuidBar();
        VendorUuidBarCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorUuidBarCB createCBForQueryInsert() {
        VendorUuidBarCB cb = newMyConditionBean();
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
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setPK...(value);</span>
     * vendorUuidBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setVersionNo(value);</span>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * vendorUuidBarBhv.<span style="color: #FD4747">queryUpdate</span>(vendorUuidBar, cb);
     * </pre>
     * @param vendorUuidBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorUuidBar vendorUuidBar, VendorUuidBarCB cb) {
        return doQueryUpdate(vendorUuidBar, cb, null);
    }

    protected int doQueryUpdate(VendorUuidBar vendorUuidBar, VendorUuidBarCB cb, UpdateOption<VendorUuidBarCB> option) {
        assertObjectNotNull("vendorUuidBar", vendorUuidBar); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorUuidBar, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorUuidBarCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorUuidBarCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * vendorUuidBarBhv.<span style="color: #FD4747">queryDelete</span>(vendorUuidBar, cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorUuidBarCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorUuidBarCB cb, DeleteOption<VendorUuidBarCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorUuidBarCB)cb); }
        else { return varyingQueryDelete((VendorUuidBarCB)cb, downcast(option)); }
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
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidBar.setFoo...(value);
     * vendorUuidBar.setBar...(value);
     * InsertOption<VendorUuidBarCB> option = new InsertOption<VendorUuidBarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorUuidBarBhv.<span style="color: #FD4747">varyingInsert</span>(vendorUuidBar, option);
     * ... = vendorUuidBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorUuidBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorUuidBar vendorUuidBar, InsertOption<VendorUuidBarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorUuidBar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * vendorUuidBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorUuidBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorUuidBarCB&gt; option = new UpdateOption&lt;VendorUuidBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorUuidBarCB&gt;() {
     *         public void specify(VendorUuidBarCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorUuidBarBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorUuidBar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorUuidBar vendorUuidBar, UpdateOption<VendorUuidBarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorUuidBar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorUuidBar The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorUuidBar vendorUuidBar, InsertOption<VendorUuidBarCB> insertOption, UpdateOption<VendorUuidBarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorUuidBar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorUuidBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorUuidBar vendorUuidBar, DeleteOption<VendorUuidBarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorUuidBar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorUuidBar> vendorUuidBarList, InsertOption<VendorUuidBarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorUuidBarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorUuidBar> vendorUuidBarList, UpdateOption<VendorUuidBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorUuidBarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorUuidBar> vendorUuidBarList, DeleteOption<VendorUuidBarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorUuidBarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB> setupper, InsertOption<VendorUuidBarCB> option) {
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
     * VendorUuidBar vendorUuidBar = new VendorUuidBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setPK...(value);</span>
     * vendorUuidBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setVersionNo(value);</span>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorUuidBarCB&gt; option = new UpdateOption&lt;VendorUuidBarCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorUuidBarCB&gt;() {
     *     public void specify(VendorUuidBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorUuidBarBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorUuidBar, cb, option);
     * </pre>
     * @param vendorUuidBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorUuidBar vendorUuidBar, VendorUuidBarCB cb, UpdateOption<VendorUuidBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorUuidBar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorUuidBarCB cb, DeleteOption<VendorUuidBarCB> option) {
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
    public OutsideSqlBasicExecutor<VendorUuidBarBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorUuidBarCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorUuidBarCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorUuidBar> void delegateSelectCursor(VendorUuidBarCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorUuidBar> List<ENTITY> delegateSelectList(VendorUuidBarCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorUuidBar e, InsertOption<VendorUuidBarCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorUuidBar e, UpdateOption<VendorUuidBarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorUuidBar e, UpdateOption<VendorUuidBarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorUuidBar e, DeleteOption<VendorUuidBarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorUuidBar e, DeleteOption<VendorUuidBarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorUuidBar> ls, InsertOption<VendorUuidBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorUuidBar> ls, UpdateOption<VendorUuidBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorUuidBar> ls, UpdateOption<VendorUuidBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorUuidBar> ls, DeleteOption<VendorUuidBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorUuidBar> ls, DeleteOption<VendorUuidBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorUuidBar e, VendorUuidBarCB inCB, ConditionBean resCB, InsertOption<VendorUuidBarCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorUuidBar e, VendorUuidBarCB cb, UpdateOption<VendorUuidBarCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorUuidBarCB cb, DeleteOption<VendorUuidBarCB> op)
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
    protected VendorUuidBar downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorUuidBar.class);
    }

    protected VendorUuidBarCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorUuidBarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorUuidBar> downcast(List<? extends Entity> entityList) {
        return (List<VendorUuidBar>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorUuidBarCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorUuidBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorUuidBarCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorUuidBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorUuidBarCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorUuidBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB>)option;
    }
}
