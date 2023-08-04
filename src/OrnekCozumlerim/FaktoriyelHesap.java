package OrnekCozumlerim;

public class FaktoriyelHesap {


    public static void main(String[] args) {

        faktoriyelHesap(6);
    }

    private static void faktoriyelHesap(double sayi) {

        double carpim=1;
        for (int i = 1; i <= sayi; i++) {
            carpim *= i;



            }
        System.out.println("Hesabı istenen " +sayi+"! = "+carpim);
        }


    }
