package ooving10_oppg1;

public class Arrangement {
    private final int nummer;
    private final String navn;
    private final String sted;
    private final String arrangoer;
    private final String type;
    private final long tidspunkt;


    public Arrangement(int nummer, String navn, String sted, 
                       String arrangoer, String type, long tidspunkt){
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
        "Nr: %d | Navn: %s | Sted: %s | Arrangør: %s | Type: %s | Tidspunkt: %s",
        nummer, navn, sted, arrangoer, type, formatTidspunkt()
    );
}

    public int getNummer(){ return nummer;}
    public String getNavn(){ return navn;}
    public String getSted(){ return sted;}
    public String getArrangoer(){ return arrangoer;}
    public String getType(){ return type;}
    public long getTidspunkt(){ return tidspunkt;}

    private String formatTidspunkt() {
        long år = tidspunkt / 100000000;
        long måned = (tidspunkt / 1000000) % 100;
        long dag = (tidspunkt / 10000) % 100;
        long time = (tidspunkt / 100) % 100;
        long minutt = tidspunkt % 100;

        // Formater med leading zeros hvis nødvendig
        return String.format("%d_%02d_%02d_%02d%02d", år, måned, dag, time, minutt);
    }




}
