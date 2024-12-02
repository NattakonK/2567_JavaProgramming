import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input valure of x : ");
		int x = input.nextInt();
		int sum = x;
		System.out.print("Input valure of y : ");
		int y = input.nextInt();
		while(y<=x) {
				System.out.print("Input valure of y, again : ");
				y = input.nextInt();
		}
			System.out.println();
			while(x<y) {
				
				x++;
				System.out.println(sum + "+" + x + "=" + (sum + x));
				sum += x;
			}
		}

	}


