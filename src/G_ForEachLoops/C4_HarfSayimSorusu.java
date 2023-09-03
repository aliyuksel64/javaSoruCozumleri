package G_ForEachLoops;

import java.util.Scanner;

public class C4_HarfSayimSorusu {

    /*
            Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
            kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scan.nextLine();
        System.out.println("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        String[] cumleArr = cumle.split("");
        int sayim = 0;
        for (String each : cumleArr
        ) {
            if (each.equalsIgnoreCase(String.valueOf(harf))) {
                sayim++;
            }
        }
        if (sayim == 0) {
            System.out.println("Verdiğiniz " + harf + " harfi cümlede hiç kullanılmamıştır.");
        } else {
            System.out.println("Verdiğiniz " + harf + " harfi cümlede " + sayim + " defa kullanılmıştır.");
        }
    }
}