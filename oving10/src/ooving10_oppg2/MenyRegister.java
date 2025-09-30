package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;


public class MenyRegister {
    private List<Meny> menyer; //attribute er meny ArrayList med Rett objekter

    public MenyRegister() { //konstruktør som lager Arraylist
        menyer = new ArrayList<>();
    }
    
    public List<Meny> getMenyer() { //Get metode for å hente menyen
        return menyer;
    }

    public void registrerNyMeny(Meny meny){
        menyer.add(meny);
    }

    public Meny finnMeny(String navn) {
        for (Meny meny : menyer) {
            if (meny.getNavn().equalsIgnoreCase(navn)) {
                return meny;
            }
        }
        return null;
    } 
    public void finnAlleRetterAvTypen(String type){
        for (Meny meny : menyer){
            for (Rett rett : meny.getRetter()){
                if (rett.getType().equals(type))
                    System.out.println(rett.toString());

            }
        }
    }
}
