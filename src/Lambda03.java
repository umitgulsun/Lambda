import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03
{

    public static void main(String[] args)
    {
        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havucDilim", "güvec", "kokorec",
                "küşleme", "arabAşı", "waffle", "künefe", "güvec"));

        // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

        alfBykTekrarsiz(menu);
        System.out.println();
        // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

        karakterSayisiters(menu);
        System.out.println();


        // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..

        karakterSayisikucuktenByke(menu);
        System.out.println();
        // ******************************************************************************************
        // *********************** anyMatch() *** allMatch() **** noneMatch() ************************
        //*******************************************************************************************

        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        // Task-4 : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

        harfSayisi7denAzKontrol(menu);
        System.out.println();

        // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
        wileKontrol222(menu);


        // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

        xileKontrol222(menu);

        // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.

        enBuyukKarakter(menu);

        // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

        //uzunyolu structered
     /*   String[] dizi = new String[menu.size()];

        for (int i = 0; i < dizi.length; i++)
        {
            dizi[i] = menu.get(i);
        }
        System.out.println(Arrays.toString(dizi));
        String konteynir = "";


        for (int i = 0; i < menu.size(); i++)
        {

                for (int j = i + 1; j < menu.size(); j++)
                {
                    if (dizi[i].charAt(dizi[i].length() - 1) > dizi[j].charAt(dizi[j].length() - 1) )
                    {
                        konteynir = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = konteynir;
                    }
                }

        }
        System.out.println(Arrays.toString(dizi));

        ilkelemanHaricSonHarfiSirali(menu);*/


    }

    public static void alfBykTekrarsiz(List<String> yemek)
    {
        yemek.stream().map(String::toUpperCase).sorted().
                distinct().forEach(w -> System.out.print(w + " "));
    }

    public static void karakterSayisiters(List<String> yemek)
    {
        yemek.stream().map(String::length).sorted(Comparator.reverseOrder()).
                distinct().forEach(w -> System.out.print(w + " "));
    }

    public static void karakterSayisikucuktenByke(List<String> yemek)
    {
        
        yemek.stream().sorted(Comparator.comparing(String::length)).
                forEach(w -> System.out.print(w + " "));
    }

    public static void harfSayisi7denAzKontrol(List<String> yemek)
    {
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ?
                "list elemanlarının 7 ve daha az harfden olusuor" :
                "List elemanları 7 harfden buyuk");
    }

    public static void wileKontrol222(List<String> yemek)
    {
        System.out.println(yemek.stream().noneMatch(t -> t.startsWith("w")) ?
                "w ile yemek ismimi olur" :
                "w ile yemek var");
    }

    public static void xileKontrol222(List<String> yemek)
    {
        System.out.println(yemek.stream().anyMatch(t -> t.endsWith("x")) ?
                "x var" :
                "x yok");
    }

    public static void enBuyukKarakter(List<String> yemek)
    {
        Stream<String> sonisim = yemek.stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).//comparing(String::length) yazılabilir
                        limit(1);//limit metodu kullanılarak sadece ilk eleman cagrıldı limit metodu Stream<> yapıdadır.

        System.out.println(Arrays.toString(sonisim.toArray()));//arraye cevirip yazdırdık
    }

    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void ilkelemanHaricSonHarfiSirali(List<String> yemek)
    {
        yemek.stream().sorted(Comparator.
                        comparing(t -> t.charAt(t.length() - 1))).
                skip(1).forEach(t -> System.out.print(t + " "));

    }


}

