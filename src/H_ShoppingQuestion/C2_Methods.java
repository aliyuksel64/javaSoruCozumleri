package H_ShoppingQuestion;

import D_ManavSorusu.YeniManav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class C2_Methods {
    static Scanner scan = new Scanner(System.in);
    static String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };
    static ArrayList<String> gunlukKazanclar = new ArrayList<String>(7);
    public static void main(String[] args) {
       giris();
    }
public static void giris(){
    int sayac = 0;
    System.out.println("Haftalık kazanç uygulamasına hoş geldiniz.");
    while (sayac < days.length) {
        System.out.print(days[sayac] + " gününün kazancını girin: ");
        String kazanc = scan.next();
        gunlukKazanclar.add(kazanc);
        sayac++;
    }
      secim();
}
    public static void secim(){
        System.out.println("");
        System.out.println("Yapmak istediğiniz işlemi seçin: \n" +
                "Haftalık Ortalama için:..............................1\n" +
                "Haftalık ortalama üstünde kazanılan günler için:.....2\n"+
                "Haftalık ortalama altında kazanılan günler için:.....3\n" +
                "Çıkış için:..........................................4");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                getOrtalamaKazanc();
                secim();
                break;
            case 2:
                getOrtalamaninUstundeKazancGunleri();
               secim();
                break;
            case 3:
                getOrtalamaninAltindaKazancGunleri();
                secim();
                break;
            case 4:
                System.out.println("Çıkış yapıldı. İyi günler...");
                System.exit(0);
            default:
                System.out.println("Yanlış tercih yaptınız.");
                giris();
        }
    }
    public static int getOrtalamaKazanc() {
        int haftalikToplam = 0;
        int haftalikOrtalama = 0;
        for (int i = 0; i < days.length; i++) {
            haftalikToplam += Integer.parseInt(gunlukKazanclar.get(i));
            haftalikOrtalama = haftalikToplam / 7;
        }
        System.out.println("Haftalık toplam kazanç: " + haftalikToplam + "\n" +
                "Haftalık ortalama kazanç: " + haftalikOrtalama);
        return haftalikOrtalama;
    }
    public static void getOrtalamaninUstundeKazancGunleri() {
        int ortalama = getOrtalamaKazanc();
        ArrayList<String> ortalamaUstuKazancGunleri =new ArrayList<>();
             for (int i = 0; i < days.length; i++) {
                 int kazanc =Integer.parseInt(gunlukKazanclar.get(i));
                if (kazanc>ortalama){
                     ortalamaUstuKazancGunleri.add(days[i]);
                 }
             }
        System.out.println("Ortalama üstünde kazanılan günler: "+ortalamaUstuKazancGunleri);
    }
 public static void getOrtalamaninAltindaKazancGunleri(){
     int ortalama = getOrtalamaKazanc();
     ArrayList<String> ortalamaAltiKazancGunleri =new ArrayList<>();
     for (int i = 0; i < days.length; i++) {
         int kazanc =Integer.parseInt(gunlukKazanclar.get(i));
         if (kazanc<ortalama){
             ortalamaAltiKazancGunleri.add(days[i]);
         }
     }
     System.out.println("Ortalama altında kazanılan günler: "+ortalamaAltiKazancGunleri);
 }
}