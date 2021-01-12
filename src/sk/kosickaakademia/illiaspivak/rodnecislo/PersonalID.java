package sk.kosickaakademia.illiaspivak.rodnecislo;

import java.util.Calendar;

public class PersonalID {
    public boolean checkId(String id) {
        /*String musi mat rozmer od 9 az 11*/
        if(id.length()<9||id.length()>11){
            System.out.println("Chyba! Rodné číslo je príliš veľké alebo príliš malé");
            return false;
        }
        int cDigits = 0; //pocet cislic
        for(int i=0;i<id.length();i++){
            if( Character.isDigit(id.charAt(i)))
                cDigits++;
        }
        /*Kontrola polohy lomitka*/
        if(cDigits<9 || cDigits>10){
            System.out.println("Chyba! Rodné číslo nie je spravne");
            return false;
        }
        if(id.length()==11 && ( cDigits!=10 || id.charAt(6)!='/')){
            System.out.println("Chyba! Rodné číslo nie je spravne");
            System.out.println("Možno lomítko je na zlom mieste.");
            return false;
        }
        if(id.length()==10 && cDigits==9 && id.charAt(6)!='/'){
            System.out.println("Chyba! Rodné číslo nie je spravne");
            System.out.println("Možno lomítko je na zlom mieste.");
            return false;
        }
        /*Kontrola pohlavia osoby*/
        if(id.charAt(2)!='0' && id.charAt(2)!='1' && id.charAt(2)!='5' && id.charAt(2)!='6'){
            System.out.println("Chyba! Rodné číslo nie je spravne");
            return false;
        }
        if(id.charAt(2)=='0' || id.charAt(2)=='1')
            System.out.println("Pohlavie: Muž");
        if(id.charAt(2)=='5' || id.charAt(2)=='6')
            System.out.println("Pohlavie: Žena");
        /*Konverzia String v long*/
        String lomitko = "/";
        String newID = id.replace(lomitko, "");
        long num = Long.parseLong(newID);
        /*Vytiahnuť datum, mesiac a rok*/
        int day , month, year;
        day=Integer.parseInt(id.substring(4,6));
        month=Integer.parseInt(id.substring(2,4));
        year=Integer.parseInt(id.substring(0,2));
        int number = Integer.parseInt(newID.substring(6,9));
        System.out.println("Mate poradove cislo: "+ number);
        if(id.charAt(2)=='5' || id.charAt(2)=='6')
            month=month-50;
        year=2000+year;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if(year>currYear)
            year=year-100;
        System.out.println("Datum narodenia: " +day+"-"+month+"-"+year);
        /*Rodné číslo pridelené osobe narodenej do 1954 musi byt deväťmiestne*/
        if(year<1954 && cDigits!=9){
            System.out.println("Chyba! Rodné číslo pridelené osobe narodenej do 31. decembra 1953 ma byť deväťmiestne s trojmiestnou koncovkou");
            return false;
        }
        /*Rodné číslo pridelené osobe narodenej po 1954 musi byt deväťmiestne*/
        if(year>1953 && cDigits!=10){
            System.out.println("Chyba! Rodné číslo pridelené osobe narodenej po 1. januári 1954 ma byť desaťmiestne so štvormiestnou koncovkou");
            return false;
        }
        /*Celé desaťmiestne rodné číslo musí byť bezo zvyšku deliteľné číslom 11*/
        /*Po roku 1985 neexistujú žiadne výnimky*/
        if(year>1984 && num%11!=0){
            System.out.println("Chyba, rodne cislo nie je delitelne 11");
            return false;
        }
        /*Výnimky do roku 1985*/
        long num1=Long.parseLong(newID.substring(0,9));
        if(year>1953 && year<1985) {
            if (num % 11 == 0 || (num1%11==10 && newID.charAt(9)=='0')) {
            } else {
                System.out.println("Chyba! Rodné číslo nie je spravne");
                return false;
            }
        }
        /*Kontrola mesiaca*/
        if(month>0 && month<13){
        }else{
            return false;
        }
        int priestupnyRok;
        if(year%4==0)
            priestupnyRok=1;
        else
            priestupnyRok=0;
        switch (month) {
            case 1:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 2:
                if ((day > 0 && day < 29 && priestupnyRok==0)||(day > 0 && day < 28 && priestupnyRok==1) ) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 3:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 4:
                if (day > 0 && day < 31) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 5:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 6:
                if (day > 0 && day < 31) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 7:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 8:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 9:
                if (day > 0 && day < 31) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 10:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 11:
                if (day > 0 && day < 31) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
            case 12:
                if (day > 0 && day < 32) {
                } else{
                    System.out.println("Chyba! Rodné číslo nie je spravne");
                    return false;
                }
                break;
        }
        System.out.println("Rodné číslo je spravne");
        return true;
    }


}
