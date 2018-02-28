package pl.samouczekprogramisty.kursjava.tablice;

public class Tablice {

    public static int sumaElemetowTablicyDwuElemetnowej(int T[]) {

        return T[0] + T[1];

    }


    public static int najwiekszyElementTablicyTrzyElementowej(int T[]){

        if (T[0] > T[1] && T[0] > T[2] )

            return T[0];

        else if (T[1] > T[2])

            return T[1];
        else
            return T[2];
    }

    public static void main(String[] args) {

        int[] T = new int[3];
        T[0]= 5;
        T[1]= 7;
        T[2]= 8;

        System.out.println(Tablice.najwiekszyElementTablicyTrzyElementowej(T));


    }
}