package ntnu.dataing;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    double intoAccount;
        
        System.out.println("Welcome to the ATM_system");

        Account myAccount = new Account(123456789, "Fredrik", 100); //object initialized from the class Account
        

        System.out.println("My name is " + myAccount.getName()); //object.method returns a value
        System.out.println("My account number is " + myAccount.getAccountnr());
        System.out.println("My saldo is " + myAccount.getSaldo());
        System.out.println();

        
        System.out.print("How much money do you want to transact: ");
        intoAccount = scanner.nextDouble();
        myAccount.doTransaction(intoAccount);
    
        System.out.println("My new saldo is " + myAccount.getSaldo());

        System.out.println("information about me: \n" + myAccount.toString());


        scanner.close();
    }
}
