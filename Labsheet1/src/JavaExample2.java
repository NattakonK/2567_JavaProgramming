import javax.swing.JOptionPane;
public class JavaExample2 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Uint:"));
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price Product:"));
		double totalPrice = productUnit * productPrice;
		double totalVat = totalPrice + (totalPrice *7/100);
		String frmtotalPrice = String.format("%,.2f",totalPrice);
		String frmtotalVat = String.format("%,.2f",totalVat);
		JOptionPane.showMessageDialog(null, "Total Price is "+frmtotalPrice+" baht."+"\nADD VAT 7% is "+frmtotalVat +" baht.");
		
	}

}
