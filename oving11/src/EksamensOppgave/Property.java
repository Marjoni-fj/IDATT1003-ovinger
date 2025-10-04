package EksamensOppgave;

public class Property {
    private int municipalityNr;
    private String municipalityName;
    private int lotNr;
    private int sectionNr;
    private String propertyName;
    private double area;
    private String owner;

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

    public int getMunicipalityNr(){ return municipalityNr;}
    public String getMunicipalityName(){ return municipalityName;}
    public int getLotNr(){ return lotNr;}
    public int getSectionNr(){ return sectionNr;}
    public String getPropertyName(){ return propertyName;}
    public double getArea(){ return area;}
    public String getOwner(){ return owner;}


    /**
     * Grunnen til at kommunenr, gnr og bnr ikke har settere,
     * er at disse verdiene entydig identifiserer eiendommen,
     * og bør ikke kunne endres etter opprettelse.
     */
    public void setSectionNr(int sectionNr) { this.sectionNr = sectionNr;}

    public void setArea(double area) {
        if (area > 0)
            this.area = area;
    }

    public void setOwner(String owner) { this.owner = owner;}
    
}
