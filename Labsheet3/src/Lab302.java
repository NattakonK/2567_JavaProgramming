import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
				 JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com",
							"ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					
					JOptionPane.showMessageDialog(null, "Your e-mail is" + inputEmail);
			 }
			 	
			}
			 
			
		

	}

}
