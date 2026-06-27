import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {

            System.out.println("===== MENU =====");
            System.out.println("1- Resident");
            System.out.println("2- Admin");
            System.out.println("3- Technician");
            System.out.print("Choose your role: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("----- Resident -----");

                    System.out.print("Enter name: ");
                    String rName = scan.nextLine();

                    System.out.print("Enter phone: ");
                    int rPhone = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter email: ");
                    String rEmail = scan.nextLine();

                    if (!rEmail.contains("@resident")) {
                        System.out.println("Access denied!");
                        break;
                    }

                    System.out.print("Enter apartment number: ");
                    int apartment = scan.nextInt();
                    scan.nextLine();

                    Resident resident = new Resident(
                            rName,
                            rPhone,
                            rEmail,
                            1234,
                            2,
                            apartment
                    );

                    Admin admin = new Admin(
                            "Ali",
                            123456,
                            "ali@admin",
                            1111,
                            1
                    );

                    admin.addResident();

                    resident.enterdetails();


                    System.out.print("Enter request: ");
                    String request = scan.nextLine();

                    resident.submitRequest(request, admin);

                    admin.generateReports();
                    break;

                case 2:
                    System.out.println("----- Admin -----");

                    System.out.print("Enter admin name: ");
                    String aName = scan.nextLine();

                    System.out.print("Enter phone: ");
                    int aPhone = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter email: ");
                    String aEmail = scan.nextLine();

                    if (!aEmail.contains("@admin")) {
                        System.out.println("Access denied!");
                        System.out.println("please try again");
                        break;
                    }

                    Admin admin2 = new Admin(
                            aName,
                            aPhone,
                            aEmail,
                            1111,
                            1
                    );

                    admin2.generateReports();
                    break;

                case 3:
                    System.out.println("----- Technician -----");

                    System.out.print("Enter technician name: ");
                    String tName = scan.nextLine();

                    System.out.print("Enter phone: ");
                    int tPhone = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter email: ");
                    String tEmail = scan.nextLine();

                    if (!tEmail.contains("@technician")) {
                        System.out.println("Access denied!");
                        break;
                    }

                    System.out.println("Choose specialization:");
                    System.out.println("1- Electricity");
                    System.out.println("2- Plumbing");
                    System.out.println("3- Air Conditioning");
                    System.out.println("4- Internet / Network");
                    System.out.println("5- Elevator Maintenance");
                    System.out.println("6- Security Systems");
                    System.out.println("7- Painting serivce");
                    System.out.println("8- Cleaning Service");
                    System.out.println("9- Fire Safety");


                    int specChoice = scan.nextInt();
                    scan.nextLine();

                    String spec = "";

                    switch (specChoice) {
                        case 1:
                            spec = "Electricity";
                            break;
                        case 2:
                            spec = "Plumbing";
                            break;
                        case 3:
                            spec = "Air Conditioning";
                            break;
                        case 4:
                            spec = "Internet / Network";
                            break;
                        case 5:
                            spec = "Elevator Maintenance";
                            break;
                        case 6:
                            spec = "Security Systems";
                            break;
                        case 7:
                            spec = "Painting serivce";
                            break;
                        case 8:
                            spec = " Cleaning Service";
                            break;
                        case 9:
                            spec = "Fire Safety";
                            break;




                        default:
                            System.out.println("Invalid specialization");
                            return;
                    }

                    Technicain tech = new Technicain(
                            true,
                            tName,
                            tPhone,
                            tEmail,
                            2222,
                            3,
                            spec
                    );

                    System.out.println("Welcome Technician : " + tech.name);

                    System.out.println("Specialization: " + tech.specialization);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}