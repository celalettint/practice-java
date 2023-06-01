package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //ctrl alt L ile duzenlenir.
    //ctrl Z-> islemi geri alma

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int x = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int y = input.nextInt();


       boolean sonuc = karelerEsitMi(x,y);
        System.out.println("sonuc = " + sonuc);




    }

    public static boolean karelerEsitMi(int x, int y) {

        //javada = isaret assigmenr isaretidir.
        //matematiksel anlamdaki esit icin == bunu kullaniriz.
        boolean sonuc =x*x==y*y;
        return sonuc;


    }
}
