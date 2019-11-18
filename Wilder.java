public class Wilder {
    //Attributes
    private String Firstname;
    private boolean present;

    //Constructor
    public Wilder(String Firstname) {
        this.Firstname = Firstname;
    }

    // Getters
    String getFirstname() {
        return this.Firstname;
    }
    boolean getpresent() {
        return this.present;
    }

    // Setters
    void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }
    void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI() {
        String Sentence;
        Sentence = "My name is " + Firstname + " and I am ";
        if (present) {
            Sentence = Sentence + "present.";     
        } else {
            Sentence = Sentence + "not present.";            
        }
        return Sentence;
    }

}