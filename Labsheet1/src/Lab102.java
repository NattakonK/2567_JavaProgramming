import java.util.*;
public class Lab102 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Inut the number of minutes: ");
        int minute = scanner.nextInt();
        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;
        int years = minute / minutesInYear;
        int minutes = minute % minutesInYear;
        int days = minutes / minutesInDay;
        System.out.println( minute + " Minutes is approximately " + years + " year and " + days + " days");
        scanner.close();
  }
}