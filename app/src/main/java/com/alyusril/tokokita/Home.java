package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    private CardView laporan, menuJualan, bantuan, hitungManual;
    private Button rincian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        load();
        select();
    }

    public void load(){

        laporan = findViewById(R.id.cvLaporan);
        menuJualan = findViewById(R.id.cvMenuJualan);
        rincian = findViewById(R.id.rincian);
        bantuan = findViewById(R.id.cvBantuan);
        hitungManual = findViewById(R.id.cvHitungManual);

    }

    public void profile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void select(){

        hitungManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, BottomNav.class);
                startActivity(intent);
            }
        });

        menuJualan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, BottomNav.class);
                startActivity(intent);
            }
        });
        rincian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, LaporanPenjualan.class);
                startActivity(intent);
            }
        });
        laporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, BottomNav.class);
                startActivity(intent);
            }
        });
        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, BottomNav.class);
                startActivity(intent);
            }
        });
    }
}