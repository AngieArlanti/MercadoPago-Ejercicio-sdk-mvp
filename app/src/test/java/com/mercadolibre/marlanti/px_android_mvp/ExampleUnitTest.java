package com.mercadolibre.marlanti.px_android_mvp;

import android.widget.ListView;


import com.mercadolibre.marlanti.px_android_mvp.mvp.OnResourcesRetrievedCallback;
import com.mercadolibre.marlanti.px_android_mvp.sample.interfaces.PaymentMethodsResourcesProvider;
import com.mercadolibre.marlanti.px_android_mvp.sample.presenter.PaymentMethodsPresenter;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.PaymentMethodsView;
import com.mercadopago.model.PaymentMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void ifPaymentMethodPresenterCreatedGetPaymentMethods() throws Exception {

        PaymentMethodsPresenter presenter = new PaymentMethodsPresenter();
        MockedView mockedView = new MockedView();

        presenter.attachView(mockedView);
        presenter.attachResourcesProvider(new MockedResourcesProvider());

        presenter.onCreate();

        assertTrue(mockedView.paymentMethods.size() == 2);

    }


    private class MockedView implements PaymentMethodsView<PaymentMethod> {

        public List<PaymentMethod> paymentMethods;

        @Override
        public void showPaymentMethodsList(List<PaymentMethod> data) {

            paymentMethods = data;
        }

        @Override
        public void showError(String message) {
            System.out.println(message);
        }
    }

    private class MockedResourcesProvider implements PaymentMethodsResourcesProvider {

        @Override
        public void getPaymentMethods(OnResourcesRetrievedCallback listener) {

            List<PaymentMethod> list = new ArrayList<>();
            list.add(new PaymentMethod());
            list.add(new PaymentMethod());

            listener.onSuccess(list);
        }

        @Override
        public String getConnectionErrorMessage() {
            return "Error de conexion";
        }
    }
}




