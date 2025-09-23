package ooving10_oppg1;
import java.util.Scanner;

public class Oppg1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrangementRegister arrangementRegister = new ArrangementRegister(10);

        arrangementRegister.registrerNyttArrangement(1, "Flo rida konsert", "Trondheim", "UKA", "konsert", 202510301800L);
        arrangementRegister.registrerNyttArrangement(2, "Roc Boyz konsert", "Trondheim", "VG Lista", "konsert", 20256301800L);
        arrangementRegister.registrerNyttArrangement(3, "Astrid S konsert", "Oslo", "VG Lista", "konsert", 20242301800L);
        
        System.out.println("Alle arrangementer i Trondheim");
        arrangementRegister.AlleArangementerPaaSted("Trondheim");
        System.out.println();
        System.out.println("Alle arrangemanter av typen konsert");
        arrangementRegister.AlleArangementerAvTypen("konsert");
        System.out.println();
        System.out.println("Alle arrangemanter arrangert av VG Lista");
        arrangementRegister.AlleArangementerArrangertAv("VG Lista");
        System.out.println();

    

    scanner.close();
    }
    
}
