
package F_MapDenemeleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Deneme_1 {

    /*         Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
      yazınız.
              A) Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
      method yazınız.
              B) Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
      gösteren bir method yazınız.
              C) Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
   * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
              2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
              3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
              4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
              5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
      for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o günleri return yap.
              6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
      for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır, ortalama kazançtan aşağıysa o günleri return yap.
     */
//===================================================================================
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Double> gunlukkazanclar= new ArrayList<>();
    static List<String> gunler;
    //====================================================================================
    public static void main(String[] args) {
        gunler= new ArrayList<String>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        // 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle
        int sayi = 0;
        double gunlukKazanc = 0;
        while (sayi < gunler.size())   {
            System.out.print("Lütfen " + gunler.get(sayi) + " günü kazancınızı giriniz : ");
            gunlukKazanc = scan.nextDouble();
            gunlukkazanclar.add(gunlukKazanc);
            sayi++;
        }
        System.out.println("");
        System.out.println("Günlük kazanclar : " + gunlukkazanclar + "\n");
        System.out.println("Günlük ortalama kazancınız : " + getOrtalamaKazanc() + "\n");
        System.out.println("Ortalamanın üzerinde kazanç sağladığınız günler : "
                +getOrtalamaninUstundeKazancGunleri() + "\n");
        System.out.println("Ortalamanın altında kazanç sağladığınız günler : "
                + getOrtalamaninAltindaKazancGunleri() + "\n");
    }
    //====================================================================================
    //getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    static double getOrtalamaKazanc() {
        double ortalamaKazanc =0;
        double gunlukKazanclarToplami=0;
        for (int i = 0; i < gunlukkazanclar.size() ; i++) {
            gunlukKazanclarToplami += gunlukkazanclar.get(i);
        }
        ortalamaKazanc = gunlukKazanclarToplami / gunlukkazanclar.size();
        return ortalamaKazanc;
    }
    //====================================================================================
    //getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //    for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //    ortalama kazançtan yüksekse o günleri return yap.
    static List<String> getOrtalamaninUstundeKazancGunleri(){
        List<String> ortalamaninUstundeKazancGunleri = new ArrayList<>();
        double ort = getOrtalamaKazanc();
        for (int i = 0; i < gunlukkazanclar.size(); i++) {
            if(gunlukkazanclar.get(i) > ort){
                ortalamaninUstundeKazancGunleri.add(gunler.get(i));
            }
        }
        return ortalamaninUstundeKazancGunleri;
    }
    //====================================================================================
    //getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır,
    // ortalama kazançtan aşağıysa o günleri return yap.
    static List<String> getOrtalamaninAltindaKazancGunleri(){
        List<String> ortalamaninAltindaKazancGunleri=new ArrayList<>();
        double ort = getOrtalamaKazanc();
        for (int i = 0; i < gunlukkazanclar.size(); i++) {
            if(gunlukkazanclar.get(i) < ort){
                ortalamaninAltindaKazancGunleri.add(gunler.get(i));
            }
        }
        return ortalamaninAltindaKazancGunleri;
    }
}//Class sonu