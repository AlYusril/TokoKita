package com.alyusril.tokokita;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class SimpanTransaksiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpan_transaksi);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new com.alyusril.tokokita.SimpanTransaksiFragment());
        ft.commit();


        SlidingUpPanelLayout layout = findViewById(R.id.slidingup);

        layout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                findViewById(R.id.tvSliding).setAlpha(3 - slideOffset);
                findViewById(R.id.tvSliding2).setAlpha(3 - slideOffset);

            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {

                if (newState == SlidingUpPanelLayout.PanelState.EXPANDED);

                else if (newState == SlidingUpPanelLayout.PanelState.COLLAPSED);

            }
        });

            }
    }
