import java.util.*;
public class Lab404 {


	 public static void main(String[] args) {
	       inputStudent();
	   }

	   public static void inputStudent() {
	       Scanner sc = new Scanner(System.in);
	       String stuId;
	       String subjId;
	       boolean isStudentIDValid, isSubjectIDValid;

	       while (true) {
	           System.out.print("Enter Student Id: ");
	           stuId = sc.nextLine();
	           System.out.print("Enter Subject Id: ");
	           subjId = sc.nextLine();
	           isStudentIDValid = isLength(stuId, 10);
	           isSubjectIDValid = isLength(subjId, 7);
	           break;
	       }
	       if (isStudentIDValid && isSubjectIDValid){
				boolean isITStudent = isITStudent(stuId);
				boolean isITSubject = isITSubject(subjId);
				displayData(stuId, subjId, isITStudent,isITSubject);
	       }
	       else {
				System.out.println("");
			}
	       sc.close();
	   }
	   public static boolean isLength(String input, int length) {
	       return input.length() == length;
	   }
	   public static boolean isITStudent(String studentId) {
	       boolean startYear = studentId.charAt(0) == '2' && studentId.charAt(1) == '1';
	       boolean level = studentId.charAt(3) == '1';
	       boolean corse = studentId.substring(3, 6).equals("311");
	       
	       return startYear && level && corse;
	   }
	   public static boolean isITSubject(String subjectId) {
		   boolean major = subjectId.startsWith("21");
	       boolean year = subjectId.charAt(4) == 1;
	       return major && year;
	   }
	   public static void displayData(String studentID, String subjectcode, boolean isITStudent, boolean isITSubject) {
		      
		   if (isITStudent(studentID)&&isITSubject(studentID)) {
	           System.out.println("Student ID:  "+ studentID + " is a 1st year student in IT.");
	           System.out.println("Enroll in courses for Year 1");
	       } else if (!isITSubject(studentID)) {
	           System.out.println("Student ID: " + studentID + " is a 1st year student in IT.");
	           System.out.println("Not enroll in courses for Year 1");
	       }else {
	    	   System.out.println("Student ID: " + studentID + " is not a 1st year student in IT.");
	           System.out.println("Enroll in courses for Year 1");
	       }
	   }
	}