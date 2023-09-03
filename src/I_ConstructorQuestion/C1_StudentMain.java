package I_ConstructorQuestion;

import java.util.Scanner;

public class C1_StudentMain {
    /*
    StudentMaın adında bir class olusturun, ögrenci bilgilerini alın.
    (ad soyad yas cınsiyet okul) Ardından Student adlı bir class olusturun
    ve içine parametreli constructor koyun, bu parametreler Maın classdaki bılgılerı ıstesın.
    Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
    Ardından consolda giriilen bilgileri yazdırın

    Ipucu:
        Bu soruda iki classa ihtiyacımız olacak.
        Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız. String isim, int yas, char cinsiyet gibi...
        Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız, bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
        Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek, bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
*/

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("İsim ve soyisminizi girin: ");
    String isim = scan.nextLine();
    System.out.println("Sınıfınızı girin: " );
    int sinif = scan.nextInt();
    System.out.println("Şubenizi girin: ");
    char sube = scan.next().toUpperCase().charAt(0);
    System.out.println("Telefon numaranızı girin: ");
    long telefon= scan.nextLong();

    C2_Student ogrenciBilgileri=new C2_Student(isim,sinif,sube,telefon);
    System.out.println(ogrenciBilgileri);
  }
















}

