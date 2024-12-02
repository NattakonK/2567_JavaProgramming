import javax.swing.*;
public class Lab103 {
  public static void main(String args[]) {
    String min = JOptionPane.showInputDialog(null, "Input Time Parkink (minute):", "Input", JOptionPane.QUESTION_MESSAGE);
    int minute = Integer.parseInt(min);
    int hours = minute / 60;
    int minutes = minute % 60;
    double hourRate = 50.0;
    double minuteRate = 0.25;
    double totalPrice = hours * hourRate + minutes * minuteRate;
    String message = "You parking "+hours+ " Hour "+minutes+ " Minute."+"\nAmount to be paid is "+totalPrice+" baht.";
    JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
  }
}