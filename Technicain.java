public class Technicain extends User {

    public String specialization;
    public boolean availablity;

    public Technicain(boolean availablity, String name, int phone_number,
                      String email, int pass, int Id, String specialization) {

        super(name, phone_number, email, pass, Id); // fix

        this.specialization = specialization;
        this.availablity = availablity;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }
}