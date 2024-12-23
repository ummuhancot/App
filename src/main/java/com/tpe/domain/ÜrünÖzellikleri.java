package com.tpe.domain;
/*### Ürün Özellikleri:
6. **Beden (Size)**: Mevcut beden seçenekleri. Örn: "S, M, L, XL".
7. **Renk (Color)**: Ürünün mevcut renk seçenekleri. Örn: "Siyah", "Beyaz", "Kırmızı".
8. **Malzeme (Material)**: Ürünün yapımında kullanılan malzemeler. Örn: "Pamuk", "Polyester".
9. **Kesim (Fit)**: Ürünün kesimi. Örn: "Dar Kesim", "Rahat Kesim".
10. **Kol Tipi (Sleeve Type)**: Ürünün kol uzunluğu veya tipi. Örn: "Kısa Kol", "Uzun Kol".
11. **Boy Uzunluğu (Length)**: Ürünün uzunluğu. Örn: "Midi", "Mini", "Uzun".
*/
public class ÜrünÖzellikleri {

    private String beden;
    private String renk;
    private String malzeme;
    private String kesim;
    private String kolTipi;
    private String boyUzunlugu;


    public ÜrünÖzellikleri() {
    }

    public ÜrünÖzellikleri(String beden, String renk, String malzeme, String kesim, String kolTipi, String boyUzunlugu) {
        this.beden = beden;
        this.renk = renk;
        this.malzeme = malzeme;
        this.kesim = kesim;
        this.kolTipi = kolTipi;
        this.boyUzunlugu = boyUzunlugu;
    }


    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public String getKesim() {
        return kesim;
    }

    public void setKesim(String kesim) {
        this.kesim = kesim;
    }

    public String getKolTipi() {
        return kolTipi;
    }

    public void setKolTipi(String kolTipi) {
        this.kolTipi = kolTipi;
    }

    public String getBoyUzunlugu() {
        return boyUzunlugu;
    }

    public void setBoyUzunlugu(String boyUzunlugu) {
        this.boyUzunlugu = boyUzunlugu;
    }

    @Override
    public String toString() {
        return "ÜrünÖzellikleri{" +
                "beden='" + beden + '\'' +
                ", renk='" + renk + '\'' +
                ", malzeme='" + malzeme + '\'' +
                ", kesim='" + kesim + '\'' +
                ", kolTipi='" + kolTipi + '\'' +
                ", boyUzunlugu='" + boyUzunlugu + '\'' +
                '}';
    }
}
