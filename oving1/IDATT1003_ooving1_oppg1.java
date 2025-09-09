import java.util.Scanner;

public class IDATT1003_ooving1_oppg1 {
    /**
     * @param args
     */
    public static void main(String[] args){ 

    Scanner scanner = new Scanner(System.in); //Legger til muligheten for user input


        //definerer variabler
        double length;
        double newLength;
        int choice;
        
        System.out.println("************************");
        System.out.println("Lengde omgjøringsprogram");
        System.out.println("1 - Omgjøring fra tommer til cm");
        System.out.println("2 - Omgjøring fra cm til tommer");
        System.out.println("************************");

        System.out.print("velg et av valgene: ");
        choice = scanner.nextInt();
        
        //If-løkken vil se hva useren velger og kjøre ut det omgjøringsprogrammet gjør
        //en while løkke vil kontrollere at bare 1-ere eller 2-ere blir tastet inn i terminalen - slik at det er den eneste måten for koden å fortsette        

        while (!(choice == 1 || choice == 2)) {
            System.out.println("Invalid choice");
            System.out.print("Choose again: ");
            choice = scanner.nextInt(); // Spør user igjen
}

        if (choice == 1) {
            System.out.print("Legg inn lengden i tommer: ");
            length = scanner.nextDouble();
            newLength = length * 2.54;
            System.out.println(length + " tommer er det samme som " + newLength + " cm");
        } else { // må være 2 her på grunn av while løkka
            System.out.print("Legg inn lengden i cm: ");
            length = scanner.nextDouble();
            newLength = length / 2.54;
            System.out.println(length + " cm er det samme som " + newLength + " tommer");
}
        scanner.close(); // lukker Scanner   
        }
    
    }

       

        


        


