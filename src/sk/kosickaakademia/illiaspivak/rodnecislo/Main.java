package sk.kosickaakademia.illiaspivak.rodnecislo;

import java.util.Scanner;

/**
 *Kontrola natívneho čísla
 * 1. Prvé dvojčíslie rodného čísla vyjadruje posledné dve číslice roku narodenia osoby
 * 2. Druhé dvojčíslie vyjadruje číselné označenie mesiaca narodenia osoby (u žien zvýšené o 50)
 * 3. Tretie dvojčíslie vyjadruje číselné označenie dňa narodenia osoby v danom kalendárnom mesiaci
 * 4. Číslo po lomítku (xxx) predstavuje poradie narodenia v daný deň
 * 5. Posledné číslo (čísla) je číslica použitá na kontrolu a priraďuje sa podľa ostatných čísel
 * 7. Rodné číslo pridelené osobe narodenej do 31. decembra 1953 je deväťmiestne s trojmiestnou koncovkou
 * 8. Rodné číslo pridelené osobe narodenej po 1. januári 1954 je desaťmiestne so štvormiestnou koncovkou
 *    pritom celé desaťmiestne rodné číslo musí byť bezo zvyšku deliteľné číslom 11.
 * 9. Do 1985 roku ak je zbytok po delení deväťmiestneho čísla rovný desať,
 *    ako kontrolná číslica sa použije nula (a celé rodné číslo potom delitelné jedenástimi nie je) FSÚ Č. Vk. 2898/1985
 *
 * Deň narodenia
 * Koľko dni je daná osoba na svete
 *
 * Dôchodkový vek
 * 1.Od 1. januára 2020 je dôchodkový vek pevne určený v prílohách zákona
 * o sociálnom poistení pre všetky skupiny poistencov v členení na ročníky,
 * pohlavie a počet vychovaných detí
 * 64 roky - Tento vek odchodu do dôchodku je určený pre mužov a ženy,
 * s rokom narodenia 1966 a viac p (podľa zákona o sociálnom poistení)
 * Priemer, ak je rok narodenia 1965 alebo menej: 62 rokov pre mužov a 58 pre ženy
 */

public class Main {
    public static void main(String[] args) {
        PersonalID p = new PersonalID();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadať rodné číslo: ");
        String rodnecislo = scanner.nextLine();
        System.out.println(p.checkId(rodnecislo));
    }
}
