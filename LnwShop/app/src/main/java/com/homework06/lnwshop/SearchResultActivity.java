package com.homework06.lnwshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class SearchResultActivity extends AppCompatActivity {

    LinearLayout itemLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        itemLayout = (LinearLayout) findViewById(R.id.itemLayout);
        itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(ProductActivity.class);
            }
        });
    }

    private void openActivity(Class destinationClass) {
        Intent intent = new Intent(this, destinationClass);
        startActivity(intent);
    }
}
