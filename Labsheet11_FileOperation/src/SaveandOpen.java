import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee {

	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		String answer;
		do {
			super.header();
			
			System.out.print("Enter Name: ");
			name = sc.next();
			System.out.print("Enter department: ");
			dept = sc.next();
			
			writeFile.println(name + "\t"+ dept);
			
			System.out.print("Enter data again?: ");
			answer = sc.next();
		}while(answer.equalsIgnoreCase("y"));
		sc.close();
	}
	public void searchData() throws IOException {
		try {
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+ ")" + name);
					check = true;
				}
			}
			if(check) {
				super.header();
				System.out.println("Emploee in dept "+ super.getDept() + " is " +i + " person(s)");
			}else {
				System.out.print("\nSorry, no dept: " +super.getDept() + " in file");
			}
		}catch(IOException e) {
			System.out.print("\nSorry, file not found...");
		}
	}
}
