package ooving10_oppg1;
import java.util.Scanner;

public class Oppg1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrangementRegister arrangementRegister = new ArrangementRegister(15);
        boolean erPaaKontoret = true;

        long[] tidspunkter = {
            2025_10_30_1800L, 2025_06_30_1800L, 2024_02_30_1800L,
            2025_03_15_1700L, 2025_05_10_1200L, 2025_07_20_2000L,
            2025_11_05_1900L, 2025_04_18_1100L, 2025_08_12_1600L,
            2025_09_25_2100L, 2025_06_01_1300L, 2025_12_15_1900L,
            2025_10_10_1800L, 2025_11_20_2000L, 2025_02_28_1400L
        };

        String[] navn = {
            "Flo Rida konsert", "Roc Boyz konsert", "Astrid S konsert",
            "Barneteater: Løvenes Konge", "Foredrag om klima", "Jazzfestival",
            "Stand-up kveld", "Kunstutstilling", "Barneteater: Askepott",
            "Popkonsert: The Weeknd", "Foredrag om teknologi", "Jazzkveld",
            "Teaterforestilling: Hamlet", "Rockkonsert: Imagine Dragons", "Foredrag om historie"
        };

        String[] sted = {
            "Trondheim", "Trondheim", "Oslo", "Bergen", "Oslo",
            "Stavanger", "Trondheim", "Oslo", "Bergen", "Stavanger",
            "Trondheim", "Bergen", "Oslo", "Stavanger", "Bergen"
        };

        String[] arrangor = {
            "UKA", "VG Lista", "VG Lista", "Barneteateret", "Klimaforum",
            "Stavanger Jazz", "Humorlaget", "Galleri Oslo", "Barneteateret", "VG Lista",
            "Teknologiforeningen", "Bergen Jazz", "Oslo Teater", "VG Lista", "Historieforeningen"
        };

        String[] type = {
            "konsert", "konsert", "konsert", "barneteater", "foredrag",
            "konsert", "komedie", "utstilling", "barneteater", "konsert",
            "foredrag", "konsert", "teater", "konsert", "foredrag"
        };

        // Legg til alle i registeret
        for (int i = 0; i < 15; i++) {
            arrangementRegister.registrerNyttArrangement(i + 1, navn[i], sted[i], arrangor[i], type[i], tidspunkter[i]);
        }


        
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
