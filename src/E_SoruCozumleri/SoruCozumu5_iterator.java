package E_SoruCozumleri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SoruCozumu5_iterator  {

    public static void main(String[] args) {



    List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        System.out.println(sayilar);

        Iterator itr = sayilar.iterator();


       itr.next();
       itr.remove();

       System.out.println(sayilar);
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();
        System.out.println(sayilar);




}
}