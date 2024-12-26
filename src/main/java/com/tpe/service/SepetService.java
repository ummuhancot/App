package com.tpe.service;

import com.tpe.domain.Urun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SepetService {

    public static Map<String, Urun> products = new LinkedHashMap<>();
    public static List<Urun> urunList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    private static final String DOSYA_ADI = "tek_urun_raporu.txt";

    //13-tüm öğrencilerin ad-soyad bilgilerini rapora yazdıralım
            // Tek bir ürünün bilgilerini yazdıran ve rapor oluşturan metot
     public static void MusteriSepeteEklemeUrunYazdirVeRaporOlustur(Urun urun) {
         // Ürünü dosyaya yaz
         try (FileWriter yazici = new FileWriter(DOSYA_ADI)) {
             yazici.write("*** Tek Ürün Raporu ***\n");
             yazici.write("-----------------------\n");
             yazici.write("Ürün Kodu: " + urun.getÜrünKodu() + "\n");
             yazici.write("Ad: " + urun.getÜrünAdı() + "\n");
             yazici.write("Kategori: " + urun.getKategori() + "\n");
             yazici.write("Fiyat: " + urun.getFiyat() + "\n");
             yazici.write("Beden: " + urun.getBeden() + "\n");
             yazici.write("Renk: " + urun.getRenk() + "\n");
             yazici.write("Malzeme: " + urun.getMalzeme() + "\n");
             yazici.write("Kol Tipi: " + urun.getKolTipi() + "\n");
             yazici.write("Boy Uzunluğu: " + urun.getBoyUzunlugu() + "\n");
             yazici.write("Stok Durumu: " + urun.getStokDurumu() + "\n");
             yazici.write("Üretici: " + urun.getUretici() + "\n");

             System.out.println("Rapor başarıyla oluşturuldu ve " + DOSYA_ADI + " dosyasına kaydedildi.");
         } catch (IOException e) {
             throw new RuntimeException("Rapor oluşturulurken hata oluştu", e);
         }
         if (urun == null) {
             System.out.println("Ürün bilgisi bulunamadı.");
             return;
         }
         // Dosyayı oku ve içeriği göster
         System.out.println("\n*** Tek Ürün Raporu ***");
         try (BufferedReader okuyucu = new BufferedReader(new FileReader(DOSYA_ADI))) {
             String satir;
             while ((satir = okuyucu.readLine()) != null) {
                 System.out.println(satir);
             }
         } catch (IOException e) {
             throw new RuntimeException("Rapor dosyası okunurken hata oluştu", e);
         }

     }

}





