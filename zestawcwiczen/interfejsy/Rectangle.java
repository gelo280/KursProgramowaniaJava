package pl.samouczekprogramisty.kursjava.zestawcwiczen.interfejsy;

public class Rectangle implements Figure {

    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter(){

        return 2 * a + 2 * b;

    }

    public double getArea() {

        return a * b;
    }

}
