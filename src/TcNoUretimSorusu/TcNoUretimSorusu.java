package TcNoUretimSorusu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TcNoUretimSorusu {
    /*
    Dinamik olarak yeni bir tc no üreten metodu yazınız. Tc no aşağıdaki koşullara göre oluşturunuz.
    TC kimlik numarasının son rakamı çift olmak zorundadır. 0 rakamı ile başlayamaz.
    ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
    Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının
    toplamının birler basamağı 10. rakamı;
    1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
     */
    public static void main(String[] args) {
        tcNoUretim();
    }
    public static void tcNoUretim() {
        Random random = new Random();
        int[] tcNo = new int[11];
        int toplam = 0;
        int tekToplam = 0;
        int ciftToplam = 0;
        do {
            for (int i = 0; i < tcNo.length; i++) {
                tcNo[i] += random.nextInt(10);
            }
            for (int i = 0; i < 10; i++) {
                toplam += tcNo[i];
            }
            for (int i = 1; i < 10; i += 2) {
                tekToplam += tcNo[i];
            }
            for (int i = 2; i < 9; i += 2) {
                ciftToplam += tcNo[i];
            }
        } while (tcNo[0] ==0  && tcNo[10] % 2 ==1 && toplam%10 != tcNo[10] &&
                (tekToplam * 7) + (ciftToplam * 9) % 10 != tcNo[9] && tekToplam * 8 % 10 != tcNo[10]);
        System.out.println(Arrays.toString(tcNo));
    }
}