package com.tpe.service;

import com.tpe.domain.Address;
import com.tpe.domain.User;

import java.util.*;

public class UserService {


    public Scanner scanner = new Scanner(System.in);

    List<User> userList = new ArrayList<>();
    List<Address> addressList = new ArrayList<>();

    public void register() {

        System.out.println("Lütfen Adınızı Giriniz:");
        String name = scanner.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz:");
        String lastname = scanner.nextLine();

        System.out.println("Lütfen Telefon Numaranızı Giriniz:");
        String telefonNo = scanner.nextLine();

        System.out.println("Lütfen Şehir Bilgisini Giriniz:");
        String city = scanner.nextLine();

        System.out.println("Lütfen Ülke Bilgisini Giriniz:");
        String country = scanner.nextLine();

        System.out.println("Lütfen Sokak Bilgisini Giriniz:");
        String street = scanner.nextLine();

        System.out.println("Lütfen Posta Kodu Giriniz:");
        String zipcode = scanner.nextLine();

        System.out.println("Lütfen Email Giriniz:");
        String email = scanner.nextLine();

        System.out.println("Lütfen password Giriniz:");
        String password = scanner.nextLine(); // next() yerine nextLine() kullanımı

        // Adres oluştur
        Address adres = new Address(city, country, street, zipcode);

        // Kullanıcı oluştur ve adresi bağla
        User user = new User(name, lastname, telefonNo, email, password, adres);
        userList.add(user);

        // Adresi adresListesine ekle (isteğe bağlı)
        addressList.add(adres);

        System.out.println("Kullanıcı başarıyla eklendi!");
        System.out.println(user); // Kullanıcının bilgileri yazdırılır
        System.out.println(adres);

    }








}