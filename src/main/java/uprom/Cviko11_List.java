package uprom;

public class Cviko11_List
{
    String[] texts = new String[1_000_000];
    int count = 0;

    public void insert(int i, String s) {
        int count = Cviko10_Uloha04.count(texts);
        if(i > count)
            return; // Neplatný vstup
        for(int p=count-1; p>=i ;p--){ // Uvolnit pozici index
            texts[p+1] = texts[p];// Posuň obsah z p na p+1
        }
        texts[i] = s; // Zapsat string s na pozici index
    }

    public void add(String s) {
        for(int i=0; i< texts.length; i++){
            if(texts[i] == null){
                texts[i] = s;
                break;
            }
        }
    }

    public void removeAt(int i) {
        // TODO: doplnit metodu removeAt, ostraní prvek
        // na dané pozici a existující posune
    }

    public String get(int i) {
        return texts[i];
    }
}
