package s0413;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("숫자입력:");
		a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=a; i++) {
			if((i%2)==0) {
				System.out.print("-"+i);
				sum-=i;
			}
			else {
				System.out.print("+"+ i);
				sum+=i;
			}
		}
		System.out.printf("=%d",sum);


	}

}
