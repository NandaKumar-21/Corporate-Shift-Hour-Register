import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    String empId;
    String empName;
    String department;
    LocalTime inTime;
    LocalTime outTime;
    long overtimeMinutes;
    double overtimePay;
    Employee(String empId, String empName, String department, LocalTime inTime, LocalTime outTime) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.inTime = inTime;
        this.outTime = outTime;
        Duration duration = Duration.between(inTime, outTime);
        long totalMinutes = duration.toMinutes();
        if (totalMinutes> 480) {
            overtimeMinutes= totalMinutes - 480;
        } else {
            overtimeMinutes =0;
        }
        overtimePay = overtimeMinutes * 9;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {

            System.out.println("\n<<<<<<<<<< EMPLOYEE OVERTIME TRACKER >>>>>>>>>>");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Company Overtime Summary");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String empId = sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String empName = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    System.out.print("Enter In Time (HH:MM - 24Hrs clock): ");
                    LocalTime inTime = LocalTime.parse(sc.nextLine());
                    System.out.print("Enter Out Time (HH:MM - 24Hrs clock: ");
                    LocalTime outTime = LocalTime.parse(sc.nextLine());
                    Employee emp = new Employee(empId,empName,department,inTime,outTime);
                    employees.add(emp);
                    System.out.println("Employee Record Added");
                    break;
                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No Employee Records Found");
                    } else {
                        System.out.println("\n<<<<<<<<<< EMPLOYEE REPORT >>>>>>>>>>");
                        for (Employee e : employees) {
                            System.out.println("--------------------------------");
                            System.out.println("Employee ID   : " + e.empId);
                            System.out.println("Employee name : " + e.empName);
                            System.out.println("Department    : " + e.department);
                            System.out.println("In time       : " + e.inTime);
                            System.out.println("Out time      : " + e.outTime);
                            System.out.println("OT minutes    : " + e.overtimeMinutes);
                            System.out.println("OT pay        : " + e.overtimePay+"rupees");
                        }
                    }
                    break;
                case 3:
                    long totalOTMinutes =0;
                    double totalOTPay =0;
                    for (Employee e :employees) {
                        totalOTMinutes+= e.overtimeMinutes;
                        totalOTPay+= e.overtimePay;
                    System.out.println("\n========== COMPANY SUMMARY ==========");
                    System.out.println("Total employees     : " + employees.size());
                    System.out.println("Total OT minutes    : " + totalOTMinutes);
                    System.out.println("Total OT amount pay : " + totalOTPay+"rupees");
                    }
                    break;
                case 4:
                    System.out.println("thank You......");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("enter valid choice");
            }
        }
    }
}