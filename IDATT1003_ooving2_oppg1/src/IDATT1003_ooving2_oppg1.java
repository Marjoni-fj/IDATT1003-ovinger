import java.util.Scanner;

public class IDATT1003_ooving2_oppg1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean skuddaar = false; //Har en boolean verdi (false) som skal se om året er skuddår
        int year;
        System.out.println("Skriv in året: ");
        year = scanner.nextInt();

        
        if (year % 100 == 0) { //Sjekker hundreårene om året er delig på 100
            if (year % 400 == 0) { //Sjekker hundreårene om året er også delig på 400
                skuddaar = true;
            } else {
                skuddaar = false;
            }
        } else if (year % 4 == 0 ) { //sjekker om året er delig på 4 og endrer boolean verdien
            skuddaar = true;

        }
        else{
            skuddaar = false;
        }

        
        if(skuddaar == true){ //Etter at den første if-en har endret boolean verdien vil den sjekke ut hva som skal printes
            System.out.println(year + " er et skuddår");
        } else{
                System.out.println(year + " er IKKE et skuddår");
                
        }

        scanner.close();   
    }
}  

    
    

