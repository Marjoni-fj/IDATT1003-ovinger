package src.oppg2;

import java.util.Random;

public class Spiller {
    private String navn;        // navn på spilleren (A eller B)
    private int sumPoeng;       // samlede poeng
    private Random terning;     // terningkastgenerator
    

    
    public Spiller(String navn){
        this.navn = navn;
        this.sumPoeng = 0;
        this.terning = new Random();
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public void kastTerningen(){
        int kast = terning.nextInt(6) + 1;
        System.out.println(navn + " kastet: " + kast);
        if (kast == 1) {
            sumPoeng = 0; // mister alle poeng denne runden
        } else {
            sumPoeng += kast;
        }

    }

    public boolean erFerdig() {
        return sumPoeng >= 100; 
    }


}
