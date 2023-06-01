package day_03;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();



        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        }
        else if (sayi1<0 && sayi2<0){
            System.out.println(sayi1*sayi2);
        }
        else if ((sayi1>0 && sayi2<0) || (sayi1<0 && sayi2>0)) {
            System.out.println("Farklı işaretlerde sayılarla işlem yapamazsın.");
        }
        else {
            System.out.println("sıfır çarpmaya göre yutan elamandır");
        }


    }
}
