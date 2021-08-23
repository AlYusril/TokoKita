package com.alyusril.tokokita;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class BarangTerjual extends AppCompatActivity {

    private TabLayout tbLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_terjual);

        tbLayout = findViewById(R.id.tbLayout);
        viewPager = findViewById(R.id.viewpager);

        tbLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new ProdukLp(),"produk");
        vpAdapter.addFragment(new LoketBayarLp(),"Loket Bayar");
        viewPager.setAdapter(vpAdapter);
    }
}