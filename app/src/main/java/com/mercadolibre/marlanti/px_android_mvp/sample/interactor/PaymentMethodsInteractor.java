package com.mercadolibre.marlanti.px_android_mvp.sample.interactor;

import android.content.Context;

import com.mercadolibre.marlanti.px_android_mvp.R;
import com.mercadolibre.marlanti.px_android_mvp.mvp.DataPublisher;
import com.mercadolibre.marlanti.px_android_mvp.mvp.DataSubscriber;
import com.mercadolibre.marlanti.px_android_mvp.mvp.Interactor;

import com.mercadopago.callbacks.Callback;
import com.mercadopago.core.MercadoPago;
import com.mercadopago.model.ApiException;
import com.mercadopago.model.PaymentMethod;

import java.util.List;

/**
 * Created by marlanti on 12/27/16.
 */

public class PaymentMethodsInteractor implements Interactor, DataPublisher {

    private Context mContext;

    public PaymentMethodsInteractor(Context mContext) {
        this.mContext = mContext;
    }

    @Override
        public void getData(final DataSubscriber listener) {

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
