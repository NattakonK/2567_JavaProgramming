import java.util.*;
public class Lab305 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int count = 0;
			System.out.print("Input some sentence : ");
			String sentence = sc.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = sc.nextLine();
	  }
		System.out.println();
		sentence.substring(0,sentence.length() -1 );
		
		for(int i = 0 ; i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println(sentence.substring(count,i));
				count = i+1;
			}
		}
		System.out.println(sentence.substring(count));
		break;
		
		}
		sc.close();
		
	}
	
}