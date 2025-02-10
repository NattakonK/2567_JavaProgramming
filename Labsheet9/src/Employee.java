
public class Employee {
	
	private String id;
	private String name;
	private double salary;
	
	Employee(String id, String name,double salary){
		this.name= name;
		this.id = id;
		this.salary = salary;
	}
	
	Employee(String id, String name){
		//this.name= name;
		//this.id = id;
		//this.salary = 0;
		this(id,name,0);
	}
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	
}
