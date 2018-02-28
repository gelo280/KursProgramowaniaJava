package pl.samouczekprogramisty.kursjava.pentleiinstrukcjewarunkowe;

public class zadanie6 {

    public static int sumaElemetowTablicy2D(int[][] T){

        int suma=0;

        for (int[] tabJednoWymiar: T) {

            for (int liczba : tabJednoWymiar) {

                suma+=liczba;
            }
        }

        return suma;
    }

    public static void main(String[] args) {

        int[][] T = new int[][]{

                new int[]{ 1 , 2 , 3 },
                new int[]{ 4 , 5 , 6 },
                new int[]{ 7 , 8 , 9 }
        };

        System.out.println(zadanie6.sumaElemetowTablicy2D(T));
    }
}
