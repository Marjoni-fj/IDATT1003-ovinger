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
    private void findPropertyMunicipalityNR(int number){
        for (Property p : properties){
            if (p.getMunicipalityNr() == number){
                System.out.println(p);
            }
        }
    }
    /**Finds a Property in the municipality with a given lot number*/
    private void findPropertyLotNR(int number){
        for (Property p : properties){
            if (p.getLotNr() == number){
                System.out.println(p);
            }
        }
    }
    /**Finds a Property in the municipality with a given section number*/
    private void findPropertySectionNR(int number){
        for (Property p : properties){
            if (p.getSectionNr() == number){
                System.out.println(p);
            }
        }
    }
}
