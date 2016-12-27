package com.mercadolibre.marlanti.px_android_mvp.mvp;

import java.lang.ref.WeakReference;

/**
 * Created by marlanti on 12/21/16.
 */

public abstract class Presenter <V extends View, I extends Interactor >{

    private WeakReference<V> mView;
    private  I interactor;

    protected void  attachView(final V view){
        this.mView = new WeakReference<>(view);
    }

    protected void attachInteractor(final I interactor){
        this.interactor = interactor;
    }

    public boolean isViewAttached() {
        return mView != null && mView.get() != null;
    }

    public V getView() {
        return mView == null ? null : mView.get();
    }

    public I getInteractor(){
        return interactor;
    }


}
