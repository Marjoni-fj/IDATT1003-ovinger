package ooving9_oppg1;

public class Student {
    private final String navn;  // entydig
    private int antOppg;

    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn(){ 
        return navn; 
    }

    public int getAntOppg(){ 
        return antOppg; 
    }

    public void økAntOppg(int økning){ 
        this.antOppg += økning;
    }

    @Override
    public String toString(){
        return "Student: " + navn + 
               "\nAntall oppgaver godkjent: " + antOppg;
    }
}
