public class Admin extends User {

    static int totalResidents = 0;
    static int totalReports = 0;

    public Admin(String name, int phone_number, String email, int pass, int Id) {
        super(name, phone_number, email, pass, Id);
    }

    public void addResident() {
        totalResidents++;
    }

    public void addReport() {
        totalReports++;
    }

    public void generateReports() {
        System.out.println("Generating report...");
        System.out.println("Total residents: " + totalResidents);
        System.out.println("Total submitted reports: " + totalReports);

    }
}