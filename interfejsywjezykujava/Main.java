package pl.samouczekprogramisty.kursjava.interfejsywjezykujava;



import java.util.Scanner;

public class Main {

         public static void main(String[] args) {

        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addiction(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {

        int wybor = 0;
        Scanner in = new Scanner(System.in);

        while(wybor != 1 && wybor != 2){


            System.out.println( "Jesli chcesz wykonac mnozenie wybierz 1 jezeli dodawanie wybierz 2" );
            wybor=in.nextInt();


        }

        if (wybor == 1)

            return true;

        else

            return false;

    }

    private double getArgument() {
        Scanner in = new Scanner(System.in);
        double liczba;

        System.out.println( "Podaj liczbe" );
        liczba = in.nextDouble();

        return liczba;
    }
}
