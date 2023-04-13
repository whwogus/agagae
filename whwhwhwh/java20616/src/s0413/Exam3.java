package s0413;

import java.util.Scanner;
public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		int day = 0;
		
		System.out.print("달 입력 : ");
		month = sc.nextInt();
		switch(month) {
			case 4:
				day = 30;
			case 6:
				day = 30;
			case 9:
				day = 30;
			case 11:
				day = 30;
			case 2:
				day = 28;
			default:
				day=31;
		}
		System.out.printf("%d월은 %d일입니다.", month, day);


}
}