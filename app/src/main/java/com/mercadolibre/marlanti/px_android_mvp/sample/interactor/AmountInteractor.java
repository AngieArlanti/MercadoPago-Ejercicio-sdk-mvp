package com.mercadolibre.marlanti.px_android_mvp.sample.interactor;

import android.content.Context;

import com.mercadolibre.marlanti.px_android_mvp.R;
import com.mercadolibre.marlanti.px_android_mvp.sample.manager.StringManager;
import com.mercadolibre.marlanti.px_android_mvp.mvp.Interactor;

/**
 * Created by marlanti on 12/22/16.
 */

public class AmountInteractor implements Interactor {

    private Context mContext;
    private StringManager stringManager;

    public AmountInteractor(final Context context) {
        this.mContext = context;
    }

    public String getInvalidAmountMessage(){
        return mContext.getResources().getString(R.string.error_invalid_amount);
    }

}
