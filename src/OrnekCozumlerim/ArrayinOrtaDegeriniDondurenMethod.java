package OrnekCozumlerim;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayinOrtaDegeriniDondurenMethod {

    /* Soru 36-)
            Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
            ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
            Örnek:
            inputarr[]=   {1,2,3,4,5,6,7}
            output:         4
            İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını
            degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen oluşturmak istediğiniz arrayin uzunluğunu girin:");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];
        System.out.println("Lutfen oluşturmak istediğiniz arrayin " + uzunluk + " elementini girin:");
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arrayin " + i + ". elementini girin:");
            arr[i] = scan.nextInt();
        }
        System.out.println("Girdiğiniz array: " + Arrays.toString(arr));
        int arrayOrtaDeger = arrayinOrtaDegeriniDondurenMethod(arr);
        System.out.println("Girilen arrayin orta değeri: " + arrayOrtaDeger);
    }
    private static int arrayinOrtaDegeriniDondurenMethod(int[] arr) {
        int arrOrta = 0;

        if (arr.length % 2 == 1) {
            arrOrta = arr[arr.length / 2];
        } else {
            arrOrta = arr[(arr.length - 1) / 2];
        }
        return arrOrta;
    }
}
