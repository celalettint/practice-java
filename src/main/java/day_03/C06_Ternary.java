package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok basamaklı olup olmadıgını  Ternary ile kontrol eden
        // ve yazdıran bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 veya daha cok basamakli pozitif bir sayi giriniz");
        int sayi = scan.nextInt();

        kacBasamakli(sayi);


    }

    public static void kacBasamakli(int sayi) {
        //bir sayi 99 dan buyuk ise uc veya daha cok basamaklidir.
        System.out.println(sayi > 99 ? "sayı 3 veya daha cok basamaklı" : "sayı 3 ten az basamaklı ");



    }
}
