package uprom;

import java.util.Scanner;

public class Cviko08_Uloha04
{
    public static void main(String[] args)
    {
        /*
        Vytvoř a využij metodu, která
        zjistí, zda číslo A je méně než setinou čísla B
        */
        Scanner s = new Scanner(System.in);
        double first = s.nextDouble();
        double second = s.nextDouble();
        if(isMuchSmaller(first,second))
            System.out.println("OK");
        else
            System.out.println("NOT OK");
    }

    public static boolean isMuchSmaller(double a, double b)
    {
        return a < b/100;
    }
}
