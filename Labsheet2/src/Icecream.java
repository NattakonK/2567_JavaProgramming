import javax.swing.*;
 
public class Icecream {
    public static void main(String[] args) {
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;
        int flavorPrice = 0;
        boolean choice = false;
 
        while (!choice) {
            String flavorChoice = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPress number to choose flavor:",
            "Ice Cream Flavor Selection",JOptionPane.QUESTION_MESSAGE);
            if (flavorChoice == null) {
                System.exit(0);
            }
 
            switch (flavorChoice) {
                case "1":
                    flavorPrice = VANILLA;
                    choice = true;
                    break;
                case "2":
                    flavorPrice = CHOCOLATE;
                    choice = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!\nTry again.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        int toppingChoice = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        boolean addTopping = (toppingChoice == JOptionPane.YES_OPTION);
 
        int totalPrice = flavorPrice + (addTopping ? TOPPING : 0);
 
        String selectChoice = (flavorPrice == VANILLA) ? "Vanilla" : "Chocolate";
        String topping = addTopping ? "with topping" : "no topping";
 
        JOptionPane.showMessageDialog(null,"You choose " + selectChoice + " flavor\n" +"And " + topping + "\n" +"Total price = " + totalPrice + " baht.",
        "Order Summary",JOptionPane.INFORMATION_MESSAGE);
    }
}