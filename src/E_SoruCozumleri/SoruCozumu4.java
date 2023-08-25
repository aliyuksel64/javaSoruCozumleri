package E_SoruCozumleri;

import java.util.Arrays;

public class SoruCozumu4 {
    public static void main(String[] args) {

        String str = "Sen yine de bize güzel 25 tane türkü soyle...";

        String[] arrStr = str.split(" "); // String bir metni " " lardan böl ve bir arraya dönüştür.

        System.out.println(Arrays.toString(arrStr)); // Oluşturduğumuz arrStr arrayini yazdır

        int sonuc = Integer.parseInt(arrStr[5]); // arrStr arrayinin 5. indexini int'e çevir ve sonuc variable'ona ata.

        System.out.println(sonuc); // String bir metindeki sayıyı atadığımız sonuc variable'ını yazdır.
    }
}
