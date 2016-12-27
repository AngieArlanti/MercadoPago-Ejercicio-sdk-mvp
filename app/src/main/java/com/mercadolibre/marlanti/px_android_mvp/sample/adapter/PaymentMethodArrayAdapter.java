package com.mercadolibre.marlanti.px_android_mvp.sample.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.mercadolibre.marlanti.px_android_mvp.R;
import com.mercadopago.model.PaymentMethod;
import com.mercadopago.util.MercadoPagoUtil;

import java.util.List;

/**
 * Created by Angie on 2/12/2016.
 */
public class PaymentMethodArrayAdapter extends ArrayAdapter<PaymentMethod> {

    private final Activity context;
    private final List<PaymentMethod> objects;

    public PaymentMethodArrayAdapter(Activity context, List<PaymentMethod> objects) {

        super(context, R.layout.list_view_item_payment_methods, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_view_item_payment_methods, parent, false);
        LinearLayout layout = (LinearLayout) rowView.findViewById(R.id.step2_item_layout);
        PaymentMethod pm = objects.get(position);



            ImageView imageView = (ImageView) rowView.findViewById(R.id.step2_icon);

            int imageId = MercadoPagoUtil.getPaymentMethodIcon(context,pm.getId());

            imageView.setImageResource(imageId);



            TextView nameTextView = (TextView)rowView.findViewById(R.id.step2_name);
            nameTextView.setText(pm.getName());


        return rowView;
    }


}
