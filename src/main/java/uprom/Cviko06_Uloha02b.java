package uprom;

import java.util.Scanner;

public class Cviko06_Uloha02b
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bound = 10;
        while (bound < n)
            bound = bound * 10;
        System.out.println(
                "Zadal jste číslo mezi "
                        + (bound/10) + " a "+bound);


        // Z konzole načti přirozené číslo N
        // Podle toho, jak bylo velké, vypiš správnou hlášku, například:
        // "Zadali jste číslo mezi 1 a 10"
        // "Zadali jste číslo mezi 10 a 100"
        // "Zadali jste číslo mezi 100 a 1000"
        // "Zadali jste číslo mezi 1000 a 10000"
        //  atd.
    }
}
