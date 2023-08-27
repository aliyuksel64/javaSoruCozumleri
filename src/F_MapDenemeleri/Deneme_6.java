package F_MapDenemeleri;

import java.util.Map;
import java.util.Set;

public class Deneme_6 {
    public static void main(String[] args) {

        Map<Integer,String > ogrenciMap = MethodDeposu.ogrenciMapGetir();
        System.out.println(ogrenciMap);

        // Şubesi H olanları T yap.

        Set<Map.Entry<Integer,String >> ogrenciEntrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            String ValueStr = eachEntry.getValue(); // Her bir Entry'nin Valuesunu getirip String olarak kaydettim.
            String [] ValueArr = ValueStr.split("-");
            if (ValueArr[3].equals("H")){
                ValueArr[3]="T";
                String yeniValue = ValueArr[0]+"-"+ValueArr[1]+"-"+ValueArr[2]+"-"+ValueArr[3]+"-"+ValueArr[4];
                eachEntry.setValue(yeniValue);
            }
        }
        System.out.println(ogrenciMap);

    }
}
