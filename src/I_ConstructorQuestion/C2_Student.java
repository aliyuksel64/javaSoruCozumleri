package I_ConstructorQuestion;

public class C2_Student {

    String isim = "Belirtilmedi";
    String soyisim= "Belirtilmedi";
    int sinif = 0;
    char sube ='-';
    long telefon=000;

    public String toString() {
        return "Öğrenci Bilgileri " +
                "İsim: " + isim +" "+ soyisim+
                ", Sınıf-Şube: " + sinif + "/" + sube+
                ", Telefon No: 0532 "+telefon;
    }


    public C2_Student(String isimler, String soyisim, int sinif, char sube,long telefon) {
        this.isim=isimler;
        this.soyisim=soyisim;
        this.sinif =sinif;
        this.sube=sube;
        this.telefon=telefon;



    }
}