package E_SoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SoruCozumu7_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        System.out.println(sayilar);

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {
            int say = (int) lit.next();
            if (say < 20 || say > 40) {
                lit.remove();

            }


        }
        System.out.println(sayilar);
    }
}
