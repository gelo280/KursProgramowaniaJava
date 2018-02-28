package pl.samouczekprogramisty.kursjava.konwersjairzutowaniewjezykujava;

import java.util.Scanner;

public class CalkowitaRazyPi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int input1;

        System.out.println("Podaj liczbe: ");
        input1 = in.nextInt();

        System.out.println( "Wynik w postaci liczby zmiennoprzecinkowej: " + input1 * Math.PI );
        System.out.println( "Wynik w postaci liczby całkowitej: " + (int) (input1 * Math.PI) );

    }
}
