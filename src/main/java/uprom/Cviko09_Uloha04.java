package uprom;

public class Cviko09_Uloha04
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        int[] b = new int[0];
        for(int i=0; i<b.length;i++)
            System.out.println(b[i]);
        int[] inputs = {23,75,69,65,25,29,61,10,9,75,33,58,72,90,68,100,77,55,31,39,1};
    }

    public static int countOf(int[] input, int x)
    {
        int result = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]==x)
                result++; //tj. result = result + 1;
        }
        return result;
    }

    // TODO:
    //  Vytvoř a otestuj medotu, která zjistí,
    //  kolikrát se v daném poli celých čísel
    //  vyskytuje daná hodnota
}
