package ooving7_oppg1;

public class NyString {
    private final String tekst;


    public NyString(String tekst){
        this.tekst = tekst;
    }

    public String getSetning(){
        return tekst;
    }
/*
    public String forkort(String tekst){
        String[] ord = tekst.split(" ");
        for (ord : tekst){

        }
        return tekst;
    }
        */

    public String fjernBokstav(char bokstav){
        return this.tekst.replace(String.valueOf(bokstav), "");
    }
    
}
