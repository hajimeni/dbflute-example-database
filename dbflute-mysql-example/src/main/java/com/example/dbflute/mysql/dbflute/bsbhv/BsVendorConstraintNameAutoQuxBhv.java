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
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_QUX as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_QUX_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_QUX_NAME
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
 *     vendor_constraint_name_auto_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorConstraintNameAutoQuxBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_constraint_name_auto_qux"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorConstraintNameAutoQuxDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoQuxDbm getMyDBMeta() { return VendorConstraintNameAutoQuxDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorConstraintNameAutoQux newMyEntity() { return new VendorConstraintNameAutoQux(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorConstraintNameAutoQuxCB newMyConditionBean() { return new VendorConstraintNameAutoQuxCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoQuxCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorConstraintNameAutoQuxCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorConstraintNameAutoQuxCB cb) { // called by selectPage(cb)
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
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoQux != null) {
     *     ... = vendorConstraintNameAutoQux.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectEntity(VendorConstraintNameAutoQuxCB cb) {
        return doSelectEntity(cb, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectEntity(final VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorConstraintNameAutoQuxCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoQux.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectEntityWithDeletedCheck(VendorConstraintNameAutoQuxCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectEntityWithDeletedCheck(final VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorConstraintNameAutoQuxCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoQuxId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectByPKValue(Long constraintNameAutoQuxId) {
        return doSelectByPKValue(constraintNameAutoQuxId, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectByPKValue(Long constraintNameAutoQuxId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(constraintNameAutoQuxId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoQuxId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectByPKValueWithDeletedCheck(Long constraintNameAutoQuxId) {
        return doSelectByPKValueWithDeletedCheck(constraintNameAutoQuxId, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectByPKValueWithDeletedCheck(Long constraintNameAutoQuxId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(constraintNameAutoQuxId), entityType);
    }

    private VendorConstraintNameAutoQuxCB buildPKCB(Long constraintNameAutoQuxId) {
        assertObjectNotNull("constraintNameAutoQuxId", constraintNameAutoQuxId);
        VendorConstraintNameAutoQuxCB cb = newMyConditionBean();
        cb.query().setConstraintNameAutoQuxId_Equal(constraintNameAutoQuxId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorConstraintNameAutoQux&gt; vendorConstraintNameAutoQuxList = vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoQux vendorConstraintNameAutoQux : vendorConstraintNameAutoQuxList) {
     *     ... = vendorConstraintNameAutoQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoQux> selectList(VendorConstraintNameAutoQuxCB cb) {
        return doSelectList(cb, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ListResultBean<ENTITY> doSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorConstraintNameAutoQuxCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoQux&gt; page = vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorConstraintNameAutoQux vendorConstraintNameAutoQux : page) {
     *     ... = vendorConstraintNameAutoQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoQux> selectPage(VendorConstraintNameAutoQuxCB cb) {
        return doSelectPage(cb, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> PagingResultBean<ENTITY> doSelectPage(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorConstraintNameAutoQuxCB>() {
            public int callbackSelectCount(VendorConstraintNameAutoQuxCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoQux&gt;() {
     *     public void handle(VendorConstraintNameAutoQux entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoQux. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<VendorConstraintNameAutoQux> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorConstraintNameAutoQux.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> void doSelectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorConstraintNameAutoQux>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorConstraintNameAutoQuxCB>() {
            public void callbackSelectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoQuxCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorConstraintNameAutoQuxCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorConstraintNameAutoQuxCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param vendorConstraintNameAutoQux The entity of vendorConstraintNameAutoQux. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoQux, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoQux), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorConstraintNameAutoRefList with the set-upper for condition-bean of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoQuxList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorConstraintNameAutoQux vendorConstraintNameAutoQux : vendorConstraintNameAutoQuxList) {
     *     ... = vendorConstraintNameAutoQux.<span style="color: #FD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setConstraintNameAutoQuxId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoQuxId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoQuxList The entity list of vendorConstraintNameAutoQux. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoQuxList, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(vendorConstraintNameAutoQuxList, new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorConstraintNameAutoQux The entity of vendorConstraintNameAutoQux. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoQux, loadReferrerOption);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoQux), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorConstraintNameAutoQuxList The entity list of vendorConstraintNameAutoQux. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoQuxList, loadReferrerOption);
        if (vendorConstraintNameAutoQuxList.isEmpty()) { return; }
        final VendorConstraintNameAutoRefBhv referrerBhv = xgetBSFLR().select(VendorConstraintNameAutoRefBhv.class);
        helpLoadReferrerInternally(vendorConstraintNameAutoQuxList, loadReferrerOption, new InternalLoadReferrerCallback<VendorConstraintNameAutoQux, Long, VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>() {
            public Long getPKVal(VendorConstraintNameAutoQux e)
            { return e.getConstraintNameAutoQuxId(); }
            public void setRfLs(VendorConstraintNameAutoQux e, List<VendorConstraintNameAutoRef> ls)
            { e.setVendorConstraintNameAutoRefList(ls); }
            public VendorConstraintNameAutoRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorConstraintNameAutoRefCB cb, List<Long> ls)
            { cb.query().setConstraintNameAutoQuxId_InScope(ls); }
            public void qyOdFKAsc(VendorConstraintNameAutoRefCB cb) { cb.query().addOrderBy_ConstraintNameAutoQuxId_Asc(); }
            public void spFKCol(VendorConstraintNameAutoRefCB cb) { cb.specify().columnConstraintNameAutoQuxId(); }
            public List<VendorConstraintNameAutoRef> selRfLs(VendorConstraintNameAutoRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(VendorConstraintNameAutoRef e) { return e.getConstraintNameAutoQuxId(); }
            public void setlcEt(VendorConstraintNameAutoRef re, VendorConstraintNameAutoQux le)
            { re.setVendorConstraintNameAutoQux(le); }
            public String getRfPrNm() { return "vendorConstraintNameAutoRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key constraintNameAutoQuxId.
     * @param vendorConstraintNameAutoQuxList The list of vendorConstraintNameAutoQux. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractConstraintNameAutoQuxIdList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        return helpExtractListInternally(vendorConstraintNameAutoQuxList, new InternalExtractCallback<VendorConstraintNameAutoQux, Long>() {
            public Long getCV(VendorConstraintNameAutoQux e) { return e.getConstraintNameAutoQuxId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key constraintNameAutoQuxName.
     * @param vendorConstraintNameAutoQuxList The list of vendorConstraintNameAutoQux. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoQuxNameList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        return helpExtractListInternally(vendorConstraintNameAutoQuxList, new InternalExtractCallback<VendorConstraintNameAutoQux, String>() {
            public String getCV(VendorConstraintNameAutoQux e) { return e.getConstraintNameAutoQuxName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoQux.setFoo...(value);
     * vendorConstraintNameAutoQux.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.set...;</span>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">insert</span>(vendorConstraintNameAutoQux);
     * ... = vendorConstraintNameAutoQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoQux The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doInsert(vendorConstraintNameAutoQux, null);
    }

    protected void doInsert(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQux", vendorConstraintNameAutoQux);
        prepareInsertOption(option);
        delegateInsert(vendorConstraintNameAutoQux, option);
    }

    protected void prepareInsertOption(InsertOption<VendorConstraintNameAutoQuxCB> option) {
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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * vendorConstraintNameAutoQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoQux.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">update</span>(vendorConstraintNameAutoQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doUpdate(vendorConstraintNameAutoQux, null);
    }

    protected void doUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, final UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQux", vendorConstraintNameAutoQux);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorConstraintNameAutoQux, new InternalUpdateCallback<VendorConstraintNameAutoQux>() {
            public int callbackDelegateUpdate(VendorConstraintNameAutoQux entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorConstraintNameAutoQuxCB createCBForVaryingUpdate() {
        VendorConstraintNameAutoQuxCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorConstraintNameAutoQuxCB createCBForSpecifiedUpdate() {
        VendorConstraintNameAutoQuxCB cb = newMyConditionBean();
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
     * @param vendorConstraintNameAutoQux The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doInesrtOrUpdate(vendorConstraintNameAutoQux, null, null);
    }

    protected void doInesrtOrUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, final InsertOption<VendorConstraintNameAutoQuxCB> insertOption, final UpdateOption<VendorConstraintNameAutoQuxCB> updateOption) {
        helpInsertOrUpdateInternally(vendorConstraintNameAutoQux, new InternalInsertOrUpdateCallback<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB>() {
            public void callbackInsert(VendorConstraintNameAutoQux entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorConstraintNameAutoQux entity) { doUpdate(entity, updateOption); }
            public VendorConstraintNameAutoQuxCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorConstraintNameAutoQuxCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorConstraintNameAutoQuxCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorConstraintNameAutoQuxCB>() : updateOption;
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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * vendorConstraintNameAutoQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoQux.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">delete</span>(vendorConstraintNameAutoQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doDelete(vendorConstraintNameAutoQux, null);
    }

    protected void doDelete(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, final DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQux", vendorConstraintNameAutoQux);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorConstraintNameAutoQux, new InternalDeleteCallback<VendorConstraintNameAutoQux>() {
            public int callbackDelegateDelete(VendorConstraintNameAutoQux entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorConstraintNameAutoQuxCB> option) {
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
     *     VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     *     vendorConstraintNameAutoQux.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoQux.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoQuxList.add(vendorConstraintNameAutoQux);
     * }
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">batchInsert</span>(vendorConstraintNameAutoQuxList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        InsertOption<VendorConstraintNameAutoQuxCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorConstraintNameAutoQuxList, option);
    }

    protected int[] doBatchInsert(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQuxList", vendorConstraintNameAutoQuxList);
        prepareBatchInsertOption(vendorConstraintNameAutoQuxList, option);
        return delegateBatchInsert(vendorConstraintNameAutoQuxList, option);
    }

    protected void prepareBatchInsertOption(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoQuxList);
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
     *     VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     *     vendorConstraintNameAutoQux.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoQux.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoQux.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoQuxList.add(vendorConstraintNameAutoQux);
     * }
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoQuxList);
     * </pre>
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        UpdateOption<VendorConstraintNameAutoQuxCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorConstraintNameAutoQuxList, option);
    }

    protected int[] doBatchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQuxList", vendorConstraintNameAutoQuxList);
        prepareBatchUpdateOption(vendorConstraintNameAutoQuxList, option);
        return delegateBatchUpdate(vendorConstraintNameAutoQuxList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoQuxList);
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
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoQuxList, new SpecifyQuery<VendorConstraintNameAutoQuxCB>() {
     *     public void specify(VendorConstraintNameAutoQuxCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoQuxList, new SpecifyQuery<VendorConstraintNameAutoQuxCB>() {
     *     public void specify(VendorConstraintNameAutoQuxCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, SpecifyQuery<VendorConstraintNameAutoQuxCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoQuxList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        return doBatchDelete(vendorConstraintNameAutoQuxList, null);
    }

    protected int[] doBatchDelete(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQuxList", vendorConstraintNameAutoQuxList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorConstraintNameAutoQuxList, option);
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
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoQux entity, VendorConstraintNameAutoQuxCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> setupper, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorConstraintNameAutoQux entity = new VendorConstraintNameAutoQux();
        VendorConstraintNameAutoQuxCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorConstraintNameAutoQuxCB createCBForQueryInsert() {
        VendorConstraintNameAutoQuxCB cb = newMyConditionBean();
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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setPK...(value);</span>
     * vendorConstraintNameAutoQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setVersionNo(value);</span>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">queryUpdate</span>(vendorConstraintNameAutoQux, cb);
     * </pre>
     * @param vendorConstraintNameAutoQux The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoQux, cb, null);
    }

    protected int doQueryUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB cb, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoQux", vendorConstraintNameAutoQux); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorConstraintNameAutoQux, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorConstraintNameAutoQuxCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorConstraintNameAutoQuxCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">queryDelete</span>(vendorConstraintNameAutoQux, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoQuxCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorConstraintNameAutoQuxCB cb, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorConstraintNameAutoQuxCB)cb); }
        else { return varyingQueryDelete((VendorConstraintNameAutoQuxCB)cb, downcast(option)); }
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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoQux.setFoo...(value);
     * vendorConstraintNameAutoQux.setBar...(value);
     * InsertOption<VendorConstraintNameAutoQuxCB> option = new InsertOption<VendorConstraintNameAutoQuxCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">varyingInsert</span>(vendorConstraintNameAutoQux, option);
     * ... = vendorConstraintNameAutoQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoQux, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * vendorConstraintNameAutoQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoQux.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *         public void specify(VendorConstraintNameAutoQuxCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorConstraintNameAutoQux, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoQux, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoQux The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, InsertOption<VendorConstraintNameAutoQuxCB> insertOption, UpdateOption<VendorConstraintNameAutoQuxCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorConstraintNameAutoQux, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoQux The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoQux, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoQuxList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoQuxList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoQuxList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> setupper, InsertOption<VendorConstraintNameAutoQuxCB> option) {
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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setPK...(value);</span>
     * vendorConstraintNameAutoQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setVersionNo(value);</span>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void specify(VendorConstraintNameAutoQuxCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoQux, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoQux The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB cb, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoQux, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorConstraintNameAutoQuxCB cb, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
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
    public OutsideSqlBasicExecutor<VendorConstraintNameAutoQuxBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorConstraintNameAutoQuxCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorConstraintNameAutoQuxCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorConstraintNameAutoQux> void delegateSelectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorConstraintNameAutoQux> List<ENTITY> delegateSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorConstraintNameAutoQux e, InsertOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorConstraintNameAutoQux e, UpdateOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorConstraintNameAutoQux e, UpdateOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorConstraintNameAutoQux e, DeleteOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorConstraintNameAutoQux e, DeleteOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorConstraintNameAutoQux> ls, InsertOption<VendorConstraintNameAutoQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorConstraintNameAutoQux> ls, UpdateOption<VendorConstraintNameAutoQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorConstraintNameAutoQux> ls, UpdateOption<VendorConstraintNameAutoQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorConstraintNameAutoQux> ls, DeleteOption<VendorConstraintNameAutoQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorConstraintNameAutoQux> ls, DeleteOption<VendorConstraintNameAutoQuxCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorConstraintNameAutoQux e, VendorConstraintNameAutoQuxCB inCB, ConditionBean resCB, InsertOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorConstraintNameAutoQux e, VendorConstraintNameAutoQuxCB cb, UpdateOption<VendorConstraintNameAutoQuxCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorConstraintNameAutoQuxCB cb, DeleteOption<VendorConstraintNameAutoQuxCB> op)
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
    protected VendorConstraintNameAutoQux downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorConstraintNameAutoQux.class);
    }

    protected VendorConstraintNameAutoQuxCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorConstraintNameAutoQuxCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorConstraintNameAutoQux> downcast(List<? extends Entity> entityList) {
        return (List<VendorConstraintNameAutoQux>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorConstraintNameAutoQuxCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorConstraintNameAutoQuxCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorConstraintNameAutoQuxCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorConstraintNameAutoQuxCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorConstraintNameAutoQuxCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorConstraintNameAutoQuxCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB>)option;
    }
}
