import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("Input a sentence : ");
		String sentence = sc.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = sc.nextLine();
	  }
		System.out.println();
		for(int i = 0 ; i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("This sentence has "+count+ " spacebar.");
		System.out.println("This sentence has "+ (count+1) + " word.");
		sc.close();
	}

}
