package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BantuanAkunToko extends AppCompatActivity {

    RecyclerView rcv;
    CustomBantuanAkunAdapter adapter;
    List<CustomBantuanAkun> bantuanAkunList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan_akun_toko);

        loadRcv();
        isiData();
    }

    public void loadRcv(){
        rcv = findViewById(R.id.rcvIsiBantuanAkun);
        rcv.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        bantuanAkunList = new ArrayList<CustomBantuanAkun>();
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu akun?", "Akun adalah isi profile pemilik"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu akun?", "Akun adalah isi profile pemilik"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu akun?", "Akun adalah isi profile pemilik"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu akun?", "Akun adalah isi profile pemilik"));

        adapter = new CustomBantuanAkunAdapter(this,bantuanAkunList);
        rcv.setAdapter(adapter);
    }
}