
public class Invoice {

	private int invid;
	private Customer customer;
	private double amount;
	
	public Invoice(int invid, Customer customer, double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getInvID() {
		return this.invid;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return getCustomer().getCusID();
	}
	
	public String getCustomerName() {
		return getCustomer().getCusName();
	}
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount() - (amount * getCustomerDiscount() / 100);
	}
	
	public String toString() {
		return "Invoice [id="+getInvID()+",customer="+customer.toString()+",amount="+getAmountAfterDiscount()+")";
	}
}
