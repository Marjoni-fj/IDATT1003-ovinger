package ooving5_oppg1;

public class oppg1 {
    public static void main(String[] args){
        Brøk brøk1 = new Brøk(2,4);
        Brøk brøk2 = new Brøk(5, 2);
        Brøk brøk3 = new Brøk(3, 5);
        Brøk brøk4 = new Brøk(6, 9);
        

    
        //System.out.println("Telleren i brøk1 er: " + brøk1.getTeller());
        //System.out.println("nevneren i brøk1 er: " + brøk1.getNevner());

        System.out.println("******************************");
        brøk1.summer(brøk2);
        System.out.println("Summen av " + brøk1.getBrøk() + " og " + brøk2.getBrøk() + " er " + brøk1.newTeller + "/" + brøk1.newNevner);
        System.out.println("eller med andre ord " + brøk1.resultat);

        System.out.println("******************************");

        brøk2.subtraher(brøk3);
        System.out.println("Differansen av " + brøk2.getBrøk() + " og " + brøk3.getBrøk() + "  er " + brøk2.newTeller + "/" + brøk2.newNevner);
        System.out.println("eller med andre ord " + brøk2.resultat);

        System.out.println("******************************");

        brøk1.multipliser(brøk2);
        System.out.println("Produktet av " + brøk1.getBrøk() + " og " + brøk2.getBrøk() + " er " + brøk1.newTeller + "/" + brøk1.newNevner);
        System.out.println("eller med andre ord " + brøk1.resultat);

        System.out.println("******************************");

        brøk2.divider(brøk4);
        System.out.println("Kvotienten av " + brøk2.getBrøk() + " og " + brøk4.getBrøk() + "er " + brøk2.newTeller + "/" + brøk2.newNevner);
        System.out.println("eller med andre ord " + brøk2.resultat);
        System.out.println("******************************");


    }
        
}
