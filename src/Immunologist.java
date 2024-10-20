package src;

public class Immunologist extends Doctor{
    /**
     * Class Constructor.
     */
    public Immunologist(){
        setWorksAtHospital(true);
        setType("an immunologist");
    }

    /**
     * Class Constructor specifying whether the Immunologist works at the hostpital and their name,
     * and setting their type to "immunologist" and their treatment action to "administer vaccines".
     */
    public Immunologist(boolean worksAtHospital, String name){
        setName(name);
        setWorksAtHospital(worksAtHospital);
        setType("an immunologist");
        setAction("administer vaccines.");
    }

}
