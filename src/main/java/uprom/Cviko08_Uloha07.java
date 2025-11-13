package uprom;

public class Cviko08_Uloha07
{
    public static void main(String[] args)
    {
         /*
        Vytvoř a využij metodu, která
        daný řetězec převede na velká písmena
        a na konec připojí daný počet vykřičníků
        */
        System.out.println(shout("ahoj",5));
    }

    public static String shout(String s, int exclamations)
    {
        String result = s.toUpperCase();
        for(int i=0; i<exclamations; i++){
            result = result + "!";
        }
        return result;
    }
}
