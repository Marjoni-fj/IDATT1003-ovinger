package ooving8_oppg1;
import java.util.Scanner;

public class oppg1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean fortsett = true;
        Person person1 = new Person("Fredrik", "Marjoni", 2006);
        ArbTaker arbTaker1 = new ArbTaker(person1, 123, 2022, 40_000, 30);

        System.out.println("*************************************");
        System.out.println("Velkommen til arbeidstakerprogrammet " + person1.toString() + "\n");
        
        

        while(fortsett){
            System.out.println("*************************************");
            System.out.println("Velg valuta:");
            System.out.println("1: Arbeidstaker informasjon");
            System.out.println("2: Endre månedslønn");
            System.out.println("3: Endre Skatteprosent");
            System.out.println("4: Oversikt");
            System.out.println("5: Avslutt");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.println(arbTaker1.toString());
                    break;

                case 2:
                    System.out.print("Skriv inn ny månedslønn: ");
                    int nyLoenn = scanner.nextInt();
                    arbTaker1.setMaanedsloenn(nyLoenn);
                    System.out.println("--------------");
                    System.out.println("Ny månedslønn: " + arbTaker1.getMaanedsloenn());
                    System.out.println("--------------");
                    break;

                case 3:
                    System.out.print("Skriv inn ny skattetrekk: ");
                    double nySkattetrekk = scanner.nextInt();
                    arbTaker1.setSkatteprosent(nySkattetrekk);
                    System.out.println("--------------");
                    System.out.println("Ny Skatteprosent: " + arbTaker1.getSkatteprosent() + "%");
                    System.out.println("--------------");
                    break;
                
                case 4:
                    System.out.println("Alder: " + arbTaker1.alder());
                    System.out.println("Antall år ansatt: " + arbTaker1.antallAarAnsatt());
                    System.out.println("Skattetrekk per måned: " + arbTaker1.skattetrekkPrMaaned());
                    System.out.println("Skattetrekk per år: " + arbTaker1.skattetrekkPrAar());
                    System.out.println("Bruttolønn per år: " + arbTaker1.bruttoloennPrAar());
                    System.out.println("Har vært ansatt mer enn 1 år? " + arbTaker1.harVaertAnsattMerEnn(1));
                    break;

                case 5:
                    fortsett = false;
                    System.out.println("Avslutter programmet...");
                    break;
            
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    
            }
        }



        scanner.close();
    }
    
}
