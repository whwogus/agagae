package s0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int i = 0;
		int max = 0;
		
		
		System.out.println("���� 5���� �Է����ּ���.");
		
		while(i<5) {
			System.out.printf("%d��° ���� : ",(i+1));
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max = num[i];
			}
			i++;
			
		}
		
		System.out.printf("�Է��� ���� �� �ִ밪�� %d�Դϴ�.",max);
		
	}

}
