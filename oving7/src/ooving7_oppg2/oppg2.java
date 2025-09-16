package ooving7_oppg2;
import java.util.Scanner;
public class oppg2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        Tekstbehandling text1 = new Tekstbehandling("æøåæøå. Hello Hello World World World. World World World World World World. æøåæøå.", "Basic Print");

        while(isRunning){
            System.out.println("Welcome to the Norsk-analyse part 2:)");
            System.out.println("Dagens tekst: " + text1.getText() + "\n");
            System.out.print("vil du endre på et av ordene? (y/n): ");
            String valg = scanner.nextLine().toLowerCase();

            if (valg.equals("y")){
                System.out.println("Hvilket ord vil du endre?");
                String oldWord = scanner.nextLine().trim();

                System.out.println("Hva vil du endre det til?");
                String newWord = scanner.nextLine().trim();

                text1.text = text1.skiftOrd(oldWord, newWord);

                System.out.println("Teksten etter endringen:");
                System.out.println(text1.getText() + "\n"); 
            }
            else if (valg.equals("n")){
                isRunning = false; // stopper løkka
            }
              
            else{
                throw new IllegalArgumentException("Skriv et ekte ord da!!");
            }

        }

        text1.statistics();


    scanner.close();
    }

    
}
