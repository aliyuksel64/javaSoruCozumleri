package L_Array;

import java.util.Arrays;

public class C1_ArraySort {
    /*
         Bir tamsayı dizisini (Int Array) girdi olarak kabul eden
         ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.
     */
    public static void arrayDonduren(int[] arrDon) {
        int maxDeger = arrDon[0];
        int minDeger = arrDon[0];
        for (int i = 0; i < arrDon.length; i++) {
            if (arrDon[i] > maxDeger) {
                maxDeger = arrDon[i];
            }
        }
        for (int i = 0; i < arrDon.length; i++) {
            if (arrDon[i] < minDeger) {
                minDeger = arrDon[i];
            }
        }
        System.out.println("Array'in en küçük değeri: " + minDeger+"'dir" + "\n" +
                "Array'in en büyük değeri: " + maxDeger + "'dir."
        );
    }
    public static void arrWithSort(int[] arr) {

        Arrays.sort(arr);
        System.out.println("Sort ile Arrayin en küçük elemanı: "+arr[0]+"'dir.");
        System.out.println("Sort ile Arrayin en büyük elemanı: "+arr[arr.length-1]+"'dir.");
    }

    public static void main(String[] args) {
        int[] yeni = {2, 4, 2, 1, 8, 6, 9, 5, -6, 3, 9, 11};
        arrayDonduren(yeni); // sort olmadan 2 tane for i ile yazdığım method

        arrWithSort(yeni); // Soruyu sort ile çözdüğüm method
    }
}