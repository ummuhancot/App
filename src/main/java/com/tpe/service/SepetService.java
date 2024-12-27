package com.tpe.service;

import com.tpe.domain.Sepet;
import com.tpe.domain.Urun;

import java.io.*;
import java.util.*;

public class SepetService {

    private static Map<Integer, Sepet> sepetler = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);


    public static List<Urun> sepetList = new ArrayList<>();

    public static void addProduct(List<Sepet> sepetler, Urun urun, int miktar) {

        if (urun != null) {
            if (urun.getStokDurumu() < miktar) {
                System.out.println("Ürün stokta yetersiz: " + urun.getÜrünAdı() +
                        " (Stok: " + urun.getStokDurumu() + ", İstenen: " + miktar + ")");
                return;
            }

            boolean mevcut = false;
            for (Sepet item : sepetler) {
                if (item.getÜrünKodu().equals(urun.getÜrünKodu())) {
                    item.setStokDurumu(item.getStokDurumu() + miktar);
                    mevcut = true;
                    System.out.println("Sepetteki ürün miktarı güncellendi: " + urun.getÜrünAdı() +
                            " (Toplam Miktar: " + item.getStokDurumu() + ")");
                    break;
                }
            }

            if (!mevcut) {
                sepetler.add(new Sepet(sepetler,urun, miktar));
                System.out.println("Ürün sepete eklendi: " + urun.getÜrünAdı() + " (Miktar: " + miktar + ")");
            }

            urun.setStokDurumu(urun.getStokDurumu() - miktar); // Stok güncelleme
        } else {
            System.out.println("Ürün bulunamadı!");
        }
    }

    // manageCart metodu
    public static void manageCart(List<Urun> products, List<Sepet> sepetler) {

        int choice;
        Sepet sepet = null;
        do {
            System.out.println("Mevcut ürünlerden sepete eklemek için ürün kodunu girin:");
            String productCode = sc.nextLine().toUpperCase().trim();
            Urun urun = products.get(Integer.parseInt(productCode));

            if (urun != null) {
                System.out.println("Sepete eklenecek miktarı girin:");
                int miktar;
                try {
                    miktar = sc.nextInt();
                    sc.nextLine(); // Satır sonu temizleme

                    if (miktar > 0) {
                        // addProduct çağrılırken uygun parametreler ile çağrılıyor
                        addProduct(sepetler, urun, miktar);
                    } else {
                        System.out.println("Miktar pozitif bir sayı olmalıdır.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                    sc.nextLine(); // Hatalı girişi temizle
                }
            } else {
                System.out.println("Ürün bulunamadı. Lütfen geçerli bir ürün kodu girin.");
            }

            System.out.println("1- Sepete ürün eklemeye devam et\n0- Çıkış yap ve dosyaya kaydet");
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Satır sonu temizleme
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş! Lütfen 0 veya 1 girin.");
                sc.nextLine(); // Hatalı girişi temizle
                choice = 1; // Döngüyü devam ettir
            }
        } while (choice != 0);

        saveCartToTxt(sepet, products);
    }

    public static void saveCartToTxt(List<Sepet> sepetler, List<Urun> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sepet.txt"))) {
            writer.write("Sepet İçeriği:\n");
            for (Sepet sepet : sepetler) {
                Urun urun = sepet.getUrun();
                int miktar = sepet.getMiktar();
                writer.write("Ürün Kodu: " + urun.getÜrünKodu() +
                        " | Adı: " + urun.getÜrünAdı() +
                        " | Miktar: " + miktar +
                        " | Fiyat: " + urun.getFiyat() + "\n");
            }

            writer.write("\nMevcut Ürünler:\n");
            for (Urun urun : products) {
                writer.write("Ürün Kodu: " + urun.getÜrünKodu() +
                        " | Adı: " + urun.getÜrünAdı() +
                        " | Stok: " + urun.getStokDurumu() +
                        " | Fiyat: " + urun.getFiyat() + "\n");
            }

            System.out.println("Sepet ve ürün bilgileri başarıyla dosyaya kaydedildi.");
        } catch (IOException e) {
            System.err.println("Dosya yazılırken hata oluştu: " + e.getMessage());
        }
    }



}






