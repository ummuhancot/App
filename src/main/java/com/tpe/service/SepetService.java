package com.tpe.service;

import com.tpe.domain.Sepet;
import com.tpe.domain.Urun;

import java.io.*;
import java.util.*;

public class SepetService {

    private static Map<Integer, Sepet> sepetler = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);


    public static List<Urun> sepetList = new ArrayList<>();

    // addProduct metodu
    public static void addProduct(Map<Integer, Sepet> sepetler, Urun urun, int miktar, Sepet sepet) {
        if (urun != null) {
            sepet.getProducts().put(urun, sepet.getUrunler().getOrDefault(urun, 0) + miktar);
            System.out.println("Ürün sepete eklendi: " + urun.getÜrünAdı() + " (Miktar: " + miktar + ")");
        } else {
            System.out.println("Ürün bulunamadı!");
        }
    }

    // manageCart metodu
    public static void manageCart(Map<String, Urun> products, Map<Integer, Sepet> sepetler) {
        int sepetID;
        System.out.println("Sepet ID oluşturmak için bir sayı girin:");
        sepetID = sc.nextInt();
        sc.nextLine(); // Satır sonu temizleme

        // Yeni sepet oluştur veya mevcut olanı al
        Sepet sepet = sepetler.getOrDefault(sepetID, new Sepet(sepetID));
        sepetler.put(sepetID, sepet);

        int choice;
        do {
            System.out.println("Mevcut ürünlerden sepete eklemek için ürün kodunu girin:");
            String productCode = sc.nextLine().toUpperCase().trim();
            Urun urun = products.get(productCode);

            if (urun != null) {
                System.out.println("Sepete eklenecek miktarı girin:");
                int miktar;
                try {
                    miktar = sc.nextInt();
                    sc.nextLine(); // Satır sonu temizleme

                    if (miktar > 0) {
                        // addProduct çağrılırken uygun parametreler ile çağrılıyor
                        addProduct(sepetler, urun, miktar, sepet);
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




    public static void saveCartToTxt(Sepet sepet, Map<String, Urun> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sepet.txt"))) {
            for (Map.Entry<Urun, Integer> entry : sepet.getProducts().entrySet()) {
                Urun urun = entry.getKey();
                int miktar = entry.getValue();
                writer.write("Ürün Kodu: " + urun.getÜrünKodu() +
                        " | Adı: " + urun.getÜrünAdı() +
                        " | Miktar: " + miktar +
                        " | Fiyat: " + urun.getFiyat() + "\n");
            }
            System.out.println("Sepet başarıyla dosyaya kaydedildi.");
        } catch (IOException e) {
            System.err.println("Dosya yazılırken hata oluştu: " + e.getMessage());
        }
    }

}






