
class IncomeTaxCalculator{
	private double income;
	
	public void setIncome(double incomes) {
		income = incomes;
	}
	public double calculateTax() {
	       double tax = 0;
	       if (income > 150000) {
	           if (income <= 300000) {
	               tax += (income - 150000) * 0.05;
	           } else if (income <= 500000) {
	               tax += (300000 - 150000) * 0.05;
	               tax += (income - 300000) * 0.10;
	           } else {
	               tax += (300000 - 150000) * 0.05;
	               tax += (500000 - 300000) * 0.10;
	               tax += (income - 500000) * 0.20;
	           }
	       }
	       return tax;
	   }
	   public void displayTaxDetails() {
	       double tax = calculateTax();
	       System.out.println("Income: " + income);
	       System.out.println("Tax: " + tax);
	   }
}
public class TestIncomeTaxCalculator {

	public static void main(String[] args) {
		IncomeTaxCalculator tax = new IncomeTaxCalculator();
	       tax.setIncome(450000);
	       tax.displayTaxDetails();
	}

}
