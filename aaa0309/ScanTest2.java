package aaa0309;

import java.util.Scanner;

public class ScanTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String major, num, name;
		Scanner s = new Scanner(System.in);
		System.out.println("학과 : ");
		major = s.next();
		System.out.println("학번 : ");
		num = s.next();
		System.out.println("이름 : ");
		name = s.next();
		System.out.println("저는 " + major + num + name + "입니다.");
	}

}
