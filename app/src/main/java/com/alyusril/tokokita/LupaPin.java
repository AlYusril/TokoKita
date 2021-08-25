package com.alyusril.tokokita;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LupaPin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_pin);
    }

    public void backLupaPin(View view) {
        onBackPressed();
    }
}