package com.tpe.controller;

import com.tpe.domain.Address;
import com.tpe.domain.AppInterface;
import com.tpe.domain.Product;
import com.tpe.domain.User;
import com.tpe.service.ProductService;
import com.tpe.service.UserService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static Scanner input = new Scanner(System.in);

    public static UserService servic = new UserService();
    public static Product product = new Product();
    public static ProductService productService = new ProductService();

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
            System.out.println("2-Kayitli admin girisi");
            System.out.println("3.Admin Kayit Olma");
            System.out.println("0-ÇIKIŞ");

            int select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1:
                    KayitliAdminGirisi();
                    break;
                case 2:
                    //admin kayıt olma methodunu cağır

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
        int select;
        boolean isExist = false;

        Map<String, Product> products = new LinkedHashMap();
        while (!isExist) {


            System.out.println("========= Depo Yönetim Sistemi ==========");
            System.out.println("1- Bir ürün tanımlayın");
            System.out.println("2- Ürünleri listele");
            System.out.println("3- Bir ürün giriniz");
            System.out.println("4- Rafa bir ürün yerleştirin");
            System.out.println("5- Ürün çıktısı");
            System.out.println("6- Bir ürünü kaldırın");
            System.out.println("7- Tüm ürünleri temizle");
            System.out.println("8- Ana menüye dön");
            System.out.println("0- ÇIKIŞ");
            System.out.print("Bir Seçenek Seçin: ");

            select = input.nextInt();
            input.nextLine();


                switch (select) {
                    case 1:

                        System.out.println("1- Bir ürün tanımlayın");

                        productService.addProduct(products) ;
                        break;
                    case 2:
                        System.out.println("2- Ürünleri listele");

                        break;
                    case 3:
                        System.out.println("3- Bir ürün giriniz");

                        break;
                    case 4:
                        System.out.println("4- Rafa bir ürün yerleştirin");

                        break;
                    case 5:
                        System.out.println("5- Ürün çıktısı");

                        break;
                    case 6:
                        System.out.println("6- Bir ürünü kaldırın");

                        break;
                    case 7:
                        System.out.println("7- Tüm ürünleri temizle");

                        break;
                    case 8:
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
                    System.out.println("3-Urun secimi ve Alisveris Sepetine Ekleme");
                    System.out.println("4-tek bir ürünü listeleme id si verilen(ürün arıyor)");
                    System.out.println("5-Siparis Tamamlama ve Odeme Islemleri");
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
                    System.out.println("1-kayıtlı olmayan kullanıcı icin menu Ürün görüntüleme");
                    System.out.println("2-tek bir ürünü listeleme id si verilen(ürün arıyor)");
                    System.out.println("3-müsteri Kayit Islemleri yönlendir");
                    System.out.println("0-ÇIKIŞ");

                    int select = input.nextInt();
                    input.nextLine();

                    switch (select) {
                        case 1:

                            //kayıtlı olmayan kullanıcı icin menu Ürün görüntüleme

                            break;
                        case 2:
                            //tek bir ürünü listeleme id si verilen(ürün arıyor)
                            break;
                        case 3:
                            //müsteri Kayit Islemleri yönlendir
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
