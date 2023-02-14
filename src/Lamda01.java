import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda01

{
    public static void main(String[] args)
    {

        /*
      1)  Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
          Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
      2) "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
          "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
      3)  "Functional Programming" hiz, code kisaligi, code okunabilirligi
          ve hatasiz code yazma acilarindan cok faydalidir.
      4)  Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.

*/


        //  List<Integer> sayi=new ArrayList<>(Arrays.asList(34, 22, 11, 35, 20, 63, 66, 81, 38, 15 ));
        List<Integer> sayi=new ArrayList<>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));

        //TASK  : "Structured Programming" kullanarak list elemanlarını aynı satirda
        // aralarında bosluk olacak sekilde print ediniz.

        String sum="";

        for (Integer w:sayi)
            System.out.print(w+" ");
        System.out.println();

        //TASK  : "functional Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

        sayi.stream().forEach((w) -> System.out.print(w+" "));
        System.out.println();
        sayi.stream().forEach(System.out::print);//sayıları bitişik yazdırır. "::" bu ifade metodunu cagırır.
        System.out.println();
        sayi.stream().forEach(Lamda01::yazdir);
        System.out.println();

        //TASK  : functional Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

        sayi.stream().
                forEach(Lamda01::ciftYazdir);//yeni metod cift yazdır
        System.out.println();

        sayi.stream().
                filter(w -> w%2==0 ).
                forEach(Lamda01::yazdir);//ilk metod cift yazdır

        //TASK :functional Programming ile list elemanlarinin 34 den kucuk cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

        System.out.println();

        sayi.stream().
                filter(w -> w<34 && w%2==0 ).
                forEach(Lamda01::yazdir);


    }
    public static void yazdir(int a){
        System.out.print(a+" ");
    }

    public static void ciftYazdir(int a){
        if (a%2==0)
            System.out.print(a+" ");

    }
    public static void yazdir2(double a){
        System.out.print(a+" ");
    }


}
