package com.mercadolibre.marlanti.px_android_mvp.mvp;

/**
 * Created by marlanti on 12/27/16.
 */

public interface DataPublisher {

    public void getData(final DataSubscriber listener);
}
