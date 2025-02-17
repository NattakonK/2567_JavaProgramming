
public class Coffee extends Drink{

	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type,' ');
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	
	public Coffee(int type, int typeCoffee) {
		super(type,' ');
		this.typeCoffee = typeCoffee;
	}
	
	public Barista getBarista() {
		return this.barista;
	}
	
	public String getTypeName() {
		switch(typeCoffee) {
			case 1: return "Americano";
			case 2: return "Espresso";
			case 3: return "Cappuccino";
			default: return "null";
		}
	}
	
	public int getTypePrice() {
		switch(typeCoffee) {
			case 1: return 50;
			case 2: return 55;
			case 3: return 65;
			default: return 0;
		}
	}
	
	public String getSizeName() {
		switch(Character.toUpperCase(sizeCoffee)) {
			case 'S': return "Short";
			case 'T': return "Tall";
			case 'G': return "Grande";
			case 'V': return "Venti";
			default : return "null";
		}
	}
	
	public int getSizePrice() {
		switch(Character.toUpperCase(sizeCoffee)) {
			case 'S': return 100;
			case 'T': return 150;
			case 'G': return 200;
			case 'V': return 250;
			default : return 0;
		}
	}
	
	public int getTotalPrice() {
		return super.getTypePrice() + getSizePrice() + getTypePrice();
	}
	
	public String toString() {
		return super.getTypeName()+ " "+ getTypeName() +"(" + getSizeName() +") is " + getTotalPrice() +" baht.\n"
				+"Barista: "+barista.getName()+"(" +barista.getGendrName()+ ")";
	}
}
