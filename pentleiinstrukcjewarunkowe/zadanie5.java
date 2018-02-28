package pl.samouczekprogramisty.kursjava.pentleiinstrukcjewarunkowe;

public class zadanie5 {

    public static int sumaElementowTablicy(int T[]){

        int suma = 0;

        for (int liczba : T ) {

            suma += liczba;
        }
        return suma;
    }

    public static void main(String[] args) {

        int[] T = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(zadanie5.sumaElementowTablicy(T));
    }
}

