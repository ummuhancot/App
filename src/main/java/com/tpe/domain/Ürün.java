package com.tpe.domain;
/*
* Bir kıyafet ürünü için kullanabileceğiniz alanlar (fields) şunlardır:

### Temel Alanlar:
1. **Ürün Adı (Product Name)**: Ürünün adı. Örn: "Klasik Beyaz Gömlek"
2. **Ürün Kodu (Product Code)**: Stok takibi ve benzersizlik için özel kod. Örn: "BG-2024-001"
3. **Kategori (Category)**: Ürünün hangi kategoride yer aldığı. Örn: "Kadın Gömlek", "Erkek Pantolon".
4. **Fiyat (Price)**: Ürünün satış fiyatı. Örn: "499.99 TL"
5. **Para Birimi (Currency)**: Fiyatın hangi para biriminde olduğu. Örn: "TL", "USD".
*/
public class Ürün {

    private String ÜrünAdı;
    private String ÜrünKodu;
    private String Kategori;
    private String Fiyat;
    private String ParaBirimi;

    private ÜrünTeknikAlanı ürünTeknikAlanı;
    private ÜrünÖzellikleri ürünÖzellikleri;


    public ÜrünTeknikAlanı getÜrünTeknikAlanı() {
        return ürünTeknikAlanı;
    }

    public void setÜrünTeknikAlanı(ÜrünTeknikAlanı ürünTeknikAlanı) {
        this.ürünTeknikAlanı = ürünTeknikAlanı;
    }

    public ÜrünÖzellikleri getÜrünÖzellikleri() {
        return ürünÖzellikleri;
    }

    public void setÜrünÖzellikleri(ÜrünÖzellikleri ürünÖzellikleri) {
        this.ürünÖzellikleri = ürünÖzellikleri;
    }


    public Ürün() {
    }

    public Ürün(String ürünAdı, String ürünKodu, String kategori, String fiyat, String paraBirimi) {
        this.ÜrünAdı = ürünAdı;
        this.ÜrünKodu = ürünKodu;
        this.Kategori = kategori;
        this.Fiyat = fiyat;
        this.ParaBirimi = paraBirimi;
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

    public String getFiyat() {
        return Fiyat;
    }

    public void setFiyat(String fiyat) {
        Fiyat = fiyat;
    }

    public String getParaBirimi() {
        return ParaBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        ParaBirimi = paraBirimi;
    }

    @Override
    public String toString() {
        return "Ürün{" +
                "ÜrünAdı='" + ÜrünAdı + '\'' +
                ", ÜrünKodu='" + ÜrünKodu + '\'' +
                ", Kategori='" + Kategori + '\'' +
                ", Fiyat='" + Fiyat + '\'' +
                ", ParaBirimi='" + ParaBirimi + '\'' +
                '}';
    }
}
