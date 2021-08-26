package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class BantuanLaporan extends AppCompatActivity {

    RecyclerView rcv;
    CustomBantuanAkunAdapter adapter;
    List<CustomBantuanAkun> bantuanAkunList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan_laporan);

        loadRcv();
        isiData();
    }

    public void loadRcv(){
        rcv = findViewById(R.id.rcvBantuanLaporan);
        rcv.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        bantuanAkunList = new ArrayList<CustomBantuanAkun>();
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara melihat laporan keuangan harian saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode Harian"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara melihat laporan keuangan mingguan saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode Mingguan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara melihat laporan keuangan bulanan saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode Bulanan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara membagikan laporan keuangan harian saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode harian lalu klik 'Bagikan' > tentukan kepada siapa anda ingin membagikan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara membagikan laporan keuangan mingguan saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode mingguan lalu klik 'Bagikan' > tentukan kepada siapa anda ingin membagikan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara membagikan laporan keuangan bulanan saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode bulanan lalu klik 'Bagikan' > tentukan kepada siapa anda ingin membagikan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengunduh laporan keuangan harian saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode harian lalu klik 'Unduh' > pilih format yang anda inginkan antara pdf atau excel"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengunduh laporan keuangan mingguan saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode mingguan lalu klik 'Unduh' > pilih format yang anda inginkan antara pdf atau excel"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengunduh laporan keuangan bulanan saya ?", "Pada halaman beranda klik 'Lihat Rincian' dibawah total pemasukan > pilih periode bulanan lalu klik 'Unduh' > pilih format yang anda inginkan antara pdf atau excel"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya dapat mengetahui laporan barang terjual harian saya ?", "Pada halaman awal pilih menu 'Laporan' > Klik Pilihan 'Barang terjual' > Pilih periode Harian"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya dapat mengetahui laporan barang terjual mingguan saya ?", "Pada halaman awal pilih menu 'Laporan' > Klik Pilihan 'Barang terjual' > Pilih periode Mingguan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya dapat mengetahui laporan barang terjual bulanan saya ?", "Pada halaman awal pilih menu 'Laporan' > Klik Pilihan 'Barang terjual' > Pilih periode Bulanan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara membagikan laporan barang terjual Harian saya ?", "Pada halaman awal pilih menu 'Laporan' > klik pilihan 'Barang Terjual' > Pilih periode Harian > Klik 'Bagikan' > Tentukan pada siapa anda akan membagikan lalu bagikan."));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara membagikan laporan barang terjual Mingguan saya ?", "Pada halaman awal pilih menu 'Laporan' > klik pilihan 'Barang Terjual' > Pilih periode Mingguan > Klik 'Bagikan' > Tentukan pada siapa anda akan membagikan lalu bagikan."));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara membagikan laporan barang terjual Bulanan saya ?", "Pada halaman awal pilih menu 'Laporan' > klik pilihan 'Barang Terjual' > Pilih periode Bulanan > Klik 'Bagikan' > Tentukan pada siapa anda akan membagikan lalu bagikan."));

        adapter = new CustomBantuanAkunAdapter(this,bantuanAkunList);
        rcv.setAdapter(adapter);
    }

    public void backBantuanLaporan(View view) {
        onBackPressed();
    }
}