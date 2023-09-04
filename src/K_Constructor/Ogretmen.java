package K_Constructor;

public class Ogretmen {
    String isim="İsim belirtilmedi";
    String soyisim = "Soyisim belirtilmedi.";
    String brans = "Branş belirtilmedi.";

    public Ogretmen(){  // Parametresiz class: Defaulttan 1. farkı parametresizi biz oluştururuz.
        // defaultu Java oluşturur. 2. farkı body'sinin içine kod girebiliriz.

        isim = "Ahmet";
        soyisim="Yavaş";
        brans = "Matematik";
    }
    public Ogretmen(String isim, String soyisim, String brans){
        // Parametreli constructorın özelliği variablelara doğrudan değer atanmasını sağlamasıdır.
        this.isim = isim;  // this. keywordu aynı classtaki instance variable ismi ile parametrenin içindeki variableın
        this.soyisim=soyisim; // karışmasını engeller. this.isim denince class seviyesindeki variableın adını alır.
        this.brans = brans; // karşısındaki = soyisim ise değerini dışarıdan gönderilen parametreden alır.
    }

    public static void main(String[] args) {

        Ogretmen ogretmen1= new Ogretmen();
        System.out.println(ogretmen1.isim+" " +ogretmen1.soyisim+" / "+ogretmen1.brans );

        ogretmen1.isim="Ali";
        ogretmen1.soyisim="Yüksel";
        ogretmen1.brans="Edebiyat";
        System.out.println(ogretmen1.isim+" " +ogretmen1.soyisim+" / "+ogretmen1.brans );


        Ogretmen ogretmen2=new Ogretmen();

        ogretmen2.isim="Mehmet";
        System.out.println(ogretmen2.isim+" " +ogretmen2.soyisim+" / "+ogretmen2.brans );

        Ogretmen ogretmen3=new Ogretmen("Ziya","Ateş","Fizik");
        System.out.println(ogretmen3.isim+" " +ogretmen3.soyisim+" / "+ogretmen3.brans );

        Ogretmen ogretmen4 = new Ogretmen("Leyla","Gencer","Resim");
        System.out.println(ogretmen4.isim+" " +ogretmen4.soyisim+" / "+ogretmen4.brans );

        Ogretmen ogretmen5 = new Ogretmen("Murat","Turat","Coğrafya");
        System.out.println(ogretmen5.isim+" " +ogretmen5.soyisim+" / "+ogretmen5.brans );
    }
}
