package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MasukkanKategoriActivity extends AppCompatActivity {
    
    EditText etSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masukkan_kategori);

        load();
    }
    public void load(){
        etSimpan = findViewById(R.id.etNamaKategori);
    }

    public void btnSimpan(View view) {
        String simpan = etSimpan.getText().toString();
        Intent intent = new Intent(this, TambahKategoriActivity.class);
        intent.putExtra("ISI", simpan);
        startActivity(intent);
    }
}