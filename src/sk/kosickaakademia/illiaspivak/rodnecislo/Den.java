package sk.kosickaakademia.illiaspivak.rodnecislo;

import org.joda.time.DateTime;

public class Den {
    public static String DenN (int year, int month, int day){
        DateTime date = new DateTime(year, month, day, 0, 0, 0);
        switch (date.getDayOfWeek()) {
            case 1:
                return "Pondelok";
            case 2:
                return  "Utorok";
            case 3:
                return "Streda";
            case 4:
                return "Štvrtok";
            case 5:
                return "Piatok";
            case 6:
                return "Sobota";
            case 7:
                return "Nedeľa";
        }
        return "Error";
    }
}
