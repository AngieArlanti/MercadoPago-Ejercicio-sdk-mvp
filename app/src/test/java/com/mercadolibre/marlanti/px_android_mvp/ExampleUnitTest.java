package com.mercadolibre.marlanti.px_android_mvp;

import com.mercadolibre.marlanti.px_android_mvp.sample.presenter.PaymentMethodsPresenter;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.PaymentMethodsView;
import com.mercadopago.model.PaymentMethod;

import org.junit.Test;

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
        presenter.attachInteractor(new MockedInteractor());

        assertTrue(mockedView.paymentMethods.size() == 5);

    }


    private class MockedView implements PaymentMethodsView<PaymentMethod> {

        public List<PaymentMethod> paymentMethods;

        @Override
        public void showPaymentMethodsList(List<PaymentMethod> data) {
            paymentMethods = data;
        }

        @Override
        public void showError(String message) {

        }
    }

    private class MockedInteractor implements PaymentMethodsInteractor {
        public void getPaymentMethods(Ca) {
            return sarasa;
        }
    }
}