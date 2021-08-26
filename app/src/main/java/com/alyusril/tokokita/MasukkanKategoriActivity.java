package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MasukkanKategoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masukkan_kategori);


    }


    public void btnTambahKategori(View view) {
        Intent intent = new Intent(MasukkanKategoriActivity.this, TambahKategoriActivity.class);
        startActivity(intent);
    }
}