package Simple_Code;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Department: ");
        String domain = sc.nextLine();
        System.out.print("Enter In Time (09:00): ");
        LocalTime inTime = LocalTime.parse(sc.nextLine());
        System.out.print("Enter Out Time (20:00): ");
        LocalTime outTime =LocalTime.parse(sc.nextLine());
        Duration duration =Duration.between(inTime, outTime);
        long totalMinutes= duration.toMinutes();
        long overtime= 0;
        if(totalMinutes>480) {
            overtime = totalMinutes - 480;
        }
        double pay = overtime * 9;
        System.out.println("\n-------- OVERTIME METRICS REPORT --------");
        System.out.println("Employee ID  : " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Domain       : " + domain);
        System.out.println("In time      : " + inTime);
        System.out.println("Out time     : " + outTime);
        System.out.println("Total work time           : " + totalMinutes + " Minutes");
        System.out.println("Standard Working Hours : 8 Hrs (480 Minutes) ");
        System.out.println("OT per hour            : 540/-");
        System.out.println("Overtime                  : " + overtime + " Minutes");
        System.out.println("Overtime pay              : " + pay+"Rupees");
        sc.close();
    }
}