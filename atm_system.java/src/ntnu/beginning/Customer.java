package ntnu.beginning;

public class Customer {
    final String name;
    final int idNumber;

    public Customer(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName(){ return name;}
    public int getIdNumber(){ return idNumber;}

    public boolean login(String name, int idNumber){
        Bank bank = new Bank();
        return bank.validateCustumer(this.name, this.idNumber);
    }
}
