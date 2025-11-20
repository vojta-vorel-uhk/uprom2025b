package uprom;

public class Cviko09_Uloha02
{
    public static void main(String[] args)
    {
        int[] interval1 = getInterval(15056);
        System.out.println(interval1[998]);
    }

    // TODO:
    //  Doplň a otestuj medotu, která vygeneruje pole
    //  po sobě jdoucích celých čísel, počínaje nulou
    public static int[] getInterval(int count)
    {
        int[] result = new int[count];
        for(int i=0;i<result.length;i++){
            result[i] = i;
        }
        return result;
    }

}
