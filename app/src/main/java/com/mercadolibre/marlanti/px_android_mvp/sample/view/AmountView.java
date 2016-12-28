package com.mercadolibre.marlanti.px_android_mvp.sample.view;

import com.mercadolibre.marlanti.px_android_mvp.mvp.View;

import java.math.BigDecimal;

/**
 * Created by marlanti on 12/22/16.
 */
public interface AmountView extends View {

    void startPaymentMethodsSelection(BigDecimal amount);
    void showError(String msg);

}
