import java.io.*;
import java.util.*;
public class Lab1101 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		System.out.print("Input Section: ");
		int section = sc.nextInt();
		
		printHeader(section);
		displayStudentList(section);
		
	}
	public static void printHeader(int sec) {
		System.out.println("********************************************");
		System.out.println("\tList of data for Section "+ sec);
		System.out.println("********************************************");
	}

	public static void displayStudentList(int sec) throws IOException{
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//List107.txt"))){
			String temp = "";
			while((temp = readFile.readLine()) != null) {
				String[] data = temp.split("\t");
				if(data.length<6) continue;
				int studentSection = Integer.parseInt(data[3]);
				if(studentSection == sec) {
					double midterm = Double.parseDouble(data[4]);
					double finalExam = Double.parseDouble(data[5]);
					double totalScore = midterm + finalExam;
					System.out.printf("%s  %s \t%.2f\t %s %n", data[0],data[2],totalScore,
							determineResult(totalScore));
				}
			}
		}
	}
	public static String determineResult(double totalScore) {
		return totalScore <= 40 ? "Fail" : "Pass";
	}
}
