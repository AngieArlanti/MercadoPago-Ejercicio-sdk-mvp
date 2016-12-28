package com.mercadolibre.marlanti.px_android_mvp.mvp;

import java.lang.ref.WeakReference;

/**
 * Created by marlanti on 12/21/16.
 */

public abstract class Presenter<V extends View, R extends ResourcesProvider> {

    private WeakReference<V> mView;
    private R r;


    public void attachResourcesProvider(final R r){
        this.r = r;
    }

    public void attachView(V view) {
        this.mView = new WeakReference<>(view);
    }

    public boolean isViewAttached() {
        return mView != null && mView.get() != null;
    }

    public V getView() {
        return mView == null ? null : mView.get();
    }

    public R getResourcesProvider(){
        return r;
    }
}
