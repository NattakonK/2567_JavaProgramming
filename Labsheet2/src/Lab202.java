import java.util.*;
public class Lab202 {
	
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Input number: ");
       int prevNumber = input.nextInt();
       while (true) {
           System.out.print("Input number: ");
           int curNumber = input.nextInt();
           
           if (curNumber < prevNumber) {
               break;
           }
           prevNumber = curNumber;
       }
       System.out.println();
       System.out.println("BYE BYE");
       input.close();
   }
}