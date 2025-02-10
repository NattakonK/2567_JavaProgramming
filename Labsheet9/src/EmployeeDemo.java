import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input employee id: ");
		String empId = sc.next();
		sc.nextLine();
		System.out.print("Input employee name: ");
		String empName = sc.nextLine();
		System.out.print("Input employee salary: ");
		double empSalary = sc.nextDouble();
		System.out.print("Input employee sales: ");
		double empSales = sc.nextDouble();
		System.out.println();


		Sales emp9 = new Sales(empId, empName, empSalary, empSales);
		System.out.println(emp9);
		
		System.out.println("Total salary " + (emp9.getSalary() + emp9.getCommission()) + " baht.");

	}

}
