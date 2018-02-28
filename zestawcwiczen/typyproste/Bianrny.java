package pl.samouczekprogramisty.kursjava.zestawcwiczen.typyproste;

import java.util.Scanner;

public class Bianrny {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer a = 0;

        System.out.println("Podaj liczbę: ");
        a = in.nextInt();

        System.out.println( Integer.toBinaryString( a ) );


    }
}
