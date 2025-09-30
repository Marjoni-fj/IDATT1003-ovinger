package ooving10_oppg2;
import java.util.List;
import java.util.Scanner;

public class Oppg2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MenyRegister register = new MenyRegister();

        // -----------------------
        // Eksempelretter
        // -----------------------
        register.registrerNyRett(new Rett("Bruschetta", "Forrett", 75, "test1"));
        register.registrerNyRett(new Rett("Caesar Salat", "Forrett", 85, "test2"));
        register.registrerNyRett(new Rett("Biff med pommes frites", "Hovedrett", 180, "test3"));
        register.registrerNyRett(new Rett("Laks med grønnsaker", "Hovedrett", 160, "test4"));
        register.registrerNyRett(new Rett("Sjokolademousse", "Dessert", 90, "test5"));
        register.registrerNyRett(new Rett("Panna Cotta", "Dessert", 95, "test6"));

        // -----------------------
        // Eksempelmenyer
        // -----------------------
        Meny meny1 = new Meny("Lunsjmeny");
        meny1.leggTilRett(register.finnRett("Bruschetta"));
        meny1.leggTilRett(register.finnRett("Laks med grønnsaker"));
        meny1.leggTilRett(register.finnRett("Panna Cotta"));
        register.registrerNyMeny(meny1);

        Meny meny2 = new Meny("Kveldmeny");
        meny2.leggTilRett(register.finnRett("Caesar Salat"));
        meny2.leggTilRett(register.finnRett("Biff med pommes frites"));
        meny2.leggTilRett(register.finnRett("Sjokolademousse"));
        register.registrerNyMeny(meny2);


        boolean isRunning = true;

        while(isRunning){
            register.klientOversikt();
            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1: //Registrer ny rett
                    System.out.print("Navn på rett: ");
                    String navn = scanner.nextLine();
                    System.out.print("Type (forrett, hovedrett, dessert): ");
                    String type = scanner.nextLine();
                    System.out.print("Pris: ");
                    double pris = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Oppskrift: ");
                    String oppskrift = scanner.nextLine();

                    Rett nyRett = new Rett(navn, type, pris, oppskrift);
                    register.registrerNyRett(nyRett);
                    System.out.println("Rett registrert!" + nyRett.toString());
                    break;

                case 2: //Registrer ny meny
                    System.out.print("Navn på meny: ");
                    String menyNavn = scanner.nextLine();
                    Meny nyMeny = new Meny(menyNavn);

                    boolean leggeTil = true;
                    while (leggeTil) {
                        System.out.println("\nVelg rett å legge til (eller skriv 'ferdig'):");
                        for (Rett r : register.getAlleRetter()) {
                            System.out.println("- " + r.getNavn());
                        }
                        String rettNavn = scanner.nextLine();
                        if (rettNavn.equalsIgnoreCase("ferdig")) {
                            leggeTil = false;
                        } else {
                            Rett valgtRett = register.finnRett(rettNavn);
                            if (valgtRett != null) {
                                nyMeny.leggTilRett(valgtRett);
                                System.out.println(valgtRett.getNavn() + " lagt til i menyen!");
                            } else {
                                System.out.println("Fant ikke retten. Sjekk stavemåte.");
                            }
                        }
                    }
                    register.registrerNyMeny(nyMeny);
                    System.out.println("Meny registrert!");
                    break;

                case 3: //Se alle menyer
                    System.out.println("\n--- Alle menyer ---");
                    for (Meny meny : register.getMenyer()) {
                        System.out.println(meny);
                    }
                    break;

                case 4: //Finn rett etter navn
                    System.out.print("Navn på rett å finne: ");
                    String søkNavn = scanner.nextLine();
                    Rett funnet = register.finnRett(søkNavn);
                    if (funnet != null) {
                        System.out.println("Fant rett:\n" + funnet);
                    } else {
                        System.out.println("Rett ikke funnet.");
                    }
                    break;

                case 5: //Finn alle retter av type
                    System.out.print("Type å søke etter (forrett, hovedrett, dessert): ");
                    String søkType = scanner.nextLine();
                    System.out.println("Retter av type " + søkType + ":");
                    register.finnAlleRetterAvTypen(søkType);
                    break;

                case 6: //Finn menyer innenfor prisintervall
                    System.out.print("Minimal pris: ");
                    double min = scanner.nextDouble();
                    System.out.print("Maksimal pris: ");
                    double max = scanner.nextDouble();
                    scanner.nextLine(); // konsumér newline

                    List<Meny> menyerIPris = register.finnMenyerMedTotalprisMellom(min, max);
                    System.out.println("Menyer innenfor prisintervallet:");
                    for (Meny m : menyerIPris) {
                        System.out.println(m);
                    }
                    break;
            
                case 7: //Avslutt
                    System.out.println("avslutter...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("ugyldig valg");
                    break;
            }

        }
        scanner.close();
    }
    
}
