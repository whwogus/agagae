package ee0525;

public class CircleMain {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.setRadius(5);
		Circle c2 = new Circle(8);
		System.out.println("반지름 "+ c1.getRadius() + 
				"원의 면적 : " + c1.computeArea() + 
				"원의 둘레 : " + c1.computePerimeter());
		System.out.println("반지름 "+ c2.getRadius() + 
				"원의 면적 : " + c2.computeArea() + 
				"원의 둘레 : " + c2.computePerimeter());
		
		c1.print();
		c2.print();
	}
}
