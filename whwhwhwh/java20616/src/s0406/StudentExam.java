package s0406;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee;
		lee = new Student();
		kim.name = "������";
		kim.number = 20616;
		kim.phone = "01234567890";
		System.out.println("�̸� " + kim.name);
		System.out.println("�й� " + kim.number);
		System.out.println("��ȭ��ȣ " + kim.phone);
		System.out.println("�б� " + kim.School);
		
		
		lee.name = "tsf";
		lee.number = 15232;
		lee.phone = "gggaafaef";
		System.out.println("�̸� " + lee.name);
		System.out.println("�й� " + lee.number);
		System.out.println("��ȭ��ȣ " + lee.phone);
		System.out.println("�б� " + kim.School);
		System.out.println("���л��� " + Student.count);
		

	}

}
