import java.util.Scanner;

import static java.lang.Math.pow;

public class MetodaNajmniejszychKwadratow {
    public static void funkcja1(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
    {
        int n = liczbaWezlow-1;
        //obliczanie sum
        double sumaxi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumaxi+=wartosciWezlow[i];
        }
        System.out.println("sumaxi: "+ sumaxi);
        double sumafi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumafi+=wartosciFunkcji[i];
        }
        System.out.println("sumafi: "+ sumafi);

        double sumaxi2=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumaxi2+=pow(wartosciWezlow[i],2);
        }
        System.out.println("sumaxi2: "+ sumaxi2);

        double sumafixi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumafixi+=wartosciFunkcji[i]*wartosciWezlow[i];
        }
        System.out.println("sumafixi: "+ sumafixi);

        //obliczanie wyznacznikow
        double W;
        double Wa0;
        double Wa1;

        W = (n+1)*sumaxi2 - sumaxi*sumaxi;
        Wa0= sumafi*sumaxi2 - sumafixi*sumaxi;
        Wa1= (n+1)*sumafixi - sumaxi*sumafi;

        double b= Wa0/W;
        double a = Wa1/W;

        System.out.println("Funkcja aproksymujaca ma postac: "+a+"x +"+"("+b+")");





    }
    public static void funkcja2(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
    {

    }
    public static void funkcja3(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
    {

    }

}
