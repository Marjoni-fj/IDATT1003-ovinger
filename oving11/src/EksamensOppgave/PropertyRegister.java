package EksamensOppgave;
import java.util.ArrayList;
import java.util.List;

public class PropertyRegister {
    private List<Property> properties; //attribute er Property ArrayList med Meny objekter

    /**Constructor which makes a new Arraylist containing Property datatypes */
    public PropertyRegister() { //konstruktør som lager Arraylist
        properties = new ArrayList<>();
    }

    /**Method that returns all the properties in the municipality */
    public List<Property> getProperties(){ return properties;}

    /** Returns total properties in the municipality*/
    public int getTotalProperties(){ return properties.size();}

    /**Registers a new Property in the municipality */
    public void newPoperty(int municipalityNr, String municipalityName, int lotNr, 
                        int sectionNr,  String propertyName, double area, String owner){
        properties.add(new Property(municipalityNr, municipalityName, lotNr, sectionNr, propertyName, area, owner));
    }

    /**Removes a Property in the municipality */
    public void deleteProperty(Property property){ properties.remove(property); }

    /**Finds a Property in the municipality with a given municipality number*/
    public void findPropertyMunicipalityNR(int number){
        for (Property p : properties){
            if (p.getMunicipalityNr() == number){
                System.out.println(p);
            }
        }
    }
    /**Finds a Property in the municipality with a given lot number*/
    public void findPropertyLotNR(int number){
        for (Property p : properties){
            if (p.getLotNr() == number){
                System.out.println(p);
            }
        }
    }
    /**Finds a Property in the municipality with a given section number*/
    public void findPropertySectionNR(int number){
        for (Property p : properties){
            if (p.getSectionNr() == number){
                System.out.println(p);
            }
        }
    }
    /**Finds a specific Property in the municipality with a specific municipality number, lot number and a section number*/
    public void findProperty(int mNumber, int lNumber, int sNumber){
        boolean found = false;
        for (Property p : properties){
            if (p.getMunicipalityNr() == mNumber && p.getLotNr() == lNumber && p.getSectionNr() == sNumber){
                System.out.println("Property found:");
                System.out.println(p);
                found = true;
            }
        }
        if (!found){ System.out.println("No property with those numbers");}
        
    }
    /**Finds average property area the municipality*/
    public double averagePropertyArea(){
        double totalArea = 0;
        for (Property p : properties){
            totalArea += p.getArea();
        }
        double average = totalArea/((double)properties.size());
        return average;
    }
    /**Displays a menu for the application */
    public void showMenu(){
        System.out.println("\n*****	Gloppen municipality Property Register Application	*****\n");
		System.out.println("1.	List all properties");
        System.out.println("2.	Add property");
        System.out.println("3.	Remove property");
		System.out.println("4.	Search property");
		System.out.println("5.	Calculate average property area");
		System.out.println("6.	Quit");
		System.out.println("\nPlease enter a number between 1	and 9");
        System.out.print("Choice: ");
    }

}
