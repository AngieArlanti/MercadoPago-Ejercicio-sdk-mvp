package com.mercadolibre.marlanti.px_android_mvp.sample.presenter;

import com.mercadolibre.marlanti.px_android_mvp.sample.interactor.AmountInteractor;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.AmountView;

import java.math.BigDecimal;

/**
 * Created by marlanti on 12/22/16.
 */
public class AmountPresenter {

    private AmountView mView;
    private BigDecimal mAmount;
    private AmountInteractor interactor;

    public AmountPresenter(AmountInteractor interactor) {
        this.interactor = interactor;
    }

    public void attachView(AmountView amountView) {
        mView = amountView;
    }

    public void informAmount(BigDecimal amount) {
        this.mAmount = amount;
        try {
            validateAmount();
            mView.startPaymentMethodsSelection(mAmount);
        } catch (IllegalStateException e) {
            mView.showError(e.getMessage());
        }
    }

    private void validateAmount() throws IllegalStateException {
        if(mAmount.compareTo(BigDecimal.ZERO) <= 0) {
            //FIXME hacer jerarquia de Exceptions no pasar mensajes por acá.
            throw new IllegalStateException(interactor.getInvalidAmountMessage());
        }
    }
}
