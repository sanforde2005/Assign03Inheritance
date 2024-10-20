package src;

public class Surgeon extends Doctor{
    /**
     * Class Constructor.
     */
    public Surgeon(){
        setType("a surgeon");
        setWorksAtHospital(true);
    }
    /**
     * Class constructor specifying if the Surgeon works at the hospital and their name,
     * and setting their type to "surgeon" and their treatment action to "perform surgeries"
     * 
     */
    public Surgeon(boolean worksAtHospital, String name){
        setName(name);
        setWorksAtHospital(worksAtHospital);
        setType("a surgeon");
        setAction("perform surgeries.");
    }

    /**
     * This method makes the surgeon perform an incision
     * @return "Makes incision." as a string
     */
    public String makeIncision(){
        return "Makes incision.";
    }
}
