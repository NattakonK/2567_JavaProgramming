import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] score = new double[5];
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = sc.nextDouble();
		}
		System.out.println();
		double sum = 0;
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		double aver = sum / score.length;
		System.out.printf("Average of "+score.length+" student is %.2f%n",aver);
		for(int i=0;i<score.length;i++) {
			if(score[i] > aver) {
				System.out.printf("> Student "+(i+1)+" (%.2f)%n",score[i]);
			}
		}
		sc.close();
	}

}
