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
 * The behavior of WHITE_VARIANT_RELATION_MASTER_BAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_BAR_ID
 * 
 * [column]
 *     MASTER_BAR_ID, MASTER_BAR_NAME
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
 *     white_variant_relation_referrer
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterBarBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_variant_relation_master_bar"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteVariantRelationMasterBarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationMasterBarDbm getMyDBMeta() { return WhiteVariantRelationMasterBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationMasterBar newMyEntity() { return new WhiteVariantRelationMasterBar(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationMasterBarCB newMyConditionBean() { return new WhiteVariantRelationMasterBarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterBarCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteVariantRelationMasterBarCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteVariantRelationMasterBarCB cb) { // called by selectPage(cb)
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
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationMasterBar != null) {
     *     ... = whiteVariantRelationMasterBar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectEntity(WhiteVariantRelationMasterBarCB cb) {
        return doSelectEntity(cb, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ENTITY doSelectEntity(final WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteVariantRelationMasterBarCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectEntityWithDeletedCheck(WhiteVariantRelationMasterBarCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ENTITY doSelectEntityWithDeletedCheck(final WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteVariantRelationMasterBarCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param masterBarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectByPKValue(Long masterBarId) {
        return doSelectByPKValue(masterBarId, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ENTITY doSelectByPKValue(Long masterBarId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(masterBarId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param masterBarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectByPKValueWithDeletedCheck(Long masterBarId) {
        return doSelectByPKValueWithDeletedCheck(masterBarId, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ENTITY doSelectByPKValueWithDeletedCheck(Long masterBarId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(masterBarId), entityType);
    }

    private WhiteVariantRelationMasterBarCB buildPKCB(Long masterBarId) {
        assertObjectNotNull("masterBarId", masterBarId);
        WhiteVariantRelationMasterBarCB cb = newMyConditionBean();
        cb.query().setMasterBarId_Equal(masterBarId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterBar&gt; whiteVariantRelationMasterBarList = whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterBar whiteVariantRelationMasterBar : whiteVariantRelationMasterBarList) {
     *     ... = whiteVariantRelationMasterBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterBar> selectList(WhiteVariantRelationMasterBarCB cb) {
        return doSelectList(cb, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ListResultBean<ENTITY> doSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteVariantRelationMasterBarCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterBar&gt; page = whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterBar whiteVariantRelationMasterBar : page) {
     *     ... = whiteVariantRelationMasterBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterBar> selectPage(WhiteVariantRelationMasterBarCB cb) {
        return doSelectPage(cb, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> PagingResultBean<ENTITY> doSelectPage(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteVariantRelationMasterBarCB>() {
            public int callbackSelectCount(WhiteVariantRelationMasterBarCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterBar&gt;() {
     *     public void handle(WhiteVariantRelationMasterBar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterBar. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterBarCB cb, EntityRowHandler<WhiteVariantRelationMasterBar> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteVariantRelationMasterBar.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> void doSelectCursor(WhiteVariantRelationMasterBarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteVariantRelationMasterBar>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteVariantRelationMasterBarCB>() {
            public void callbackSelectCursor(WhiteVariantRelationMasterBarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteVariantRelationMasterBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteVariantRelationMasterBarCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param whiteVariantRelationMasterBar The entity of whiteVariantRelationMasterBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> conditionBeanSetupper) {
        xassLRArg(whiteVariantRelationMasterBar, conditionBeanSetupper);
        loadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterBar), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteVariantRelationReferrerAsVariantList with the set-upper for condition-bean of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterBarList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteVariantRelationMasterBar whiteVariantRelationMasterBar : whiteVariantRelationMasterBarList) {
     *     ... = whiteVariantRelationMasterBar.<span style="color: #FD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterBarList The entity list of whiteVariantRelationMasterBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> conditionBeanSetupper) {
        xassLRArg(whiteVariantRelationMasterBarList, conditionBeanSetupper);
        loadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterBarList, new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteVariantRelationMasterBar The entity of whiteVariantRelationMasterBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterBar, loadReferrerOption);
        loadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterBar), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteVariantRelationMasterBarList The entity list of whiteVariantRelationMasterBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterBarList, loadReferrerOption);
        if (whiteVariantRelationMasterBarList.isEmpty()) { return; }
        final WhiteVariantRelationReferrerBhv referrerBhv = xgetBSFLR().select(WhiteVariantRelationReferrerBhv.class);
        helpLoadReferrerInternally(whiteVariantRelationMasterBarList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteVariantRelationMasterBar, Long, WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>() {
            public Long getPKVal(WhiteVariantRelationMasterBar e)
            { return e.getMasterBarId(); }
            public void setRfLs(WhiteVariantRelationMasterBar e, List<WhiteVariantRelationReferrer> ls)
            { e.setWhiteVariantRelationReferrerAsVariantList(ls); }
            public WhiteVariantRelationReferrerCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteVariantRelationReferrerCB cb, List<Long> ls)
            { cb.query().setVariantMasterId_InScope(ls); }
            public void qyOdFKAsc(WhiteVariantRelationReferrerCB cb) { cb.query().addOrderBy_VariantMasterId_Asc(); }
            public void spFKCol(WhiteVariantRelationReferrerCB cb) { cb.specify().columnVariantMasterId(); }
            public List<WhiteVariantRelationReferrer> selRfLs(WhiteVariantRelationReferrerCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteVariantRelationReferrer e) { return e.getVariantMasterId(); }
            public void setlcEt(WhiteVariantRelationReferrer re, WhiteVariantRelationMasterBar le)
            { re.setWhiteVariantRelationMasterBarAsVariant(le); }
            public String getRfPrNm() { return "whiteVariantRelationReferrerAsVariantList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key masterBarId.
     * @param whiteVariantRelationMasterBarList The list of whiteVariantRelationMasterBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterBarIdList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        return helpExtractListInternally(whiteVariantRelationMasterBarList, new InternalExtractCallback<WhiteVariantRelationMasterBar, Long>() {
            public Long getCV(WhiteVariantRelationMasterBar e) { return e.getMasterBarId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterBar.setFoo...(value);
     * whiteVariantRelationMasterBar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.set...;</span>
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">insert</span>(whiteVariantRelationMasterBar);
     * ... = whiteVariantRelationMasterBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doInsert(whiteVariantRelationMasterBar, null);
    }

    protected void doInsert(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBar", whiteVariantRelationMasterBar);
        prepareInsertOption(option);
        delegateInsert(whiteVariantRelationMasterBar, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteVariantRelationMasterBarCB> option) {
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * whiteVariantRelationMasterBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">update</span>(whiteVariantRelationMasterBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doUpdate(whiteVariantRelationMasterBar, null);
    }

    protected void doUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, final UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBar", whiteVariantRelationMasterBar);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteVariantRelationMasterBar, new InternalUpdateCallback<WhiteVariantRelationMasterBar>() {
            public int callbackDelegateUpdate(WhiteVariantRelationMasterBar entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteVariantRelationMasterBarCB createCBForVaryingUpdate() {
        WhiteVariantRelationMasterBarCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteVariantRelationMasterBarCB createCBForSpecifiedUpdate() {
        WhiteVariantRelationMasterBarCB cb = newMyConditionBean();
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
     * @param whiteVariantRelationMasterBar The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doInesrtOrUpdate(whiteVariantRelationMasterBar, null, null);
    }

    protected void doInesrtOrUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, final InsertOption<WhiteVariantRelationMasterBarCB> insertOption, final UpdateOption<WhiteVariantRelationMasterBarCB> updateOption) {
        helpInsertOrUpdateInternally(whiteVariantRelationMasterBar, new InternalInsertOrUpdateCallback<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB>() {
            public void callbackInsert(WhiteVariantRelationMasterBar entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteVariantRelationMasterBar entity) { doUpdate(entity, updateOption); }
            public WhiteVariantRelationMasterBarCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteVariantRelationMasterBarCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteVariantRelationMasterBarCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteVariantRelationMasterBarCB>() : updateOption;
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * whiteVariantRelationMasterBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">delete</span>(whiteVariantRelationMasterBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doDelete(whiteVariantRelationMasterBar, null);
    }

    protected void doDelete(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, final DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBar", whiteVariantRelationMasterBar);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteVariantRelationMasterBar, new InternalDeleteCallback<WhiteVariantRelationMasterBar>() {
            public int callbackDelegateDelete(WhiteVariantRelationMasterBar entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteVariantRelationMasterBarCB> option) {
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
     *     WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     *     whiteVariantRelationMasterBar.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterBar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterBarList.add(whiteVariantRelationMasterBar);
     * }
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">batchInsert</span>(whiteVariantRelationMasterBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        InsertOption<WhiteVariantRelationMasterBarCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteVariantRelationMasterBarList, option);
    }

    protected int[] doBatchInsert(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBarList", whiteVariantRelationMasterBarList);
        prepareBatchInsertOption(whiteVariantRelationMasterBarList, option);
        return delegateBatchInsert(whiteVariantRelationMasterBarList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterBarList);
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
     *     WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     *     whiteVariantRelationMasterBar.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterBar.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterBar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterBarList.add(whiteVariantRelationMasterBar);
     * }
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterBarList);
     * </pre>
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        UpdateOption<WhiteVariantRelationMasterBarCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteVariantRelationMasterBarList, option);
    }

    protected int[] doBatchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBarList", whiteVariantRelationMasterBarList);
        prepareBatchUpdateOption(whiteVariantRelationMasterBarList, option);
        return delegateBatchUpdate(whiteVariantRelationMasterBarList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterBarList);
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
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterBarList, new SpecifyQuery<WhiteVariantRelationMasterBarCB>() {
     *     public void specify(WhiteVariantRelationMasterBarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationMasterBarList, new SpecifyQuery<WhiteVariantRelationMasterBarCB>() {
     *     public void specify(WhiteVariantRelationMasterBarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, SpecifyQuery<WhiteVariantRelationMasterBarCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationMasterBarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        return doBatchDelete(whiteVariantRelationMasterBarList, null);
    }

    protected int[] doBatchDelete(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBarList", whiteVariantRelationMasterBarList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteVariantRelationMasterBarList, option);
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
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB&gt;() {
     *     public ConditionBean setup(whiteVariantRelationMasterBar entity, WhiteVariantRelationMasterBarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> setupper, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteVariantRelationMasterBar entity = new WhiteVariantRelationMasterBar();
        WhiteVariantRelationMasterBarCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteVariantRelationMasterBarCB createCBForQueryInsert() {
        WhiteVariantRelationMasterBarCB cb = newMyConditionBean();
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setPK...(value);</span>
     * whiteVariantRelationMasterBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setVersionNo(value);</span>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">queryUpdate</span>(whiteVariantRelationMasterBar, cb);
     * </pre>
     * @param whiteVariantRelationMasterBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterBar, cb, null);
    }

    protected int doQueryUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB cb, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertObjectNotNull("whiteVariantRelationMasterBar", whiteVariantRelationMasterBar); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteVariantRelationMasterBar, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteVariantRelationMasterBarCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteVariantRelationMasterBarCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">queryDelete</span>(whiteVariantRelationMasterBar, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterBarCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteVariantRelationMasterBarCB cb, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteVariantRelationMasterBarCB)cb); }
        else { return varyingQueryDelete((WhiteVariantRelationMasterBarCB)cb, downcast(option)); }
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterBar.setFoo...(value);
     * whiteVariantRelationMasterBar.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterBarCB> option = new InsertOption<WhiteVariantRelationMasterBarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">varyingInsert</span>(whiteVariantRelationMasterBar, option);
     * ... = whiteVariantRelationMasterBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationMasterBar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * whiteVariantRelationMasterBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterBarCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteVariantRelationMasterBar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationMasterBar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterBar The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, InsertOption<WhiteVariantRelationMasterBarCB> insertOption, UpdateOption<WhiteVariantRelationMasterBarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteVariantRelationMasterBar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationMasterBar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationMasterBarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationMasterBarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationMasterBarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> setupper, InsertOption<WhiteVariantRelationMasterBarCB> option) {
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setPK...(value);</span>
     * whiteVariantRelationMasterBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setVersionNo(value);</span>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterBarBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterBar, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB cb, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationMasterBar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterBarCB cb, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterBarBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteVariantRelationMasterBarCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteVariantRelationMasterBarCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteVariantRelationMasterBar> void delegateSelectCursor(WhiteVariantRelationMasterBarCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteVariantRelationMasterBar> List<ENTITY> delegateSelectList(WhiteVariantRelationMasterBarCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteVariantRelationMasterBar e, InsertOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteVariantRelationMasterBar e, UpdateOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteVariantRelationMasterBar e, UpdateOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteVariantRelationMasterBar e, DeleteOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteVariantRelationMasterBar e, DeleteOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteVariantRelationMasterBar> ls, InsertOption<WhiteVariantRelationMasterBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteVariantRelationMasterBar> ls, UpdateOption<WhiteVariantRelationMasterBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteVariantRelationMasterBar> ls, UpdateOption<WhiteVariantRelationMasterBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteVariantRelationMasterBar> ls, DeleteOption<WhiteVariantRelationMasterBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteVariantRelationMasterBar> ls, DeleteOption<WhiteVariantRelationMasterBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteVariantRelationMasterBar e, WhiteVariantRelationMasterBarCB inCB, ConditionBean resCB, InsertOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteVariantRelationMasterBar e, WhiteVariantRelationMasterBarCB cb, UpdateOption<WhiteVariantRelationMasterBarCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteVariantRelationMasterBarCB cb, DeleteOption<WhiteVariantRelationMasterBarCB> op)
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
    protected WhiteVariantRelationMasterBar downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteVariantRelationMasterBar.class);
    }

    protected WhiteVariantRelationMasterBarCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteVariantRelationMasterBarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteVariantRelationMasterBar> downcast(List<? extends Entity> entityList) {
        return (List<WhiteVariantRelationMasterBar>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationMasterBarCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteVariantRelationMasterBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationMasterBarCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteVariantRelationMasterBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationMasterBarCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteVariantRelationMasterBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB>)option;
    }
}
