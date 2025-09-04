package ooving5_oppg1;

public class Brøk {
    double teller;
    double nevner;
    double resultat;
    double newTeller;
    double newNevner;
    double finalTeller;
    double finalNevner;


    public Brøk(double teller, double nevner){ //konstruktor 1
        this.teller = teller;
        this.nevner = nevner;
        if (nevner == 0){
            throw new IllegalArgumentException("Kanke dele på null vettu");

        }

    }
    public Brøk(double teller){ //konstruktor 2
        nevner = 1;
    }

   public double getTeller(){
    return teller;
   }
   public double getNevner(){
    return nevner;
   }

   private double gcd(double a, double b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

    private void simplify() {
    double tellerInt = (int) this.newTeller;
    double nevnerInt = (int) this.newNevner;

    double gcd = gcd(Math.abs(tellerInt), Math.abs(nevnerInt));

    this.finalTeller = tellerInt / gcd;
    this.finalNevner = nevnerInt / gcd;
}



   public void summer(Brøk other){
        this.newTeller = (this.teller * other.nevner) + (this.nevner * other.nevner);
        this.newNevner = this.nevner * other.nevner;
        this.resultat = ((this.teller)/(this.nevner)) + ((other.teller)/(other.nevner)); //Svaret som desimal
        if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        simplify();


   }

    public void subtraher(Brøk other){
        this.newTeller = (this.teller * other.nevner) - (this.nevner * other.teller);
        this.newNevner = this.nevner * other.nevner;
        this.resultat =  ((this.teller)/(this.nevner)) - ((other.teller)/(other.nevner)); //Svaret som desimal
        if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        simplify();

   }
   
    public void multipliser(Brøk other){
        this.newTeller = this.teller * other.teller;
        this.newNevner = this.nevner * other.nevner;
        this.resultat =  ((this.teller)/(this.nevner)) * ((other.teller)/(other.nevner)); //Svaret som desimal
        if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        simplify();

        

   }
   
    public void divider(Brøk other){
        this.newTeller = this.teller * other.nevner;
        this.newNevner = this.nevner * other.teller;
        this.resultat =  ((this.teller)/(this.nevner)) / ((other.teller)/(other.nevner)); //Svaret som desimal
        if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        simplify();

   }
   

    
    
}
