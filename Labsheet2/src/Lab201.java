import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET =299;
		double discount;
		int isMember;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalPrice = numberofCustomer * BUFFET;
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is " +totalPrice+ " baht."+"\nDo you have a member Card?");
			
			}while(isMember==2);
		if(isMember==0) {
			discount = totalPrice *0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(discount)+ " baht.");
		}
		else if (isMember==1) {
			JOptionPane.showMessageDialog(null, "Amount tobe apid is "+frm.format(totalPrice)+" bath.");
		}
	}

}
