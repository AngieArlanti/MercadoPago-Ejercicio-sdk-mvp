package com.mercadolibre.marlanti.px_android_mvp.mvp;

import java.lang.ref.WeakReference;

/**
 * Base class for all Presenter implementations.
 */

public abstract class Presenter<V extends View, R extends ResourcesProvider> {

    private WeakReference<V> mView;
    private R resourcesProvider;


    public void attachResourcesProvider(final R resourcesProvider){
        this.resourcesProvider = resourcesProvider;
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
        return resourcesProvider;
    }
}
