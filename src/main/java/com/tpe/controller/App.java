package com.tpe.controller;


import com.tpe.domain.Sepet;
import com.tpe.domain.Urun;
import com.tpe.service.AdminService;
import com.tpe.service.SepetService;
import com.tpe.service.UrunService;
import com.tpe.service.UserService;

import java.util.*;

import static com.tpe.service.UrunService.addProduct;
import static com.tpe.service.UrunService.products;

public class App {

    public static Scanner input = new Scanner(System.in);

    public static Urun urun = new Urun();
    public static UrunService urunService = new UrunService();
    public static UserService servic = new UserService();

    public static void displayAppMenu() {


        int select;

        do {
            System.out.println("========================================================");
            System.out.println("Online Alisveris Platformu");
            System.out.println("1-Admin Modul");
            System.out.println("2-Client Modul");
            System.out.println("3-Guest Modul");
            System.out.println("0-ÇIKIŞ");
            System.out.println("Modul Seçiniz : ");

            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Admin Modulu");
                    AdminIslemleriMethod();
                    KayitliAdminGirisi();
                    break;
                case 2:
                    System.out.println("User Modulu");
                    MüsteriIslemleriMethod();
                    break;
                case 3:
                    MisafirIslemleriMethod();
                    break;
                case 0:
                    System.out.println("İyi Günler...");
                    break;
                default:
                    System.out.println("Hatalı giriş!!!");
                    break;
            }
        } while (select != 0);


    }

    public static void AdminIslemleriMethod() {
        boolean isExist = false;
        while (!isExist) {
            System.out.println("========================================================");
            System.out.println("1-Admin Islemleri: ");
            System.out.println("2.Admin Kayit Olma");
            System.out.println("0-ÇIKIŞ");

            int select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1:
                    KayitliAdminGirisi();
                    break;

                case 2:
                    AdminService adminService = new AdminService();
                    adminService.Kayıt();
                    break;
                case 0:
                    isExist = true;

                    System.out.println("İyi Günler...");
                    break;

                default:
                    System.out.println("Hatalı giriş!!!");
                    break;
            }
        }

    }


    public static void KayitliAdminGirisi() {
        Scanner input = new Scanner(System.in);
        int select;
        boolean isExist = false;

        while (!isExist) {

            System.out.println("========= Depo Yönetim Sistemi ==========");
            System.out.println("1- Bir ürün tanımlayın");
            System.out.println("2- id verilen ürünü listeleme ürün listele");
            System.out.println("3- Tüm ürünleri listeleyiniz");
            System.out.println("4- id si verilen ürünü silme ");
            System.out.println("5- Ürünleri filtreleme (max,min,A dan - Z ye )");
            System.out.println("6- Satın alınan ürünleri görüntüleme ve kargoya verme");
            System.out.println("7- Ana menüye dön");
            System.out.println("0- ÇIKIŞ");

            select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1:
                    System.out.println("1- Bir ürün tanımlayın");
                    UrunService.addProduct(UrunService.products);
                    break;
                case 2:
                    System.out.println("2- id si verilen Ürünleri listele");
                    UrunService.listIdProduct(UrunService.products);
                    break;
                case 3:
                    System.out.println("3- tüm ürünleri listeleyiniz");
                    UrunService.enterProduct(UrunService.products);
                    break;
                case 4:
                    System.out.println("4- id si verilen ürünü silme ");
                    UrunService.deleteProductById(UrunService.products);
                    // Implement silme işlemi burada
                    break;
                case 5:
                    System.out.println("5- Ürünleri filtreleme (max,min,A dan - Z ye )");
                    UrunService.AdminlistProductWithSorting(UrunService.products);

                    break;
                case 6:
                    System.out.println("5- Satın alınan ürünleri görüntüleme ve kargoya verme");
                    // Implement satın alma işlemi burada
                    break;
                case 7:
                    System.out.println("Ana menüye yönlendiriliyorsunuz");
                    // displayAppMenu(); // Uncomment if menu is defined elsewhere
                    break;
                case 0:
                    System.out.println("Good bye...");
                    isExist = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        }
    }



            public static void MüsteriIslemleriMethod(){
                boolean isExist=false;
                while (!isExist) {

                    System.out.println("========================================================");
                    System.out.println("1-müsteri Kayit Islemleri");
                    System.out.println("2-kayıtlı müsteri menüsü Ana menüye yönlendirildi ");
                    System.out.println("3-Ürün ismine göre arama yap");
                    System.out.println("4- Ürünleri filtreleme (max,min,A dan - Z ye )");
                    System.out.println("5-Urun secimi ve Alisveris Sepetine Ekleme");
                    System.out.println("6-Kargo secimi ve ödeme secenekleri");
                    System.out.println("7-Urun iptal ve Urun iade");
                    System.out.println("8-Siparis Tamamlama ve Odeme Islemleri");
                    System.out.println("9-Alınan ürünün Kargo durumunu görüntüleme");
                    System.out.println("10-Urun degerlendirme ve yorum");
                    System.out.println("0-ÇIKIŞ");

                    int select = input.nextInt();
                    input.nextLine();

                    int miktar;
                    switch (select) {
                        case 1:
                            System.out.println("1-müsteri Kayit Islemleri");
                            servic.register();
                            //müsteri Kayit Islemleri
                            break;
                        case 2:
                            System.out.println("2-kayıtlı olmayan müsteri müsteri menüsü Ana menüye yönlendirildi ");
                            //kayıtlı müsteri menüsü
                            System.out.println("Ana menüye yönlendiriliyor");
                            MüsteriIslemleriMethod();
                            break;
                        case 3:
                            System.out.println("3-Ürün ismine göre arama yap");
                            UrunService.searchProductByName(UrunService.products);
                            break;
                        case 4:
                            System.out.println("4- Ürünleri filtreleme (max,min,A dan - Z ye )");
                            UrunService.MusterilistProductWithSorting(UrunService.products);
                            //tek bir ürünü listeleme id si verilen(ürün arıyor)
                            break;
                        case 5:
                            System.out.println("5-Urun secimi ve Alisveris Sepetine Ekleme");
                            //Siparis Tamamlama ve Odeme Islemleri
                            // Kullanıcıdan ID al

                            SepetService.addToCart(SepetService.urunList,SepetService.sepetList);
                            SepetService.saveToFile(SepetService.urunList,SepetService.sepetList);
                            SepetService.listUnaddedProducts(SepetService.urunList,SepetService.sepetList);
                            SepetService.listCart(SepetService.sepetList);

                            break;

                        case 6:
                            System.out.println("6-Kargo secimi ve ödeme secenekleri");

                            break;
                        case 7:
                            System.out.println("7-Urun iptal ve Urun iade");

                            break;
                        case 8:
                            System.out.println("8-Siparis Tamamlama ve Odeme Islemleri");

                            break;
                        case 9:
                            System.out.println("8-Siparis Tamamlama ve Odeme Islemleri");

                            break;
                        case 10:
                            System.out.println("10-Urun degerlendirme ve yorum");

                            break;
                        case 0:
                            isExist = true;

                            System.out.println("İyi Günler...");
                            break;

                        default:
                            System.out.println("Hatalı giriş!!!");
                            break;
                    }

                }

            }
            public static void MisafirIslemleriMethod () {
                boolean isExist = false;
                while (!isExist) {
                    System.out.println("========================================================");
                    System.out.println("1-Ürün ismine göre arama yap");
                    System.out.println("2-Ürünleri filtreleme (max,min,A dan - Z ye )");
                    System.out.println("3-müsteri Kayit Islemleri yönlendir");
                    System.out.println("0-ÇIKIŞ");

                    int select = input.nextInt();
                    input.nextLine();

                    switch (select) {
                        case 1:
                            System.out.println("1-Ürün ismine göre arama yap");
                            UrunService.searchProductByName(UrunService.products);

                            break;
                        case 2:
                            System.out.println("2-Ürünleri filtreleme (max,min,A dan - Z ye )");
                            UrunService.MusterilistProductWithSorting(UrunService.products);
                            break;
                        case 3:
                            //müsteri Kayit Islemleri yönlendir
                            //müsteri ürün almak isterse 1 e basıp kayıt olmalıdır.
                            System.out.println("Kayıt olmak icin 1 e basınız.");
                            MüsteriIslemleriMethod();
                            break;
                        case 0:
                            isExist = true;

                            System.out.println("İyi Günler...");
                            break;

                        default:
                            System.out.println("Hatalı giriş!!!");
                            break;
                    }

                }

            }


}
