package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DataPelanggan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pelanggan);
    }

    public void backPelanggan(View view) {
        onBackPressed();
    }

    public void tambahPelanggan(View view) {
        Intent intent = new Intent(this, TambahPelanggan.class);
        startActivity(intent);
    }
}