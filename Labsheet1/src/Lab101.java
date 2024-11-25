import java.text.*;
import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product Name	: ");
		String prodName = scan.nextLine();
		System.out.print("Input Product Unit	: ");
		int prodUnit = scan.nextInt();
		System.out.print("Input Price per unit	: ");
		double prodPrice = scan.nextDouble();
		System.out.println("----------------------------------------------");
		double totalPrice = prodUnit * prodPrice;
		System.out.println("Total Price is "+totalPrice+" baht.");
		

	}

}
