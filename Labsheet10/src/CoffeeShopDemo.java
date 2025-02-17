import javax.swing.*;
public class CoffeeShopDemo {
   public static void main(String[] args) {
       int drinkType = Integer.parseInt(JOptionPane.showInputDialog("Enter Drink Type (1: Hot, 2: Cold):"));
       int coffeeType = Integer.parseInt(JOptionPane.showInputDialog("Enter Coffee Type (1: Americano, 2: Espresso, 3: Cappuccino):"));
       char coffeeSize = JOptionPane.showInputDialog("Enter Coffee Size (S, T, G, V):").charAt(0);
       int baristaNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Barista Number (1: Leon, 2: Claire):"));
   
       Barista barista = (baristaNum == 1) ? new Barista("Leon", 'M') : new Barista("Claire", 'F');

       Coffee coffee = new Coffee(drinkType, coffeeSize, coffeeType, barista);

       JOptionPane.showMessageDialog(null, coffee.toString());
   }
}