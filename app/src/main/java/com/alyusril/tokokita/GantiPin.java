package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GantiPin extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganti_pin);

        load();
    }

    public void load(){
        btnBack = findViewById(R.id.btnBackBantuanPJ);
    }

    public void backSetBisnis(View view) {
        onBackPressed();
    }
}