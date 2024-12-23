package com.tpe.domain;
/*Kargo İşlemleri:
Kargo Durumu (Shipping Status): Ürünün kargo süreciyle ilgili durumu.

Örn: "Hazırlanıyor", "Kargoya Verildi", "Teslim Edildi".
Kargo Ücreti (Shipping Fee): Ürünün kargo maliyeti.

Örn: "20.00 TL".
Teslimat Süresi (Delivery Time): Kargonun tahmini teslim süresi.

Örn: "3-5 iş günü".
Kargo Takip Numarası (Tracking Number): Kargo şirketi tarafından sağlanan takip numarası.

Örn: "1234567890ABC".*/
public class Kargo {

    private String kargoTakipNo;
    private String teslimatSüresi;
    private String kargoUcreti;
    private String yurtici;
    private String yurtdısı;
    private String kargoDurumu;


    public Kargo() {
    }

    public Kargo(String kargoTakipNo, String teslimatSüresi, String kargoUcreti, String yurtici, String yurtdısı, String kargoDurumu) {
        this.kargoTakipNo = kargoTakipNo;
        this.teslimatSüresi = teslimatSüresi;
        this.kargoUcreti = kargoUcreti;
        this.yurtici = yurtici;
        this.yurtdısı = yurtdısı;
        this.kargoDurumu = kargoDurumu;
    }

    public String getKargoTakipNo() {
        return kargoTakipNo;
    }

    public void setKargoTakipNo(String kargoTakipNo) {
        this.kargoTakipNo = kargoTakipNo;
    }

    public String getTeslimatSüresi() {
        return teslimatSüresi;
    }

    public void setTeslimatSüresi(String teslimatSüresi) {
        this.teslimatSüresi = teslimatSüresi;
    }

    public String getKargoUcreti() {
        return kargoUcreti;
    }

    public void setKargoUcreti(String kargoUcreti) {
        this.kargoUcreti = kargoUcreti;
    }

    public String getYurtici() {
        return yurtici;
    }

    public void setYurtici(String yurtici) {
        this.yurtici = yurtici;
    }

    public String getYurtdısı() {
        return yurtdısı;
    }

    public void setYurtdısı(String yurtdısı) {
        this.yurtdısı = yurtdısı;
    }

    public String getKargoDurumu() {
        return kargoDurumu;
    }

    public void setKargoDurumu(String kargoDurumu) {
        this.kargoDurumu = kargoDurumu;
    }

    @Override
    public String toString() {
        return "Kargo{" +
                "kargoTakipNo='" + kargoTakipNo + '\'' +
                ", teslimatSüresi='" + teslimatSüresi + '\'' +
                ", kargoUcreti='" + kargoUcreti + '\'' +
                ", yurtici='" + yurtici + '\'' +
                ", yurtdısı='" + yurtdısı + '\'' +
                ", kargoDurumu='" + kargoDurumu + '\'' +
                '}';
    }
}
