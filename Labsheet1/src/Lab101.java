import java.util.*;
import java.text.*;
public class Lab101 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Input Product Name  	: ");
      String prodName = scanner.nextLine();
      System.out.print("Input Product Unit  	: ");
      int prodUnit = scanner.nextInt();
      System.out.print("Input Price per unit    : ");
      double prodPrice = scanner.nextDouble();
      System.out.println("------------------------------------------");
      double totalPrice = prodUnit*prodPrice;
      DecimalFormat frm = new DecimalFormat("#,###.00");
      System.out.println("Total Price is "+ frm.format(totalPrice)+ " baht.");
      System.out.println("------------------------------------------");
      System.out.print("How many discount (%)   : ");
      double dis = scanner.nextDouble();
      double totalDis = (dis /100) * totalPrice ;
      System.out.println("------------------------------------------");
      double totalAmount = totalPrice - totalDis;
      System.out.println("Discount from " +dis+ "%        "+frm.format(totalDis)+ " baht.");
      System.out.println("Amount to be paid         "+frm.format(totalAmount)+" baht.");
      scanner.close();
  }
}
