package ooving6_oppg2;

import java.util.Scanner;

public class oppg2 {
    public static void main(String[] args) {
        boolean fortsett = true;
        Scanner scanner = new Scanner(System.in);



        while (fortsett) {
            System.out.println("Welcome to the Back-to-the-norskanalyse-program");

            // Spør brukeren om standardtekst eller egen tekst
            System.out.print("Vil du analysere standardteksten eller skrive egen tekst? (s/e): ");
            String valg = scanner.nextLine().toLowerCase();
            String input;  // selve teksten
            String tittel; // tittel som brukes i statistics()

            if (valg.equals("s")) {
                input = StandardTekst.CALL_ME_MAYBE;   // standardtekst
                tittel = "Call_me_maybe";
            } 
            else {
                System.out.println("Skriv inn din tekst:");
                input = scanner.nextLine(); // brukerens tekst
                tittel = "User_input";      // tittel for brukerens tekst
            }

            // Opprett Tekstanalyse-objekt og kjør analysen
            Tekstanalyse analyse = new Tekstanalyse(input, tittel);
            analyse.statistics(); // eller kall metodene dine direkte

            // Spør om brukeren vil fortsette
            boolean gyldigSvar = false;
            while (!gyldigSvar) {
                System.out.println("Vil du skrive en ny tekst? (y/n)");
                String svar = scanner.nextLine().toLowerCase();

                if (svar.equals("y")) {
                    gyldigSvar = true; // fortsetter løkka
                } else if (svar.equals("n")) {
                    System.out.println("Takk for at du brukte Back-to-the-norskanalyse-program");
                    gyldigSvar = true;
                    fortsett = false; // avslutt løkka
                } else {
                    System.out.println("Ugyldig valg, vennligst skriv y eller n.");
                }
            }
        }

        scanner.close();
    }
}