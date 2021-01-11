package sk.kosickaakademia.illiaspivak.rozcvicka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = "BBALASTBALASTRBALASTABALASTBALASTBALASTTBALASTBALASTIBALASTBALASTBALASTSLBALASTBALASTBALASTABALASTBALASTVBALASTBALASTA";
        String b = "BALAST";
        String c = "BALASTBBABALASTLASTALASBALASTBALBALASTASTTSBALASTTABILIBALASTBALASTTABALASBALASTT";
        System.out.println("najviac delitelov ma cislo: " + Deliteli(n));
        Heslo("Heso: "+ a,b);
        VnorenyBalast("Heso: "+c,b);

    }

    /**
     *Hľadáme čísla, ktoré majú čo najviac prirodzených deliteľov.
     * Z čísel do 50 je to číslo 48, ktoré má 10 deliteľov.
     * Ktoré z čísel menších ako 1000 má najviac deliteľov?
     */
    public static int Deliteli (int n){
        int a = 0;
        int b = 0;
        int c = 0;
        for(int j = n; j>0; j--) {
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    a++;
                }
            }
            if(a>b){
                b=a;
                c=j;
            }
            a=0;
        }
        return c;
    }

    /**
     *Odstráňte z nasledujúceho reťazca všetok BALAST a dostanete heslo.
     */
    public static void Heslo (String a, String b){
            String newStr = a.replaceAll(b, "");
            System.out.println(newStr);
    }

    /**
     *Odstráňte z nasledujúceho reťazca všetok BALAST.
     *Pozor, BALAST môže byť vnorený, napríklad BABALASTLAST
     *(najprv odstránime BALAST od druhej pozície ďalej a vznikne nám nový BALAST,
     * ktorý rovnako odstránime).
     */
    public static void VnorenyBalast (String a, String b){
        for(int i=0; i<a.length(); i++) {
            String c = a.replaceAll(b, "");
            a = c;
        }
        System.out.println(a);
    }
}
