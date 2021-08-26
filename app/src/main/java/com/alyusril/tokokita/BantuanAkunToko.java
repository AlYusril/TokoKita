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
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara melakukan registrasi pada aplikasi Toko Kita melalui form registrasi ?", "pada halaman awal aplikasi Toko Kita klik 'Daftar Sekarang! > isi formulir sesuai data yang diminta > klik 'Daftar'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara melakukan registrasi pada aplikasi Toko Kita melalui social media ?", "Pada halaman awal aplikasi Toko Kita klik social media yang diinginkan akun fb atau google > pilih akun yang akan didaftarkan > isi formulir sesuai data yang diminta > klik 'konfirmasi' lalu klik 'OK'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara melakukan Log in pada aplikasi Toko Kita ?", "Masukkan Email/no. Telp yang terdaftar beserta PIN > lalu klik 'Masuk'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengganti foto pada profile saya", "klik ikon pengaturan yang berada pada pojok kanan atas beranda > klik 'Ubah Profile toko' > Klik pada gambar yang ditampilkan > pilih gambar yang ingin dijadikan foto profil bisa melalui camera atau galeri > lalu klik 'perbaharui Profile' dan klik 'OK'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengganti nama usaha pada profile saya ?", "Klik ikon pengaturan yang berada di pojok kanan atas beranda > klik 'Ubah Profile Toko' > Ubah nama usaha sesuai yang diinginkan > Lalu klik 'perbaharui profile' dan klik 'OK'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengganti no handphone pada profile saya ?", "Klik ikon pengaturan yang berada di pojok kanan atas beranda > klik 'Ubah Profile Toko' > Ganti no handphone sesuai yang diinginkan > lalu klik 'Perbaharui profile' dan klik 'Ok'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengganti email pada profil saya ?", "klik ikon pengaturan yang berada di pojok kanan atas beranda > klik 'Ubah Profile Toko' > ganti email sesuai yang diinginkan > lalu klik 'Perbaharui profile' dan klik 'Ok'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengganti PIN pada akun saya ?", "klik ikon pengaturan yang berada di pojok kanan atas beranda > klik 'Ganti PIN' > Masukan PIN lama dan ganti dengan PIN Baru > klik 'Ganti PIN' dan Klik 'Ok'"));
        bantuanAkunList.add(new CustomBantuanAkun("Bagaimana cara mengatur integrasi akun Toko Kita ?", "jika anda sudah memiliki akun QRen di perangkat yang sama dengan email pendaftaran yang sama, maka otomatis akun Toko Kita POS & QRen anda akan terintegrasi."));

        adapter = new CustomBantuanAkunAdapter(this,bantuanAkunList);
        rcv.setAdapter(adapter);
    }
}