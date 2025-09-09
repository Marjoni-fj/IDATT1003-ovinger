package ooving5_oppg1;

public class Brøk {
    double teller;
    double nevner;
    double resultat;
    double newTeller;
    double newNevner;
    //double finalTeller;
    //double finalNevner;


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

   public String getBrøk(){
    return this.getTeller() + "/" + this.getNevner();
   }

   private double gcd(double a, double b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

    private void simplify() {
    int tellerInt = (int) this.newTeller;
    int nevnerInt = (int) this.newNevner;

    int gcd = (int) gcd(Math.abs(tellerInt), Math.abs(nevnerInt));

    this.newTeller = tellerInt / gcd;
    this.newNevner = nevnerInt / gcd;

    this.resultat = (double) this.newTeller / this.newNevner;
}



   public void summer(Brøk other){
        this.newTeller = (this.teller * other.nevner) + (other.teller * this.nevner);
        this.newNevner = this.nevner * other.nevner;
        this.resultat = ((this.teller)/(this.nevner)) + ((other.teller)/(other.nevner)); //Svaret som desimal
        /*if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        */
        simplify();


   }

    public void subtraher(Brøk other){
        this.newTeller = (this.teller * other.nevner) - (other.teller * this.nevner);
        this.newNevner = this.nevner * other.nevner;
        this.resultat =  ((this.teller)/(this.nevner)) - ((other.teller)/(other.nevner)); //Svaret som desimal
        /*if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        */
        simplify();

   }
   
    public void multipliser(Brøk other){
        this.newTeller = this.teller * other.teller;
        this.newNevner = this.nevner * other.nevner;
        this.resultat =  ((this.teller)/(this.nevner)) * ((other.teller)/(other.nevner)); //Svaret som desimal
        /*if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        */
        simplify();

        

   }
   
    public void divider(Brøk other){
        this.newTeller = this.teller * other.nevner;
        this.newNevner = this.nevner * other.teller;
        this.resultat =  ((this.teller)/(this.nevner)) / ((other.teller)/(other.nevner)); //Svaret som desimal
        /*if (this.newTeller % this.newNevner == 0){ // tester hvis newTeller = newNevner
            this.newTeller /= this.newNevner;
            this.newNevner /= this.newNevner;
        }
        */
        simplify();

   }
   

    
    
}
