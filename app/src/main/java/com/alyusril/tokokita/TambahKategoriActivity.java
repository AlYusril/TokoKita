package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TambahKategoriActivity extends AppCompatActivity {

    TextView tvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_kategori);

        load();
        ambilData();
    }
    public void load(){
        tvMenu = findViewById(R.id.tvMenuJualan);
    }

    public void ambilData(){
        String ambil = getIntent().getStringExtra("ISI");
        tvMenu.setText(ambil);
    }

    public void btnTambahKategori2(View view) {
        Intent intent = new Intent(TambahKategoriActivity.this, MasukkanKategoriActivity.class);
        startActivity(intent);
    }
}