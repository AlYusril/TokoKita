package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PelangganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelanggan);
    }

    public void btnTambahPelanggan(View view) {
        Intent intent = new Intent(PelangganActivity.this, TambahPelanggan.class);
        startActivity(intent);
    }
}