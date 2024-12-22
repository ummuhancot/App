package com.tpe.controller;

import com.tpe.service.UserService;

import java.util.Scanner;

public class App {

    public static Scanner input = new Scanner(System.in);

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

    public static   void  AdminIslemleriMethod(){
        boolean isExist=false;
        while (!isExist){
            System.out.println("========================================================");
            System.out.println("Admin Islemleri: ");
            System.out.println("1-Kayitli admin girisi");
            System.out.println("2.Admin Kayit Olma");
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
                    isExist=true;

                    System.out.println("İyi Günler...");
                    break;

                default:
                    System.out.println("Hatalı giriş!!!");
                    break;
            }
        }

    }


    public static void KayitliAdminGirisi(){

        boolean isExist=false;
        while (!isExist) {
            System.out.println("========================================================");
            System.out.println("1-Urun Kayit : ");
            System.out.println("2-kayıtlı ürünü Listeleme :");
            System.out.println("3-tek bir ürünü listeleme id si verilen(ürün arıyor) :");
            System.out.println("4-di verilen ürünü Silme :");
            System.out.println("5-id si verilen ürünü Fiyatlandirma Islemleri :");
            System.out.println("6-kullanıcının aldığı ürünlerin Siparislerini Hazirlama Islemleri :");
            System.out.println("7-Stok Takip Islemleri :");
            System.out.println("8-Yedekleme Islemleri :");
            System.out.println("9-Ana menüye gitmek icin tıkla :");
            System.out.println("0-ÇIKIŞ");

            int select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1:
                    //Urun Kayit
                    break;
                case 2:
                    //kayıtlı ürünü Listeleme
                    break;
                case 3:
                    //tek bir ürünü listeleme id si verilen(ürün arıyor)
                    break;
                case 4:
                    //di verilen ürünü Silme-
                    break;
                case 5:
                    //id si verilen ürünü Fiyatlandirma Islemleri
                    break;
                case 6:
                    //kullanıcının aldığı ürünlerin Siparislerini Hazirlama Islemleri
                    break;
                case 7:
                    //Stok Takip Islemleri
                    break;
                case 8:
                    //Yedekleme Islemleri
                    break;
                case 9:
                    displayAppMenu();
                    System.out.println("Ana menüye gidiliyor");
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
    public static void MisafirIslemleriMethod() {
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
