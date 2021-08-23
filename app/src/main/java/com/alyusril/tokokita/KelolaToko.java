package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KelolaToko extends AppCompatActivity {

    CardView cvDataPegawai, cvDataPelanggan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_toko);

        load();
        select();
    }

    public void load(){
        cvDataPegawai = findViewById(R.id.cvDataPegawai);
        cvDataPelanggan = findViewById(R.id.cvDatapelanggan);
    }

    // Pilihan
    public void select(){
        cvDataPegawai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KelolaToko.this, DataPegawai.class);
                startActivity(intent);
            }
        });
        cvDataPelanggan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KelolaToko.this, DataPelanggan.class);
                startActivity(intent);
            }
        });
    }
    public void backKelola(View view) {
        onBackPressed();
    }
}