package M_ForLoop;

import java.util.Scanner;

public class C3_TersiIleAyniKelimeBulucuMethod {
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        tersiIleDuzuAyniOlanKelimeBulucu();

    }
    public static void tersiIleDuzuAyniOlanKelimeBulucu(){
        System.out.println("Tersini bulmak istediğiniz kelimeyi giriniz:");
        String kelime = scan.next();
        String [] tersarr = kelime.split("");
        String tersKelime="";
        for (int i = tersarr.length-1; i >= 0 ; i--) {
            tersKelime=tersKelime+tersarr[i];

        }
        if (tersKelime.equals(kelime)){
            System.out.println("Girdiğiniz "+kelime+ " kelimesi tersi ile aynı\n" +
                    "Yeni bir kelime kontrol etmek ister misiniz? \n" +
                    "Evet için E'ye; Hayır için H'ye basınız. ");
            String secim = scan.next().toUpperCase();
            if (secim.equals("E")){
                tersiIleDuzuAyniOlanKelimeBulucu();

            }else {
                System.out.println("Teşekkürler...");
            }

        }else{
            System.out.println("Girdiğiniz "+kelime+ " kelimesinin tersi "+ tersKelime+"'dir.\n" +
                    " Tersi ile aynı değildir. Yeni kelime girmek ister misiniz?\n" +
                    " Evet için E'ye; Hayır için H'ye basınız.");
            String secim = scan.next().toUpperCase();
            if (secim.equals("E")){

                tersiIleDuzuAyniOlanKelimeBulucu();

            }else {
                System.out.println("Teşekkürler...");
            }
        }
    }

}
