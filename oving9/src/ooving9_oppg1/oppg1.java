package ooving9_oppg1;

public class oppg1 {
    public static void main(String[] args){

        Student student1 = new Student("Fredrik", 7);
        Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt(10);



        System.out.println(student1.toString() + "\n");
        oppgaveoversikt.registrerNyStudent("Fredrik", 7);
        System.out.println("Antall studenter i klassen: " +oppgaveoversikt.getAntStud());

    }
    
}
