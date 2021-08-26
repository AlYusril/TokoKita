package com.alyusril.tokokita.modul;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName("ID")
    @Expose
    private Long id;
    @SerializedName("TGL")
    @Expose
    private String tgl;
    @SerializedName("MASUK")
    @Expose
    private Integer masuk;
    @SerializedName("KELUAR")
    @Expose
    private Integer keluar;
    @SerializedName("KETERANGAN_MASUK")
    @Expose
    private String keteranganMasuk;
    @SerializedName("KETERANGAN_KELUAR")
    @Expose
    private String keteranganKeluar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public Integer getMasuk() {
        return masuk;
    }

    public void setMasuk(Integer masuk) {
        this.masuk = masuk;
    }

    public Integer getKeluar() {
        return keluar;
    }

    public void setKeluar(Integer keluar) {
        this.keluar = keluar;
    }

    public String getKeteranganMasuk() {
        return keteranganMasuk;
    }

    public void setKeteranganMasuk(String keteranganMasuk) {
        this.keteranganMasuk = keteranganMasuk;
    }

    public String getKeteranganKeluar() {
        return keteranganKeluar;
    }

    public void setKeteranganKeluar(String keteranganKeluar) {
        this.keteranganKeluar = keteranganKeluar;
    }
}
