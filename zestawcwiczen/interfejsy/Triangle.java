package pl.samouczekprogramisty.kursjava.zestawcwiczen.interfejsy;

public class Triangle implements Figure {

    public double a;
    public double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter(){

        double c = Math.sqrt( Math.pow( a , 2) + Math.pow( b , 2 ));

        return a + b + c;
    }

    public double getArea(){

        return 0.5 * a * b;
    }
}
