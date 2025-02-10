import java.util.*;
public class CheckStockProduct {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many product list in stock : ");
        int numOfProducts = scan.nextInt();
        scan.nextLine();

        Product[] productlist = new Product[numOfProducts];

        for (int i=0; i<numOfProducts;i++) 
        {
            System.out.print("Input product Id : ");
            String productId = scan.nextLine();
            System.out.print("Input product Unit : ");
            int productUnit = scan.nextInt();
            scan.nextLine();
            Product product = new Product();
            product.setId(productId);
            product.setUnit(productUnit);

            productlist[i] = product;
        }
        System.out.println();
        Line();
        System.out.println("List of product in 'LOW' status.");
        Line();
        for (Product product : productlist) 
        {
            if (product.getUnit() < 5) {
                System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units");
            }
        }

        Line();
        System.out.println("List of product in 'NORMAL' status.");
        Line();
        for (Product product : productlist) {
            if (product.getUnit() >= 5 && product.getUnit()<50) {
                System.out.println(">> " + product.getId()+" has " + product.getUnit()+" units");
            }
        }
        Line();
        System.out.println("List of product in 'HIGH' status.");
        Line();
        for (Product product : productlist) 
        {
            if (product.getUnit()>50) {
                System.out.println(">> " + product.getId()+ " has " + product.getUnit() + " units");
            }
        }

        scan.close();
    }
	public static void Line() 
	{
		for (int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
