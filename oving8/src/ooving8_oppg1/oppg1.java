package ooving8_oppg1;

public class oppg1 {
    public static void main(String[] args){

        /*
        System.out.println(Fredrik.getFornavn());
        System.out.println(Fredrik.getEtternavn());
        System.out.println(Fredrik.getBirthYear());
        */
        Person person1 = new Person("Fredrik", "Marjoni", 2006);
        ArbTaker arbTaker1 = new ArbTaker(person1, 123, 2022, 40000, 30);


       System.out.println("Fullt navn: " + arbTaker1.fullNavn());
       System.out.println("Alder: " + arbTaker1.alder());
       System.out.println("Antall år ansatt: " + arbTaker1.antallAarAnsatt());
       System.out.println("Skattetrekk per måned: " + arbTaker1.skattetrekkPrMaaned());
       System.out.println("Skattetrekk per år: " + arbTaker1.skattetrekkPrAar());
       System.out.println("Bruttolønn per år: " + arbTaker1.bruttoloennPrAar());
       System.out.println("Har vært ansatt mer enn 1 år? " + arbTaker1.harVaertAnsattMerEnn(1));




        
    }
    
}
