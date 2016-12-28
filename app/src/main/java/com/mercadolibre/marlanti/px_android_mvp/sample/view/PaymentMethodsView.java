package com.mercadolibre.marlanti.px_android_mvp.sample.view;


import com.mercadolibre.marlanti.px_android_mvp.mvp.View;

import java.util.List;

/**
 * Created by marlanti on 12/21/16.
 */

public interface PaymentMethodsView <E> extends View {
    public void showPaymentMethodsList(List<E> data);
    void showError(String msg);
}
