package ooving10_oppg1;

import java.util.Scanner;

public class Oppg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrangementRegister arrangementRegister = new ArrangementRegister(); 
        boolean erPaaKontoret = true;

        long[] tidspunkter = {
            202510301800L, 202506301800L, 202402301800L,
            202503151700L, 202505101200L, 202507202000L,
            202511051900L, 202504181100L, 202508121600L,
            202509252100L, 202506011300L, 202512151900L,
            202510101800L, 202511202000L, 202502281400L
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

        // Legg til alle arrangementer i registeret
        for (int i = 0; i < 15; i++) {
            arrangementRegister.registrerNyttArrangement(
                i + 1, navn[i], sted[i], arrangor[i], type[i], tidspunkter[i]
            );
        }

        // Menystyrt program
        while (erPaaKontoret) {
            arrangementRegister.arrangementKlientProgram();
            int valg = scanner.nextInt();
            scanner.nextLine(); // rydder linjeskift

            switch (valg) {
                case 1: // Registrer nytt arrangement
                    System.out.println("Funksjonalitet for registrering kommer snart...");
                    break;

                case 2: // Finn arrangementer på sted
                    System.out.print("Hvilket sted vil du undersøke? ");
                    String by = scanner.nextLine();
                    arrangementRegister.AlleArangementerPaaSted(by);
                    System.out.println();
                    break;

                case 3: // Finn arrangementer på dato
                    System.out.println("Funksjonalitet for søk på dato kommer snart...");
                    break;

                case 4: // Finn arrangementer i tidsintervall
                    System.out.println("Funksjonalitet for søk i tidsintervall kommer snart...");
                    break;

                case 5: // Finn arrangementer på arrangør
                    System.out.print("Hvilken arrangør vil du undersøke? ");
                    String mc = scanner.nextLine();
                    arrangementRegister.AlleArangementerArrangertAv(mc);
                    System.out.println();
                    break;

                case 6: // Avslutt
                    System.out.println("Ha en fin dag!");
                    System.out.println("*går ut av turistkontoret*...");
                    erPaaKontoret = false;
                    break;

                default:
                    System.out.println("Ugyldig valg");
                    break;
            }
        }

        scanner.close();
    }
}
