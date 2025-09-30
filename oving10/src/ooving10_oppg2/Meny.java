package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;

public class Meny {
    private String navn;
    private List<Rett> retter = new ArrayList<>();

    public Meny(String navn) {
        this.navn = navn;

    }
    public String getNavn(){
        return navn;
    }
    public void leggTilRett(Rett rett){
        retter.add(rett);
    }
    public double beregnMenyTotalpris(){
        double totalPris = 0;
        for (Rett rett : retter){
            totalPris += rett.getPris();
        }
        return totalPris;

    }

    
}
