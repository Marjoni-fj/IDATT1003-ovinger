package ooving6_oppg2;

public class Tekstanalyse {
    String text;
    int[] antallTegn = new int[30];

    private int finnIndeks(char tegn) {
    tegn = Character.toLowerCase(tegn);
    if (tegn >= 'a' && tegn <= 'z') return tegn - 'a';
    if (tegn == 'æ') return 26;
    if (tegn == 'ø') return 27;
    if (tegn == 'å') return 28;
    return 29;
}

    public Tekstanalyse(String text) {
    this.text = text;
    for (int i = 0; i < text.length(); i++) {
    int indeks = finnIndeks(text.charAt(i));
    antallTegn[indeks]++;
    }
}

    public int antallForskjelligeBokstaver(int antall){
        return antall;

    }

    public int totaltAntallBokstaver(int total){
        return total;

    }

    public double prosentIkkeBokstaver(double prosent){
        return prosent;

    }

    public int antallAv(char bokstav){
        return bokstav;
    }
    /*

    public int mestForekommendeBokstaver(){
       
    }

    */






}
