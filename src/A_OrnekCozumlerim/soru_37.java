package A_OrnekCozumlerim;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class soru_37 {
    public static void main(String[] args) {
        /*
        Soru 37-)
SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
(Eliminate duplicates)
ENG:
Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
Write a test program that reads in ten integers, invokes the method, and displays the result.
(Tekrarlananları çıkar)
TÜR:
Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
---->>>
public static int[] eliminateDuplicates(int[] list)
ÖRNEK:
On sayi giriniz:
1 2 3 2 1 6 3 4 5 2
ÇIKTI:
Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 10 tane tamsayı giriniz");
        int[] list = new int[10];
        int deger = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("lütfen " + (i + 1) + ". değeri giriniz");
            deger = scanner.nextInt();
            list[i] = deger;
        }
        System.out.print("İlk Array : ");
        System.out.println(Arrays.toString(list));
        eliminateDuplicates( list);
    }
    private static void eliminateDuplicates(int[] list) {
        List<Integer> listtekrarlanmayan= new ArrayList<>();
        for (int i = 0; i < list.length ; i++) {
            if (!listtekrarlanmayan.contains(list[i])){
                listtekrarlanmayan.add(list[i] );
            }
        }
        int[] listTekrarlanmayan=new int[listtekrarlanmayan.size()];
        for (int i = 0; i < listtekrarlanmayan.size() ; i++) {
            listTekrarlanmayan[i]=listtekrarlanmayan.get(i);
        }
        System.out.print("Tekrar Eleman Olmayan Array : ");
        System.out.println(Arrays.toString(listTekrarlanmayan));
    }
}