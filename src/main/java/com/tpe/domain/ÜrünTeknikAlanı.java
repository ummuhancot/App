package com.tpe.domain;
/*### Teknik Alanlar:
12. **Stok Durumu (Stock Status)**: Ürünün stokta olup olmadığı. Örn: "Stokta Var", "Tükendi".
13. **Barkod Numarası (Barcode)**: Ürün için benzersiz barkod.
14. **SKU (Stok Birim Kodu)**: Depo takibi için benzersiz stok birim kodu.
15. **Üretici (Manufacturer)**: Ürünün üreticisi veya markası.
16. **Menşei (Origin)**: Ürünün üretildiği ülke.*/
public class ÜrünTeknikAlanı {

    private String stokDurumu;
    private String barkodNumarası;
    private String stokBirimKodu;
    private String uretici;
    private String menşei;

    public ÜrünTeknikAlanı() {
    }

    public ÜrünTeknikAlanı(String stokDurumu, String barkodNumarası, String stokBirimKodu, String uretici, String menşei) {
        this.stokDurumu = stokDurumu;
        this.barkodNumarası = barkodNumarası;
        this.stokBirimKodu = stokBirimKodu;
        this.uretici = uretici;
        this.menşei = menşei;
    }

    public String getStokDurumu() {
        return stokDurumu;
    }

    public void setStokDurumu(String stokDurumu) {
        this.stokDurumu = stokDurumu;
    }

    public String getBarkodNumarası() {
        return barkodNumarası;
    }

    public void setBarkodNumarası(String barkodNumarası) {
        this.barkodNumarası = barkodNumarası;
    }

    public String getStokBirimKodu() {
        return stokBirimKodu;
    }

    public void setStokBirimKodu(String stokBirimKodu) {
        this.stokBirimKodu = stokBirimKodu;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMenşei() {
        return menşei;
    }

    public void setMenşei(String menşei) {
        this.menşei = menşei;
    }

    @Override
    public String toString() {
        return "ÜrünTeknikAlanı{" +
                "stokDurumu='" + stokDurumu + '\'' +
                ", barkodNumarası='" + barkodNumarası + '\'' +
                ", stokBirimKodu='" + stokBirimKodu + '\'' +
                ", uretici='" + uretici + '\'' +
                ", menşei='" + menşei + '\'' +
                '}';
    }
}
