package com.homework06.lnwshop;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.homework06.lnwshop.fragment.ProductDialogFragment;

public class ProductActivity extends AppCompatActivity {

    LinearLayout addItemLayout;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        addItemLayout = (LinearLayout) findViewById(R.id.addItemLayout);
        addItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.getItem(0).setIcon(ContextCompat.getDrawable(ProductActivity.this, R.drawable.ic_cart_item_menu));
                FragmentManager fragmentManager = getFragmentManager();
                ProductDialogFragment dialogFragment = new ProductDialogFragment();
                dialogFragment.show(fragmentManager, "ProductDialog");
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Eloop E13");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cart_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else if (item.getItemId() == R.id.cartMenu) {
            openActivity(CartActivity.class);
        }
        return super.onOptionsItemSelected(item);
    }

    private void openActivity(Class destinationClass) {
        Intent intent = new Intent(this, destinationClass);
        startActivity(intent);
    }
}
