package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;


public class MenyRegister {
    private List<Rett> meny; //attribute er meny ArrayList med Rett objekter

    public MenyRegister() { //konstruktør som lager Arraylist
        meny = new ArrayList<>();
    }
    
    public List<Rett> getMeny() { //Get metode for å hente menyen
        return meny;
    }
    public void finnRettSomHeter(String navn){ //finner en spesifikt rett i menyen basert på navn
        for (Rett rett : meny) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                System.out.println(rett);
            }
            else{ System.out.println("Vi har desverre ikke" + navn + "på denne menyen");}
            
        }
    }

    public void finnRettAvTypen(String type){ //finner en spesifikt rett i menyen basert på type
        for (Rett rett : meny){
            if (rett.getType().equalsIgnoreCase(type)){
                System.out.println(rett);
            }
            else { System.out.println("Vi har desverre ikke slike rett typer på denne menyen");}
        }

    }
}
