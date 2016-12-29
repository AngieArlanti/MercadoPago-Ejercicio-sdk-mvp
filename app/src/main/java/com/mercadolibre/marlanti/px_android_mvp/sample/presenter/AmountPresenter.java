package com.mercadolibre.marlanti.px_android_mvp.sample.presenter;

import com.mercadolibre.marlanti.px_android_mvp.mvp.Presenter;
import com.mercadolibre.marlanti.px_android_mvp.sample.interfaces.AmountResourcesProvider;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.AmountView;

import java.math.BigDecimal;

/**
 * Created by marlanti on 12/22/16.
 */
public class AmountPresenter extends Presenter<AmountView,AmountResourcesProvider>{


    private BigDecimal mAmount;


    public void informAmount(BigDecimal amount) {
        this.mAmount = amount;
        try {
            validateAmount();
            getView().startPaymentMethodsSelection(mAmount);
        } catch (IllegalStateException e) {
            getView().showError(e.getMessage());
        }
    }

    public void validateAmount() throws IllegalStateException {
        if(mAmount.compareTo(BigDecimal.ZERO) <= 0) {
            //FIXME hacer jerarquia de Exceptions no pasar mensajes por acá.
            throw new IllegalStateException(getResourcesProvider().getInvalidAmountMessage());
        }
    }
}
