package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DataPegawai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pegawai);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new IsiPegawaiFragment());
        ft.commit();
    }

    public void backPegawai(View view) {
        onBackPressed();
    }

    public void tambahPegawai(View view) {
        Intent intent = new Intent(this, TambahPegawai.class);
        startActivity(intent);
    }
}