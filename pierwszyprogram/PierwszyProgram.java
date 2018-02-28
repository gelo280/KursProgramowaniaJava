package pl.samouczekprogramisty.kursjava.pierwszyprogram;

public class PierwszyProgram {

    public static void main(String[] args) {

        String zdanie1 = "Jest ladna pogoda";
        String zdanie2 = "Jest brzydka pogoda";
        String zdanie3 = "Pada dzisaj deszcz";
        int lacznaDlugosc = zdanie1.length() + zdanie2.length() + zdanie3.length();
        System.out.println(zdanie1 + "\n" + zdanie2 + "\n" + zdanie3 + "\n" + lacznaDlugosc);


    }
}
