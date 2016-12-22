package com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.view;

import java.math.BigDecimal;

/**
 * Created by marlanti on 12/22/16.
 */
public interface AmountView extends View {


    void startPaymentMethodsSelection(BigDecimal amount);
}
