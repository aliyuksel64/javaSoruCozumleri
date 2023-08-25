package E_SoruCozumleri;

import java.util.Scanner;

public class CharDataTuruSoruCozumu {
    public static void main(String[] args) {
        // SORU: Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin:");
        char krk = scan.next().charAt(0); // aldığım kelimenin ilk harfini krk variable'ına atadım.

        int toplam = krk + 3;  // data türü int olan toplam isimli bir variable oluşturup onu da krk'nin 3 fazlasına atadım.


        char son = (char) toplam; // int olan toplamı chara dönüştürerek son isimli char variable atadım.
        System.out.println(son); // son variable'ını yazdırarak char verilen bir harfin
        //  üç karakter sonrasındaki karakteri vermemi isteyen soruyu çözmüş oldum.

    }
}
