import javax.swing.*;
public class Lab104 {
  public static void main(String args[]) {
    JOptionPane.showMessageDialog(null, "Welcome to the payroll application", "Message", JOptionPane.INFORMATION_MESSAGE);
    String empName = JOptionPane.showInputDialog(null, "Enter employee name", "Input", JOptionPane.QUESTION_MESSAGE);
    String hourEmpInput = JOptionPane.showInputDialog(null, "Enter total hours for this employee", "Input", JOptionPane.QUESTION_MESSAGE);
    double hourEmp = Double.parseDouble(hourEmpInput);
    double hourWage = 7.5;
    double grossEarn = hourEmp * hourWage;
    double taxRate = 0.15;
    double taxAmount = grossEarn * taxRate;
    double netEarn = grossEarn - taxAmount;
   String message = "Employee name:"+empName+"\nHours worked:"+hourEmp+"\nHourly wage:$"+ hourWage +"\nGross earning:$"+grossEarn+"\nTax rate:"+taxRate+"\nTax:$"+taxAmount+"\nNet earning:$"+netEarn;
   JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
  }
}
