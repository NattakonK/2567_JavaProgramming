import java.util.*;
public class JavaExample1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your first name(using next): ");
		String firstName = input.next();
		input.nextLine();
		System.out.print("Enter your last name(using nextLine): ");
		String lastName = input.nextLine();
		System.out.println("\n-----OUTPUT-----");
		System.out.println("First Nmae: "+firstName);
		System.out.println("Last Nmae : "+lastName);
		input.close();
	}

}
