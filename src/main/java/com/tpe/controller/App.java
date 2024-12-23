package com.tpe.controller;


import com.tpe.domain.Urun;
import com.tpe.service.AdminService;
import com.tpe.service.UrunService;
import com.tpe.service.UserService;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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

    static Map<String, Urun> products = new HashMap<>();
    public static void KayitliAdminGirisi() {
        int select;
        boolean isExist = false;

        while (!isExist) {


            System.out.println("========= Depo Yönetim Sistemi ==========");
            System.out.println("1- Bir ürün tanımlayın");
            System.out.println("2- id verilen ürünü listeleme ürün listele");
            System.out.println("3- Tüm ürünleri listeleyiniz");
            System.out.println("4- id si verilen ürünü silme ");
            System.out.println("5- Satın alınan ürünleri görüntüleme ve kargoya verme");//
            System.out.println("6- Ana menüye dön");
            System.out.println("0- ÇIKIŞ");


            select = input.nextInt();
            input.nextLine();


                switch (select) {
                    case 1:

                        System.out.println("1- Bir ürün tanımlayın");

                        urunService.addProduct(products);

                        break;
                    case 2:
                        System.out.println("2- id si verilen Ürünleri listele");
                        urunService.listProduct(products);
                        break;
                    case 3:
                        System.out.println("3- tüm ürünleri listeleyiniz");

                        break;
                    case 4:
                        System.out.println("4- id si verilen ürünü silme ");


                        break;

                    case 5:
                        System.out.println("6- Satın alınan ürünleri görüntüleme ve kargoya verme");

                        break;

                    case 6:
                        System.out.println("Ana menüye yönlendiriliyorsunuz");
                        displayAppMenu();
                    case 0:
                        System.out.println("Good byy...");
                        isExist = true;
                }




        }
    }


            public static void MüsteriIslemleriMethod(){
                boolean isExist=false;
                while (!isExist) {

                    System.out.println("========================================================");
                    System.out.println("1-müsteri Kayit Islemleri");
                    System.out.println("2-kayıtlı müsteri menüsü Ana menüye yönlendirildi ");
                    System.out.println("3-tek bir ürünü listeleme id si verilen(ürün arıyor)");
                    System.out.println("4-Urun secimi ve Alisveris Sepetine Ekleme");
                    System.out.println("5-Kargo secimi ve ödeme secenekleri");
                    System.out.println("6-Urun iptal ve Urun iade");
                    System.out.println("7-Siparis Tamamlama ve Odeme Islemleri");
                    System.out.println("8-Alınan ürünün Kargo durumunu görüntüleme");
                    System.out.println("9-Urun degerlendirme ve yorum");
                    System.out.println("0-ÇIKIŞ");

                    int select = input.nextInt();
                    input.nextLine();

                    switch (select) {
                        case 1:
                            servic.register();
                            //müsteri Kayit Islemleri
                            break;
                        case 2:
                            //kayıtlı müsteri menüsü
                            System.out.println("Ana menüye yönlendiriliyor");
                            MüsteriIslemleriMethod();
                            break;
                        case 3:
                            //Urun secimi ve Alisveris Sepetine Ekleme
                            break;
                        case 4:
                            //tek bir ürünü listeleme id si verilen(ürün arıyor)
                            break;
                        case 5:
                            //Siparis Tamamlama ve Odeme Islemleri
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
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
                    System.out.println("1-kayıtlı olmayan kullanıcı icin menu Urun görüntüleme");
                    System.out.println("2-tek bir urunun listeleme id si verilen(ürün arıyor)");
                    System.out.println("3-müsteri Kayit Islemleri yönlendir");
                    System.out.println("0-ÇIKIŞ");

                    int select = input.nextInt();
                    input.nextLine();

                    switch (select) {
                        case 1:
                            //adminin tek bir ürünü listele methodunu cağırıcaz
                            //adminin tüm ürünleri listele methodunu cağrıcaz
                            //ik ürün kayıt yapcaz ürün listeleme methodunu cağrıcaz admin kısmından
                            //kayıtlı olmayan kullanıcı icin menu Urun görüntüleme

                            break;
                        case 2:
                            //tek bir ürünü listeleme id si verilen(ürün arıyor)
                            break;
                        case 3:
                            //müsteri Kayit Islemleri yönlendir
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
