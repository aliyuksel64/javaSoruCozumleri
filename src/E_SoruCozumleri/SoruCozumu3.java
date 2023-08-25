package E_SoruCozumleri;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoruCozumu3 {
    static String str = "Java Candir ama biraz da heyecandir";
    static int[] arr  = {3,5,7,8,2,5,9,0};
    // Kullanicidan bir sayi isteyip
    // girilen sayiyi index olarak kullanin
    // str 'daki o index'deki harfi
    // ve array'deki o index'deki sayiyi yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int index=0;
        System.out.println("Indexini istediğin sayiyi girin: ");
        try {
            index= scan.nextInt();


        } catch (InputMismatchException e) {
            System.out.println("Senden sayi istedik kardeşşş!");
        }
        
        try {
            System.out.println("Stringin indexteki harfi: "+str.charAt(index));
            System.out.println("Arrayin indexteki bileşeni: "+arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiğin index bizim arrayde yok kardeş!");;
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girdiğin index bizim Stringte yok kardeş!");;
        }
    }


}
