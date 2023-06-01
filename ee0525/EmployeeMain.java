package ee0525;	

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setname("이도령");
		e1.setno(300);
		e1.setage(25);
		e1.print();
		Employee Shung = new Employee("성춘향", 200, 18);
		Shung.print();
		e1.setno(300);
		e1.print();
		Shung.setage(20);
		Shung.print();
		// TODO Auto-generated method stub

	}

}
