package ooving6_oppg2;

import java.util.Scanner;

public class oppg2 {
    public static void main(String[] args){
    boolean fortsett = true;
    
    Scanner scanner = new Scanner(System.in);


    while (fortsett) {
    System.out.println("Skriv inn en tekst: ");
    String input = scanner.nextLine();

    Tekstanalyse analyse = new Tekstanalyse(input);

    boolean gyldigSvar = false;
    while (!gyldigSvar) {
        System.out.println("Vil du skrive en ny tekst? (Y/N)");
        String svar = scanner.nextLine().toUpperCase(); // gjør input store bokstaver

        if (svar.equals("Y")) {
            gyldigSvar = true; // fortsetter løkka
        } 
        else if (svar.equals("N")) {
            gyldigSvar = true;
            fortsett = false; // avslutt løkka
        } 
        else {
            System.out.println("Ugyldig valg, vennligst skriv Y eller N.");
            }
        }
    }

    scanner.close();
    }

    
}
