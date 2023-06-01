package day_02;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
        //Kullanicidan fahrenheit bir deger alalim.
        //scanner objesi olusturalim.
        Scanner scan = new Scanner(System.in);
        //kullaniciya bir mesaj verelim.
        System.out.println("Lutfen Fahrenheit cinsinden bir sicaklik giriniz.");
        double fahrenheit = scan.nextDouble(); //kullanicinin girmis oldugu veriyi fahrenheit variable na koyunuz.
        double celsius = fahrtoCels(fahrenheit);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius = " + celsius);


    }
/*
    public static double fahrtoCels(double fahrenheit) {
        // formül: c = (f-32)/1.8
        double celsius =(fahrenheit-32)/1.8;
        //return celsius;//

 */
public static double fahrtoCels(double fahrenheit) {

    double celsius =(fahrenheit-32)/1.8;
    return celsius;






}

}






