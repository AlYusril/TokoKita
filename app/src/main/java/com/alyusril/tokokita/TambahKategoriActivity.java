package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TambahKategoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_kategori);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl_main, new KategoriFragment());
        ft.commit();

    }

    public void btnTambahKategori2(View view) {
        Intent intent = new Intent(TambahKategoriActivity.this, MasukkanKategoriActivity.class);
        startActivity(intent);
    }


}