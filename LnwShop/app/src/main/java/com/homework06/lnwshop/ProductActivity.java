package com.homework06.lnwshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.homework06.lnwshop.fragment.CartActivity;

public class ProductActivity extends AppCompatActivity {

    LinearLayout addItemLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        addItemLayout = (LinearLayout) findViewById(R.id.addItemLayout);
        addItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(CartActivity.class);
            }
        });
    }

    private void openActivity(Class destinationClass) {
        Intent intent = new Intent(this, destinationClass);
        startActivity(intent);
    }
}
