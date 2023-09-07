package M_ForLoop;

public class C2_KelimeyiTersCevirenMethod {
    public static void main(String[] args) {
        kelimeTersCevirenMethod("ey edip adanada pide ye");
        kelimeTersCevirenMethod("Ey internetçi netçi içten içten ret niye");
        kelimeTersCevirenMethod("Karalasak şairi aşka salarak");

    }

    public static void kelimeTersCevirenMethod(String kelime){
        String [] tersarr = kelime.split("");
        StringBuilder tersKelime= new StringBuilder();
        for (int i = tersarr.length-1; i >= 0 ; i--) {
            tersKelime.append(tersarr[i]);

        }
        System.out.println(tersKelime);

    }
}
