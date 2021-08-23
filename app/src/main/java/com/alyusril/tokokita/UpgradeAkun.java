package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpgradeAkun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade_akun);
    }

    public void backVip(View view) {
        onBackPressed();
    }

    public void voucher(View view) {
        Intent intent = new Intent(this, KlaimVoucher.class);
        startActivity(intent);
    }
}