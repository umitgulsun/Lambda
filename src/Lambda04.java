
import java.util.*;
import java.util.stream.Collectors;

public class Lambda04
{

    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */

    public static void main(String[] args)
    {
        Universite u01=new Universite("bogazici","matematik",571,93);
        Universite u02=new Universite("Istanbul tk","matematik",600,81);
        Universite u03=new Universite("Istanbul","hukuk",1400,71);
        Universite u04=new Universite("Marmara","bilgisayar",1080,77);
        Universite u05=new Universite("odtu","gemi mh",333,74);

        List<Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));


        System.out.println(notOrtalamasi74tenBuyukMu(unv));
        System.out.println(matematikVarMi(unv));
        System.out.println(buyuktenSiralaUniversite(unv));
        notOrtalam74ten(unv);
        System.out.println();
        buyuktenSirala(unv);



    }

    public static void buyuktenSirala(List<Universite> liste)
    {
        Collections.sort(liste,Comparator.comparing(Universite::getOgrenciSayisi));
        System.out.println(liste);

    }

    public static void notOrtalam74ten(List<Universite> liste)
    {
        for (int i = 0; i < liste.size(); i++)
        {
            if (liste.get(i).getNotOrtalamasi()>=74)
            {
                System.out.print(liste.get(i).getUnivercity()+" ----  ");
            }
        }

    }


    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrtalamasi74tenBuyukMu(List<Universite> liste)
    {
        return liste.stream().allMatch(t->t.getNotOrtalamasi()>74);
    }

    //task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.




    public static boolean matematikVarMi(List<Universite> liste)
    {
        return liste.stream().anyMatch(t->t.getBolum().toLowerCase().equals("mat"));
    }
    public static List<Universite> buyuktenSiralaUniversite(List<Universite> liste)
    {
        List<Universite> unver=  liste.stream().sorted(Comparator.
                        comparing(Universite::getOgrenciSayisi).reversed()).
                collect(Collectors.toList());
        return unver;
    }



}
