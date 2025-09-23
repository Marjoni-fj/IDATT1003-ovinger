package ooving10_oppg1;

public class Arrangement {
    private final int nummer;
    private final String navn;
    private final String sted;
    private final String arrangoer;
    private final String type;
    private final int tidspunkt;


    public Arrangement(int nummer, String navn, String sted, 
                       String arrangoer, String type, int tidspunkt){
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangoer = arrangoer;
        this.type = type;
        this.tidspunkt = tidspunkt;

    }
    @Override
    public String toString() {
    return String.format(
        "Nr: %d | Navn: %s | Sted: %s | Arrangør: %s | Type: %s | Tidspunkt: %d",
        nummer, navn, sted, arrangoer, type, tidspunkt
    );
}

    public int getNummer(){ return nummer;}
    public String getNavn(){ return navn;}
    public String getSted(){ return sted;}
    public String getArrangoer(){ return arrangoer;}
    public String getType(){ return type;}
    public int getTidspunkt(){ return tidspunkt;}



}
