package F_MapDenemeleri;

import java.util.Map;
import java.util.Set;

public class Deneme_5 {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapGetir(); // Map oluşturdum

        // Öğrenci soyisimlerini BÜYÜK harflere çevir.

        Set<Map.Entry<Integer,String >> ogrenciEntrySeti = ogrenciMap.entrySet(); // Key ve value'yu birlikte almak için Entry Set'i oluşturdum.

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti // Her bir Entry'i tek tek for loop'un içine attım.
             ) {
            String eachValue = eachEntry.getValue(); // Her bir Entry'den String oluşturdum.
            String [] ValueArr = eachValue.split("-"); // Her bir String'ten Array oluşturdum.
            ValueArr[1]=ValueArr[1].toUpperCase(); // Array'in 1. indexindeki Soyisimleri Büyük Harfe Çevirdim.
            String yeniValue = ValueArr[0]+"-"+ValueArr[1]+"-"+ValueArr[2]+"-"+ValueArr[3]+"-"+ValueArr[4]; // Güncellediğim Arrayi diğer parçalarla Stringe çevirdim.
            eachEntry.setValue(yeniValue); // Stringe çevirdiğim Update edilmiş Value'yu Entry'e set ettim.
        }
        System.out.println(ogrenciMap);
    }
}
