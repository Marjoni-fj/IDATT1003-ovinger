package ooving6_oppg2;
import java.awt.Desktop;
import java.net.URI;
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
                input = StandardTekst.CALL_ME_MAYBE;
                tittel = "Call_me_maybe";
                System.out.println("BEST WHITE GIRL SONG: CALL ME MAYBE");
                //System.out.println("Hør sangen her: " + StandardTekst.CALL_ME_MAYBE_LINK);

            // Spør om brukeren vil åpne YouTube-linken
            System.out.print("Vil du høre på sangen? (y/n): ");
            String åpneLink = scanner.nextLine().toLowerCase();
            if (åpneLink.equals("y")) {
                try {
                    Desktop.getDesktop().browse(new URI(StandardTekst.CALL_ME_MAYBE_LINK));
                } catch (Exception e) {
                    System.out.println("Kunne ikke åpne lenken: " + e.getMessage());
                }
                }
            }
            else {
                System.out.println("Skriv inn din tekst:");
                input = scanner.nextLine(); // brukerens tekst
                tittel = "User_input";      // tittel for brukerens tekst
            }

            // Opprett Tekstanalyse-objekt etter brukerens ønske og kjører analysen
            Tekstanalyse analyse = new Tekstanalyse(input, tittel);

            analyse.statistics(); // Selve analysen

            // Spør om brukeren vil fortsette
            boolean gyldigSvar = false;
            while (!gyldigSvar) {
                System.out.print("Vil du skrive en ny tekst? (y/n): ");
                String svar = scanner.nextLine().toLowerCase();

                if (svar.equals("y")) {
                    gyldigSvar = true; // fortsetter løkka
                } 
                else if (svar.equals("n")) {
                    System.out.println("Takk for at du brukte Back-to-the-norskanalyse-program :)");
                    System.out.println("Avslutter...");
                    gyldigSvar = true;
                    fortsett = false; // avslutt løkka
                } 
                else {
                    System.out.println("Ugyldig valg, vennligst skriv y eller n.");
                }
            }
        }

        scanner.close();
    }
}