package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;

public class Meny {
    private String navn;
    private List<Rett> retter = new ArrayList<>(); //attribute er retter ArrayList med rett objekter

    public Meny(String navn) {
        this.navn = navn;
    }
    //----------------------------------------//
    //Get-metoder
    public String getNavn(){ return navn; }
    public List<Rett> getRetter(){ return retter; }
    public void leggTilRett(Rett rett){ retter.add(rett); }
    //----------------------------------------//

    public double beregnMenyTotalpris(){
        double totalPris = 0;
        for (Rett rett : retter){
            totalPris += rett.getPris();
        }
        return totalPris;
    }
    //----------------------------------------//
    //finn-metoder
    public void finnRettSomHeter(String navn){ //finner en spesifikt rett i menyen basert på navn
        for (Rett rett : retter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                System.out.println(rett);
            }
            else{ System.out.println("Vi har desverre ikke" + navn + "på denne menyen");}
            
        }
    }

    public void finnRettAvTypen(String type){ //finner en spesifikt rett i menyen basert på type
        for (Rett rett : retter){
            if (rett.getType().equalsIgnoreCase(type)){
                    System.out.println(rett);
            }
            else { System.out.println("Vi har desverre ikke slike rett typer på denne menyen");}
            }

        }
    
    @Override
    public String toString(){
        String tekst = "Meny: " + navn + "\n";
        for (Rett rett : retter) {
            tekst += "  - " + rett.toString() + "\n"; 
        }
        tekst += "Totalpris: " + beregnMenyTotalpris() + "\n";
        return tekst;
    };
    
}
