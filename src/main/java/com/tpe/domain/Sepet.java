package com.tpe.domain;
/*Sepet İşlemleri:
Sepete Eklenen Miktar (Cart Quantity): Kullanıcının sepete eklediği ürün miktarı.

Örn: 2 adet "Klasik Beyaz Gömlek".
Sepet ID (Cart ID): Sepeti benzersiz şekilde tanımlayan ID.

Örn: Kullanıcının farklı sepet oturumlarını izlemek için kullanılabilir.*/
public class Sepet {

    private Integer sepetID;
    private int sepetEklenenMiktar;

    private Satış satış;
    private Kargo kargo;


    public Sepet() {
    }

    public Sepet(Integer sepetID, int sepetEklenenMiktar) {
        this.sepetID = sepetID;
        this.sepetEklenenMiktar = sepetEklenenMiktar;
    }

    public Integer getSepetID() {
        return sepetID;
    }

    public void setSepetID(Integer sepetID) {
        this.sepetID = sepetID;
    }

    public int getSepetEklenenMiktar() {
        return sepetEklenenMiktar;
    }

    public void setSepetEklenenMiktar(Integer sepetEklenenMiktar) {
        this.sepetEklenenMiktar = sepetEklenenMiktar;
    }

    public Satış getSatış() {
        return satış;
    }

    public void setSatış(Satış satış) {
        this.satış = satış;
    }

    public Kargo getKargo() {
        return kargo;
    }

    public void setKargo(Kargo kargo) {
        this.kargo = kargo;
    }

    @Override
    public String toString() {
        return "Sepet{" +
                "sepetID=" + sepetID +
                ", sepetEklenenMiktar=" + sepetEklenenMiktar +
                ", satış=" + satış +
                ", kargo=" + kargo +
                '}';
    }
}
