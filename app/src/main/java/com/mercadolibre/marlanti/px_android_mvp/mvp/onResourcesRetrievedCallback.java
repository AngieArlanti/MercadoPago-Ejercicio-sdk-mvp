package com.mercadolibre.marlanti.px_android_mvp.mvp;


import java.util.List;



public interface OnResourcesRetrievedCallback {
    public <E> void  onSuccess(List<E> data);
    public void onFailure();
}
