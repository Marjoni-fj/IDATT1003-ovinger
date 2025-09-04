import java.util.Scanner;
public class IDATT1003_ooving3_oppg2 {

    public static void main(String[] args){

    int number;
    boolean is_Prime; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        number = scanner.nextInt();

        while (number < 0){
            is_Prime = false;
            System.out.println("The number cannot be negative");
            System.out.print("Choose again: ");
            number = scanner.nextInt(); // Aks user again

        }
        
        is_Prime = true; // ensure default true for the checked number

        if (number == 2 || number == 1 || number == 0) { //2 is by definition a prime number - this line checks if input is equal to 2
            is_Prime = true;
        } 
        else if (number % 2 == 0) { // checks if the number is even and > 2 -> not prime
            is_Prime = false; 
        } 
        else {
            int limit = (int) Math.sqrt(number);
            for (int i = 3; i <= limit; i += 2) { //test the number with only odd divisors up until the sqrt(number)
                if (number % i == 0) { //checks if number is divisble by some of the odd numbers from 3 to (int) Math.sqrt(number)
                    is_Prime = false; 
                    break; // found divisor -> stop
                }
            }
        }

        // Output result
        if (is_Prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }



    

        scanner.close();


    }

}
