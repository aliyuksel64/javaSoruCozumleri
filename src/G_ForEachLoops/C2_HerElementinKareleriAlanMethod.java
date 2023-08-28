package G_ForEachLoops;

public class C2_HerElementinKareleriAlanMethod {

    /*Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
    yazdiran bir method olusturun. */

    public static void main(String[] args) {

        int [] arr = {5,15,3,9};
        kareAlanMethod(arr);
    }
    private static void kareAlanMethod(int [] arr) {
        int kareToplam = 0;
        for (int each : arr
             ) {
            int kare=each*each;
            kareToplam+=kare;
        }
        System.out.println("Verdiğiniz Array'deki elementlerin kareleri toplamı: "+kareToplam);
    }


}
