package uprom;

import java.util.Scanner;

public class Cviko06_Uloha04
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<x;j++)
                System.out.print("•");
            System.out.println();
        }


        // Z konzole načti přirozená čísla X a Y
        // Vykresli na konzoli obdélník velikosti X krát Y
        // vyplněný puntíky (znak •)
    }
}
