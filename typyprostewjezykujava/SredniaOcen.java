package pl.samouczekprogramisty.kursjava.typyprostewjezykujava;

public class SredniaOcen {

    public static void main(String[] args) {

        int[][] tablicaOcen = new int[][]{
                new int[]{ 2 , 2 , 4 , 5 },
                new int[]{ 3 , 4 , 5 , 5 },
                new int[]{ 4 , 3 , 2 , 4}
        };
        int suma = 0;



        for (int[] oceny : tablicaOcen) {
            for (int ocena : oceny ) {

                suma+=ocena;
            }

        }

        double srednia;

        srednia = suma/12.0;

        System.out.println(srednia);

    }
}
