package ntnu.beginning;

public class ClientProgram {
    public static void main(String[] args){
        Customer customer1 = new Customer("Fredrik", 123456);
        boolean loginSuccess = customer1.login();

        System.out.println(custumer1.getName());
        System.out.println(custumer1.getIdNumber());

        if(loginSuccess){ 
            System.out.println("yes");
        }
        else{ 
            System.out.println("no");
        }

    }
}
