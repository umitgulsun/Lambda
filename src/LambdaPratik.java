import java.util.*;
import java.util.stream.Collectors;

public class LambdaPratik
{
    public static void main(String[] args)
    {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        negatifYazdir(list);//negatifleri yaz
        System.out.println();
        // S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım

        kareYazdir(list);
        System.out.println();
        //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım

        kareTekrarsizYazdir(list);
        System.out.println();
        buyuktenkucugeYazdir(list);
        System.out.println();
        System.out.println(pozKup5list(list));

        //   Collections.reverse(list);
        //    System.out.println(list+"--");
        System.out.println(pozKare1list(list));

        //list elemanlarını topla
        System.out.println(toplYazdir(list));



    }

    public static void negatifYazdir(List<Integer> sayi){
        sayi.stream().filter(t->t<0).forEach(w-> System.out.print(w+" "));

    }
    public static void kareYazdir(List<Integer> sayi){
        sayi.stream().map(t->t*t).forEach(Lamda01::yazdir2);

    }

    public static void kareTekrarsizYazdir(List<Integer> sayi){
        sayi.stream().map(t->t*t).distinct().forEach(w-> System.out.print(w+" "));

    }
    public static void buyuktenkucugeYazdir(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(w-> System.out.print(w+" "));

    }

    public static List<Integer> pozKup5list(List<Integer> list){
        return list.stream().filter(t-> t>0 && t%10 == 5).map(t -> t*t*t).collect(Collectors.toList());//listeye atma collect ile
    }
    public static List<Integer> pozKare1list(List<Integer> list){
        return list.stream().filter(t-> t>0&& t%10 != 5).map(t -> t*t).collect(Collectors.toList());//listeye atma collect ile
    }

    public static int toplYazdir(List<Integer> sayi){
        int i=  sayi.stream().reduce(0,(a,b)->a+b);//Integer sınıfından sum metoduda olabilirdi
        return i;

    }

}
