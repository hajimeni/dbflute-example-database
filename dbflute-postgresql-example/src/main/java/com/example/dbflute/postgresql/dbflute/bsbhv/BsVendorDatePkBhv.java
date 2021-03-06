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
 * The behavior of vendor_date_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_date
 * 
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorDateFkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDatePkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_date_pk"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorDatePkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorDatePkDbm getMyDBMeta() { return VendorDatePkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorDatePk newMyEntity() { return new VendorDatePk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorDatePkCB newMyConditionBean() { return new VendorDatePkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * int count = vendorDatePkBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorDatePkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorDatePkCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorDatePkCB cb) { // called by selectPage(cb)
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
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorDatePk != null) {
     *     ... = vendorDatePk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntity(VendorDatePkCB cb) {
        return doSelectEntity(cb, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectEntity(final VendorDatePkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorDatePkCB>() {
            public List<ENTITY> callbackSelectList(VendorDatePkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorDatePk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntityWithDeletedCheck(VendorDatePkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectEntityWithDeletedCheck(final VendorDatePkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorDatePkCB>() {
            public List<ENTITY> callbackSelectList(VendorDatePkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooDate The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectByPKValue(java.util.Date fooDate) {
        return doSelectByPKValue(fooDate, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectByPKValue(java.util.Date fooDate, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(fooDate), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fooDate The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectByPKValueWithDeletedCheck(java.util.Date fooDate) {
        return doSelectByPKValueWithDeletedCheck(fooDate, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectByPKValueWithDeletedCheck(java.util.Date fooDate, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(fooDate), entityType);
    }

    private VendorDatePkCB buildPKCB(java.util.Date fooDate) {
        assertObjectNotNull("fooDate", fooDate);
        VendorDatePkCB cb = newMyConditionBean();
        cb.query().setFooDate_Equal(fooDate);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorDatePk&gt; vendorDatePkList = vendorDatePkBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorDatePk> selectList(VendorDatePkCB cb) {
        return doSelectList(cb, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> ListResultBean<ENTITY> doSelectList(VendorDatePkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorDatePkCB>() {
            public List<ENTITY> callbackSelectList(VendorDatePkCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorDatePk&gt; page = vendorDatePkBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorDatePk vendorDatePk : page) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorDatePk> selectPage(VendorDatePkCB cb) {
        return doSelectPage(cb, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> PagingResultBean<ENTITY> doSelectPage(VendorDatePkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorDatePkCB>() {
            public int callbackSelectCount(VendorDatePkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorDatePkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorDatePk&gt;() {
     *     public void handle(VendorDatePk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorDatePk. (NotNull)
     */
    public void selectCursor(VendorDatePkCB cb, EntityRowHandler<VendorDatePk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorDatePk.class);
    }

    protected <ENTITY extends VendorDatePk> void doSelectCursor(VendorDatePkCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorDatePk>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorDatePkCB>() {
            public void callbackSelectCursor(VendorDatePkCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorDatePkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorDatePkBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorDatePkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorDatePkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorDateFkList(VendorDatePk vendorDatePk, ConditionBeanSetupper<VendorDateFkCB> conditionBeanSetupper) {
        xassLRArg(vendorDatePk, conditionBeanSetupper);
        loadVendorDateFkList(xnewLRLs(vendorDatePk), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorDateFkList with the set-upper for condition-bean of referrer. <br />
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * <pre>
     * vendorDatePkBhv.<span style="color: #FD4747">loadVendorDateFkList</span>(vendorDatePkList, new ConditionBeanSetupper&lt;VendorDateFkCB&gt;() {
     *     public void setup(VendorDateFkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.<span style="color: #FD4747">getVendorDateFkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBarDate_InScope(pkList);
     * cb.query().addOrderBy_BarDate_Asc();
     * </pre>
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorDateFkList(List<VendorDatePk> vendorDatePkList, ConditionBeanSetupper<VendorDateFkCB> conditionBeanSetupper) {
        xassLRArg(vendorDatePkList, conditionBeanSetupper);
        loadVendorDateFkList(vendorDatePkList, new LoadReferrerOption<VendorDateFkCB, VendorDateFk>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorDateFkList(VendorDatePk vendorDatePk, LoadReferrerOption<VendorDateFkCB, VendorDateFk> loadReferrerOption) {
        xassLRArg(vendorDatePk, loadReferrerOption);
        loadVendorDateFkList(xnewLRLs(vendorDatePk), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorDateFkList(List<VendorDatePk> vendorDatePkList, LoadReferrerOption<VendorDateFkCB, VendorDateFk> loadReferrerOption) {
        xassLRArg(vendorDatePkList, loadReferrerOption);
        if (vendorDatePkList.isEmpty()) { return; }
        final VendorDateFkBhv referrerBhv = xgetBSFLR().select(VendorDateFkBhv.class);
        helpLoadReferrerInternally(vendorDatePkList, loadReferrerOption, new InternalLoadReferrerCallback<VendorDatePk, java.util.Date, VendorDateFkCB, VendorDateFk>() {
            public java.util.Date getPKVal(VendorDatePk e)
            { return e.getFooDate(); }
            public void setRfLs(VendorDatePk e, List<VendorDateFk> ls)
            { e.setVendorDateFkList(ls); }
            public VendorDateFkCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorDateFkCB cb, List<java.util.Date> ls)
            { cb.query().setBarDate_InScope(ls); }
            public void qyOdFKAsc(VendorDateFkCB cb) { cb.query().addOrderBy_BarDate_Asc(); }
            public void spFKCol(VendorDateFkCB cb) { cb.specify().columnBarDate(); }
            public List<VendorDateFk> selRfLs(VendorDateFkCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Date getFKVal(VendorDateFk e) { return e.getBarDate(); }
            public void setlcEt(VendorDateFk re, VendorDatePk le)
            { re.setVendorDatePk(le); }
            public String getRfPrNm() { return "vendorDateFkList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key fooDate.
     * @param vendorDatePkList The list of vendorDatePk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.Date> extractFooDateList(List<VendorDatePk> vendorDatePkList) {
        return helpExtractListInternally(vendorDatePkList, new InternalExtractCallback<VendorDatePk, java.util.Date>() {
            public java.util.Date getCV(VendorDatePk e) { return e.getFooDate(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDatePk.setFoo...(value);
     * vendorDatePk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * vendorDatePkBhv.<span style="color: #FD4747">insert</span>(vendorDatePk);
     * ... = vendorDatePk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorDatePk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorDatePk vendorDatePk) {
        doInsert(vendorDatePk, null);
    }

    protected void doInsert(VendorDatePk vendorDatePk, InsertOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePk", vendorDatePk);
        prepareInsertOption(option);
        delegateInsert(vendorDatePk, option);
    }

    protected void prepareInsertOption(InsertOption<VendorDatePkCB> option) {
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorDatePk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorDatePkBhv.<span style="color: #FD4747">update</span>(vendorDatePk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorDatePk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorDatePk vendorDatePk) {
        doUpdate(vendorDatePk, null);
    }

    protected void doUpdate(VendorDatePk vendorDatePk, final UpdateOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePk", vendorDatePk);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorDatePk, new InternalUpdateCallback<VendorDatePk>() {
            public int callbackDelegateUpdate(VendorDatePk entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorDatePkCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorDatePkCB createCBForVaryingUpdate() {
        VendorDatePkCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorDatePkCB createCBForSpecifiedUpdate() {
        VendorDatePkCB cb = newMyConditionBean();
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
     * @param vendorDatePk The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorDatePk vendorDatePk) {
        doInesrtOrUpdate(vendorDatePk, null, null);
    }

    protected void doInesrtOrUpdate(VendorDatePk vendorDatePk, final InsertOption<VendorDatePkCB> insertOption, final UpdateOption<VendorDatePkCB> updateOption) {
        helpInsertOrUpdateInternally(vendorDatePk, new InternalInsertOrUpdateCallback<VendorDatePk, VendorDatePkCB>() {
            public void callbackInsert(VendorDatePk entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorDatePk entity) { doUpdate(entity, updateOption); }
            public VendorDatePkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorDatePkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorDatePkCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorDatePkCB>() : updateOption;
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorDatePk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorDatePkBhv.<span style="color: #FD4747">delete</span>(vendorDatePk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorDatePk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorDatePk vendorDatePk) {
        doDelete(vendorDatePk, null);
    }

    protected void doDelete(VendorDatePk vendorDatePk, final DeleteOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePk", vendorDatePk);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorDatePk, new InternalDeleteCallback<VendorDatePk>() {
            public int callbackDelegateDelete(VendorDatePk entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorDatePkCB> option) {
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
     *     VendorDatePk vendorDatePk = new VendorDatePk();
     *     vendorDatePk.setFooName("foo");
     *     if (...) {
     *         vendorDatePk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorDatePkList.add(vendorDatePk);
     * }
     * vendorDatePkBhv.<span style="color: #FD4747">batchInsert</span>(vendorDatePkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorDatePk> vendorDatePkList) {
        InsertOption<VendorDatePkCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorDatePkList, option);
    }

    protected int[] doBatchInsert(List<VendorDatePk> vendorDatePkList, InsertOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePkList", vendorDatePkList);
        prepareBatchInsertOption(vendorDatePkList, option);
        return delegateBatchInsert(vendorDatePkList, option);
    }

    protected void prepareBatchInsertOption(List<VendorDatePk> vendorDatePkList, InsertOption<VendorDatePkCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorDatePkList);
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
     *     VendorDatePk vendorDatePk = new VendorDatePk();
     *     vendorDatePk.setFooName("foo");
     *     if (...) {
     *         vendorDatePk.setFooPrice(123);
     *     } else {
     *         vendorDatePk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorDatePk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorDatePkList.add(vendorDatePk);
     * }
     * vendorDatePkBhv.<span style="color: #FD4747">batchUpdate</span>(vendorDatePkList);
     * </pre>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDatePk> vendorDatePkList) {
        UpdateOption<VendorDatePkCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorDatePkList, option);
    }

    protected int[] doBatchUpdate(List<VendorDatePk> vendorDatePkList, UpdateOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePkList", vendorDatePkList);
        prepareBatchUpdateOption(vendorDatePkList, option);
        return delegateBatchUpdate(vendorDatePkList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorDatePk> vendorDatePkList, UpdateOption<VendorDatePkCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorDatePkList);
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
     * vendorDatePkBhv.<span style="color: #FD4747">batchUpdate</span>(vendorDatePkList, new SpecifyQuery<VendorDatePkCB>() {
     *     public void specify(VendorDatePkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorDatePkBhv.<span style="color: #FD4747">batchUpdate</span>(vendorDatePkList, new SpecifyQuery<VendorDatePkCB>() {
     *     public void specify(VendorDatePkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDatePk> vendorDatePkList, SpecifyQuery<VendorDatePkCB> updateColumnSpec) {
        return doBatchUpdate(vendorDatePkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorDatePk> vendorDatePkList) {
        return doBatchDelete(vendorDatePkList, null);
    }

    protected int[] doBatchDelete(List<VendorDatePk> vendorDatePkList, DeleteOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePkList", vendorDatePkList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorDatePkList, option);
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
     * vendorDatePkBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorDatePk, VendorDatePkCB&gt;() {
     *     public ConditionBean setup(vendorDatePk entity, VendorDatePkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> setupper, InsertOption<VendorDatePkCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorDatePk entity = new VendorDatePk();
        VendorDatePkCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorDatePkCB createCBForQueryInsert() {
        VendorDatePkCB cb = newMyConditionBean();
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #FD4747">queryUpdate</span>(vendorDatePk, cb);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb) {
        return doQueryUpdate(vendorDatePk, cb, null);
    }

    protected int doQueryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb, UpdateOption<VendorDatePkCB> option) {
        assertObjectNotNull("vendorDatePk", vendorDatePk); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorDatePk, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorDatePkCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorDatePkCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #FD4747">queryDelete</span>(vendorDatePk, cb);
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorDatePkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorDatePkCB cb, DeleteOption<VendorDatePkCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorDatePkCB)cb); }
        else { return varyingQueryDelete((VendorDatePkCB)cb, downcast(option)); }
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDatePk.setFoo...(value);
     * vendorDatePk.setBar...(value);
     * InsertOption<VendorDatePkCB> option = new InsertOption<VendorDatePkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorDatePkBhv.<span style="color: #FD4747">varyingInsert</span>(vendorDatePk, option);
     * ... = vendorDatePk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorDatePk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorDatePk vendorDatePk, InsertOption<VendorDatePkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorDatePk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorDatePk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *         public void specify(VendorDatePkCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorDatePkBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorDatePk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorDatePk vendorDatePk, UpdateOption<VendorDatePkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorDatePk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorDatePk The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorDatePk vendorDatePk, InsertOption<VendorDatePkCB> insertOption, UpdateOption<VendorDatePkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorDatePk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorDatePk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorDatePk vendorDatePk, DeleteOption<VendorDatePkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorDatePk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorDatePk> vendorDatePkList, InsertOption<VendorDatePkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorDatePkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorDatePk> vendorDatePkList, UpdateOption<VendorDatePkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorDatePkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorDatePk> vendorDatePkList, DeleteOption<VendorDatePkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorDatePkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> setupper, InsertOption<VendorDatePkCB> option) {
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *     public void specify(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorDatePkBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorDatePk, cb, option);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb, UpdateOption<VendorDatePkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorDatePk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorDatePkCB cb, DeleteOption<VendorDatePkCB> option) {
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
    public OutsideSqlBasicExecutor<VendorDatePkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorDatePkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorDatePkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorDatePk> void delegateSelectCursor(VendorDatePkCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorDatePk> List<ENTITY> delegateSelectList(VendorDatePkCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorDatePk e, InsertOption<VendorDatePkCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorDatePk e, UpdateOption<VendorDatePkCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorDatePk e, UpdateOption<VendorDatePkCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorDatePk e, DeleteOption<VendorDatePkCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorDatePk e, DeleteOption<VendorDatePkCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorDatePk> ls, InsertOption<VendorDatePkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorDatePk> ls, UpdateOption<VendorDatePkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorDatePk> ls, UpdateOption<VendorDatePkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorDatePk> ls, DeleteOption<VendorDatePkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorDatePk> ls, DeleteOption<VendorDatePkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorDatePk e, VendorDatePkCB inCB, ConditionBean resCB, InsertOption<VendorDatePkCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorDatePk e, VendorDatePkCB cb, UpdateOption<VendorDatePkCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorDatePkCB cb, DeleteOption<VendorDatePkCB> op)
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
    protected VendorDatePk downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorDatePk.class);
    }

    protected VendorDatePkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorDatePkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorDatePk> downcast(List<? extends Entity> entityList) {
        return (List<VendorDatePk>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorDatePkCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorDatePkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorDatePkCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorDatePkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorDatePkCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorDatePkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorDatePk, VendorDatePkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorDatePk, VendorDatePkCB>)option;
    }
}
