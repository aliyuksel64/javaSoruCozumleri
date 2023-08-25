package E_SoruCozumleri;

import java.util.Scanner;

public class SoruCozumu2 {

    public static void main(String[] args) {

        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
Ipucu: IF ile çözebilirsiniz.
Giriş :
		 > Gandalf Grey 563245879632
Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adınızı girin: ");
        String ad = scan.nextLine();
        System.out.println("Lutfen soyadınızı girin: ");
        String soyad = scan.next();
        System.out.println("Lutfen 16 haneli kart numaranızı girin: ");
        String kartNo = scan.next();

        ad = ad.toUpperCase().charAt(0) + ad.substring(1).replaceAll("\\w", "*");
        soyad = soyad.toUpperCase().charAt(0) + soyad.substring(1).replaceAll("\\w","*");

        if (kartNo.length() == 16) {
            System.out.println("isim: " + ad + " " + soyad);
            kartNo = "**** **** "+kartNo.substring(12);
            System.out.println("Kart Numaranız: " + kartNo);
        } else {
            System.out.println("Geçersiz kredi kartı numarası");


        }
    }
}
