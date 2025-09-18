package ooving8_oppg1;
import java.util.GregorianCalendar;


public class ArbTaker {
    private final Person personalia; 
    private int arbTakerNr;
    private int ansettelsesaar;
    private double maanedsloenn;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbTakerNr, int ansettelsesaar, 
                    double maanedsloenn, double skatteprosent) {
        this.personalia = personalia;
        this.arbTakerNr = arbTakerNr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedsloenn = maanedsloenn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() { return personalia; }
    public int getArbTakerNr() { return arbTakerNr; }
    public int getAnsettelsesaar() { return ansettelsesaar; }
    public double getMaanedsloenn() { return maanedsloenn; }
    public double getSkatteprosent() { return skatteprosent; }

    public void setMaanedsloenn(double maanedsloenn){
        this.maanedsloenn = maanedsloenn;
    }

    public void setSkatteprosent(double skatteprosent){
        this.skatteprosent = skatteprosent;
    }

    public double skattetrekkPrMonth(){
        return maanedsloenn * (skatteprosent/100);
    }
    public double skattetrekkPrYear(){
        double vanligMonth = 10.5 * this.skattetrekkPrMonth(); //10,5 månder av 12 måneder skal
        return vanligMonth;

    }

    public double bruttoloennPrYear(){
        return maanedsloenn * 12;
    }

    public String fullNavn(){
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }
    public int age(){
        GregorianCalendar calendar = new GregorianCalendar();
        int thisYear = calendar.get(java.util.Calendar.YEAR); 
        return thisYear - personalia.getBirthYear();
    }
    public int yearsInWork(){
        GregorianCalendar calendar = new GregorianCalendar();
        int thisYear = calendar.get(java.util.Calendar.YEAR);
        return thisYear - this.ansettelsesaar;

    }
    public boolean harVaertAnsattMerEnn(int aar){
        return yearsInWork() > aar;
    }  




    
}
