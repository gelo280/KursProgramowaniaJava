package pl.samouczekprogramisty.kursjava.zestawcwiczen.interfejsy;

public class Main {

    public static void main(String[] args) {

        Figure[] tab = new Figure[ 3 ];

        tab[ 0 ] = new Circle( 3 );
        tab[ 1 ] = new Triangle( 3 , 4 );
        tab[ 2 ] = new Rectangle(4 , 6 );

        for (int i = 0; i < tab.length ; i++) {

            System.out.println( "Obowod figury wynosi: " + tab[ i ].getPerimeter() );
            System.out.println( "Pole figury wynosi: " + tab[ i ].getArea() + "\n" );
        }

    }
}
