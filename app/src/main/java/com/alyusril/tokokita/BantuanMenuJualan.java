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
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya menambahkan kategori produk ?", "Pada halaman beranda klik menu 'Produk' > klik 'Tambah Kategori' > ketik nama kategori sesuai yang diinginkan > klik 'Simpan'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya mengganti nama kategori produk ?", "pada Menu Jualan klik 'Ubah' yang berada diatas pojok kanan > pilih kategori yang ingin anda ubah namanya > klik ikon titik tiga > klik 'Ubah Kategori' > ketik nama kategori yang baru > klik 'Simpan'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya menambahkan produk Jualan saya ?", "pada Menu Jualan klik 'Ubah' yang berada diatas pojok kanan > pilih kategori yang ingin anda tambahkan produknya > klik 'Tambah Produk' > beri nama produk berikut dengan harga dan gambarnya > klik 'Simpan'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya mengganti gambar pada produk jualan saya ?", "pada Menu Jualan 'Ubah' yang berada diatas pojok kanan > pilih kategori yang ingin anda ganti gambar produknya > Klik pada logo kamera > pilih gambar yang anda inginkan bisa melalui kamera atau galeri > klik 'simpan'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya mengganti nama pada produk jualan saya ?", "Pada Menu Jualan klik 'Ubah' yang berada diatas pojok kanan > pilih kategori yang ingin anda ganti nama produknya > klik produk yang ingin diganti namanya > hapus nama lama dan tuliskan nama baru > klik 'simpan'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana saya mengganti harga pada produk jualan saya ?", "Pada Menu Jualan klik 'Ubah' yang berada diatas pojok kanan > pilih kategori yang ingin anda ganti harga produknya > klik produk yang ingin diganti harganya > hapus harga lama dan tuliskan harga baru > klik 'Simpan'"));
        bantuanAkunList.add(new CustomBantuanAkun("Apa saja pilihan metode bayar pada aplikasi Toko kita ?", "saat ini Toko Kita memiliki pembayaran melalui integrasi dengan QRen. anda cukup scan dan transaksi pun selesai, ini memudahkan bisnis anda. selain itu Toko Kita tentu bisa menerima metode bayar secara tunai."));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana jika saya ingin melakukan transaksi dengan QRen ?", "Sebelumnya anda perlu memiliki akun QRen pada aplikasi QRen, setelah anda memiliki akun QRen, maka ketika melakukan transaksi dan memilih metode pembayaran dengan QRen, maka otomatis akan dilarikan ke aplikasi QRen, Setelah Transaksi berhasil, transaksi akan tersimpan di laporan keuangan"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana jika saya belum memiliki akun QRen ?", "jika anda belum mempunyai akun QRen, anda perlu install terlebih dahulu aplikasi QRen kemudian lakukan registrasi akun."));
        bantuanAkunList.add(new CustomBantuanAkun("Berapa jumlah maksimal diskon yang bisa saya berikan ke pelanggan ?", "Jumlah maksimal diskon adalah 99%, sedangkan minimum diskon adalah 1%, jika terdapat desimal, maka nominal diskon akan dibulatkan ke bawah"));
        bantuanAkunList.add(new CustomBantuanAkun("Apakah bisa mengaktifkan diskon produk dan diskon transaksi sekaligus ?","Diskon produk adalah diskon yang berlaku spesifik ke satuan produk tertentu, sedangkan diskon transaksi adalah diskon yang berlaku pada total harga transaksi. diskon produk dan diskon transaksi dapat diterapkan sekaligus di Toko kita"));
        bantuanAkunList.add(new CustomBantuanAkun("Berapa maksimal pembeli bisa mencicil kasbon ?", "Toko Kita saat ini tidak ada fitur untuk mencicil pembayaran kasbon, melainkan pembeli membayar lunas kasbon setelah membayar uang muka"));


        adapter = new CustomBantuanAkunAdapter(this,bantuanAkunList);
        rcv.setAdapter(adapter);
    }

    public void backBantuanPJ(View view) {
        onBackPressed();
    }
}
