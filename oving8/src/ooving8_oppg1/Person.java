package ooving8_oppg1;

public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int fodselsaar;


    public Person(String fornavn, String etternavn, int fodselsaar){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;
    }

    @Override
    public String toString() {
        return fornavn + " " + etternavn + " (født " + fodselsaar + ")";
    }


    public String getFornavn(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public int getFodselsaar(){
        return fodselsaar;
    }




    
}
