
class Product{
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String namePro, double pricePro, double vat) {
		name = namePro;
		price = pricePro;
		vatRate = vat;
	}
	public double calculateTotalPrice() {
		return price + (price * vatRate / 100);
	}
	public void displayProductDetails() {
		System.out.println("Product Name: "+name);
		System.out.println("Price (Before VAT):"+price);
		System.out.println("Price (After VAT):"+calculateTotalPrice());
	}
}
public class TestProduct {
 
	public static void main(String[] args) {
		Product prod = new Product();
		prod.setProductDetails("Smartphone", 30000.0, 7.0);
		
		System.out.println("Product Details:");
		prod.displayProductDetails();
		
		
 
	}
 
}