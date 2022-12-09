import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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

        System.out.println("Funkcja aproksymujaca ma postac: "+a+"x +"+" ("+b+")");





    }
    public static void funkcja2(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
    {
        int n = liczbaWezlow-1;
        //obliczanie sum
        double sumaxi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumaxi+=(1/wartosciWezlow[i]);
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
            sumaxi2+=pow((1/wartosciWezlow[i]),2);
        }
        System.out.println("sumaxi2: "+ sumaxi2);

        double sumafixi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumafixi+=wartosciFunkcji[i]*(1/wartosciWezlow[i]);
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

        System.out.println("Funkcja aproksymujaca ma postac: "+a+"/x "+"+ ("+b+")");


    }
    public static void funkcja3(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
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
            sumafi+=(Math.log(wartosciFunkcji[i]));
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
            sumafixi+=(Math.log(wartosciFunkcji[i])*wartosciWezlow[i]);
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

        double bb= pow(Math.E,b);
        double aa = pow(Math.E,a);
        System.out.println("Funkcja aproksymujaca ma postac: e^"+ b +" * e^("+ a +"*x)");
        System.out.println("Jej dokladna postac to: "+ bb +" * "+ aa +"^x");

    }
    public static void funkcja4(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
    {
        int n = liczbaWezlow-1;
        //obliczanie sum
        double sumaxi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumaxi+=pow(wartosciWezlow[i],2);
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
            sumaxi2+=pow(pow(wartosciWezlow[i],2),2);
        }
        System.out.println("sumaxi2: "+ sumaxi2);

        double sumafixi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumafixi+=wartosciFunkcji[i]*pow(wartosciWezlow[i],2);
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

        System.out.println("Funkcja aproksymujaca ma postac: "+a+"x^2 +"+" ("+b+")");





    }
    public static void funkcja5(int liczbaWezlow, double [] wartosciWezlow, double [] wartosciFunkcji)
    {
        int n = liczbaWezlow-1;
        //obliczanie sum
        double sumaxi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumaxi+=sqrt(wartosciWezlow[i]);
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
            sumaxi2+=pow(sqrt(wartosciWezlow[i]),2);
        }
        System.out.println("sumaxi2: "+ sumaxi2);

        double sumafixi=0;
        for(int i=0;i<liczbaWezlow;i++)
        {
            sumafixi+=wartosciFunkcji[i]*sqrt(wartosciWezlow[i]);
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

        System.out.println("Funkcja aproksymujaca ma postac: "+a+"*pierwiastek kwadratowy z x +"+" ("+b+")");





    }

}
