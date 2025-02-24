import java.io.*;
import java.util.*;

class ATMData {
    private String accountNumber;
    private String password;
    private int balance;

    public ATMData(String accountNumber, String password, int balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    public String getID() {
        return accountNumber;
    }

    public String getPass() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
}