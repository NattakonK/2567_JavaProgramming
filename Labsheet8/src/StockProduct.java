import java.util.*;
public class StockProduct {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Product[] productlist = new Product[4];

		for(int i=0; i<productlist.length;i++) {
			System.out.print("Input product Id : ");
			String productId = scan.nextLine();
			System.out.print("Input product Unit : ");
			int productUnit = scan.nextInt();
			System.out.print("Input product Price : ");
			double productPrice = scan.nextDouble();
			scan.nextLine();
			Product product = new Product();
            product.setId(productId);
            product.setUnit(productUnit);
            product.setPrice(productPrice);
            productlist[i] = product;
		}

		double totalPrice = 0;
		Line();

		for (Product product : productlist) {
			double productTotal = product.calculate();
			totalPrice += productTotal;
			System.out.printf("Product ID: %s, Total price = %,.2f baht.\n",product.getId(),productTotal);
		}

		Line();
		System.out.printf("Total price of all products is %,.2f baht.\n", totalPrice);

		scan.close();
	}

	public static void Line() {
		for (int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
