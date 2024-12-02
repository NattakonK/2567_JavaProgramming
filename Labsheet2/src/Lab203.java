import javax.swing.*;
public class Lab203 {
   public static void main(String[] args) {
       String weightInput = JOptionPane.showInputDialog(null, "Input Weight:");
       double weight = Double.parseDouble(weightInput);
       String heightInput = JOptionPane.showInputDialog(null, "Input Height:");
       double centimates = Double.parseDouble(heightInput);
       double meters = centimates / 100;
       double bmi = weight / (meters * meters);
       String avrBmi;
       if (bmi < 18.5) {
    	   avrBmi = "Underweight";
       } else if (bmi >= 18.5 && bmi <= 24.9) {
    	   avrBmi = "Normal-weight";
       } else if (bmi >= 25 && bmi <= 29.9) {
    	   avrBmi = "Overweight";
       } else {
    	   avrBmi = "Obesity";
       }
       String message = String.format("BMI = %.1f\nYou're %s", bmi, avrBmi);
       JOptionPane.showMessageDialog(null, message,"BMI", JOptionPane.WARNING_MESSAGE);
   }
}
