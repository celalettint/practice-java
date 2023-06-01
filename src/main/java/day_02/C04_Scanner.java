package day_02;

import java.util.Scanner;

public class C04_Scanner {
    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {

            Scanner girdi = new Scanner(System.in);
            System.out.println(" lutfen bir karakter giriniz");
            char ch = girdi.next().charAt(0); // o burada 0 inci indeks demek/ stringlerde indeks yapisi vardir ve sifirdan baslar.
            System.out.println("ch = " + ch);

            System.out.println("=================");
            /*
              A    ->2 bosluk
             A A
            A A A

             */

            //konsolda space gormek icin mutrlaka bi spacelerin "" icinde olmasi gerekir.
            System.out.println("  "+ch+"  ");
            System.out.println(" "+ ch + " "+ ch +" ");
            System.out.println(ch+ " " + ch + " "+ ch);

            System.out.println("  "+ ch+ "  \n " + ch + " "+ ch + "  \n" +ch + " " + ch + " "+ ch);
            //char data turunde bır veri almak istoyorum
            //ancak scanner objesının(girdi) methodlarına bakınca nextChar diye bir
            //methodun olmadıgını gorduk
            //scanner ile char almak istiyorsak önce string olarak alırız -> (next() methodu ile)
            //daha sonra bu stringin charat(0) methodu ile 0. indexindeki karakteri alırız.






        }

}
