package com.tpe.service;

import com.tpe.domain.*;

import java.time.LocalDate;
import java.util.*;

public class UrunService  {
    // Ürünlerin saklanacağı Map, LinkedHashMap kullanılarak eklenme sırası korunur
    public static Map<String, Urun> products = new LinkedHashMap<>();
    public static Scanner sc = new Scanner(System.in);
    // UrunSaveService saveService = new UrunSaveService(); // Ürünlerin dosyaya kaydedilmesi için servis sınıfı
    // Yapıcı metot, uygulama başlarken dosyadan ürünleri yükler




    public static void addProduct(Map<String, Urun> products) {


        int select = 1;
        do {
            // Yeni bir ürün nesnesi oluştur


            // Ürün bilgilerini kullanıcıdan al
            System.out.print("Ürün Adı: ");
            String ÜrünAdı = sc.nextLine().toUpperCase().trim();
            System.out.print("Ürün kategorisini giriniz :");
            String kategori = sc.nextLine().toUpperCase().trim();
            System.out.print("Ürün Fiyatı : ");
            Integer fiyat = sc.nextInt();
            sc.nextLine();


            //Ürün Özelliklerini ekleme objesini oluştur

            System.out.print("Ürün Bedeni : ");
            String Beden = sc.nextLine().toUpperCase().trim();
            System.out.print("Ürün Renk : ");
            String renk = sc.nextLine().toUpperCase().trim();
            System.out.print("Ürün Malzeme : ");
            String malzeme = sc.nextLine().toUpperCase().trim();
            System.out.print("Ürün Kol Tipi : ");
            String ÜrünKolTipi = sc.nextLine().toUpperCase().trim();
            System.out.print("Ürün Boy Uzunluğu : ");
            String ÜrünBoyUzunluğu = sc.nextLine().toUpperCase().trim();

            //Ürün Teknik Alanı
            System.out.print("Ürün Stok Durum : ");
            int ÜrünStokDurumu = sc.nextInt();
            sc.nextLine();
            System.out.print("Ürün Üretici : ");
            String ÜrünÜretici = sc.nextLine().toUpperCase().trim();

            // Aynı ürünün mevcut olup olmadığını kontrol et
            for (Urun w : products.values()) {
                if (w.getÜrünAdı().equals(ÜrünAdı)  && w.getKategori().equals(kategori)&&
                        w.getFiyat().equals(fiyat)) {
                    System.out.println("Bu ürün zaten mevcut. Bunun yerine miktarını güncelleyebilirsiniz.");
                    return;
                }
            }

            // Ürün miktarını doğrula ve al
            int productQuantity;
            do {
                System.out.print("Bir miktar giriniz:");
                while (!sc.hasNextInt()) {
                    System.out.println("Geçersiz giriş! Lütfen miktar için sayısal bir değer girin.");
                    sc.next(); // Hatalı girişi temizle
                }
                productQuantity = sc.nextInt();
                sc.nextLine(); // Newline karakterini temizle
                if (productQuantity <= 0) {
                    System.out.println("Miktar pozitif bir sayı olmalıdır.");
                }
            } while (productQuantity <= 0);


            Urun urun = new Urun(ÜrünAdı,kategori,fiyat,new UrunTeknikAlanı(),new UrunOzellikleri());
            UrunOzellikleri urunOzellikleri = new UrunOzellikleri(Beden,renk,malzeme,ÜrünKolTipi,ÜrünBoyUzunluğu);
            UrunTeknikAlanı urunTeknikAlanı = new UrunTeknikAlanı(ÜrünStokDurumu,ÜrünÜretici);



            // Ürün özelliklerini ayarla ve ID'yi oluştur
            urun.setÜrünAdı(ÜrünAdı);
            urun.setKategori(kategori);
            urun.setFiyat(fiyat);
            urunOzellikleri.setBeden(Beden);
            urunOzellikleri.setMalzeme(malzeme);
            urunOzellikleri.setRenk(renk);
            urunOzellikleri.setKolTipi(ÜrünKolTipi);
            urunOzellikleri.setBoyUzunlugu(ÜrünBoyUzunluğu);
            urun.setUrunOzellikleri(urunOzellikleri);
            urunTeknikAlanı.setUretici(ÜrünÜretici);
            urunTeknikAlanı.setStokDurumu(ÜrünStokDurumu);
            urun.setUrunTeknikAlanı(urunTeknikAlanı);
            productId(urun);
            // Ürün ID'sini ayarla

            // Ürünü Map'e ekle
            products.put(urun.getÜrünKodu(), urun);

            System.out.println(urun);
            System.out.println(urunOzellikleri);
            System.out.println(urunTeknikAlanı);
            System.out.println(urun.getÜrünKodu());

            // İşleme devam veya çıkış seçeneği sunma
            System.out.println("Press 1 to CONTINUE the process or 0 to EXIT.");
            try {
                select = sc.nextInt();
                sc.nextLine();  // Satır sonu karakterini temizlemek için
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter 0 or 1.");
                sc.nextLine();  // Hatalı girişi temizlemek için
                select = 1;     // Hatalı giriş durumunda döngüyü devam ettirmek için
            }

        }while (select !=0);

        listProduct(products);
    }


    // Ürün ID'sini oluşturur
    public static void productId(Urun urun) {

        try {

            // ID'yi ürün adı ve yıl bilgisiyle oluştur, counter'ı kullanarak benzersiz yap
            urun.setÜrünKodu(urun.getÜrünAdı().toUpperCase().substring(0,3) + LocalDate.now().getYear()+Urun.counter);
            Urun.counter++;
        } catch (StringIndexOutOfBoundsException e) {
            // Eğer ürün adı kısa ise "NULL" kullanarak ID oluştur
            urun.setÜrünKodu("\uD83D\uDE08"+LocalDate.now().getYear() + Urun.counter);
            Urun.counter++;
        }
    }


/*
    public void listProduct (List<Urun > urun){

        for (Urun product : urun) {
            // Eğer ürün miktarı 0 ise kırmızı renkte yazdır
            if (product.getUrunTeknikAlanı().getStokDurumu() == 0) {
                System.err.printf("stok bulunmamakta");
            } else {
                System.out.printf(product.getÜrünKodu(), product.getÜrünAdı(), product.getUrunTeknikAlanı().getUretici(), product.getUrunTeknikAlanı().getStokDurumu(), product.getFiyat(), product.getKategori());
            }
        }

    }
    */

    // ürünleri listeler
    public static void listProduct(Map<String, Urun> products) {
        List<Urun> urunList =new ArrayList<>(products.values());
        for (Urun product : urunList) {
            // Eğer ürün miktarı 0 ise kırmızı renkte yazdır
            if (product.getUrunTeknikAlanı().getStokDurumu() == 0) {
                System.err.println("\n"+product.getÜrünKodu()+"\n"+product.getÜrünAdı()+"\n"+product.getFiyat()+"\n"+product.getKategori()+"\n");
            } else {
                System.out.println("\n"+product.getÜrünKodu()+"\n"+product.getÜrünAdı()+"\n"+product.getFiyat()+"\n"+product.getKategori()+"\n");
                System.err.println("calıştı");
            }
        }
    }

    public void enterProduct(Map<String, Urun> products) {

    }


    public void putProductOnShelf(Map<String, Urun> products) {

    }


    public void productOutput(Map<String, Urun> products) {

    }


    public void removeProduct(Map<String, Urun> products) {

    }


    public void clearProducts(Map<String, Urun> products) {

    }
}