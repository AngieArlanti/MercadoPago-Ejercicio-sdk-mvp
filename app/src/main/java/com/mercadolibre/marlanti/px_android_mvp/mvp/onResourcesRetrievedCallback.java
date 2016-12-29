package com.mercadolibre.marlanti.px_android_mvp.mvp;


import java.util.List;


/**
 * All ResourcesProvider implementations' methods containing api calls
 * SHOULD receive as @param an OnResourcesRetrievedCallback.
 *
 * See also {@link ResourcesProvider}
 */

public interface OnResourcesRetrievedCallback {
    public <E> void  onSuccess(List<E> data);
    public void onFailure();
}
