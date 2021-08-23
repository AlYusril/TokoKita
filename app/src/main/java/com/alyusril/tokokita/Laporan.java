package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Laporan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);
    }

    public void LapPenjualan(View view) {
        Intent intent = new Intent(Laporan.this, LaporanPenjualan.class);
        startActivity (intent);
    }

    public void cvBarangTerjual(View view) {
        Intent intent = new Intent(Laporan.this, BarangTerjual.class);
        startActivity (intent);
    }

    public void cvPalingLaris(View view) {
        Intent intent = new Intent(Laporan.this, PalingLaris.class);
        startActivity (intent);
    }

    public void cvKasbon(View view) {
        Intent intent = new Intent(Laporan.this, PalingLaris.class);
        startActivity (intent);
    }
}