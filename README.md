# KursProgramowaniaJava

A. dziedziczeniewjezykujava


Na koniec mam dla Ciebie zadanie do wykonania, przećwiczysz w nim zagadnienia omówione w tym artykule.
Napisz program, w którym zasymulujesz hierarchię dziedziczenia zwierząt. Stwórz abstrakcyjną klasę Animal, po której będą dziedziczyły 
klasy Fish i Mammal. Wszystkie te klasy powinny być abstrakcyjne.Następnie stwórz konkretne klasy które dziedziczą po Fish i Mammal.
Będą to odpowiednio Goldfish i Human.Nadpisz metodę toString w każdej z tych klas. Stwórz instancje obu tych klas i wyświetl je na konsoli.


B. interfejsywjezykujava


Użyj obu implementacji do uzupełnienia programu poniżej:
Program po uruchomieniu powinien zapytać użytkownika jaką operację chce wykonać,następnie pobrać dwa argumenty niezbędne do 
wykonania tej operacji.Ostatnią linijką powinien być wynik dodawania/mnożenia wyświetlony użytkownikowi.Napisz dwie klasy 
implementujące interfejs Computation. Niech jedna z implementacji przeprowadza operację dodawania, druga mnożenia.


C. konwersjairzutowaniewjezykujava
1. Napisz program przyjmujący od użytkownika liczbę całkowitą i wyświetl wynik mnożenia tej liczby oraz stałej pi (Math.PI). 
konwersjairzutowaniewjezykujavaWyświetl wynik w postaci liczby całkowitej i liczby zmiennoprzecinkowej.
2. Napisz program pobierający od użytkownika dwie liczby całkowite. Wyświetl wynik ich dzielenia wraz z częścią ułamkową.
3. Napisz program, który skończy się wyjątkiem spowodowanym błędem podczas boxingu/unboxingu.
4. Jak myślisz co otrzymasz przypisując zmienną typu char do zmiennej typu int? Znajdziesz ten numer w tabeli ASCII?


D. pentleiinstrukcjewarunkowe


1. Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający wartość zmiennej o 1. Jest nim --. Napisz program,
który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.
2. Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
3. Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
4. Przerób pętlę z zadania trzeciego na pętlę while.
5. Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
Przerób funkcję z zadania piątego tak, żeby metoda przymowała tablicę dwuwymiarową typu int[][].


E. pierwszyprogram


Napisz program, który wyświetli trzy różne zdania opisujące aktualną pogodę. W czwartej linii wypisz sumaryczną
długość trzech poprzednich zdań.


F. tablice


1. Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
2. Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.
3. Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących do przechowywania
sudoku i uzupełnij ją przykładową planszą.
4.Jak przechowałbyś stan gry w szachy? Napisz program, który stworzy instancje tablic służące do przechowywania stanu gry w szachy.
Potrafiłbyś zachować w nim ostatni stan partii Kasparowa z Deep Blue?


G. typyprostewjezykujava


Teraz ćwiczenie dla Ciebie. Napisz program, który policzy średnią z kilku przedmiotów. Możemy założyć, że uczeń w szkole ma
3 przedmioty i z każdego z nich dostał po 4 oceny.Do wykonania tego zadania możesz potrzebować tablic wielowymiarowych i zagnieżdżonych
pętli. Dla przypomnienia możesz zajrzeć do artykułu o tablicach wielowymiarowych i pętlach w języku Java.Zagnieżdżona pętla to nic 
innego jak pętla umieszczona w ciele innej pętli. Dla przykładu pętle, które mogą pomóc Ci wykonać zadanie mogą wyglądać tak:

int numberOfClasses = 3;
int numberOfNotes = 4;
for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
    for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
        // zadanie ;)
    }
}


H. wyjatkiwjezykujava


Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz użyć istniejącej 
metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, 
w której użytkownik poda ciąg znaków, który nie jest liczbą.


I.zestawcwiczen


a) Metody w języku Java
1. Napisz metodę, która zwróci Twój aktualny wiek.
2. Napisz metodę, która zwróci Twoje imię,
3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli metoda jest podzielna przez 3 i przez 5,
6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math,
znajdziesz tam metodę, która na pewno Ci pomoże),
8. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w 
argumentach można zbudować trójkąt prostokątny.

b) Obiekty i pakiety 
1. Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć. Klasa powinna także
zawierać metody getAge, getWeight, getHeight, getName, isMale.
2. Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. Klasa powinna posiadać metody obliczające pole,
obwód i długość przekątnej.
3. Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
4. MyNumber isOdd() - true jeśli atrybut jest nieparzysty,
5. MyNumber isEven() - true jeśli atrybut jest parzysty,
6. MyNumber sqrt() - pierwiastek z atrybutu,
7. MyNumber pow(MyNumber x) - atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
8. MyNumber add(MyNumber x) - zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
9. MyNumber subtract(MyNumber x) - zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.

c) Tablice

1. Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
2. Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności

d) Pętle i instrukcje warunkowe

1. Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
2. Jeśli w zadaniu 1. użyłeś pętli for przerób tą metodę na while (lub odwrotnie),
3. Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X większą od zera. Klasa powinna mieć 2 metody:
4. int[] oneDimension - zwróci instancję tablicy jednowymiarowej o długości X,
5. int[][] twoDimension - zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X
6. Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą
to trzy linie z 3, 2 i 1),
7. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przykład “pies” przekształci w
“seip”,
8. Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.). System binarny 
opisałem w osobnym artykule,
9. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane 
“od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
10. Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
11. Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
12. Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby. 
Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.

e) Typy proste
W tej sekcji znajdują się głównie zadania, które wymagają znajomości klasy Scanner opisanej w artykule dotyczącym typów prostych.

1. Jeśli w klasie Human użyłeś typów prostych zamień je na odpowiadające im klasy (int => Integer),
2. Napisz program, który pobierze od użytkownika liczbę całkowitą a następnie wyświetli jej binarną reprezentację na ekranie,
3. Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy a następnie poprosi o N kolejnych 
liczb uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej
do największej liczby,
4. Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego długość, informację czy jest to palindrom 
czy nie oraz jego odwróconą wartość.

f) Intefejsy 

1. Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). 
Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze
od użytkownika:
2. długość promienia koła,
3. 2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
4. długość boków prostokąta.

Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz 
obwód aktualnego obiektu.


