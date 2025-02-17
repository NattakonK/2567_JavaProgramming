import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Book Title: ");
		String bookTitle = sc.nextLine();
		System.out.print("Book Publish year: ");
		int publicYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Author book name: ");
		String authorName = sc.nextLine();
		System.out.print("Author email: ");
		String authorEmail = sc.nextLine();
		
		FictionBook book1 = new FictionBook(bookTitle,publicYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
			System.out.print("Author email, again: ");
			authorEmail = sc.nextLine();
			book1.setEmail(authorEmail);
		}
		Line();
		System.out.println(book1);
	}
	public static void Line() {
		for(int i=1;i<60;i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}
