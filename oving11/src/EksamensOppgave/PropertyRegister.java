package EksamensOppgave;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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



    /*======================Case 2: register and add new property ================================ */

    /**Adds a new Property in the municipality */
    public void addPoperty(int municipalityNr, String municipalityName, int lotNr, 
                        int sectionNr,  String propertyName, double area, String owner){
        properties.add(new Property(municipalityNr, municipalityName, lotNr, sectionNr, propertyName, area, owner));
    }
    /**Registers a new Property in the municipality.
     * Handles the logic
     * @param scanner
    */
    public void NewProperty(Scanner scanner) {
        System.out.print("Municipality number: ");
        int municipalityNr = scanner.nextInt();
        scanner.nextLine(); // clear newline

        System.out.print("Municipality name: ");
        String municipalityName = scanner.nextLine();

        System.out.print("Lot number: ");
        int lotNr = scanner.nextInt();

        System.out.print("Section number: ");
        int sectionNr = scanner.nextInt();
        scanner.nextLine(); // clear newline

        System.out.print("Property name: ");
        String propertyName = scanner.nextLine();

        System.out.print("Area (m2): ");
        double area = scanner.nextDouble();
        scanner.nextLine(); // clear newline

        System.out.print("Owner name: ");
        String owner = scanner.nextLine();

        addPoperty(municipalityNr, municipalityName, lotNr, sectionNr, propertyName, area, owner);
        System.out.println("✅ Property successfully added!");
    }
    /*======================================================================================== */



    /*======================Case 3: delete and unregister a property ================================ */
    /**Deletes a property in the municipality */
    public boolean deleteProperty(int municipalityNr, int lotNr, int sectionNr) {
        for (Property p : properties) {
            if (p.getMunicipalityNr() == municipalityNr &&
                p.getLotNr() == lotNr &&
                p.getSectionNr() == sectionNr) {
                properties.remove(p);
                System.out.println("Property sucessfully removed");
                return true;
            }
        }
        return false; // if not found
    }
    /**Unregisters a property in the municipality. 
     * Handles the logic
     * @param scanner
    */
    public void unregisterProperty(Scanner scanner){
        System.out.println("Which property do you want to remove? ");
        System.out.print("What's the municipality number: ");
        int xmNumber = scanner.nextInt();
        System.out.print("What's the lot number: ");
        int xlNumber = scanner.nextInt();
        System.out.print("What's the section number: ");
        int xsNumber = scanner.nextInt();
        deleteProperty(xmNumber, xlNumber, xsNumber);

    }
    /*======================================================================================== */

    /*============================= Find Methods ============================================= */
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
    /*======================================================================================== */

    

    /*======================Case 4: Search and finds a property ================================ */
    /**Finds a specific Property in the municipality with a specific municipality number, lot number and a section number*/
    private void findProperty(int mNumber, int lNumber, int sNumber){
        boolean found = false;
        for (Property p : properties){
            if (p.getMunicipalityNr() == mNumber && p.getLotNr() == lNumber && p.getSectionNr() == sNumber){
                System.out.println("Property found:");
                System.out.println(p);
                found = true;
            }
        }
        if (!found){ System.out.println("No property¨found with those numbers");}
        
    }
    /**Searches a specific Property in the municipality with a specific municipality number, lot number and a section number.
     * Handles the logic
     * @param scanner
    */
    public void searchProperty(Scanner scanner){
        System.out.print("What's the municipality number: ");
        int mNumber = scanner.nextInt();
        System.out.print("What's the lot number: ");
        int lNumber = scanner.nextInt();
        System.out.print("What's the section number: ");
        int sNumber = scanner.nextInt();
        this.findProperty(mNumber, lNumber, sNumber);
    }
    /*======================================================================================== */


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
		System.out.println("\nPlease enter a number between 1	and 6");
        System.out.print("Choice: ");
    }

}
