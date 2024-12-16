import java.util.*;
public class Lab304 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = sc.nextLine();
		int space = fullName.indexOf(" ");
		if (space != -1 ) {
			String firstName = fullName.substring(0, space);
			String lastName = fullName.substring(space +1);
			
			firstName = firstName.toUpperCase();
            lastName = lastName.toLowerCase();
            
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
			
		}else{
			System.out.println("Incorrect Name");
		}
		sc.close();		
		
		
		
		
		}
		
 
}
