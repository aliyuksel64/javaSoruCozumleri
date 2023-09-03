package I_ConstructorQuestion;

public class C2_Student {

    String isim = "Belirtilmedi";
    int sinif = 0;
    char sube ='-';
    long telefon=000;

    public String toString() {
        return "Öğrenci Bilgileri " +
                "İsim: " + isim +
                ", Sınıf-Şube: " + sinif + "/" + sube+
                ", Telefon No: "+telefon;
    }


    public C2_Student(String isimler, int sinif, char sube,long telefon) {
        this.isim=isimler;
        this.sinif =sinif;
        this.sube=sube;
        this.telefon=telefon;



    }
}
