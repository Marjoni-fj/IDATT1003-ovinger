package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;


public class MenyRegister {
    private List<Meny> menyer; //attribute er Menyer ArrayList med Meny objekter

    public MenyRegister() { //konstruktør som lager Arraylist
        menyer = new ArrayList<>();
    }

    private List<Rett> alleRetter = new ArrayList<>();

    public void registrerNyRett(Rett rett) {
        alleRetter.add(rett);
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

    public Meny finnRett(String Rettnavn){
        for (Meny meny : menyer){
            for (Rett rett : meny.getRetter()){
                if (rett.getNavn().equals(Rettnavn)){
                    System.out.println(rett.toString());
                }
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

}