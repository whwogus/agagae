package s0406;

public class Car {
	//�������
	String car_name; //����
	int price; //����
	String brand; //����, bmw
	static int count; //�� ���� ����
	int velocity = 0;
	boolean running;
	//������
	Car(){
		count++;
	}
	
	//�޼ҵ�
	void run() {
		running=true;
		System.out.println(car_name + "�� ������ �Դϴ�.");
		
	}
	void stop() {
		running=false;
		System.out.println(car_name + "�� ���� �Ͽ����ϴ�.");
	}
	void vel_up(int value) {//value��ŭ �ӵ�����
		if(!running) {
			System.out.println(car_name+"������");
			return;
			
		}
		
		velocity+=value;
		if (velocity>100) {
			velocity = 100;
			System.out.println("�ִ�ӵ��� 100�Դϴ�.");
		}
		System.out.println("car name "+car_name);
		System.out.println("spd "+velocity);
	}
	void vel_down(int value) { //value��ŭ �ӵ�����
		velocity-=value;
		System.out.println("car name "+car_name);
		System.out.println("spd "+velocity);
	}
	
}
