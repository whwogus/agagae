package ee0525;

public class Employee {
	String name;
	int no;
	int age;
	Employee(){};
	Employee(String name, int no, int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setno(int no) {
		this.no = no;
		System.out.println(name + "님의 사번이 " + no + "로 변경됨");
	}
	
	public void setage(int age) {
		this.age = age;
		System.out.println(name + "님의 나이가 " + age + "로 변경됨");
	}
		
	String getname() {
		return name;
	}
	
	int getno() {
		return no;
	}
	
	int getage() {
		return age;
	}
	
	@Override
	public String toString() {
		return("[직원정보]이름 : " + name + ", 번호 : " + no + ", 나이 : " + age);
	}
	
	void print() {
		System.out.println(toString());
	}
}
