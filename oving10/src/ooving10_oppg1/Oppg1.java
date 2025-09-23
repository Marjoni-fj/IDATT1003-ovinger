package ooving10_oppg1;
import java.util.Scanner;

public class Oppg1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrangementRegister arrangementRegister = new ArrangementRegister(10);
        boolean erPaaKontoret = true;

        arrangementRegister.registrerNyttArrangement(1, "Flo rida konsert", "Trondheim", "UKA", "konsert", 2025_10_30_1800L);
        arrangementRegister.registrerNyttArrangement(2, "Roc Boyz konsert", "Trondheim", "VG Lista", "konsert", 2025_6_30_1800L);
        arrangementRegister.registrerNyttArrangement(3, "Astrid S konsert", "Oslo", "VG Lista", "konsert", 2024_2_30_1800L);
        
        while (erPaaKontoret){
            arrangementRegister.arrangementKlientProgram();
            int valg = scanner.nextInt();
            scanner.nextLine(); 

            switch (valg) {
            case 1: // 1. Registrer nytt arrangement
                System.out.println("this is a test");
                break;
            
            case 2: //2. Finn arrangementer på sted
                System.out.print("Hvilket sted har du lyst til å undersøke: ");
                String by = scanner.nextLine();
                arrangementRegister.AlleArangementerPaaSted(by);
                System.out.println();
                break;

            case 3: //3. Finn arrangementer på dato
                System.out.println("this is a test");
                break;
            
            case 4: //4. Finn arrangementer i tidsintervall
                System.out.println("this is a test");
                break;

            case 5: //5. Finn arrangementer på arrangør
                System.out.print("Hvilken arrangør har du lyst til å undersøke: ");
                String mc = scanner.nextLine();
                arrangementRegister.AlleArangementerArrangertAv(mc);
                System.out.println();
                break;

            case 6:
                System.out.println("Ha en fin dag ");
                System.out.println("*går ut av turistkontoret*...");
                erPaaKontoret = false;
                break;

        
            default:
            System.out.println("Ugyldig valg");
                break;
            }
        }

        


        

        /*
        System.out.println("Alle arrangementer i Trondheim");
        arrangementRegister.AlleArangementerPaaSted("Trondheim");
        System.out.println();
        System.out.println("Alle arrangemanter av typen konsert");
        arrangementRegister.AlleArangementerAvTypen("konsert");
        System.out.println();
        System.out.println("Alle arrangemanter arrangert av VG Lista");
        arrangementRegister.AlleArangementerArrangertAv("VG Lista");
        System.out.println();
        */

    

    scanner.close();
    }
    
}
