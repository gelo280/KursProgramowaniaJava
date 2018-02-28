package pl.samouczekprogramisty.kursjava.zestawcwiczen.metodywjezykujava;

public class MetodyWJezykuJava {

    public static int getWiek() {
        return 21;
    }

    public static String getImie() {
        return "Grzegorz";
    };

    public static void sumaRoznicaIloczyn(int a, int b) {
        System.out.println( "Suma: " + (a+b) );
        System.out.println( "Różnica: " + (a-b) );
        System.out.println( "Iloczyn: " + (a*b) );
    };

    public static boolean podzielnePrzezTrzyIPiec(int a){
        if( a%3 == 0 || a%5 == 0 )
            return true;
        else
            return false;
    };

    public static double liczbaDoPotegiTrzeciej (double a) {
        return Math.pow( a , 3);
    }

    public static double pierwiastekKwadratowy (double a) {
        return Math.sqrt( a );
    }

    public static boolean trojkatProstokatny (double a, double b, double c){
        if(     Math.pow( a , 2 ) + Math.pow( b , 2 ) == Math.pow( c , 2 ) ||
                Math.pow( a , 2 ) + Math.pow( c , 2 ) == Math.pow( b , 2 ) ||
                Math.pow( b , 2 ) + Math.pow( c , 2 ) == Math.pow( a , 2 ))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        System.out.println(MetodyWJezykuJava.getImie());
        System.out.println(MetodyWJezykuJava.getWiek());
        MetodyWJezykuJava.sumaRoznicaIloczyn(3,5);
        if( MetodyWJezykuJava.podzielnePrzezTrzyIPiec(4))
            System.out.println("Podzielna przez 3 lub 5");
        else
            System.out.println("Nie podzielna przez 3 i 5");
        System.out.println(MetodyWJezykuJava.liczbaDoPotegiTrzeciej(3));
        System.out.println(MetodyWJezykuJava.pierwiastekKwadratowy(9));
        if(MetodyWJezykuJava.trojkatProstokatny(2,4,5))
            System.out.println("Można zbudować trójkąt");
        else
            System.out.println("Nie mozna zbudowac trójątu");

    }
}
