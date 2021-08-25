package com.alyusril.tokokita;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BantuanMenuJualan extends AppCompatActivity {
    RecyclerView rcv;
    CustomBantuanAkunAdapter adapter;
    List<CustomBantuanAkun> bantuanAkunList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan_menu_jualan);

        loadRcv();
        isiData();
    }

    public void loadRcv(){
        rcv = findViewById(R.id.rcvMenuJualan);
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

    public void backBantuanPJ(View view) {
        onBackPressed();
    }
}
