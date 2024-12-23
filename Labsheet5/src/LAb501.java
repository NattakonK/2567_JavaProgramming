import javax.swing.*;
public class LAb501 {

	public static void main(String[] args) {
		int[] idProd = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] priceProd = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double itemPrice = 0;
		boolean validItem = false;
		
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		for(int i=0;i<idProd.length;i++ ) {
			if(itemOrder == idProd[i]) {
				itemPrice = priceProd[i];
				validItem = true;
			}
		}
		if(validItem) {
			JOptionPane.showMessageDialog(null,"Item "+itemOrder+" is "+itemPrice);
			System.out.print("Item "+itemOrder+" is "+itemPrice);
		}
		else {
			JOptionPane.showMessageDialog(null,"Invalid Item");
			System.out.print("Invalid Item");
		}
	}

}
