import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz funkcje. Wprowadz 1, 2 ,3 ,4 lub 5: ");
        System.out.println("1: ax +b ");
        System.out.println("2: a/x +b ");
        System.out.println("3: b * a^x ");
        System.out.println("4: a*x^2 +b ");
        System.out.println("5: a* pierwiastek kwadratowy z x +b ");
        Scanner wybor = new Scanner(System.in);
        int funkcja = wybor.nextInt();
        //liczba wezlow
        System.out.println("Podaj liczbe wezlow: ");
        Scanner wezly = new Scanner(System.in);
        int liczbaWezlow = wezly.nextInt();
        //wartosci wezlow
        double[] wartosciWezlow = new double [liczbaWezlow];
        if(funkcja==1||funkcja==4||funkcja==3||funkcja==5) {
            for (int i = 0; i < liczbaWezlow; i++) {
                System.out.println("Wprowadz wartosc x[" + i + "]: ");
                Scanner wartosc = new Scanner(System.in);
                wartosciWezlow[i] = wartosc.nextDouble();
            }
        }
        if(funkcja==2)
        {
            for (int i = 0; i < liczbaWezlow; i++) {
                System.out.println("Wprowadz wartosc mianownika w x[" + i + "]: ");
                Scanner wartosc = new Scanner(System.in);
                wartosciWezlow[i] = 1/wartosc.nextDouble();
            }
        }

        //wartosci funkcji w wezlach
        double[] wartosciFunkcji = new double [liczbaWezlow];
        if(funkcja==1||funkcja==2||funkcja==4||funkcja==5) {
            for (int i = 0; i < liczbaWezlow; i++) {
                System.out.println("Wprowadz wartosci funckji w wezle x[" + i + "]: ");
                Scanner funkcjaX = new Scanner(System.in);
                wartosciFunkcji[i] = funkcjaX.nextDouble();
            }
        }
        if(funkcja==3) {
            for (int i = 0; i < liczbaWezlow; i++) {
                System.out.println("Wprowadz wartosci wykladnika e w funkcji w wezle x[" + i + "]:");
                System.out.println(" jesli wartosc funkcji jest rowna 1, wprowadz 0");
                Scanner funkcjaX = new Scanner(System.in);
                wartosciFunkcji[i] = pow(Math.E,funkcjaX.nextDouble());
            }
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
        if(funkcja==4)
        {
            MetodaNajmniejszychKwadratow.funkcja4(liczbaWezlow,wartosciWezlow,wartosciFunkcji);
        }
        if(funkcja==5)
        {
            MetodaNajmniejszychKwadratow.funkcja5(liczbaWezlow,wartosciWezlow,wartosciFunkcji);
        }

    }
}