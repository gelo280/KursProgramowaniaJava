package pl.samouczekprogramisty.kursjava.zestawcwiczen.pentleiinstrukcjewarunkowe;


import java.util.Scanner;

public class ArrayFactory {

    int x;

    public ArrayFactory( int x ) {

        Scanner in = new Scanner( System.in );
        int b = 0;

        if ( x > 0 )
            this.x = x;

        while (true) {

            if ( b > 0 ) {

                this.x = b;
                break;

            } else {

                System.out.println("Podaj liczbe większą od zera");
                b = in.nextInt();

            }
        }
    }

    public int[] oneDimension() {

        int[] y = new int[ this.x ];
        return y;
    }
    public int[][] twoDimesion() {

        int[][] y = new int[x][x];
        return y;
    }

    public static void wypiszKazdyZnak( int x ){

        String y = String.valueOf( x );

        for (int i = y.length() - 1 ; i >= 0  ; i--) {

            System.out.print( y.charAt( i ) + " ");

        }
    }


    public static String odwrocSlowo( String x ){

        String y = "";


        for (int i = x.length()-1 ; i >=0 ; i--) {

             y += x.charAt(i);

        }
        return y;
    }

    public static void spawdzCzyPalindromem(String x) {

        String y = "";
        int z = 0;


        for (int i = x.length()-1 ; i >=0 ; i--) {

            y += x.charAt(i);

        }

        while ( z < x.length() ) {
            if (y.charAt(z) == x.charAt(z))
                z++;
            else
                break;
        }

        if ( z == x.length() )
            System.out.println("Slowo jest palindromem");
        else
            System.out.println("Slowo nie jest palindromem");

    }

    public int[][]  dajMacierzJednostkowa(){

        int[][] y = new int[x][x];

        for (int i = 0; i < x ; i++) {

            y[i][i] = 1 ;
        }
        return y;
    }

    public static void wypiszTablice( int[] x ) {

        String b = "[";

        for (int i = 0; i < x.length; i++) {
            b += String.valueOf( x[i]);
            b += ",";
        }
        b = b.substring(0, b.length() - 1 );
        b += "]";

        System.out.println( b );
    }


    public static void main(String[] args) {



    }
}

