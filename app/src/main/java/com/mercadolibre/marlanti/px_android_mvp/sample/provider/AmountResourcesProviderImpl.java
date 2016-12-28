package com.mercadolibre.marlanti.px_android_mvp.sample.provider;

import android.content.Context;

import com.mercadolibre.marlanti.px_android_mvp.R;
import com.mercadolibre.marlanti.px_android_mvp.sample.interfaces.AmountResourcesProvider;
import com.mercadolibre.marlanti.px_android_mvp.sample.manager.StringManager;

/**
 * Created by marlanti on 12/22/16.
 */

public class AmountResourcesProviderImpl implements AmountResourcesProvider {

    private Context mContext;
    private StringManager stringManager;

    public AmountResourcesProviderImpl(final Context context) {
        this.mContext = context;
    }

    public String getInvalidAmountMessage(){
        return mContext.getResources().getString(R.string.error_invalid_amount);
    }

}
