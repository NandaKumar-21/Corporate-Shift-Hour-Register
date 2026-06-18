import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        int choice;

        do {
            System.out.println("\n===== Corporate Shift Hour Register =====");
            System.out.println("1. Add Employee Shift");
            System.out.println("2. Upload CSV");
            System.out.println("3. View Records");
            System.out.println("4. Search Employee");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    // Add Employee Shift
                    break;

                case 2:
                    // Upload CSV
                    break;

                case 3:
                    dao.viewAllRecords();
                    break;

                case 4:
                    // Search Employee
                    break;

                case 5:
                    // Generate Report
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 6);

        sc.close();
    }
}