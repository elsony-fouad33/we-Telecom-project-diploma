public class Resident extends User {

    public String resident_name;
    public int apartment_num;
    private String resident_email;

    public Resident(String name, int phone_number, String email, int pass, int Id, int apartment_num) {
        super(name, phone_number, email, pass, Id);

        this.resident_name = name;
        this.apartment_num = apartment_num;
        this.resident_email = email;
        this.pass = 1234;
        this.Id = 1;
    }

    public int getApartment_num() {
        return apartment_num;
    }

    public void setApartment_num(int apartment_num) {
        this.apartment_num = apartment_num;
    }

    public void enterdetails() {

        boolean valid = true;

        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
            valid = false;
        }

        String phone = String.valueOf(phone_number);

        if (phone.length() != 13) {
            System.out.println("thanks : " +resident_name);

            valid = false;
        }

        if (!email.equals(resident_email) || !email.contains("@resident")) {
            System.out.println("Invalid email");
            valid = false;
        }

        if (pass != 1234) {
            System.out.println("Wrong password");
            valid = false;
        }

        if (valid=true) {
            System.out.println("Hello resident! " + name);
        } else {
            System.out.println("Please check your details.");
        }
    }

    public void submitRequest(String request, Admin admin) {
        System.out.println("Request submitted: " + request);
        System.out.println("Thanks for submitting");
        admin.addReport();
    }

    public void makeBooking(String facility) {
        System.out.println("Booking confirmed for: " + facility);
        System.out.println("Thanks for booking");
    }
}