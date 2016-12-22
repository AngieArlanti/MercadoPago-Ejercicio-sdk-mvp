package com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.view.PaymentMethodsView;

public class PaymentMethodsActivity extends AppCompatActivity /*implements PaymentMethodsView*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_methods_activity);


    }
}
