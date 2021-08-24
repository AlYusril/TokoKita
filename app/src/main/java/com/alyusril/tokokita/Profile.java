package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Profile extends AppCompatActivity {

    Button btnBackProfile, btnKeluar, btnUbahProfile;
    CardView cvKelolaToko, cvGantiPin, cvUpgrade, cvBantuan;
    LinearLayout pilihToko;
//    private BottomSheetBehavior bottomSheetBehavior;
//    private BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        load();
        pilihan();
    }

    public void load(){
        // Button
        btnBackProfile = findViewById(R.id.btnBackBantuanPJ);
        btnKeluar = findViewById(R.id.btnKeluar);
        btnUbahProfile = findViewById(R.id.btnUbahProfile);
        // CardView
        cvKelolaToko = findViewById(R.id.cvKelolaToko);
        cvGantiPin = findViewById(R.id.cvGantiPin);
        cvUpgrade = findViewById(R.id.cvUpgradeAkun);
        cvBantuan = findViewById(R.id.cvBantuan);
        // LinearLayout
        pilihToko = findViewById(R.id.layToko);
    }

    public void backProfile(View view) {
        onBackPressed();
    }

    public void keluar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        onDestroy();
        return;
    }

    public void ubahProfile(View view) {
        Intent intent = new Intent(this, UbahProfile.class);
        startActivity(intent);
    }

//    Bagian Scroll
    public void pilihan(){
        pilihToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PilihTokoSheet pilihTokoSheet = new PilihTokoSheet();
                pilihTokoSheet.show(getSupportFragmentManager(), "contoh");
            }
        });
        cvKelolaToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, KelolaToko.class);
                startActivity(intent);
            }
        });
        cvGantiPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, GantiPin.class);
                startActivity(intent);
            }
        });
        cvUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, UpgradeAkun.class);
                startActivity(intent);
            }
        });

        cvBantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, BottomNav.class);
                intent.putExtra("layout","bantuan");
                startActivity(intent);
            }
        });
    }
}