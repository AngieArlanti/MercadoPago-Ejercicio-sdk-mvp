package com.mercadolibre.marlanti.mercadopago_ejercicio_sdk_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AmountActivity extends AppCompatActivity {

    private final Button bAmount;
    private final EditText etAmount;
    private String amount;

    public AmountActivity() {
        bAmount = (Button) findViewById(R.id.amountButton);
        etAmount = (EditText) findViewById(R.id.amountEditText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);
        
        bAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getAmount()) {
                    startPaymentMethodsActivity();
                }
            }
        });
    }

    private boolean validateAmount(){
        return true;
    }

    private void startPaymentMethodsActivity(){

    }

    private boolean getAmount(){

        if(validateAmount()){
            amount = etAmount.getText().toString();
            return true;
        }
        return false;

    }

}
