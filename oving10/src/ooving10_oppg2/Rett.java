package ooving10_oppg2;

public class Rett {
    private final String navn;
    private String type;
    private double pris;
    private String oppskrift;


    public Rett(String navn, String type, double pris, String oppskrift){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }
    public String getNavn(){ return navn; }
    public String getType(){ return type; }
    public double getPris(){ return pris; }
    public String getOppskrift(){ return oppskrift; }

    @Override
    public String toString() {
        return String.format(
            "Navn: %s | Type: %s | Pris: %.2f | Oppskrift: %s",
            navn, type, pris, oppskrift
        );

    
}

}
