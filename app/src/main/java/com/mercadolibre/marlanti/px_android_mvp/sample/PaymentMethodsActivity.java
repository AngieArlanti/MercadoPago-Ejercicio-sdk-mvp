package com.mercadolibre.marlanti.px_android_mvp.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;


import com.mercadolibre.marlanti.px_android_mvp.R;
import com.mercadolibre.marlanti.px_android_mvp.sample.adapter.PaymentMethodArrayAdapter;
import com.mercadolibre.marlanti.px_android_mvp.sample.provider.PaymentMethodsResourcesProviderImpl;
import com.mercadolibre.marlanti.px_android_mvp.sample.presenter.PaymentMethodsPresenterImpl;
import com.mercadolibre.marlanti.px_android_mvp.sample.utils.ActivityUtils;
import com.mercadolibre.marlanti.px_android_mvp.sample.view.PaymentMethodsView;

import java.util.List;

public class PaymentMethodsActivity extends AppCompatActivity implements PaymentMethodsView {

    private PaymentMethodsPresenterImpl mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_methods_activity);


        String amount = getIntent().getStringExtra(ActivityUtils.EXTRA_AMOUNT);


        mPresenter = new PaymentMethodsPresenterImpl();
        mPresenter.attachView(this);

        PaymentMethodsResourcesProviderImpl resourcesProvider = new PaymentMethodsResourcesProviderImpl(this);
        mPresenter.attachResourcesProvider(resourcesProvider);
        mPresenter.onCreate();

    }



    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showPaymentMethodsList(List data) {
        ListView list = (ListView) findViewById(R.id.step2_listView);
        PaymentMethodArrayAdapter adapter = new PaymentMethodArrayAdapter(this,data);

        adapter.notifyDataSetChanged();

        list.setAdapter(adapter);
    }
}
