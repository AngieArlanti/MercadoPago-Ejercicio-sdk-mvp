package com.mercadolibre.marlanti.px_android_mvp.sample.interfaces;

import com.mercadolibre.marlanti.px_android_mvp.sample.view.PaymentMethodsView;

/**
 * Created by marlanti on 12/28/16.
 */

public interface PaymentMethodsPresenter{

    PaymentMethodsView getView();

    PaymentMethodsResourcesProvider getResourcesProvider();

    void onCreate();

}
