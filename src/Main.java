public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */
        Dom dom1 = new Dom();
        Budynek dom2 = new Dom();

        dom1.powierzchnia(500);
            dom1.liczbaOkien(40);
        dom1.liczbaMieszkancow(100);
             dom1.kolorDomu(KolorEnum.Zielony);
        dom1.setSzerokość(50);
            dom1.setDługość(112);
        dom1.Cena(700000);
            dom1.Info();

        System.out.println("dom1 ma: " + KolorEnum.Zielony + " kolor");
            System.out.println(dom1.adresBudynku("Konwaliowa"));
        System.out.println(dom1.toString());
            dom2.powierzchnia(70000);
        dom2.kolorDomu(KolorEnum.Niebieski);
            dom2.liczbaMieszkancow(400);
        dom2.liczbaOkien(1000);
            dom2.setszerokość(1000);
        dom2.setdługość(220);


        dom2.Info();
            System.out.println("dom2 ma: " + KolorEnum.Niebieski + " kolor");
        System.out.println(dom2.adresBudynku("Siemiradzkiego"));
            System.out.println(dom2.toString());
    }
}
