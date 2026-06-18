import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter in time (HH:mm, 24-hour format): ");
            String inTimeStr = sc.next();
            LocalTime inTime = LocalTime.parse(inTimeStr);
            System.out.print("Enter out time (HH:mm, 24-hour format): ");
            String outTimeStr = sc.next();
            LocalTime outTime = LocalTime.parse(outTimeStr);

            Duration duration;
            if (outTime.isBefore(inTime)) {
                duration = Duration.between(inTime, outTime).plusDays(1);
            } else {
                duration = Duration.between(inTime, outTime);
            }
            long Min = duration.toMinutes();
            long minutes = duration.toMinutesPart();
            long StandardMin = 480;
            if(Min>StandardMin){
                long OverTime =  Min - StandardMin ;
                long pay = OverTime * 9;
                System.out.println("Over Time worked "+ OverTime);
                System.out.println("Overtime Pay:"+pay);
            }
            else{
                System.out.println("Not even worked perfectly < 8hrs");
            }
            
            System.out.println("Total time worked: "+" "+Min+" Minutes");
            

        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid time format please use hh:mm ( 08:30 or 17:45)");
        } finally {
            sc.close();
        }
    }
}