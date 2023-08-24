package C_Inheritance;

public class C_Banaz extends B_Usak{
    String baskan = "Ali";

    public static void main(String[] args) {


        B_Usak kentim = new C_Banaz();
        C_Banaz ilcem = new C_Banaz();
        ilcem.iklim();
        kentim.nufus();
        ilcem.belediye();


    }


    public void iklim(){
        System.out.println("Gecis iklimi");
    }
    public void nufus (){
        System.out.println(20000);
    }
    public void belediye (){
        System.out.println("Belediye var.");

    }
    public void koySayisi(){
        System.out.println(250);
    }




}
