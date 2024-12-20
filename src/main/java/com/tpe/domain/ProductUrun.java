package com.tpe.domain;

public class ProductUrun {

    private int id;
    private String ad;
    private String kategori;
    private double fiyat;
    private int stok;
    private String aciklama;

    // Yapıcı Metot
    public ProductUrun(int id, String ad, String kategori, double fiyat, int stok, String aciklama) {
        this.id = id;
        this.ad = ad;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stok = stok;
        this.aciklama = aciklama;
    }

    // Getter ve Setter Metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    // Stok Kontrolü
    public boolean stoktaVarMi() {
        return stok > 0;
    }

    public void stokAzalt(int miktar) {
        if (miktar <= stok) {
            stok -= miktar;
        } else {
            throw new IllegalArgumentException("Yetersiz stok!");
        }
    }
}