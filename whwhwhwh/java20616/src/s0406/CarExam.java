package s0406;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car redCar = new Car();
		Car blueCar = new Car();
		
		redCar.car_name = "제네시스";
		redCar.price = 5000;
		redCar.brand = "hyundai";
		redCar.velocity = 30;
				
		blueCar.car_name = "520d";
		blueCar.price = 7000;
		blueCar.brand = "BMW";
		blueCar.velocity = 40;
		
		redCar.run();
		redCar.vel_up(10); //10
		redCar.vel_up(20); //20
		redCar.vel_down(40);
		redCar.vel_up(150); //30
		redCar.stop();
		redCar.vel_up(100);
		redCar.stop();
	}

}
