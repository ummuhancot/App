package com.tpe.domain;
/*Satış İşlemleri:
Satış Tarihi (Sale Date): Ürünün satış işleminin gerçekleştiği tarih.

Örn: "23.12.2024".
Satış Durumu (Sale Status): Ürünün satışa dair durumu.

Örn: "Tamamlandı", "İade Edildi".
Ödeme Yöntemi (Payment Method): Kullanıcının ürünü satın alırken kullandığı ödeme yöntemi.

Örn: "Kredi Kartı", "Kapıda Ödeme", "Havale".
Toplam Satış Tutarı (Total Sale Amount): Ürünün toplam satış bedeli (kargo dahil).

Örn: "519.99 TL".
Fatura Bilgileri (Invoice Info): Satış işleminin fatura bilgileri.

Örn: "Ad: Ahmet Yılmaz, Vergi Numarası: 1234567890".*/
public class Satış {

    private String tarih;
    private String satisDurumu;
    private String Tamamlandı;
    private String krediCart;
    private String kapıdaOdeme;
    private String faturaBilgileri;

    public Satış() {
    }

    public Satış(String tarih, String satisDurumu, String tamamlandı, String krediCart, String kapıdaOdeme, String faturaBilgileri) {
        this.tarih = tarih;
        this.satisDurumu = satisDurumu;
        Tamamlandı = tamamlandı;
        this.krediCart = krediCart;
        this.kapıdaOdeme = kapıdaOdeme;
        this.faturaBilgileri = faturaBilgileri;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSatisDurumu() {
        return satisDurumu;
    }

    public void setSatisDurumu(String satisDurumu) {
        this.satisDurumu = satisDurumu;
    }

    public String getTamamlandı() {
        return Tamamlandı;
    }

    public void setTamamlandı(String tamamlandı) {
        Tamamlandı = tamamlandı;
    }

    public String getKrediCart() {
        return krediCart;
    }

    public void setKrediCart(String krediCart) {
        this.krediCart = krediCart;
    }

    public String getKapıdaOdeme() {
        return kapıdaOdeme;
    }

    public void setKapıdaOdeme(String kapıdaOdeme) {
        this.kapıdaOdeme = kapıdaOdeme;
    }

    public String getFaturaBilgileri() {
        return faturaBilgileri;
    }

    public void setFaturaBilgileri(String faturaBilgileri) {
        this.faturaBilgileri = faturaBilgileri;
    }

    @Override
    public String toString() {
        return "Satış{" +
                "tarih='" + tarih + '\'' +
                ", satisDurumu='" + satisDurumu + '\'' +
                ", Tamamlandı='" + Tamamlandı + '\'' +
                ", krediCart='" + krediCart + '\'' +
                ", kapıdaOdeme='" + kapıdaOdeme + '\'' +
                ", faturaBilgileri='" + faturaBilgileri + '\'' +
                '}';
    }
}
