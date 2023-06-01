package s0518;

public class Student {
	//멤버 변수
	private String name;
	private int grade;
	static int count;
	
	//생성자
	Student(){
		count++;
	}
	
	//메소드
	public static int getCount(){
		return count;
	}
	
	
	String getname() {
		return name;
	}
	void setname(String name) {
		this.name = name;
	}
	
	int getgrade() {
		return grade;
	}
	void setgrade(int grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("학생의 이름은 " + name + "이고, " + grade + "학년입니다.");
	}

}


