package pl.samouczekprogramisty.kursjava.wyjatkiwjezykujava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class wyjatek {

    public static void main(String[] args) {

        double liczba;
        Scanner in = new Scanner(System.in);

        System.out.print("Podaj liczbe:");

        while (true) {
            try {
                liczba = in.nextDouble();
                break;
            }
            catch (InputMismatchException e) {

                System.out.println("Podales zla liczbe");
                in.next();
            }
        }

        if( liczba < 0) {
            throw new IllegalArgumentException("Piewiastek z liczby ujemnej nie istnieje");
        }

        System.out.println("Pierwiastek z " + liczba + " to " + Math.sqrt(liczba));
        }

    }

