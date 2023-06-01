package day_03;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();


        if (sayi1>sayi2) {
            System.out.println("Birinci sayi ikinci sayidan buyuktur.");
            } else {
            System.out.println("Birinci sayi ikinci sayidan buyuk degildir.");
        }

















    }
}
