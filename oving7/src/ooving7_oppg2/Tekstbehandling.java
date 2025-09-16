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
    public double gjennomsnittOrdlengde(){
        String[] ord = text.split("[\\s.,!?;:]+");  // deler på mellomrom og skilletegn
        int totalBokstaver = 0;

        for (String o : ord){ //for løkke som itererer gjennom ordene og legger sammen ordlengdene
            totalBokstaver += o.length();
        }
        if (ord.length == 0) return 0;  // unngå deling på null
        return (double) totalBokstaver / ord.length;

    }
    public double gjennomsnittOrdPrPeriode(){
        String[] perioder = text.split("[.,!?;:]+");  // deler på mellomrom og skilletegn
        String[] nyOrd = text.split("[\\s]");
        double totalOrd = (nyOrd.length)/(perioder.length);

        return totalOrd;

    }
    public String skiftOrd(String oldWord, String newWord){
        String find = "\\b" + oldWord + "\\b";
        String newText = text.replaceAll(find, newWord);

        return newText;
    }

    public String getText(){ //Skriver ut teksten
        return text;
    }

    public String getBigText(){ //Skriver ut teksten i STORE bokstaver
        return text.toUpperCase();
    }
    
    public void statistics(){
        System.out.println("\n************ Statistics over "+ this.tittel +" ************* \n");
        System.out.println("Selve teksten: "+ this.text +"\n");
        System.out.println("Totalt antall bokstaver: " + this.totaltAntallBokstaver());
        System.out.println("Gjennomsnittlig ordlengde: " + this.gjennomsnittOrdlengde());
        System.out.println("Gjennomsnittlig ord per periode: " + this.gjennomsnittOrdPrPeriode());
        System.out.println("Teksten i uppercase: "+ this.getBigText() +"\n");

        System.out.println("********************************************* \n");
    }
    
}
