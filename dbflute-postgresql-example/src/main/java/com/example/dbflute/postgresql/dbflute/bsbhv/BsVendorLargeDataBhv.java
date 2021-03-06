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
 * The behavior of vendor_large_data as TABLE. <br />
 * <pre>
 * [primary key]
 *     large_data_id
 * 
 * [column]
 *     large_data_id, string_index, string_no_index, string_unique_index, intflg_index, numeric_integer_index, numeric_integer_no_index
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
 *     vendor_large_data_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorLargeDataRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeDataBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_large_data"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorLargeDataDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeDataDbm getMyDBMeta() { return VendorLargeDataDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeData newMyEntity() { return new VendorLargeData(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeDataCB newMyConditionBean() { return new VendorLargeDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeDataBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeDataCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorLargeDataCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorLargeDataCB cb) { // called by selectPage(cb)
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
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * VendorLargeData vendorLargeData = vendorLargeDataBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorLargeData != null) {
     *     ... = vendorLargeData.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectEntity(VendorLargeDataCB cb) {
        return doSelectEntity(cb, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectEntity(final VendorLargeDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorLargeDataCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * VendorLargeData vendorLargeData = vendorLargeDataBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectEntityWithDeletedCheck(VendorLargeDataCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectEntityWithDeletedCheck(final VendorLargeDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorLargeDataCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param largeDataId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectByPKValue(Long largeDataId) {
        return doSelectByPKValue(largeDataId, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectByPKValue(Long largeDataId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(largeDataId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param largeDataId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectByPKValueWithDeletedCheck(Long largeDataId) {
        return doSelectByPKValueWithDeletedCheck(largeDataId, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectByPKValueWithDeletedCheck(Long largeDataId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(largeDataId), entityType);
    }

    private VendorLargeDataCB buildPKCB(Long largeDataId) {
        assertObjectNotNull("largeDataId", largeDataId);
        VendorLargeDataCB cb = newMyConditionBean();
        cb.query().setLargeDataId_Equal(largeDataId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeData&gt; vendorLargeDataList = vendorLargeDataBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorLargeData vendorLargeData : vendorLargeDataList) {
     *     ... = vendorLargeData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeData> selectList(VendorLargeDataCB cb) {
        return doSelectList(cb, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> ListResultBean<ENTITY> doSelectList(VendorLargeDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorLargeDataCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeDataCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeData&gt; page = vendorLargeDataBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeData vendorLargeData : page) {
     *     ... = vendorLargeData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeData> selectPage(VendorLargeDataCB cb) {
        return doSelectPage(cb, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> PagingResultBean<ENTITY> doSelectPage(VendorLargeDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorLargeDataCB>() {
            public int callbackSelectCount(VendorLargeDataCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorLargeDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeData&gt;() {
     *     public void handle(VendorLargeData entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeData. (NotNull)
     */
    public void selectCursor(VendorLargeDataCB cb, EntityRowHandler<VendorLargeData> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorLargeData.class);
    }

    protected <ENTITY extends VendorLargeData> void doSelectCursor(VendorLargeDataCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorLargeData>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorLargeDataCB>() {
            public void callbackSelectCursor(VendorLargeDataCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorLargeDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeDataBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorLargeDataCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorLargeDataCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorLargeDataRefList(VendorLargeData vendorLargeData, ConditionBeanSetupper<VendorLargeDataRefCB> conditionBeanSetupper) {
        xassLRArg(vendorLargeData, conditionBeanSetupper);
        loadVendorLargeDataRefList(xnewLRLs(vendorLargeData), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorLargeDataRefList with the set-upper for condition-bean of referrer. <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * <pre>
     * vendorLargeDataBhv.<span style="color: #FD4747">loadVendorLargeDataRefList</span>(vendorLargeDataList, new ConditionBeanSetupper&lt;VendorLargeDataRefCB&gt;() {
     *     public void setup(VendorLargeDataRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorLargeData vendorLargeData : vendorLargeDataList) {
     *     ... = vendorLargeData.<span style="color: #FD4747">getVendorLargeDataRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLargeDataId_InScope(pkList);
     * cb.query().addOrderBy_LargeDataId_Asc();
     * </pre>
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorLargeDataRefList(List<VendorLargeData> vendorLargeDataList, ConditionBeanSetupper<VendorLargeDataRefCB> conditionBeanSetupper) {
        xassLRArg(vendorLargeDataList, conditionBeanSetupper);
        loadVendorLargeDataRefList(vendorLargeDataList, new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorLargeDataRefList(VendorLargeData vendorLargeData, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeData, loadReferrerOption);
        loadVendorLargeDataRefList(xnewLRLs(vendorLargeData), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorLargeDataRefList(List<VendorLargeData> vendorLargeDataList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataList, loadReferrerOption);
        if (vendorLargeDataList.isEmpty()) { return; }
        final VendorLargeDataRefBhv referrerBhv = xgetBSFLR().select(VendorLargeDataRefBhv.class);
        helpLoadReferrerInternally(vendorLargeDataList, loadReferrerOption, new InternalLoadReferrerCallback<VendorLargeData, Long, VendorLargeDataRefCB, VendorLargeDataRef>() {
            public Long getPKVal(VendorLargeData e)
            { return e.getLargeDataId(); }
            public void setRfLs(VendorLargeData e, List<VendorLargeDataRef> ls)
            { e.setVendorLargeDataRefList(ls); }
            public VendorLargeDataRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorLargeDataRefCB cb, List<Long> ls)
            { cb.query().setLargeDataId_InScope(ls); }
            public void qyOdFKAsc(VendorLargeDataRefCB cb) { cb.query().addOrderBy_LargeDataId_Asc(); }
            public void spFKCol(VendorLargeDataRefCB cb) { cb.specify().columnLargeDataId(); }
            public List<VendorLargeDataRef> selRfLs(VendorLargeDataRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(VendorLargeDataRef e) { return e.getLargeDataId(); }
            public void setlcEt(VendorLargeDataRef re, VendorLargeData le)
            { re.setVendorLargeData(le); }
            public String getRfPrNm() { return "vendorLargeDataRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key largeDataId.
     * @param vendorLargeDataList The list of vendorLargeData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractLargeDataIdList(List<VendorLargeData> vendorLargeDataList) {
        return helpExtractListInternally(vendorLargeDataList, new InternalExtractCallback<VendorLargeData, Long>() {
            public Long getCV(VendorLargeData e) { return e.getLargeDataId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key stringUniqueIndex.
     * @param vendorLargeDataList The list of vendorLargeData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractStringUniqueIndexList(List<VendorLargeData> vendorLargeDataList) {
        return helpExtractListInternally(vendorLargeDataList, new InternalExtractCallback<VendorLargeData, String>() {
            public String getCV(VendorLargeData e) { return e.getStringUniqueIndex(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeData.setFoo...(value);
     * vendorLargeData.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * vendorLargeDataBhv.<span style="color: #FD4747">insert</span>(vendorLargeData);
     * ... = vendorLargeData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeData The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeData vendorLargeData) {
        doInsert(vendorLargeData, null);
    }

    protected void doInsert(VendorLargeData vendorLargeData, InsertOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeData", vendorLargeData);
        prepareInsertOption(option);
        delegateInsert(vendorLargeData, option);
    }

    protected void prepareInsertOption(InsertOption<VendorLargeDataCB> option) {
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataBhv.<span style="color: #FD4747">update</span>(vendorLargeData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorLargeData The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorLargeData vendorLargeData) {
        doUpdate(vendorLargeData, null);
    }

    protected void doUpdate(VendorLargeData vendorLargeData, final UpdateOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeData", vendorLargeData);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorLargeData, new InternalUpdateCallback<VendorLargeData>() {
            public int callbackDelegateUpdate(VendorLargeData entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorLargeDataCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorLargeDataCB createCBForVaryingUpdate() {
        VendorLargeDataCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorLargeDataCB createCBForSpecifiedUpdate() {
        VendorLargeDataCB cb = newMyConditionBean();
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
     * @param vendorLargeData The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeData vendorLargeData) {
        doInesrtOrUpdate(vendorLargeData, null, null);
    }

    protected void doInesrtOrUpdate(VendorLargeData vendorLargeData, final InsertOption<VendorLargeDataCB> insertOption, final UpdateOption<VendorLargeDataCB> updateOption) {
        helpInsertOrUpdateInternally(vendorLargeData, new InternalInsertOrUpdateCallback<VendorLargeData, VendorLargeDataCB>() {
            public void callbackInsert(VendorLargeData entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorLargeData entity) { doUpdate(entity, updateOption); }
            public VendorLargeDataCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorLargeDataCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorLargeDataCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorLargeDataCB>() : updateOption;
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataBhv.<span style="color: #FD4747">delete</span>(vendorLargeData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorLargeData The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeData vendorLargeData) {
        doDelete(vendorLargeData, null);
    }

    protected void doDelete(VendorLargeData vendorLargeData, final DeleteOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeData", vendorLargeData);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorLargeData, new InternalDeleteCallback<VendorLargeData>() {
            public int callbackDelegateDelete(VendorLargeData entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorLargeDataCB> option) {
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
     *     VendorLargeData vendorLargeData = new VendorLargeData();
     *     vendorLargeData.setFooName("foo");
     *     if (...) {
     *         vendorLargeData.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeDataList.add(vendorLargeData);
     * }
     * vendorLargeDataBhv.<span style="color: #FD4747">batchInsert</span>(vendorLargeDataList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeData> vendorLargeDataList) {
        InsertOption<VendorLargeDataCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorLargeDataList, option);
    }

    protected int[] doBatchInsert(List<VendorLargeData> vendorLargeDataList, InsertOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeDataList", vendorLargeDataList);
        prepareBatchInsertOption(vendorLargeDataList, option);
        return delegateBatchInsert(vendorLargeDataList, option);
    }

    protected void prepareBatchInsertOption(List<VendorLargeData> vendorLargeDataList, InsertOption<VendorLargeDataCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorLargeDataList);
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
     *     VendorLargeData vendorLargeData = new VendorLargeData();
     *     vendorLargeData.setFooName("foo");
     *     if (...) {
     *         vendorLargeData.setFooPrice(123);
     *     } else {
     *         vendorLargeData.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeData.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeDataList.add(vendorLargeData);
     * }
     * vendorLargeDataBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeDataList);
     * </pre>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeData> vendorLargeDataList) {
        UpdateOption<VendorLargeDataCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorLargeDataList, option);
    }

    protected int[] doBatchUpdate(List<VendorLargeData> vendorLargeDataList, UpdateOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeDataList", vendorLargeDataList);
        prepareBatchUpdateOption(vendorLargeDataList, option);
        return delegateBatchUpdate(vendorLargeDataList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorLargeData> vendorLargeDataList, UpdateOption<VendorLargeDataCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorLargeDataList);
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
     * vendorLargeDataBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeDataList, new SpecifyQuery<VendorLargeDataCB>() {
     *     public void specify(VendorLargeDataCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorLargeDataBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeDataList, new SpecifyQuery<VendorLargeDataCB>() {
     *     public void specify(VendorLargeDataCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeData> vendorLargeDataList, SpecifyQuery<VendorLargeDataCB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeDataList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeData> vendorLargeDataList) {
        return doBatchDelete(vendorLargeDataList, null);
    }

    protected int[] doBatchDelete(List<VendorLargeData> vendorLargeDataList, DeleteOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeDataList", vendorLargeDataList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorLargeDataList, option);
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
     * vendorLargeDataBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeData, VendorLargeDataCB&gt;() {
     *     public ConditionBean setup(vendorLargeData entity, VendorLargeDataCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> setupper, InsertOption<VendorLargeDataCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorLargeData entity = new VendorLargeData();
        VendorLargeDataCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorLargeDataCB createCBForQueryInsert() {
        VendorLargeDataCB cb = newMyConditionBean();
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataBhv.<span style="color: #FD4747">queryUpdate</span>(vendorLargeData, cb);
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb) {
        return doQueryUpdate(vendorLargeData, cb, null);
    }

    protected int doQueryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb, UpdateOption<VendorLargeDataCB> option) {
        assertObjectNotNull("vendorLargeData", vendorLargeData); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorLargeData, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorLargeDataCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorLargeDataCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataBhv.<span style="color: #FD4747">queryDelete</span>(vendorLargeData, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeDataCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorLargeDataCB cb, DeleteOption<VendorLargeDataCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorLargeDataCB)cb); }
        else { return varyingQueryDelete((VendorLargeDataCB)cb, downcast(option)); }
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeData.setFoo...(value);
     * vendorLargeData.setBar...(value);
     * InsertOption<VendorLargeDataCB> option = new InsertOption<VendorLargeDataCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeDataBhv.<span style="color: #FD4747">varyingInsert</span>(vendorLargeData, option);
     * ... = vendorLargeData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeData The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeData vendorLargeData, InsertOption<VendorLargeDataCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeData, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeDataCB&gt; option = new UpdateOption&lt;VendorLargeDataCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeDataCB&gt;() {
     *         public void specify(VendorLargeDataCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeDataBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorLargeData, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeData The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeData vendorLargeData, UpdateOption<VendorLargeDataCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeData, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeData The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeData vendorLargeData, InsertOption<VendorLargeDataCB> insertOption, UpdateOption<VendorLargeDataCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorLargeData, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeData The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeData vendorLargeData, DeleteOption<VendorLargeDataCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeData, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeData> vendorLargeDataList, InsertOption<VendorLargeDataCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeDataList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeData> vendorLargeDataList, UpdateOption<VendorLargeDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeDataList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeData> vendorLargeDataList, DeleteOption<VendorLargeDataCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeDataList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> setupper, InsertOption<VendorLargeDataCB> option) {
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeDataCB&gt; option = new UpdateOption&lt;VendorLargeDataCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeDataCB&gt;() {
     *     public void specify(VendorLargeDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeDataBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorLargeData, cb, option);
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb, UpdateOption<VendorLargeDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeData, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeDataCB cb, DeleteOption<VendorLargeDataCB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorLargeDataCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorLargeDataCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorLargeData> void delegateSelectCursor(VendorLargeDataCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorLargeData> List<ENTITY> delegateSelectList(VendorLargeDataCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorLargeData e, InsertOption<VendorLargeDataCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorLargeData e, UpdateOption<VendorLargeDataCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorLargeData e, UpdateOption<VendorLargeDataCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorLargeData e, DeleteOption<VendorLargeDataCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorLargeData e, DeleteOption<VendorLargeDataCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorLargeData> ls, InsertOption<VendorLargeDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorLargeData> ls, UpdateOption<VendorLargeDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorLargeData> ls, UpdateOption<VendorLargeDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorLargeData> ls, DeleteOption<VendorLargeDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorLargeData> ls, DeleteOption<VendorLargeDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorLargeData e, VendorLargeDataCB inCB, ConditionBean resCB, InsertOption<VendorLargeDataCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorLargeData e, VendorLargeDataCB cb, UpdateOption<VendorLargeDataCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorLargeDataCB cb, DeleteOption<VendorLargeDataCB> op)
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
    protected VendorLargeData downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorLargeData.class);
    }

    protected VendorLargeDataCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorLargeDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorLargeData> downcast(List<? extends Entity> entityList) {
        return (List<VendorLargeData>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorLargeDataCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorLargeDataCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorLargeDataCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorLargeDataCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorLargeDataCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorLargeDataCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorLargeData, VendorLargeDataCB>)option;
    }
}
