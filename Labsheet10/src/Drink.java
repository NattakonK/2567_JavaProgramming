
public class Drink {

	private int type;
	private char size;
	
	public Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	
	public String getTypeName() {
		if(type == 1)return "Hot";
		if(type == 2) return "Cold";
		else return "null";
	}
	
	public int getTypePrice() {
		if(type == 1) return 10;
		if(type == 2) return 20;
		else return 0;
	}
	
	public String getSizeName() {
		switch(Character.toUpperCase(size)) {
			case 'S': return "Small";
			case 'M': return "Medium";
			case 'L': return "Large";
			default : return "null";
		}
	}
	
	public int getSizePrice() {
		switch(size) {
			case 'S': return 15;
			case 'M': return 20;
			case 'L': return 25;
			default : return 0;
		}
	}
	
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
}
