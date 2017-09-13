package com.mollie.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        setUpMoreButton();
        setUpPurchaseButton();
        setUpBackButton();
    }

    private void setUpMoreButton() {
        Button moreButton = (Button) findViewById(R.id.more_button);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpPurchaseButton() {
        Button moreButton = (Button) findViewById(R.id.purchase_button);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, PurchaseActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpBackButton() {
        Button backButton = (Button) findViewById(R.id.back_to_library_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });
    }
}
