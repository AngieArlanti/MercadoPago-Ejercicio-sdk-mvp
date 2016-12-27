package com.mercadolibre.marlanti.px_android_mvp.mvp;


import java.util.List;

/**
 * Created by marlanti on 12/27/16.
 */

public interface DataSubscriber {
    public <E> void  onSuccess(List<E> data);
    public void onFailure();
}
