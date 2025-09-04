import java.util.Scanner;

public class IDATT1003_ooving3_oppg1 {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    double number_min;
    double number_max;
    

        System.out.print("Choose a minimum number: ");
        number_min = scanner.nextDouble();
        System.out.print("Choose a maximum number: ");
        number_max = scanner.nextDouble();
        System.out.println("*****************************");
    
        
        

        while(number_min <=  number_max){
            System.out.println(number_min + " gangetabellen \n");
            for(int i = 1; i <= 10; i++){
                System.out.println(number_min + " X " + i + " = " + number_min*i); 
        }
        System.out.println("*****************************");
        number_min++;
        }
        


            


        scanner.close();
     }
    
}
