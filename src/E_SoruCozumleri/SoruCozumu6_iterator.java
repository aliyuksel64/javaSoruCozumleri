package E_SoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SoruCozumu6_iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        System.out.println(sayilar);
        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {
            int sayi = (Integer) lit.next();
            lit.set(sayi + 2);
        }
        System.out.println(sayilar);

        // iterator kullanarak, listenin elementlerini sondan basa dogru yazdirin

     while (lit.hasPrevious()){
         int s=(int) lit.previous();
         System.out.print(s+" ");
       }
    }}
