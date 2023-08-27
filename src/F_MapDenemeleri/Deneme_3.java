package F_MapDenemeleri;

import java.util.Map;

public class Deneme_3 {

    // Bölümü TM olanları EA yap

    public static <Set> void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapGetir();
        System.out.println(ogrenciMap);
        System.out.println(MethodDeposu.bolumDegistirenMethod(ogrenciMap,"MF","SAY"));


    }


}
