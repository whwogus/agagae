package s0406;

public class Car {
	//멤버변수
	String car_name; //차종
	int price; //가격
	String brand; //현대, bmw
	static int count; //총 소유 차량
	int velocity = 0;
	boolean running;
	//생성자
	Car(){
		count++;
	}
	
	//메소드
	void run() {
		running=true;
		System.out.println(car_name + "가 운행중 입니다.");
		
	}
	void stop() {
		running=false;
		System.out.println(car_name + "가 정차 하였습니다.");
	}
	void vel_up(int value) {//value만큼 속도증가
		if(!running) {
			System.out.println(car_name+"정차중");
			return;
			
		}
		
		velocity+=value;
		if (velocity>100) {
			velocity = 100;
			System.out.println("최대속도는 100입니다.");
		}
		System.out.println("car name "+car_name);
		System.out.println("spd "+velocity);
	}
	void vel_down(int value) { //value만큼 속도감소
		velocity-=value;
		System.out.println("car name "+car_name);
		System.out.println("spd "+velocity);
	}
	
}
