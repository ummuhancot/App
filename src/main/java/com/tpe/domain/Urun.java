package com.tpe.domain;
/*
* Bir kıyafet ürünü için kullanabileceğiniz alanlar (fields) şunlardır:

### Temel Alanlar:
1. **Urun Adı (Product Name)**: Ürünün adı. Örn: "Klasik Beyaz Gömlek"
2. **Urun Kodu (Product Code)**: Stok takibi ve benzersizlik için özel kod. Örn: "BG-2024-001"
3. **Kategori (Category)**: Ürünün hangi kategoride yer aldığı. Örn: "Kadın Gömlek", "Erkek Pantolon".
4. **Fiyat (Price)**: Ürünün satış fiyatı. Örn: "499.99 TL"
5. **Para Birimi (Currency)**: Fiyatın hangi para biriminde olduğu. Örn: "TL", "USD".
*/
public class Urun {

    public static int counter=1;
    private String ÜrünAdı;
    private String ÜrünKodu;
    private String Kategori;
    private Integer Fiyat;

    private UrunTeknikAlanı urunTeknikAlanı;
    private UrunOzellikleri urunOzellikleri;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Urun.counter = counter;
    }

    public UrunTeknikAlanı getUrunTeknikAlanı() {
        return urunTeknikAlanı;
    }

    public void setUrunTeknikAlanı(UrunTeknikAlanı urunTeknikAlanı) {
        this.urunTeknikAlanı = urunTeknikAlanı;
    }

    public UrunOzellikleri getUrunOzellikleri() {
        return urunOzellikleri;
    }

    public void setUrunOzellikleri(UrunOzellikleri urunOzellikleri) {
        this.urunOzellikleri = urunOzellikleri;
    }


    public Urun() {
    }


    public Urun(String ürünAdı, String kategori, Integer fiyat, UrunTeknikAlanı urunTeknikAlanı, UrunOzellikleri urunOzellikleri) {
        this.ÜrünAdı = ürünAdı;
        this.Kategori = kategori;
        this.Fiyat = fiyat;
        this.urunTeknikAlanı = urunTeknikAlanı;
        this.urunOzellikleri = urunOzellikleri;
        this.ÜrünKodu = "\uD83D\uDE08" + counter++;
    }

    public String getÜrünAdı() {
        return ÜrünAdı;
    }

    public void setÜrünAdı(String ürünAdı) {
        ÜrünAdı = ürünAdı;
    }

    public String getÜrünKodu() {
        return ÜrünKodu;
    }

    public void setÜrünKodu(String ürünKodu) {
        ÜrünKodu = ürünKodu;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public Integer getFiyat() {
        return Fiyat;
    }

    public void setFiyat(Integer fiyat) {
        Fiyat = fiyat;
    }



    @Override
    public String toString() {
        return "Urun{" +
                "UrunAdı='" + ÜrünAdı + '\'' +
                ", ÜrünKodu='" + ÜrünKodu + '\'' +
                ", Kategori='" + Kategori + '\'' +
                ", Fiyat='" + Fiyat + '\'' +
                '}';
    }
}
