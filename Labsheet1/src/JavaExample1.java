import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//สั่งแสดงข้อความ
		System.out.print("Input product name	: ");
		String productName = scan.nextLine();
		System.out.print("Input product unit	: ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit	: ");
		float productPrice = scan.nextFloat();
		
		System.out.println();
		System.out.println("Product Name is "+productName);
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total Price is "+ frm.format(totalPriceProduct) + " baht.");
		float totalVat =totalPriceProduct + (totalPriceProduct * 7 /100);
		System.out.println("ADD VAT 7% is " +frm.format(totalVat)+" baht.");
		
		System.out.println("*********Using printf and String.format***********");
		System.out.printf("Product Nmae is : %s\n",productName);
		System.out.printf("Total Price is : %,.2f\n",totalPriceProduct);
		
		
		
		scan.close();
		

	}

}
