package uprom;

import java.util.Scanner;

public class Cviko06_Uloha06
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int emptyLines = 0;
        do
        {
            String line = s.nextLine();
            if(line.equals(""))
                emptyLines=emptyLines+1;
            else
                emptyLines = 0;
        } while (emptyLines < 5);

        // Načítej řádky z konzole.
        // Pokud byl pětkrát za sebou zadán prázdný řádek,
        // program končí
    }
}
