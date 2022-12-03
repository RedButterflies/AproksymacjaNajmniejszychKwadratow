import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz funkcje. Wprowadz 1, 2 lub 3: ");
        Scanner wybor = new Scanner(System.in);
        int funkcja = wybor.nextInt();
        //liczba wezlow
        System.out.println("Podaj liczbe wezlow: ");
        Scanner wezly = new Scanner(System.in);
        int liczbaWezlow = wezly.nextInt();
        //wartosci wezlow
        double wartosciWezlow [] = new double [liczbaWezlow];
        for(int i=0;i<liczbaWezlow;i++)
        {
            System.out.println("Wprowadz wartosc x["+i+"]: ");
            Scanner wartosc = new Scanner(System.in);
            wartosciWezlow[i]=wartosc.nextDouble();
        }

        //wartosci funkcji w wezlach
        double wartosciFunkcji[]= new double [liczbaWezlow];
        for(int i=0;i<liczbaWezlow;i++)
        {
            System.out.println("Wprowadz wartosci funckji w wezle x["+i+"]: ");
            Scanner funkcjaX = new Scanner(System.in);
            wartosciFunkcji[i]=funkcjaX.nextDouble();
        }
        if(funkcja==1)
        {
            MetodaNajmniejszychKwadratow.funkcja1(liczbaWezlow,wartosciWezlow,wartosciFunkcji);
        }
        if(funkcja==2)
        {
            MetodaNajmniejszychKwadratow.funkcja2(liczbaWezlow,wartosciWezlow,wartosciFunkcji);
        }
        if(funkcja==3)
        {
            MetodaNajmniejszychKwadratow.funkcja3(liczbaWezlow,wartosciWezlow,wartosciFunkcji);
        }

    }
}