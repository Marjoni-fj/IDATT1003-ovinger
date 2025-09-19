package ooving9_oppg1;

public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud = 0;
    
    
    public Oppgaveoversikt(int kapasitet){
        studenter = new Student[kapasitet]; // oppretter tabell med plass
        antStud = 0;
    }

    // Antall registrerte studenter
    public int getAntStud(){
        return antStud;
    }

    public int oppgaverloest(String navn){
        for (int i = 0; i < antStud; i++){
            if (studenter[i].getNavn().equals(navn)){
                return studenter[i].getAntOppg();

            }
        }
        return -1;
    }
    public void registrerNyStudent(String navn, int antOppg){
        studenter[antStud] = new Student(navn, antOppg);
        antStud++;
    }

    public void oekAntOppg(String navn, int oekning){
        for (int j = 0; j < antStud; j++){
            if (studenter[j].getNavn().equals(navn)){
                studenter[j].økAntOppg(oekning);
            }
        }
    }

    @Override
    public String toString(){
        return "Antall Studenter i klassen: " + antStud;
    }



    
}
