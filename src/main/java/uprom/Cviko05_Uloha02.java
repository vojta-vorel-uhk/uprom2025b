package uprom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cviko05_Uloha02
{
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/data/obce.txt";
        Scanner scanner = new Scanner(new File(path));
        int viceslovne = 0;
        int vsechny = 0;
        while (scanner.hasNextLine()){
            String obec = scanner.nextLine();
            vsechny = vsechny + 1;
            if(obec.contains(" ")){
                viceslovne = viceslovne + 1;
            }
        }
        double vysledek = viceslovne * 100d / vsechny ;
        System.out.println(vysledek + " %");

        // Vypiš, kolik procent obcí v ČR má víceslovný název
    }
}
