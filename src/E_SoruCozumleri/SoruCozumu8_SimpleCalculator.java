package E_SoruCozumleri;

import java.util.Scanner;

public class SoruCozumu8_SimpleCalculator {
    static Scanner scan = new Scanner(System.in);
    /* Problem Tanımı :
    Basit 4 işlem yapan bir hesap makinesi kodlayınız.

    Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
    Kullanicidan iki sayi girmesini isteyiniz.
    Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.*/

    public static void main(String[] args) {
        giris();
                }
    static void toplama() {
        System.out.println("Toplama işlemi için ilk sayıyı girin:");
        double topsayi1= scan.nextInt();
        System.out.println("Toplama işlemi için ikinci sayıyı girin:");
        double topsayi2= scan.nextInt();
        System.out.println("Toplama işlemi sonucu: "+topsayi1+" + "+topsayi2+" = "+(topsayi1+topsayi2));
    }
    static void cikarma() {
        System.out.println("Çıkarma işlemi için ilk sayıyı (eksilen) girin:");
        double ciksayi1= scan.nextInt();
        System.out.println("Çıkarma işlemi için ikinci sayıyı (çıkan) girin:");
        double ciksayi2= scan.nextInt();
        System.out.println("Toplama işlemi sonucu: "+ciksayi1+" - "+ciksayi2+" = "+(ciksayi1-ciksayi2));
    }
    static void carpma() {
        System.out.println("Çarpma işlemi için ilk sayıyı girin:");
        double carpsayi1= scan.nextInt();
        System.out.println("Çarpma işlemi için ikinci sayıyı girin:");
        double carpsayi2= scan.nextInt();
        System.out.println("Çarpma işlemi sonucu: "+carpsayi1+" * "+carpsayi2+" = "+carpsayi1*carpsayi2);
    }
    static void bolme() {
        System.out.println("Bölme işlemi için ilk sayıyı (bölünen) girin:");
        double bolsayi1= scan.nextInt();
        System.out.println("Bölme işlemi için ikinci sayıyı (bölen) girin:");
        double bolsayi2= scan.nextInt();
        System.out.println("Bölme işlemi sonucu: " +bolsayi1+" / "+bolsayi2+" = "+bolsayi1/bolsayi2);
    }
     static void giris() {
        System.out.println("Hesap Makinesi Uygulamıza Hoş Geldiniz.\n" +
                "==========+-*//*-+=========\n" +
                "Yapacağınız işlemi seçin: \n" +
                "Toplama için '+'\n " +
                "Çıkarma için '-' \n" +
                "Çarpma için  '*' \n" +
                "Bölme için   '/' \n" +
                "karşısındaki işareti girin.");
        char islemTalep= scan.next().charAt(0);
         switch (islemTalep){
             case '+': toplama();
                  break;
             case '-': cikarma();
                 break;
             case '*': carpma();
                 break;
             case '/': bolme();
                 break;
             default:
                 System.out.println("Yanlış bir seçim yaptınız.\n" +
                                 "========+-*//*-+========\n");
                 giris();
         }
}
}
