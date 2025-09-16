package src.oppg2;
//import java.util.Scanner;

public class Oppg2 {
    public static void main(String[] args) {

        Spiller spiller1 = new Spiller("Player 1");
        Spiller spiller2 = new Spiller("Player 2");
    
    int runde = 1;
        while (!spiller1.erFerdig() && !spiller2.erFerdig()){
            System.out.println("Round" + runde);
            System.out.println("Scoreboard: ");
            System.out.println("Player 1: "+ spiller1.getSumPoeng());
            System.out.println("Player 2: "+ spiller2.getSumPoeng() + "\n");

            spiller1.kastTerningen();
            spiller2.kastTerningen();

            if (spiller1.erFerdig()){
                System.out.println(spiller1 + "Won");
                System.out.println("Scoreboard after round " + runde + ":");
                System.out.println("Player 1: "+ spiller1.getSumPoeng());
                System.out.println("Player 2: "+ spiller2.getSumPoeng() + "\n");
                break;

            }
            else if (spiller2.erFerdig()){
                System.out.println(spiller2 + "Won");
                System.out.println("Scoreboard after round " + runde + ":");
                System.out.println("Player 1: "+ spiller1.getSumPoeng());
                System.out.println("Player 2: "+ spiller2.getSumPoeng() + "\n");
                break;
            }
            else{
               runde++; 
            }

            


        }

       

    




        








    }

}
