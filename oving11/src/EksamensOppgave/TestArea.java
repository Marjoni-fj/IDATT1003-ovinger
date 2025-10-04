package EksamensOppgave;
import java.util.ArrayList;
public class TestArea {
    public static void main(String[] args){
        ArrayList<Property> properties = new ArrayList<>();
        Property property1 = new Property(1445, "Gloppen", 
        77, 631, "Property1", 1017.6, "Jens Olsen");
        
        Property property2 = new Property(1445, "Gloppen", 
        77, 131, "Syningom", 661.3, "Nicolay Madsen");
        
        Property property3 = new Property(1445, "Gloppen", 
        75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        
        Property property4 = new Property(1445, "Gloppen", 
        74, 1445, "Property4", 1457.2, "Karl Ove Bråten");
        
        Property property5 = new Property(1445, "Gloppen", 
        69, 188, "Høiberg", 1339.4, "Elsa Indregård");

        properties.add(property1);
        properties.add(property2);
        properties.add(property3);
        properties.add(property4);
        properties.add(property5);

        for (Property p : properties) { System.out.println(p); }


    }
}
