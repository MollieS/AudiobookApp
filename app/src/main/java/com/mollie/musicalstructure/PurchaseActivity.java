package com.mollie.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        setUpBackButton();
    }

    private void setUpBackButton() {
        Button backButton = (Button) findViewById(R.id.back_to_library_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PurchaseActivity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });
    }
}
