package uprom;

public class Cviko10_Uloha04
{
    public static void main(String[] args)
    {
        String[] texts = new String[1_000_000];
        Cviko10_Utils.fillExample(texts);
        System.out.println(count(texts));
    }
    public static int count(String[] a){
        for(int i=0; i<a.length; i++){
            if(a[i] == null)
               return i;
        }
        return a.length;
    }
    // TODO:
    //  Doplň metodu, která vrátí aktuální počet řetězců
    //  v kolekci

}
