package uprom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cviko06_Uloha05
{
    public static void main(String[] args) throws FileNotFoundException {
        String path = System.getProperty("user.dir")+"/data/hesla.txt";
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            for(int i=0; i<line.length()-3; i++)
            {
                if(line.charAt(i)=='A'
                && line.charAt(i+3)=='A') {
                    System.out.println(line);
                }
            }
        }

        // Ze souboru hesla.txt vypiš řádky,
        // které obsahují podřetězec ve tvaru A**A
    }
}
