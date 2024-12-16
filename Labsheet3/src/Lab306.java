import java.util.*;
public class Lab306 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Message : ");
		String message = sc.nextLine();
		if(message.toLowerCase().indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		}else {
			System.out.println(message);
		}
		sc.close();
	}
 
}