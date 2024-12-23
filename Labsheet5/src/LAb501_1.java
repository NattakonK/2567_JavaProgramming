import javax.swing.JOptionPane;

public class LAb501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean foundName = false;
		
		String listName = JOptionPane.showInputDialog("Enter adepartment name:");

		for(int i=0;i<deptName.length;i++ ) {
			if(listName.equalsIgnoreCase(deptName[i])) {
				foundName = true;
			}
		}
		if(foundName) {
			JOptionPane.showMessageDialog(null,listName+" was found in the list");

		}
		else {
			JOptionPane.showMessageDialog(null,listName+" was not found in the list");
		}
	}

}
