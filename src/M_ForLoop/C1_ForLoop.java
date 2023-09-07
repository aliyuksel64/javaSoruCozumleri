package M_ForLoop;
import java.util.Arrays;
import java.util.Scanner;

public class C1_ForLoop {
    static Scanner scan = new Scanner(System.in);
    // Sıfırdan girilen sayıya kadar aradaki sayıların toplamını yazdıran bir program yazın.

    public static void main(String[] args) {

        toplamMethodu(44);
            }
    public static void toplamMethodu (int sayi){
        double sonSayi = sayi;
        double toplam= 0;
        for (int i = 0; i <= sonSayi; i++) {
            toplam+=i;
        }
        System.out.println("Girdiğiniz sayıya kadar olan sayıların toplamı: "+toplam);
    }
}
