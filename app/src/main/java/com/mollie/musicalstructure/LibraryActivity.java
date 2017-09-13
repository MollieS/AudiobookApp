package com.mollie.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        setUpSearchButton();
        setUpNowPlayingButton();
        setUpBrowseButton();
    }

    private void setUpSearchButton() {
        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpNowPlayingButton() {
        Button searchButton = (Button) findViewById(R.id.now_playing_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpBrowseButton() {
        Button searchButton = (Button) findViewById(R.id.browse_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        });
    }
}
