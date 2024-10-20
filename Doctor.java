/**
 * The Doctor class is ..
 *
 * @author Jill Hubbard
 * @version 1.0
 * @since 2021-04-12
 */
public class Doctor {
    private boolean worksAtHospital;
    private String name;
    private String type;
    private String action;

    /**
     * Class constructor.
     */
    public Doctor() {
        this(false,"Dr Jones","a surgeon");
    }

    /**
     * Class constructor specifying whether the doctor works at the hospital, the doctor's name,
     * and the doctor's specialty
     */
    public Doctor(boolean worksAtHospital, String name, String type){
        this.worksAtHospital=worksAtHospital;
        this.name=name;
        this.type=type;
        action = "give checkups.";
    }



    /**
     * This method is used to get whether or not the doctor works at the hospital.
     * @return true if doctor works at hospital. Otherwise false
     */
    public boolean isWorksAtHospital() {
        return worksAtHospital;
    }

    /**
     * This method is used to set whether or not the doctor works at the hospital
     * @param worksAtHospital true if the doctor works at the hospital
     */
    public void setWorksAtHospital(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    /**
     * This method is used to get the doctor's name.
     * @return name variable (a string)
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the doctor's name to a specified string
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is used to get the doctor's area of focus
     * @return type as a string
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the doctor's type to a specified string
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * This method sets the action the doctor takes to treat patients
     * @param action
     */
    public void setAction(String action){
        this.action = action;
    }

    /**
     * This method returns a string containing the doctor's name, whether they work at the hostpital, and the type of doctor they are
     */
    public String toString(){
        String worksAt;
        if (worksAtHospital){
            worksAt = "I work at the hospital";
        }else{
            worksAt = "";
        }
        return "My Name is "+name+". "+worksAt+". "+"I am "+type+".";
    }

    /**
     * This method returns the doctor's class and what they do to treat their patients
     * @return object's class and how they treat patients
     */
    public String treatPatient(){
    
        return "I am a "+this.getClass()+" object. I "+action;
    }
}

