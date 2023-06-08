package hh0608;

public class Truck extends Car{
	int ton;
	void speedUp() {
		velocity += 10;
		System.out.println("속도 " + velocity + " 증가");
	}
	
	void speedUpUp() {
		super.speedUp();
	}
}
