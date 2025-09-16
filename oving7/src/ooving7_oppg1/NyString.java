package ooving7_oppg1;

public class NyString {
    private final String tekst;


    public NyString(String tekst){
        this.tekst = tekst;
    }

    public String getSetning(){
        return tekst;
    }

    public String forkort(){
        String[] ord = tekst.split(" ");
        String resultat = "";
        for (String i : ord){
            resultat += i.charAt(0);
        }
        return resultat;
    }


    public String fjernBokstav(char bokstav){
        return this.tekst.replace(String.valueOf(bokstav), "");
    }
    
}
