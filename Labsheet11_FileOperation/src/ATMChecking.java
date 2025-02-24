import java.io.*;
import java.util.*;

class ATMChecking extends ATMData{
    private int money;

    public ATMChecking(String accountNumber, String password,int money) {
    	super(accountNumber,password,0);
        this.money = money;
    }

    public boolean checkBookBank() throws IOException {
    	try {
    	Scanner readFile = new Scanner(new File("src//txtFile//ATMBookBank.txt"));
    	while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            String[] data = line.split(" ");
            
            if (data.length == 3) {
                String fileAccount = data[0];
                String filePass = data[1];
                int fileBalance = Integer.parseInt(data[2]);

                if (fileAccount.equals(getID()) && filePass.equals(getPass())) {
                    setBalance(fileBalance);
                    readFile.close();
                    return true;
                }
            }
        }
        readFile.close();
    	}catch(IOException e) {
    		System.out.print("\nSorry, file not found...");
    	}
    	return false;
    }

    public void show() {
    	int total = money;
        int count1000 = money / 1000;
        money %= 1000;
        int count500 = money / 500;
        money %= 500;
        int count100 = money / 100;

        System.out.println("You drawing for " + total + ", get");
        System.out.println("1000 = " + count1000);
        System.out.println("500  = " + count500);
        System.out.println("100  = " + count100);
        System.out.println("Your balance is " + getBalance() + " Baht.");
    }
}