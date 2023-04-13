package s0406;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee;
		lee = new Student();
		kim.name = "조재현";
		kim.number = 20616;
		kim.phone = "01234567890";
		System.out.println("이름 " + kim.name);
		System.out.println("학번 " + kim.number);
		System.out.println("전화번호 " + kim.phone);
		System.out.println("학교 " + kim.School);
		
		
		lee.name = "tsf";
		lee.number = 15232;
		lee.phone = "gggaafaef";
		System.out.println("이름 " + lee.name);
		System.out.println("학번 " + lee.number);
		System.out.println("전화번호 " + lee.phone);
		System.out.println("학교 " + kim.School);
		System.out.println("총학생수 " + Student.count);
		

	}

}
