public class Main {

    public static void main(String[] args) {

        //TODO: Sprint 1 Tests
        Doctor doctor = new Doctor(true, "Dr L. Bow", "a chiropractor");
        System.out.println(doctor.toString()); //Expected output: My name is Dr L. Bow. I work at the hospital. I am a chiropractor.

        //TODO: Sprint 2 Tests
        //Instantiate a Surgeon object
        //Display its information
        Surgeon surgeon  = new Surgeon(true, "Antonia Coello Novello");
        System.out.println(surgeon.toString()); //Expected output: My name is Antonia Coello Novello. I work at the hospital. I am a surgeon.

        //TODO: Sprint 3 Tests:
        // Instantiate a Immunologist object (Add the code below)
        Immunologist immy = new Immunologist();
        // Display its information (Add the code below)
        System.out.println(immy.toString());


        //TODO: Sprint 4 Tests:
        // Children(Subclasses) are specialized versions of their parent (superclass). Overriding methods.
        // Call each object's treatPatient method.  Hint: Try the getClass() method defined in class Object! Google search Java Object class
        System.out.println(doctor.treatPatient());
        System.out.println(surgeon.treatPatient());
        System.out.println(immy.treatPatient());
        //Expected output:
        //I am a class Doctor object. I give checkups.
        //I am a class Surgeon object. I perform surgeries.
        // I am a class Immunologist object. I administer vaccines.


        //TODO: Sprint 5 Tests:
        //Is a surgeon a Surgeon object?
 
        if (surgeon instanceof Surgeon){
            System.out.println("surgeon IS a " + surgeon.getClass().getName() + " object");
        }else {
            System.out.println("surgeon IS NOT a " + surgeon.getClass().getName() + " object");
        }
        //TODO: Is surgeon a Doctor object? Add code. Can you make the sample code better?
        if (surgeon instanceof Doctor){
            System.out.println("surgeon IS a Doctor object");
        }else {
            System.out.println("surgeon IS NOT a Doctor object");
        }
        //TODO: Is doctor a Surgeon object? Add code
        if (doctor instanceof Surgeon){
            System.out.println("doctor IS a Surgeon object");
        }else {
            System.out.println("doctor IS NOT a Surgeon object");
        }



        //TODO CHALLENGE: Sprint 6 Tests. Who gets to run with scissors?
        //Call surgeon's make incision method and print the results
        System.out.println(surgeon.makeIncision());

        Doctor surgeon2 = new Surgeon();
        //Call surgeon2's make incision method and print the results

        System.out.println(surgeon2.getClass());

        System.out.println(surgeon2.makeIncision());
    }
}