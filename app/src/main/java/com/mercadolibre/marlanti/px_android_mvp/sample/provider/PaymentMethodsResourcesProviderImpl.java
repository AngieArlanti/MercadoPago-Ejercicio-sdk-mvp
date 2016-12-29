package com.mercadolibre.marlanti.px_android_mvp.sample.provider;

import android.content.Context;

import com.mercadolibre.marlanti.px_android_mvp.R;
import com.mercadolibre.marlanti.px_android_mvp.mvp.OnResourcesRetrievedCallback;

import com.mercadolibre.marlanti.px_android_mvp.sample.interfaces.PaymentMethodsResourcesProvider;
import com.mercadopago.callbacks.Callback;
import com.mercadopago.core.MercadoPago;
import com.mercadopago.model.ApiException;
import com.mercadopago.model.PaymentMethod;

import java.util.List;

/**
 * Created by marlanti on 12/27/16.
 */

public class PaymentMethodsResourcesProviderImpl implements PaymentMethodsResourcesProvider {

    private Context mContext;

    public PaymentMethodsResourcesProviderImpl(Context mContext) {
        this.mContext = mContext;
    }

    public void getPaymentMethods(final OnResourcesRetrievedCallback listener) {

        MercadoPago mercadoPago = new MercadoPago.Builder()
                .setContext(mContext)
                .setPublicKey("444a9ef5-8a6b-429f-abdf-587639155d88")
                .build();

        mercadoPago.getPaymentMethods(new Callback <List<PaymentMethod>>() {
            @Override
            public void success(List<PaymentMethod> paymentMethods) {
                listener.onSuccess(paymentMethods);
            }

            @Override
            public void failure(ApiException error)
            {
                listener.onFailure();
            }
        });


    }



    public String getConnectionErrorMessage() {
        return mContext.getResources().getString(R.string.error_connection);
    }

}
