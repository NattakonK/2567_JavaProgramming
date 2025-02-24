import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert or Read data? : ");
		String select = sc.next().toLowerCase();
		
		while(!select.equals("insert") && !select.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			select = sc.next().toLowerCase();
		}
		
		SaveandOpen objFile = new SaveandOpen();
		if(select.equals("insert")) {
			objFile.insert();
		}
		else {
			System.out.print("\nEnter dept : ");
			String dept = sc.next();
			objFile.setDept(dept);
			objFile.searchData();
		}

		sc.close();
	}

}
