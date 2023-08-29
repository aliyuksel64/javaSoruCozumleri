package G_ForEachLoops;

import java.nio.MappedByteBuffer;
import java.util.Arrays;

public class C3_KelimeKontrolSorusu {

    /*      Verilen String bir array’deki her bir elementi kontrol edip,
                - Kelimenin uzunlugu cift sayi ise ilk yarisini
                - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                  yeni bir listeye ekleyip yazdirin.*/

    public static void main(String[] args) {

        String[] aphorismArr = {"Learn", "from", "yesterday", "live", "for", "today", "hope", "for", "tomorrow" };

        String [] newArr = new String[aphorismArr.length];

        for (String each: aphorismArr
             ) {
           // if (aphorismArr[each])

        }

























        /*
        String[] newArr = new String[aphorismArr.length];

        for (int i = 0; i < aphorismArr.length; i++) {
            String word = aphorismArr[i];
            int length = word.length();

            if (length % 2 == 0) {
                newArr[i] = word.substring(0, length / 2);
            } else {
                newArr[i] = word.substring((length) / 2);
            }
        }

        System.out.println("Old Array: "+Arrays.toString(aphorismArr));
        System.out.println("New Array: "+Arrays.toString(newArr));

 */
    }
}














        //   for (String each : aphorismArr
    //   ) {
    //       if (each.length() % 2 == 0) {
    //           System.out.println(aphorismArr[each.length() / 2]);
    //       }
    //       if (each.length() % 2 == 1) {
    //           System.out.println(aphorismArr[each.length()]);
    //       }


