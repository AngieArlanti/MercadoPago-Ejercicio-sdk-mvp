package com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.interactor;

import android.content.Context;

import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.R;
import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.manager.StringManager;

/**
 * Created by marlanti on 12/22/16.
 */

public class AmountInteractor {

    private Context mContext;
    private StringManager stringManager;

    public AmountInteractor(final Context context) {
        this.mContext = context;
    }

    public String getInvalidAmountMessage(){
        return mContext.getResources().getString(R.string.error_invalid_amount);
    }




}
