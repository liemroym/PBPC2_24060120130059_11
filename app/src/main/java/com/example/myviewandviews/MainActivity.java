package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Arduino UNO");
        }

        // Inisialisasi onClickListener untuk button yang ada
        Button callCsBtn = findViewById(R.id.dial_cs_btn);
        Button buyBtn = findViewById(R.id.buy_btn);

        callCsBtn.setOnClickListener(this);
        buyBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dial_cs_btn:
                String phoneNumber = "08214166739";
                Intent dialCSIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialCSIntent);
                break;
            case R.id.buy_btn:
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(buyIntent);
                break;
        }
    }
}