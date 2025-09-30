package ooving10_oppg2;
import java.util.ArrayList;
import java.util.List;


public class MenyRegister {
    private List<Meny> menyer; //attribute er meny ArrayList med Rett objekter

    public MenyRegister() { //konstruktør som lager Arraylist
        menyer = new ArrayList<>();
    }
    
    public List<Meny> getMeny() { //Get metode for å hente menyen
        return menyer;
    }


}
