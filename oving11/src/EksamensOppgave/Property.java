package EksamensOppgave;

public class Property {
    private int municipalityNr; //Norwegian: Kommune nummer
    private final String municipalityName; //Norwegian: Kommune navn
    private int lotNr; //Norwegian: Gårdsnummer
    private int sectionNr; //Norwegian: Bruksnummer
    private String propertyName; //Norwegian: Bruksnavn
    private double area; //Norwegian: Areal
    private String owner; //Norwegian: Navn på eier	

    /**
     * Constructor initializing all fields for a property.
     */
    public Property(int municipalityNr, String municipalityName, int lotNr, 
                    int sectionNr,  String propertyName, double area, String owner){
        this.municipalityNr = municipalityNr;
        this.municipalityName = municipalityName;
        this.lotNr = lotNr;
        this.sectionNr = sectionNr;
        this.propertyName = propertyName;
        this.area = area;
        this.owner = owner;

    }

    //=========Get methods=========
    /** Get method for municipality number */
    public int getMunicipalityNr() { return municipalityNr; }

    /** Get method for municipality name */
    public String getMunicipalityName() { return municipalityName; }

    /** Get method for lot number */
    public int getLotNr() { return lotNr; }

    /** Get method for section number */
    public int getSectionNr() { return sectionNr; }

    /** Get method for property name */
    public String getPropertyName() { return propertyName; }

    /** Get method for area */
    public double getArea() { return area; }

    /** Get method for owner */
    public String getOwner() { return owner; }


    //=========Set methods=========
    public void setPropertyName(String propertyName) { this.propertyName = propertyName; }
    public void setOwner(String owner) { this.owner = owner;}
    public void setArea(double area) {
        if (area > 0)
            this.area = area;
    }


    //=========Get ID method=========
    public String getPropertyID(){ return municipalityNr + "-" + lotNr + "/" + sectionNr;}

    //=========Ovveride toString method=========
    /**toString method to display Property in a nice way */
    @Override
    public String toString() {
        return "Property ID: " + getPropertyID() + " (" + municipalityName + ")| " +
                "Property name: " + (propertyName != null ? propertyName : "N/A") +
                "| Area: " + area + " m2| Owner: " + owner;
    }
    
}
