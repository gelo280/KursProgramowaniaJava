package pl.samouczekprogramisty.kursjava.zestawcwiczen.obiektyipakiety;

public class Prostokat {

    public double a;
    public double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double liczPole() {
        return a*b;
    }

    public double liczObwod() {
        return 2 * a + 2 * b;
    }

    public double liczPrzekatnal() {
        return Math.sqrt( Math.pow( a , 2 ) + Math.pow( b , 2) );
    }

    public static void main(String[] args) {

        Prostokat piewszy = new Prostokat(3,4);
        System.out.println( piewszy.liczPrzekatnal() );
    }
}
