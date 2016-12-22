package com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.interactor.AmountInteractor;
import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.presenter.AmountPresenter;
import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.utils.ActivityUtils;
import com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp.view.AmountView;

import java.math.BigDecimal;

public class AmountActivity extends AppCompatActivity implements AmountView {

    private final Button bAmount;
    private final EditText etAmount;
    private AmountPresenter mAmountPresenter;



    public AmountActivity() {
        bAmount = (Button) findViewById(R.id.amountButton);
        etAmount = (EditText) findViewById(R.id.amountEditText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);
        AmountInteractor interactor = new AmountInteractor(this);

        mAmountPresenter = new AmountPresenter(interactor);
        mAmountPresenter.attachView(this);

        bAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BigDecimal amount = getAmount();
                mAmountPresenter.informAmount(amount);
            }
        });
    }

    private void startPaymentMethodsActivity(BigDecimal amount) {
        Intent intent = new Intent(AmountActivity.this, PaymentMethodsActivity.class);
        intent.putExtra(ActivityUtils.EXTRA_AMOUNT, amount.toString());
        startActivityForResult(intent, ActivityUtils.USER_SELECTION_REQUEST_CODE);
    }

    private BigDecimal getAmount() {
        return new BigDecimal(etAmount.getText().toString());
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startPaymentMethodsSelection(BigDecimal amount) {
        startPaymentMethodsActivity(amount);
    }
}
