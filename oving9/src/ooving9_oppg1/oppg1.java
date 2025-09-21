package ooving9_oppg1;
import java.util.Scanner;

public class oppg1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt(10);

        oppgaveoversikt.registrerNyStudent("Fredrik", 9);
        oppgaveoversikt.registrerNyStudent("Mathea", 6);
        oppgaveoversikt.registrerNyStudent("Daniel", 5);
        oppgaveoversikt.registrerNyStudent("Jon", 5);
        oppgaveoversikt.registrerNyStudent("Anine", 11);


        boolean systemRunning = true;

        while (systemRunning){
            oppgaveoversikt.meny();
            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg){
                case 1:
                    oppgaveoversikt.toString();
                    oppgaveoversikt.studentOversikt();
                    break;

                case 2:
                    System.out.println("Hvilken student vil du se på? : ");
                    String undersokelse = scanner.nextLine();
                    int ant = oppgaveoversikt.oppgaverloest(undersokelse);
                      if (ant == -1){
                        System.out.println("Fant ikke studenten " + undersokelse);
                    } else {
                        System.out.println(undersokelse + " har " + ant + " oppgaver godkjent.");
                    }
                    break;

                case 3:
                    System.out.print("Hvilken student vil du oppdatere? : ");
                    String navn = scanner.nextLine();
                    System.out.print("Hvor mange oppgaver skal legges til? : ");
                    int okning = scanner.nextInt();
                    scanner.nextLine();
                    oppgaveoversikt.oekAntOppg(navn, okning);
                    int nyttAntall = oppgaveoversikt.oppgaverloest(navn);
                    System.out.println(navn + " har nå " + nyttAntall + "/11 oppgaver godkjent.");
                    break;
                
                case 4:
                    System.out.print("Hva er navnet på studenten? ");
                    String nyttNavn = scanner.nextLine();
                    System.out.print("Hvor mange oppgaver har studenten fått godkjent? ");
                    int nyttoppg = scanner.nextInt();
                    scanner.nextLine();
                    oppgaveoversikt.registrerNyStudent(nyttNavn, nyttoppg);
                    System.out.println("Student " + nyttNavn + " registrert med " + nyttoppg + "/11 oppgaver godkjent.");
                    break;

                case 5:
                    System.out.println("Avslutter...");
                    systemRunning = false;
                    break;
                
                default:
                    System.out.println("Ugjyldig valg");
            }
        }

        scanner.close();
    }
    
}
