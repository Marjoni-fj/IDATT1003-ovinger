package ooving10_oppg1;

public class ArrangementRegister {
    private Arrangement[] arrangementer;
    private int antArrang = 0;



    public ArrangementRegister(int kapasitet){
        arrangementer = new Arrangement[kapasitet];
        antArrang = 0;
    }
    public int getAntallArrangementer(){ return antArrang;}

    public void registrerNyttArrangement(int nummer, String navn, String sted, 
                                        String arrangoer, String type, long tidspunkt){
        arrangementer[antArrang] = new Arrangement(nummer, navn, sted, arrangoer, type, tidspunkt);
        antArrang++;
    }

    public void AlleArangementerPaaSted(String sted){
        for (int i = 0; i < antArrang; i++){
            if (arrangementer[i].getSted().equals(sted)){
                System.out.println(arrangementer[i].toString());
            }
        }
    }

    public void AlleArangementerAvTypen(String type){
        for (int i = 0; i < antArrang; i++){
            if (arrangementer[i].getType().equals(type)){
                System.out.println(arrangementer[i].toString());
            }
        }
    }

    public void AlleArangementerArrangertAv(String arrangoer){
        for (int i = 0; i < antArrang; i++){
            if (arrangementer[i].getArrangoer().equals(arrangoer)){
                System.out.println(arrangementer[i].toString());
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
