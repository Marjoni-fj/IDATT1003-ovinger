package src.oppg1;

import java.util.Scanner;

public class oppg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Oppretter valutaobjekter
        Valuta dollar = new Valuta("Dollar", 10.5);
        Valuta euro = new Valuta("Euro", 11.2);
        Valuta sek = new Valuta("Svenske kroner", 1.02);
        //Valuta nok = new Valuta("Norske kroner",1.00);
        
        boolean fortsett = true;

        while (fortsett) {
            System.out.println("*******************");
            System.out.println("Velg valuta:");
            System.out.println("1: dollar");
            System.out.println("2: euro");
            System.out.println("3: svenske kroner");
            System.out.println("4: avslutt");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    // kode for USD
                    System.out.println("Choose direction");
                    System.out.println("1: USD --> NOK");
                    System.out.println("2: NOK --> USD");
                    int direction_0 = scanner.nextInt();

                    if (direction_0 == 1){
                        System.out.print("Oppgi beløp i dollar: ");
                        double belopDollar = scanner.nextDouble();
                        double tilNOK_0 = dollar.tilNOK(belopDollar);
                        System.out.println(belopDollar + " dollar = " + tilNOK_0 + " NOK");
                        break;
                    }
                    else if (direction_0 == 2){
                        System.out.print("Oppgi beløp i NOK: ");
                        double belopNOK = scanner.nextDouble();
                        double fraNOK_0 = dollar.fraNOK(belopNOK);
                        System.out.println(belopNOK + " NOK = " + fraNOK_0 + " Dollar");
                        break;
                    }
                    else{
                        fortsett = false;
                        System.out.println("Try again");
                        System.exit(0);
                    }

                case 2:
                    // kode for Euro
                    
                    System.out.println("Choose direction");
                    System.out.println("1: Euro --> NOK");
                    System.out.println("2: NOK --> Euro");
                    int direction_1 = scanner.nextInt();

                    if (direction_1 == 1){
                        System.out.print("Oppgi beløp i Euro: ");
                        double belopEuro = scanner.nextDouble();
                        double tilNOK_1 = euro.tilNOK(belopEuro);
                        System.out.println(belopEuro + " Euro = " + tilNOK_1 + " NOK");
                        break;
                    }
                    else if (direction_1 == 2){
                        System.out.print("Oppgi beløp i NOK: ");
                        double belopNOK = scanner.nextDouble();
                        double fraNOK_1 = euro.fraNOK(belopNOK);
                        System.out.println(belopNOK + " NOK = " + fraNOK_1 + " Euro");
                        break;
                    }
                    else{
                        fortsett = false;
                        System.out.println("Try again");
                        System.exit(0);
                    }

                case 3:
                    //Kode for SEK

                    System.out.println("Choose direction");
                    System.out.println("1: SEK --> NOK");
                    System.out.println("2: NOK --> SEK");
                    int direction_2 = scanner.nextInt();

                    if (direction_2 == 1){
                        System.out.print("Oppgi beløp i Svenske korner: ");
                        double belopSek = scanner.nextDouble();
                        double tilNOK_2 = sek.tilNOK(belopSek);
                        System.out.println(belopSek + " SEK = " + tilNOK_2 + " NOK");
                        break;
                    }
                    else if (direction_2 == 2){
                        System.out.print("Oppgi beløp i NOK: ");
                        double belopNOK = scanner.nextDouble();
                        double fraNOK_1 = sek.fraNOK(belopNOK);
                        System.out.println(belopNOK + " NOK = " + fraNOK_1 + " SEK");
                        break;
                    }
                    else{
                        fortsett = false;
                        System.out.println("Try again");
                        System.exit(0);
                    }

                case 4:
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