package com.mercadolibre.marlanti.px_android_mvp.sample.presenter;

import com.mercadolibre.marlanti.px_android_mvp.mvp.DataSubscriber;
import com.mercadolibre.marlanti.px_android_mvp.mvp.Presenter;
import com.mercadolibre.marlanti.px_android_mvp.sample.interactor.PaymentMethodsInteractor;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.PaymentMethodsView;

import java.util.List;

/**
 * Created by marlanti on 12/21/16.
 */

public class PaymentMethodsPresenter extends Presenter implements DataSubscriber{




    public void attachView(PaymentMethodsView mView){
        super.attachView(mView);
    }

    public void attachInteractor(PaymentMethodsInteractor interactor){
        super.attachInteractor(interactor);
    }

    public PaymentMethodsView getView(){
        return (PaymentMethodsView) super.getView();
    }

    public PaymentMethodsInteractor getInteractor(){
        return (PaymentMethodsInteractor) super.getInteractor();
    }

    @Override
    public <E> void onSuccess(List<E> data) {
        getView().showPaymentMethodsList(data);
    }

    @Override
    public void onFailure() {
        getView().showError(getInteractor().getConnectionErrorMessage());

    }

    public void onCreate(){
        getInteractor().getData(this);
    }

}
