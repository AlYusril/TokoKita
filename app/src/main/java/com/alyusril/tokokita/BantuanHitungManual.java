package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class BantuanHitungManual extends AppCompatActivity {

    RecyclerView rcv;
    CustomBantuanAkunAdapter adapter;
    List<CustomBantuanAkun> bantuanAkunList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan_hitung_manual);
        loadRcv();
        isiData();
    }

    public void loadRcv(){
        rcv = findViewById(R.id.rcvHitungManual);
        rcv.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        bantuanAkunList = new ArrayList<CustomBantuanAkun>();
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara menggunakan kalkulator pada fitur hitung manual ?", "Pilih menu 'Hitung Manual' dihalaman awal lalu anda bisa langsung menggunakannya. Klik 'Simpan Transaksi' untuk memasukkan data ke laporan keuangan"));
        bantuanAkunList.add(new CustomBantuanAkun("Apakah hitung manual datanya akan tersimpan pada laporan ?", "Tentu saja!, transaksi pada hitung manual akan tersimpan di laporan anda hanya harus Klik 'Simpan Transaksi' ketika anda telah menggunakan fitur hitung manual untuk memasukkannya ke laporan keuangan"));


        adapter = new CustomBantuanAkunAdapter(this,bantuanAkunList);
        rcv.setAdapter(adapter);
    }

    public void backHitung(View view) {
        onBackPressed();
    }
}