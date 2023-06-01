package ee0525;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "김로봇";
		kim.grade = 1;
		
		Student lee = new Student("이로봇");
		lee.grade = 2;
		
		Student choi = new Student("최로봇", 3);
		
		kim.print();
		lee.print();
		choi.print();
		
	}

}


