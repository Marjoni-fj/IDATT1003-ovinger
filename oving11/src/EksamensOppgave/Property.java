package EksamensOppgave;

public class Property {
    private int municipalityNr;
    private String municipalityName;
    private int lotNr;
    private int sectionNr;
    private String propertyname;
    private double area;
    private String owner;

    public Property(int municipalityNr, String municipalityName, int lotNr, 
                    int sectionNr,  String propertyname, double area, String owner){
        this.municipalityNr = municipalityNr;
        this.municipalityName = municipalityName;
        this.lotNr = lotNr;
        this.sectionNr = sectionNr;
        this.propertyname = propertyname;
        this.area = area;
        this.owner = owner;

    }

    public int getMunicipalityNr(){ return municipalityNr;}
    public String getMunicipalityName(){ return municipalityName;}
    public int getLotNr(){ return lotNr;}
    public int getSectionNr(){ return sectionNr;}
    public String getPropertyName(){ return propertyname;}
    public double getArea(){ return area;}
    public String getOwner(){ return owner;}
    
}
