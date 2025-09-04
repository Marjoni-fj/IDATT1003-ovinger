import java.util.Scanner;
public class IDATT1003_ooving1_oppg2 {

    
    
    public static void main(String[] args) {
        
        //Skriv et program som regner om timer, minutter og sekunder til 
        //totalt antall sekunder. Sett opp testdatasett og prøv ut programmet.
        
        Scanner scanner = new Scanner(System.in);
        
    int hours;
    int minutes;
    int seconds;
    int totalseconds;

        System.out.println("Total sekunder program ");

        System.out.print("skriv inn antall timer: ");
        hours = scanner.nextInt();

        System.out.print("skriv inn antall minutter: ");
        minutes = scanner.nextInt();

        System.out.print("skriv inn antall sekunder: ");
        seconds = scanner.nextInt();
        

        totalseconds = (hours*3600) + (minutes*60) + seconds;

        System.out.println(hours + " h "+ minutes + " min "+ seconds + " sek er totalt "+ totalseconds + " sekunder");
       

    scanner.close();
    }
}

