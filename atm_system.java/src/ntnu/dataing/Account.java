package ntnu.dataing;

public class Account {
    private final long accountnr; // instansvariabel (felt)
    private final String name; // instansvariabel (felt)
    private double saldo; // instansvariabel (felt)


    // Konstruktør: brukes til å opprette et nytt Account-objekt med initialverdier
    public Account(long accountnr, String name, double saldo){ 
        // 'this' refererer til objektets felt og brukes for å skille fra parameter med samme navn
        this.accountnr = accountnr; 
        
        this.name = name; 
        
        this.saldo = saldo;
    }
    //MERK:
    //this.[] refererer til instansen av klassen. 
    //Vi bruker det når vi trenger å skille mellom parameteren og feltet med samme navn 
    //eller når vi eksplisitt vil referere t il objektets felt/metoder.

    public long getAccountnr(){ //method
        return accountnr; //burker [] isteden for this.[] fordi det ikke er navnekonfliktt
    }

    public String getName(){ //method
        return name; //burker [] isteden for this.[] fordi det ikke er navnekonfliktt
    }

    public double getSaldo(){ //method
        return saldo; //burker [] isteden for this.[] fordi det ikke er navnekonfliktt
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + 
               "Account number: " + this.accountnr + "\n" + 
               "Saldo: " + this.saldo;
    }

    // Metode som endrer saldoen (legger til eller trekker fra beløp)
    public void doTransaction(double amount){ 
        if (amount < 0){
            saldo += amount;
        }
        else if (amount == 0){
            saldo = saldo*1;
        }
        else{
            saldo += amount;
        }

        
    }





    
}
