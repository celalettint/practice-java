package day_01;

public class C04MethodCreation {
    public static void main(String[] args) {
        //konsola;
        /*
        hello world
        Hello World
        HEllo WOrld
        HELlo WORld
        HELLo WORLd
        HELLO WORLD
        yazdırın
         */
        yazdir();
        yazdir();
        yazdir();
    }
    //syntax : access modıfıer + static keyword + return type + methodismi(){} ->{body} kodlarımızı bodye yazarız
    public static void yazdir(){
        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");
    }
}
