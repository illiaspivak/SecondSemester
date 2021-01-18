package sk.kosickaakademia.illiaspivak.rozcvicka.benzin;

public class Auto {
    public static String CenaBenzin(int distance, double spotreba, double benzin){
        if(distance < 0 || spotreba <= 0 || benzin < 0){
            return "0";
        }
        String formattedDouble = String.format("%.2f", distance*benzin/spotreba);

        return formattedDouble;
    }
}
