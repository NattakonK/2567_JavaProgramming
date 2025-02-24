import java.util.*;
import java.io.*;

public class ATMBanking {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String accNumber, password;
        while (true) {
            System.out.print("Enter account number: ");
            accNumber = sc.nextLine();
            
            if (accNumber.length() == 13 &&
                accNumber.charAt(1) == '-' &&
                accNumber.charAt(5) == '-' &&
                accNumber.charAt(9) == '-' &&
                accNumber.charAt(12) == '-') {

                boolean valid = true;
                for (int i = 0; i < accNumber.length(); i++) {
                    if (i == 1 || i == 5 || i == 9 || i == 12) continue;
                    if (accNumber.charAt(i) < '0' || accNumber.charAt(i) > '9') {
                        valid = false;
                        System.out.println("Input wrong type, Enter account number: ");
                        accNumber = sc.nextLine();
                    }
                }
            }
        }
        while (true) {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (password.length() == 4) {
                boolean valid = true;
                for (int i = 0; i < 4; i++) {
                    if (password.charAt(i) < '0' || password.charAt(i) > '9') {
                        valid = false;
                        System.out.println("Enter password: ");
                        password = sc.nextLine();
                    }
                }
            }
        }

        ATMChecking bank = new ATMChecking(accNumber, password,0);

        if (bank.checkBookBank()) {
            bank.show();
        } else {
            System.out.println("Sorry, your ID or password is wrong, or your amount is not enough.");
        }

        sc.close();
    }
}
