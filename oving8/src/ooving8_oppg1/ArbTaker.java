package ooving8_oppg1;
import java.util.GregorianCalendar;

public class ArbTaker {
    private final Person personalia; 
    private int arbTakerNr;
    private int ansettelsesaar;
    private double maanedsloenn;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbTakerNr, int ansettelsesaar, double maanedsloenn, double skatteprosent) {
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



    
}
