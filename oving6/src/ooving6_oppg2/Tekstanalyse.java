package ooving6_oppg2;

public class Tekstanalyse {
    String text;
    String tittel;
    int[] antallTegn = new int[30]; //liste med bare nullere fordelt på 30 plasser

    private int finnIndeks(char tegn) {
    tegn = Character.toLowerCase(tegn);
    if (tegn >= 'a' && tegn <= 'z') return tegn - 'a';
    if (tegn == 'æ') return 26;
    if (tegn == 'ø') return 27;
    if (tegn == 'å') return 28;
    return 29;
}

    public Tekstanalyse(String text,String tittel) { //konstruktør
    this.text = text;
    this.tittel = tittel;
    for (int i = 0; i < text.length(); i++) {
    int indeks = finnIndeks(text.charAt(i));
    antallTegn[indeks]++;
    }
}

    public int antallForskjelligeBokstaver(){
        int unique = 0;
        for (int i = 0; i <= 28; i++){
            if (antallTegn[i] > 0){
                unique += 1;
            } 
        }
        return unique;

    }

    public int totaltAntallBokstaver(){
        int total = 0;
        for (int i = 0; i <= 28; i++){
            total += antallTegn[i];
        }
        return total;

    }

    public double prosentIkkeBokstaver(){
        double prosent= ((double) antallTegn[29] / text.length()) * 100;
        return prosent;

    }

    public int antallAv(char bokstav){
        int indeks = finnIndeks(bokstav);
        return antallTegn[indeks];
    }
    

    public int mestForekommendeBokstaver(){
        int max = 0;
        for (int i = 0; i <= 28; i++){
            if (antallTegn[i] > max){
                max = antallTegn[i];
            }
        }
        return max;
       
    }


    public void statistics(){
        System.out.println("\n************ Statistics over "+ this.tittel +" ************* \n");
        System.out.println("Totalt antall bokstaver: " + this.totaltAntallBokstaver());
        System.out.println("Antall forskjellige bokstaver: " + this.antallForskjelligeBokstaver());
        System.out.println("Mest forekommende bokstaver " + this.mestForekommendeBokstaver());
        System.out.println("Prosent ikke-bokstaver: " + this.prosentIkkeBokstaver() + "% \n");
        System.out.println("********************************************* \n");
    }








}
