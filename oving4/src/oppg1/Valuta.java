package src.oppg1;

public class Valuta { //klassen
    //properties - attributes 
    private String navn; 
    private double kurs; // NOK per 1 enhet av valutaen

    public Valuta(String navn, double kurs) { //constructor - specific kind of method
        this.navn = navn;           
        this.kurs = kurs;
    }

    public double tilNOK(double belop) { //method
        return belop * kurs;
    }

    public double fraNOK(double belop) { //method
        return belop / kurs;
    }

    public String getNavn() { //method
        return navn;
    }
}
