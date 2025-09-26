package ooving10_oppg1;
import java.util.ArrayList;
import java.util.List;

public class ArrangementRegister {
    private List<Arrangement> arrangementer;

    public ArrangementRegister() {
        arrangementer = new ArrayList<>();
    }

    public int getAntallArrangementer() {
        return arrangementer.size();
    }

    public void registrerNyttArrangement(int nummer, String navn, String sted,
                                         String arrangoer, String type, long tidspunkt) {
        arrangementer.add(new Arrangement(nummer, navn, sted, arrangoer, type, tidspunkt));
    }

    public void AlleArangementerPaaSted(String sted) {
        for (Arrangement a : arrangementer) {
            if (a.getSted().equalsIgnoreCase(sted)) {
                System.out.println(a);
            }
        }
    }

    public void AlleArangementerAvTypen(String type) {
        for (Arrangement a : arrangementer) {
            if (a.getType().equalsIgnoreCase(type)) {
                System.out.println(a);
            }
        }
    }

    public void AlleArangementerArrangertAv(String arrangoer) {
        for (Arrangement a : arrangementer) {
            if (a.getArrangoer().equalsIgnoreCase(arrangoer)) {
                System.out.println(a);
            }
        }
    }

    public void arrangementKlientProgram(){
        System.out.println("****************************************************************");
        System.out.println("Vekommen til kommunens turistkontor. Hva kan jeg hjelpe deg med?");
        System.out.println("1. Registrer nytt arrangement");
        System.out.println("2. Finn arrangementer på sted");
        System.out.println("3. Finn arrangementer på dato");
        System.out.println("4. Finn arrangementer i tidsintervall");
        System.out.println("5. Finn arrangementer på arrangør");
        System.out.println("6. Ingenting");
        System.out.println("****************************************************************");

    }
}
