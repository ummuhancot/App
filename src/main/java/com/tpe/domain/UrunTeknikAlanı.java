package com.tpe.domain;
/*### Teknik Alanlar:
12. **Stok Durumu (Stock Status)**: Ürünün stokta olup olmadığı. Örn: "Stokta Var", "Tükendi".
13. **Barkod Numarası (Barcode)**: Ürün için benzersiz barkod.
14. **SKU (Stok Birim Kodu)**: Depo takibi için benzersiz stok birim kodu.
15. **Üretici (Manufacturer)**: Ürünün üreticisi veya markası.
16. **Menşei (Origin)**: Ürünün üretildiği ülke.*/
public class UrunTeknikAlanı {

    private int stokDurumu;
    private String uretici;


    public UrunTeknikAlanı() {
    }

    public UrunTeknikAlanı(int stokDurumu, String uretici) {
        this.stokDurumu = stokDurumu;
        this.uretici = uretici;
    }

    public int getStokDurumu() {
        return stokDurumu;
    }

    public void setStokDurumu(int stokDurumu) {
        this.stokDurumu = stokDurumu;
    }


    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }


    @Override
    public String toString() {
        return "ÜrünTeknikAlanı{" +
                "stokDurumu='" + stokDurumu + '\'' +
                ", uretici='" + uretici + '\'' +
                '}';
    }
}
