package com.luisdeveloper.spotifydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class radio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
