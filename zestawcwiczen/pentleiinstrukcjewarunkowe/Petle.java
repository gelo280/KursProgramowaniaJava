package pl.samouczekprogramisty.kursjava.zestawcwiczen.pentleiinstrukcjewarunkowe;

public class Petle {

    public static void wypiszOdZeraDoXFor( int x ) {

        for (int i = 0; i < x ; i++) {
            System.out.println( i );
        }
    }

    public static void wypiszOdZeraDoXWhile( int x ) {

        int i = 0;

        while ( i <= x ) {
            System.out.println( i );
            i++;
        }
    }

    public static void main(String[] args) {

        Petle.wypiszOdZeraDoXFor( 4) ;
        Petle.wypiszOdZeraDoXWhile(5 );
    }
}

