package pl.samouczekprogramisty.kursjava.zestawcwiczen.typyproste;

import java.util.Arrays;
import java.util.Scanner;

public class TablicaNPosortowana {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Podaj rozmiar tablicy: ");
        n = in.nextInt();

        System.out.println();

        Integer[] tab = new Integer[ n ];

        for (int i = 0; i < n ; i++) {

            System.out.print("Podaj " + i + "-element:");
            tab[ i ] = in.nextInt();

        }

        Arrays.sort( tab );
        System.out.println();

        for (int i = 0; i < n ; i++) {

            System.out.println("Tab [" + i + "] = " + tab[i] );

        }
    }
}
