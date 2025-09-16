package ooving7_oppg2;

public class Tekstbehandling {
    String text;
    String tittel;
    int[] antallTegn = new int[30]; //liste med bare nullere fordelt på 30 plasser

    private int finnIndeks(char tegn) {
    tegn = Character.toLowerCase(tegn);
    switch(tegn){
        case 'æ': return 26;
        case 'ø': return 27;
        case 'å': return 28;
    }
    if (tegn >= 'a' && tegn <= 'z') return tegn - 'a';
   
    return 29;
} 

    public Tekstbehandling(String text,String tittel) { //konstruktør
    this.text = text;
    this.tittel = tittel;
    for (int i = 0; i < text.length(); i++) {
        int indeks = finnIndeks(text.charAt(i));
        antallTegn[indeks]++;
    }
}
    public int totaltAntallBokstaver(){
        int total = 0;
        for (int i = 0; i <= 28; i++){
            total += antallTegn[i];
        }
        return total;

    }

    public String getText(){
        return text;
    }

    public String getBigText(){
        return text.toUpperCase();
    }
    
    public void statistics(){
        System.out.println("\n************ Statistics over "+ this.tittel +" ************* \n");
        System.out.println("Selve teksten: "+ this.text +"\n");
        System.out.println("Totalt antall bokstaver: " + this.totaltAntallBokstaver());
        System.out.println("Teksten i uppercase: "+ this.getBigText() +"\n");

        System.out.println("********************************************* \n");
    }
    
}
