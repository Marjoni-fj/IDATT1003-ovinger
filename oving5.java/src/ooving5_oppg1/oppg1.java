package ooving5_oppg1;

public class oppg1 {
    public static void main(String[] args){
        Brøk brøk1 = new Brøk(2,4);
        Brøk brøk2 = new Brøk(5, 2);

    
        //System.out.println("Telleren i brøk1 er: " + brøk1.getTeller());
        //System.out.println("nevneren i brøk1 er: " + brøk1.getNevner());

        System.out.println("******************************");
        brøk1.summer(brøk2);
        System.out.println("Summen er " + brøk1.newTeller + "/" + brøk1.newNevner);
        System.out.println("eller med andre ord " + brøk1.resultat);

        System.out.println("******************************");

        brøk2.subtraher(new Brøk(3, 5));
        System.out.println("Differansen er " + brøk2.newTeller + "/" + brøk2.newNevner);
        System.out.println("eller med andre ord " + brøk2.resultat);

        System.out.println("******************************");

        brøk1.multipliser(brøk2);
        System.out.println("Produktet er " + brøk1.newTeller + "/" + brøk1.newNevner);
        System.out.println("eller med andre ord " + brøk1.resultat);

        System.out.println("******************************");

        brøk2.divider(new Brøk(6, 9));
        System.out.println("Kvotienten er " + brøk2.newTeller + "/" + brøk2.newNevner);
        System.out.println("eller med andre ord " + brøk2.resultat);
        System.out.println("******************************");

        
        

    



    }
        
}
