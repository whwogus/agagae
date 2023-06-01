package ee0525;

public class Circle {
	
	
	double radius;
	double Pi = 3.14;
	
	Circle(){}
	Circle(double radius){
		this.radius = radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double computeArea() {
		return (radius*radius*Pi);
	}
	
	double computePerimeter() {
		return (2*radius*Pi);
	}
	
	public void print() {
		System.out.println("반지름 "+ getRadius() + 
				"원의 면적 : " + computeArea() + 
				"원의 둘레 : " + computePerimeter());
	}
}

	