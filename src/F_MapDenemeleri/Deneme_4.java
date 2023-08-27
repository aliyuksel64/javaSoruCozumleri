package F_MapDenemeleri;

import java.util.Map;
import java.util.Set;

public class Deneme_4 {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapGetir(); // yeni bir Map oluşturdum.

        System.out.println(ogrenciMap);

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet(); // key ve value'yu bir arada kullanmak için bir Entry seti oluşturdum.

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti  // ogrenciEntrySeti'nden her bir entry'i tek tek aldım.
             ) {

            String eachValue = eachEntry.getValue(); // Her bir value'yu alıp Srtinglere çevirdim.
            System.out.println(eachValue); // String hallerini görmek için arada yazdırdım.
            String [] valueArr = eachValue.split("-");  // Her bir String'ten birer Array oluşturdum.
            switch (valueArr[2]){ // Switch ile sınıf değerlerini birer artırdım.
                case "9":
                    valueArr[2]="10";
                    break;
                case "10":
                    valueArr[2]="11";
                    break;
                case "11":
                    valueArr[2]="12";
                    break;
                case "12":
                    valueArr[2]="Mezun";
                    break;
            }
            // Artırdığım değer Arraylerini altta String'e çevirdim.
            String yeniValue = valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];
           eachEntry.setValue(yeniValue); // Her bir Entry'e artırdığım yeni Value'ları update ettim.

        }
        System.out.println(ogrenciMap);
    }
}
