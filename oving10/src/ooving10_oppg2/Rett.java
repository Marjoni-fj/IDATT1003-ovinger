package ooving10_oppg2;

public class Rett {
    private final String navn;
    private String type;
    private double pris;


    public Rett(String navn, String type, double pris){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
    }
    public String getNavn(){ return navn; }
    public String getType(){ return type; }
    public double getPris(){ return pris; }

    
}
