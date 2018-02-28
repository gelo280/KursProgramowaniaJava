package pl.samouczekprogramisty.kursjava.zestawcwiczen.obiektyipakiety;

public class MyNumber {
    private double a;

    public MyNumber(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public  boolean isOdd() {

        if( a%2 == 1 )
             return true;
         else
             return false;
    }

    public  boolean isEven() {

        if( this.isOdd() )
            return false;
        else
            return true;
    }

    public double sqrt() {
        return Math.sqrt( a );
    }

    public double pow( MyNumber x ) {
        return Math.pow( a , x.getA() );
    }

    public double add( MyNumber x ) {
        return a + x.getA() ;
    }

    public double subtract( MyNumber x ) {
        return a - x.getA();
    }

    public static void main(String[] args) {

        MyNumber first = new MyNumber(5.3);
        MyNumber second = new MyNumber(6.3);

        System.out.println( first.pow( second ) );

    }




}
