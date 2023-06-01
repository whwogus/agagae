package ee0525;

public class Student {
	
	
	//멤버변수
	String name;
	int grade;
	
	
	
	//생성자
	Student(){}
	Student(String name){
		this.name = name;
	}
	Student(String name, int grade){
//		this.name = name;
		this(name);
		this.grade = grade;
	}
	
	Student(int grade, String name){
		this.name = name;
		this.grade = grade;
	}
	
	//메소드
	
	void print() {
		System.out.println("학생 이름 : " + name + "\n학년 : " + grade);
	}
	
	void print2() {
		System.out.println("학생 이름 : " + getName() + "\n학년 : " + getGrade());
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
	
	//set
	void setName(String name) {
		this.name = name;
		
	}
	
	void setGrade(int grade) {
		this.grade = grade;
	}
	
}




