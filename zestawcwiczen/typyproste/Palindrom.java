package pl.samouczekprogramisty.kursjava.zestawcwiczen.typyproste;

import java.util.Scanner;


public class Palindrom {

    public static boolean czyPalindrom(String slowo ){

        int b = slowo.length() - 1 ;
        boolean check = false;
        for (int i = 0; i < slowo.length() / 2 ; i++) {

            if( slowo.charAt( i ) != slowo.charAt( b ) ) {
                check = true;
                break;
            }
            b--;
        }

        if ( check )
            return false;
        else
            return true;
    }

    public static void main(String[] args) {

        String word;
        Scanner in = new Scanner(System.in);

        System.out.print( "Podaj slowo:" );
        word = in.next();

        System.out.println( "\nDlugosc słowa to : " + word.length() );

        if( czyPalindrom( word ) )
            System.out.println( "Slowo jest palindromem" );
        else
            System.out.println( "Slowo nie jest palindromem" );

        for (int i = word.length() - 1 ; i >= 0; i--) {

            System.out.print( word.charAt( i ) );

        }



    }
}
