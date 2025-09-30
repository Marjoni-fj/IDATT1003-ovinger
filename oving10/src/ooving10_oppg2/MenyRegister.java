package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;


public class MenyRegister {
    private List<Meny> menyer; //attribute er Menyer ArrayList med Meny objekter

    public MenyRegister() { //konstruktør som lager Arraylist
        menyer = new ArrayList<>();
    }

    //----------------------------------------//
    //liste over alle rettene
    private List<Rett> alleRetter = new ArrayList<>();

    public void registrerNyRett(Rett rett) {
        alleRetter.add(rett);
    }
    //----------------------------------------//
    
    public List<Meny> getMenyer() { //Get metode for å hente menyen
        return menyer;
    }

    public void registrerNyMeny(Meny meny){
        menyer.add(meny);
    }

    //----------------------------------------//
    //Finn-metoder
    public Meny finnMeny(String navn) {
        for (Meny meny : menyer) {
            if (meny.getNavn().equalsIgnoreCase(navn)) {
                return meny;
            }
        }
        return null;
    } 

    public Rett finnRett(String Rettnavn){
        for (Rett rett : alleRetter){
            if (rett.getNavn().equalsIgnoreCase(Rettnavn)){
                    return rett;
            }
        }
        return null;
    }

    public void finnAlleRetterAvTypen(String type){
        for (Rett rett : alleRetter){
            if (rett.getType().equalsIgnoreCase(type))
                    System.out.println(rett.toString());

        }
    }
    public List<Meny> finnMenyerMedTotalprisMellom(double minimalPrice, double maximalPrice){
        List<Meny> menyIntervall = new ArrayList<Meny>();
        for (Meny meny : menyer){
            double pris = meny.beregnMenyTotalpris();
            if (pris >= minimalPrice && pris <= maximalPrice){
                menyIntervall.add(meny);
            }
        }
        return menyIntervall;
    }
    //----------------------------------------//

}