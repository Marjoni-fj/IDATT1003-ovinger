import java.util.Scanner;

public class IDATT1003_ooving1_oppg3 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
    
    int seconds;
    
        System.out.print("Hvor mange sekunder har du igjen av livet: ");
        seconds = scanner.nextInt();
    
 
    int timer = seconds / 3600; //Regner ut hvor mange hele timer det går i det totale antallet sekunder
        System.out.println(timer + " timer");
    int rest_min = seconds % 3600; //Finner restverdien etter å ha trukket ut hele timer, altså hvor mange sekunder som er igjen etter hele timer er regnet ut.
        System.out.println(rest_min + " sekunder i rest");
    int minutes = rest_min / 60; //Regner ut hvor mange hele minutter det går i restverdien
        System.out.println(minutes + " minutter");
    int rests_sec = rest_min % 60; //Finner restverdien etter at minuttene er regnet ut, altså sekundene som står igjen til slutt.
        System.out.println(rests_sec + " sekunder");


        System.out.println(seconds + " sekunder igjen av livet er lik: " + timer + " t, "+ minutes + " min, og " + rests_sec + "sek.");

        scanner.close();
    }
}
