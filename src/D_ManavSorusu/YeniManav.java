package D_ManavSorusu;

import java.util.Scanner;

public class YeniManav {
    static Scanner scan = new Scanner(System.in);
    public static String istek;
    public static int toplamFiyat = 0;

    public static void main(String[] args) {

        giris();
    }
    public static void giris() {

        System.out.println("--------  Manavımıza Hoşgeldiniz  -------");
        System.out.println("---BUGUN LISTEMİZDEKİ URUNLERİMİZ---\n" +
                "1. Domates.....20 TL\n" +
                "2. Salatalık...20 TL\n" +
                "3. Karpuz......12 TL\n" +
                "4. Patates.....25 TL\n" +
                "5. Soğan.......15 TL\n" +
                "istediğiniz ürünün başındaki numarayı giriniz: ");
        String secim = scan.next();
        switch (secim) {
            case "1":
                domates();
            case "2":
                salatalik();
            case "3":
                karpuz();
            case "4":
                patates();
            case "5":
                sogan();
            default:
                System.out.println("Hatalı giriş yaptınız.");
                giris();
                break;
        }
    }

    private static void sogan() {    System.out.println("İstediğiniz soğan miktarını giriniz:");
        int miktar = scan.nextInt();
        toplamFiyat += miktar * 15;
        System.out.println("Borcunuz: " + toplamFiyat);
        System.out.println("Başka bir isteğiniz var mı? Evet için 'E'; Hayır için 'H'yi seçiniz... ");
        istek = scan.next();
        if (istek.equalsIgnoreCase("E"))
            giris();
        else kasa();
    }

    private static void patates() {System.out.println("İstediğiniz patates miktarını giriniz:");
        int miktar = scan.nextInt();
        toplamFiyat += miktar * 25;
        System.out.println("Borcunuz: " + toplamFiyat);
        System.out.println("Başka bir isteğiniz var mı? Evet için 'E'; Hayır için 'H'yi seçiniz... ");
        istek = scan.next();
        if (istek.equalsIgnoreCase("E"))
            giris();
        else kasa();
    }

    private static void karpuz() {
        System.out.println("İstediğiniz karpuz miktarını giriniz:");
        int miktar = scan.nextInt();
        toplamFiyat += miktar * 12;
        System.out.println("Borcunuz: " + toplamFiyat);
        System.out.println("Başka bir isteğiniz var mı? Evet için 'E'; Hayır için 'H'yi seçiniz... ");
        istek = scan.next();
        if (istek.equalsIgnoreCase("E"))
            giris();
        else kasa();
    }

    private static void salatalik() {
        System.out.println("İstediğiniz salatalık miktarını giriniz:");
        int miktar = scan.nextInt();
        toplamFiyat += miktar * 20;
        System.out.println("Borcunuz: " + toplamFiyat);
        System.out.println("Başka bir isteğiniz var mı? Evet için 'E'; Hayır için 'H'yi seçiniz... ");
        istek = scan.next();
        if (istek.equalsIgnoreCase("E"))
            giris();
        else kasa();
    }
    private static void domates() {
        System.out.println("İstediğiniz domates miktarını giriniz:");
        int miktar = scan.nextInt();
        toplamFiyat += miktar * 20;
        System.out.println("Borcunuz: " + toplamFiyat);
        System.out.println("Başka bir isteğiniz var mı? Evet için 'E'; Hayır için 'H'yi seçiniz... ");
        istek = scan.next();
        if (istek.equalsIgnoreCase("E"))
            giris();
        else kasa();
    }

    private static void kasa() {
        System.out.println("Bizi tercih ettiğiniz için teşekkürler\n" +
                "toplam borcunuz: " + toplamFiyat);
        System.exit(0);
    }
}

