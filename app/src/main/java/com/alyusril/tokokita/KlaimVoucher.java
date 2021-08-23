package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class KlaimVoucher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klaim_voucher);
    }

    public void backKlaim(View view) {
        onBackPressed();
    }
}