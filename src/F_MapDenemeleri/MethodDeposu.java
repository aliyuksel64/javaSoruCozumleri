package F_MapDenemeleri;

import java.util.*;

public class MethodDeposu {

    public static void main(String[] args) {



    }

    public static Map<Integer, String> ogrenciMapGetir() {

        Map<Integer,String> ogrenciMap = new TreeMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");


return ogrenciMap;
    }

    public  static void siraNoIleOgrenciListesiYap() {

        Collection <String> ogrColl = ogrenciMapGetir().values();

        String[] valueArr = new String[0];

        System.out.println( "---SINIF LİSTESİ--- ");
        int sira = 1;
        for (String eachValue : ogrColl
        ) {
            valueArr = eachValue.split("-");
            System.out.println(sira+ " "+valueArr[0] + " " + valueArr[1]);
            sira ++;


        }

    }

    public static void sinifListesiVer (){

        Map <Integer,String> ogrenciMap = ogrenciMapGetir();

        Collection <String> ogrColl = ogrenciMap.values(); // mapi collection'a çevirdim.
        System.out.println("Uşaklılar Listesi");
        for (String eachValue: ogrColl // for each loop ile collection'a çevirdiğim Map'i String olarak getirdim.
             ) {
            String [] ogrArr = eachValue.split("-");  // Stringe çevirdiğim her bir Collection'ı Array'e çevirdim.
                if (ogrArr[4].equals("Uşak")){ // Her bir Array elementinin 4. indexinin Uşak ile aynı olup olmadığını kontrol ettim.
                System.out.println(ogrArr[0]+" "+ogrArr[1]);
            }
        }

    }

    public static Map seneSonuSinifArtir() {

        Map <Integer,String> ogrenciMap1 = MethodDeposu.ogrenciMapGetir();
        Set<Integer> ogrenciKeySeti = ogrenciMap1.keySet(); // [101, 102, 103, 104, 105, 106]
        for (Integer eachKey: ogrenciKeySeti
        ) {
            String eachValue = ogrenciMap1.get(eachKey);
            System.out.println(eachValue);
            String[] valueArr = eachValue.split("-");
            System.out.println(Arrays.toString(valueArr));
            switch (valueArr[2]) {
                case "9":
                    valueArr[2] = "10";
                    break;
                case "10":
                    valueArr[2] = "11";
                    break;
                case "11":
                    valueArr[2] = "12";
                    break;
                case "12":
                    valueArr[2] = "Mezun";
                    break;
            }
            String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];
            ogrenciMap1.put(eachKey, yeniValue);

        }


return ogrenciMap1;
    }

    public static Map<Integer, String> bolumDegistirenMethod(Map ogrenciMap, String eskiBolum, String yeniBolum) {

        Map <Integer,String> ogrenciMap1 = MethodDeposu.ogrenciMapGetir();  // ogrenciMapGetir methodunu kullanarak yeni bir Map oluşturdum.

        Set <Integer> ogrenciKeySeti = ogrenciMap1.keySet(); // öğrenci Map'inden yeni bir Set oluşturdum. Bu bana Map'in keylerini set olarak getirdi.

        for (Integer eachKey: ogrenciKeySeti   // Setin her bir keyinin Valuesunu  String olarak getirdim.
             ) {
            String ogrStr = ogrenciMap1.get(eachKey); // ogrenciMap'in getirdiği her bir Value değeri String olarak kaydettim.

            String [] ogrArr = ogrStr.split("-"); // Gelen her bir Stringi Array olarak kaydettim.

            if (ogrArr[4].equals(eskiBolum)){ // Gelen arraydeki 4. indexte TM varsa if'in içine gir
                ogrArr[4]=yeniBolum; // 4. indexteki TM'yi EA'ya çevir
            }
            String yeniValue = ogrArr[0]+"-"+ogrArr[1]+"-"+ogrArr[2]+"-"+ogrArr[3]+"-"+ogrArr[4]; // Yeni arraydeki bilgileri String yap.

            ogrenciMap1.put(eachKey,yeniValue); // Yeni Stringleri ogrenciMap'e kaydet.

        }
        return ogrenciMap1;

    }




    }



