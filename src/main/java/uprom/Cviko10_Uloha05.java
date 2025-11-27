package uprom;

public class Cviko10_Uloha05
{
    public static void main(String[] args)
    {
        String[] texts = new String[1_000_000];
        Cviko10_Utils.fillExample(texts);
    }
    public static void insert(String[] m,String s,int index)
    {
        int count = Cviko10_Uloha04.count(m);
        if(index > count)
            return; // Neplatný vstup
        for(int p=count-1; p>=index ;p--){ // Uvolnit pozici index
            m[p+1] = m[p];// Posuň obsah z p na p+1
        }
        m[index] = s; // Zapsat string s na pozici index
    }

    // TODO:
    //  Doplň metodu, která vloží nový řetězec
    //  na danou pozici v kolekci

}
