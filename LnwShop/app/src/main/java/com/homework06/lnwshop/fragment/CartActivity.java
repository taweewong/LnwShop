package com.homework06.lnwshop.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.homework06.lnwshop.PaymentSuccessActivity;
import com.homework06.lnwshop.R;

public class CartActivity extends AppCompatActivity {

    LinearLayout checkoutLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        checkoutLayout = (LinearLayout) findViewById(R.id.checkoutLayout);
        checkoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(PaymentSuccessActivity.class);
            }
        });
    }

    private void openActivity(Class destinationClass) {
        Intent intent = new Intent(this, destinationClass);
        startActivity(intent);
    }
}
