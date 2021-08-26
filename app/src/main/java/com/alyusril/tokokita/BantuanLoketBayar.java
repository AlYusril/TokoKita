package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BantuanLoketBayar extends AppCompatActivity {

    RecyclerView rcv;
    CustomBantuanAkunAdapter adapter;
    List<CustomBantuanAkun> bantuanAkunList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan_loket_bayar);
        loadRcv();
        isiData();
    }

    public void loadRcv(){
        rcv = findViewById(R.id.rcvLoketBayar);
        rcv.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        bantuanAkunList = new ArrayList<CustomBantuanAkun>();
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa itu menu jualan?", "Menu jualan adalah isi dari produk kita"));

        adapter = new CustomBantuanAkunAdapter(this,bantuanAkunList);
        rcv.setAdapter(adapter);
    }
}