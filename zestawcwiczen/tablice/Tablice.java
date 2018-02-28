package pl.samouczekprogramisty.kursjava.zestawcwiczen.tablice;

public class Tablice {

    public static String[] pierwszeAlfabetu() {

        String[] tab = new String[5];

        tab[ 0 ] = "a";
        tab[ 1 ] = "b";
        tab[ 2 ] = "c";
        tab[ 3 ] = "d";
        tab[ 4 ] = "e";
        return tab;
    }

    public static double[] odwrotneLiczby(double[] x) {

        double a , b , c;

        a = x[ 0 ];
        b = x[ 1 ];
        c = x[ 2 ];

        double[] y = new double[3];

        y[ 0 ] = c;
        y[ 1 ] = b;
        y[ 2 ] = a;

        return y;
    }

    public static void main(String[] args) {

        String[] x = Tablice.pierwszeAlfabetu();
        System.out.println( x[ 0 ] + x[ 1 ] + x[ 2 ] );

        double[] y = new double[]{1,2,3};
        y = Tablice.odwrotneLiczby( y );
        System.out.println( y[ 0 ] + " " +  y[ 1 ] + " " + y[ 2 ] );

    }
}
