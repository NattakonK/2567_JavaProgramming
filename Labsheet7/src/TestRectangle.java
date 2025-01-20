
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(1.2F,3.4F);
		System.out.println(r2);
		System.out.println();
		
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
 
		System.out.println(r1);
		System.out.println("Length is "+r1.getLength());
		System.out.println("Width is "+r1.getWidth());
		System.out.println();
		
		System.out.printf("area is %.2f%n", r1.getArea());
		System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());

	}

}
