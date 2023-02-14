import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02
{
    public static void main(String[] args)
    {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));
        // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
        // ayni satirda aralarina bosluk bırakarak print ediniz


        ciftKareYazdir(sayi);
        // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

        System.out.println();
        tekKupbirFazlaYazdir(sayi);
        System.out.println();
        // Task-3 : Functional Programming ile listin cift elemanlarinin
// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

        ciftKarekokYazdir(sayi);
        System.out.println();

        // Task-4 : list'in en buyuk elemanini yazdiriniz
        System.out.println(enBuyukYazdir(sayi));
        // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz

        enBuyukCiftYazdir(sayi);
        // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...

        elTopla(sayi);
        // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
        elCarp(sayi);
        // Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
        bestenBuyukEnkucuk(sayi);

        // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
        ciftKareSirala(sayi);
        System.out.println();
        bestenBuyukEnkucuk1(sayi);
        System.out.println();




    }
    public static void ciftKareYazdir(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0).map(t->t*t).
                forEach(Lamda01::yazdir);
    }
    public static void tekKupbirFazlaYazdir(List<Integer> sayi){

        sayi.stream().filter(t->t%2!=0).map(t->(t*t*t)+1).
                forEach(Lamda01::yazdir);

    }

    public static void ciftKarekokYazdir(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0).map(Math::sqrt).
                forEach(Lamda01::yazdir2);

    }
    public static Optional<Integer> enBuyukYazdir(List<Integer> sayi){

        Optional<Integer> maxSayi= sayi.
                stream().
                reduce(Math::max);//benim result degerim tek bir deger ise reduce metodunu kullan


        return maxSayi;
    }

    public static void enBuyukCiftYazdir(List<Integer> sayi){

        Optional<Integer> maxCiftSayi= sayi.
                stream().
                filter(w->w%2==0).
                map(w->w*w).
                reduce(Math::max);//benim result degerim tek bir deger ise reduce metodunu kullan

        System.out.println(maxCiftSayi);

    }

    public static void elTopla(List<Integer> sayi){

        int toplam= sayi.stream().reduce(0,(a,b)->a+b);

        System.out.println(toplam);

    }
    public static void elCarp(List<Integer> sayi){

        int carp= sayi.stream().
                filter(t->t%2==0).reduce(1,(a,b)->a*b);

        System.out.println(carp+"--");

    }
    public static void bestenBuyukEnkucuk(List<Integer> sayi){

        Optional<Integer> min= sayi.stream().
                filter(t->t%2!=0&& t>5).reduce(Math::min);

        System.out.println(min);

    }
    public static void ciftKareSirala(List<Integer> sayi){

        sayi.stream().
                filter(t->t%2==0).map(t->t*t).sorted().forEach(Lamda01::yazdir);

    }

    public static void bestenBuyukEnkucuk1(List<Integer> sayi){

        Optional<Integer> min= sayi.stream().
                filter(t->t%2!=0&& t>5).reduce(Math::min);
        String str=min+"";
        int mino= Integer.parseInt(str.replaceAll("[^0-9]",""));

        System.out.println(mino+5);

    }

}

