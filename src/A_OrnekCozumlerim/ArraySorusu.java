package A_OrnekCozumlerim;

public class ArraySorusu {


    /*          39. Soru:
                Bir diziyi (Array) parametre olarak kabul eden
                ve dizideki tüm elemanların toplamını döndüren bir method yazın
                ve ardından sonucu main methodda yazdırın.
                Örn:
                girdi : {1,2,3,4,5,6,7,8}
                çıkış: 36
                ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};

        int arrToplam = arrayElemanlariniToplayanMethod(arr);
        System.out.println("Array'in elemanları toplamı: " + arrToplam);

    }

    public static int arrayElemanlariniToplayanMethod(int [] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }
        return toplam;


    }




















}



