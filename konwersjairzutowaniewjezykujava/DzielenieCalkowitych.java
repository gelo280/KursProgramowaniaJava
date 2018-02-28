package pl.samouczekprogramisty.kursjava.konwersjairzutowaniewjezykujava;

import java.util.Scanner;

public class DzielenieCalkowitych {

    public static void main(String[] args) {

        int a;
        int b;
        Scanner in = new Scanner(System.in);

        System.out.println( "Podaj pierwszą liczbę ");
        a = in.nextInt();
        System.out.println( "Podaj drugą liczbę ");
        b = in.nextInt();

        System.out.println( "Wynik dzielenie wraz z częścią ułmakową: " + (float) a/b);
    }
}
