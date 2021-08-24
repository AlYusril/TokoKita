package com.alyusril.tokokita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView bottomNav = findViewById(R.id.menu_bottom_nav);
        bottomNav.setOnItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnItemSelectedListener navListener = new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.btMenuJualan:
                            selectedFragment = new MenuJualanFragment();
                            break;
                        case R.id.btHitungManual:
                            selectedFragment = new MainKalkulatorFragment();
                            break;
                        case R.id.btLaporan:
                            selectedFragment = new LaporanFragment();
                            break;
                        case R.id.btBantuan:
                            selectedFragment = new BantuanFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedFragment).commit();

                    return true;
                }
            };
}