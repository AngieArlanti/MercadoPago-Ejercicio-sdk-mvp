package com.mercadolibre.marlanti.px_android_mvp.sample.presenter;

import com.mercadolibre.marlanti.px_android_mvp.mvp.Presenter;
import com.mercadolibre.marlanti.px_android_mvp.mvp.OnResourcesRetrievedCallback;
import com.mercadolibre.marlanti.px_android_mvp.sample.interfaces.PaymentMethodsResourcesProvider;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.PaymentMethodsView;

import java.util.List;

/**
 * Created by marlanti on 12/21/16.
 */

public class PaymentMethodsPresenter extends Presenter<PaymentMethodsView, PaymentMethodsResourcesProvider> {


    public void onCreate(){
        getResourcesProvider().getPaymentMethods(new OnResourcesRetrievedCallback() {

            @Override
            public <E> void onSuccess(List<E> data) {
                getView().showPaymentMethodsList(data);
            }

            @Override
            public void onFailure() {
                getView().showError(getResourcesProvider().getConnectionErrorMessage());
            }
        });
    }

}


