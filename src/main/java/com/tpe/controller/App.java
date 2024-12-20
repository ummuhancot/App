package com.tpe.controller;

import java.util.Scanner;

public class App {

    public static Scanner input = new Scanner(System.in);


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
                    break;

                    /*
                 Admin Islemleri Method

                 1.Admin ve User Kayit Islemleri
                 2.Urun Kayit-Listeleme-Silme-Fiyatlandirma Islemleri
                 3.Siparis Hazirlama Islemleri
                 4.Stok Takip Islemleri
                 5.Yedekleme Islemleri

                */

                case 2:
                    System.out.println("User Modulu");
                    break;
                /*
                 User Islemleri Metoduna Yonlendirecek

                 1.Kayit Islemleri
                 2.Urun secimi ve Alisveris Sepetine Ekleme
                 3.Siparis Tamamlama ve Odeme Islemleri
                */
                case 3:

                    /*
                    kayıtlı olmayan kullanıcı icin menu
                    Ürün görüntüleme
                    */
                    break;
                case 0:
                    System.out.println("İyi Günler...");
                    break;


                default:
                    System.out.println("Hatalı giriş!!!");
                    break;
            }
        } while (select != 0); // Ana menüden çıkana kadar döner


    }

    public  void  AdminIslemleriMethod(){
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

                    break;


                case 2:

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









}
