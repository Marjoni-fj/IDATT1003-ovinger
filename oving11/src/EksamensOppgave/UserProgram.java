package EksamensOppgave;
import java.util.Scanner;

public class UserProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        // Create a PropertyRegister
        PropertyRegister register = new PropertyRegister();

        // Add properties to the register
        register.newPoperty(1445, "Gloppen", 77, 631, "Property1", 1017.6, "Jens Olsen");
        register.newPoperty(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        register.newPoperty(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        register.newPoperty(1445, "Gloppen", 74, 1445, "Property4", 1457.2, "Karl Ove Bråten");
        register.newPoperty(1445, "Gloppen", 69, 188, "Høiberg", 1339.4, "Elsa Indregård");

        while (isRunning){
            register.showMenu();
            int choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1: //List all properties
                    for (Property p : register.getProperties()) { System.out.println(p);} 
                    break;
                case 2: //Add property
                    
                    break;

                case 3: //Remove property
                    
                    break;

                case 4: //Search property
                    System.out.print("What's the municipality number: ");
                    int mNumber = scanner.nextInt();
                    System.out.print("What's the lot number: ");
                    int lNumber = scanner.nextInt();
                    System.out.print("What's the section number: ");
                    int sNumber = scanner.nextInt();
                    register.findProperty(mNumber, lNumber, sNumber);
                                        
                    break;

                case 5: //Calculate average property area
                    System.out.println("The average property area in the municipality is " + register.averagePropertyArea() + " m2");
                    break;
                
                case 6:
                    System.out.println("Closing...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    
    scanner.close();
    }
}
