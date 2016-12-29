package com.mercadolibre.marlanti.px_android_mvp.sample.interfaces;

import com.mercadolibre.marlanti.px_android_mvp.mvp.OnResourcesRetrievedCallback;
import com.mercadolibre.marlanti.px_android_mvp.mvp.ResourcesProvider;

/**
 * Created by marlanti on 12/28/16.
 */
public interface PaymentMethodsResourcesProvider extends ResourcesProvider {
     void getPaymentMethods(final OnResourcesRetrievedCallback listener);
     public String getConnectionErrorMessage();
}
