package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.lang.reflect.Field;

import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.exception.IllegalClassificationCodeException;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.mysql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.mysql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.mysql.dbflute.exentity.Purchase;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.7 (2010/04/01 Thursday)
 */
public class WxCheckSelectedClassificationTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_select_correct_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        Purchase actual = purchaseBhv.selectByPKValueWithDeletedCheck(3L);

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
    }

    public void test_select_correct_classification_relation() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member();
        cb.query().setPurchaseId_Equal(3L);

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
        assertNotNull(actual.getMember().getMemberStatusCode());
        assertNotNull(actual.getMember().getMemberStatusCodeAsMemberStatus());
    }

    public void test_select_illegal_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        ColumnInfo paymentCompleteFlg = PurchaseDbm.getInstance().columnPaymentCompleteFlg();
        String propertyName = paymentCompleteFlg.getPropertyName();
        Field field = DfReflectionUtil.getAccessibleField(Purchase.class, "_" + propertyName);
        DfReflectionUtil.setValueForcedly(field, purchase, 99999);
        purchase.modifiedProperties().add(propertyName);
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        try {
            purchaseBhv.selectByPKValueWithDeletedCheck(3L);

            // ## Assert ##
            fail();
        } catch (IllegalClassificationCodeException e) {
            // OK
            log(e.getMessage());
        }
    }
}
