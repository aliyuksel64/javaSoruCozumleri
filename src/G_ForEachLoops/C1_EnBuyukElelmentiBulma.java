package G_ForEachLoops;

import java.util.logging.SocketHandler;

public class C1_EnBuyukElelmentiBulma {

    public static void main(String[] args) {

        int [] arr= {1,45,23,65,90,12,23,1,5,67,44,76};
        // SORU: Array'deki en büyük elementi bul.
        int enBuyukElement = arr[0];
        for (int each: arr
             ) {

            if (each>enBuyukElement);
            enBuyukElement=each;
        }
        System.out.println("En büyük element :"+ enBuyukElement);
    }
}