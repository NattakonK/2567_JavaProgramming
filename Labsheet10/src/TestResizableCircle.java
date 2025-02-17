
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle re1 = new ResizableCircle(10.0);
		System.out.println(re1);
		
		System.out.println("Perimeter: " + re1.getPerimeter());
		System.out.println("Area: " + re1.getArea());
		re1.resize(50);
		System.out.println("After resize(50%) : "+ re1);
		System.out.println("Perimeter: " + re1.getPerimeter());
		System.out.println("Area: " + re1.getArea());
}
}