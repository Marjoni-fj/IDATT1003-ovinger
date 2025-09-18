package ooving8_oppg1;

public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int birthyear;


    public Person(String fornavn, String etternavn, int birthyear){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.birthyear = birthyear;
    }

    public String getFornavn(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public int getbirthyear(){
        return birthyear;
    }




    
}
