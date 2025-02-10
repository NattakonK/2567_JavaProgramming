import java.util.*;
public class MovieDemo {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input movie id: ");
       String mId = sc.nextLine();
       System.out.print("Input movie name: ");
       String mName = sc.nextLine();
       System.out.println();
       System.out.print("Input director name: ");
       String direcName = sc.nextLine();
       System.out.print("Input director e-mail: ");
       String direcEmail = sc.nextLine();
       char direcGender;
       while (true) {
           System.out.print("Input director gender: ");
           String inputGender = sc.nextLine().toLowerCase();
           if (inputGender.equals("m") || inputGender.equals("f")) {
               direcGender = inputGender.charAt(0);
               break;
           }
           System.out.println("Input director gender, again");
       }
       System.out.println();
       int theaterNo;
       while (true) {
           System.out.print("Input movie theater no. (1-15 only): ");
           theaterNo = sc.nextInt();
           if (theaterNo >= 1 && theaterNo <= 15) {
               break;
           }
           System.out.println("Please input 1 - 15 only!");
       }
       Director director = new Director(direcName, direcEmail, direcGender);
       Theater theater = new Theater(mId, mName, director, theaterNo);
       System.out.println(theater);
       sc.close();
   }
}
