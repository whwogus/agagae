package s0413;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[2];
		int sum;
		int score[][] = new int[2][3];
		float avg;
		for(int i=0; i<2; i++) {
			System.out.printf("�л�%d �̸� �Է� : ", (i+1));
			name[i] = sc.next();
			for(int j=0; j<3; j++) {
				System.out.printf("����%d �Է� : ", (j+1));
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println("********** �Է� �Ϸ� **********");
		for(int a=0; a<2; a++) {
			sum = 0;
			avg = 0;
			for(int b=0; b<3; b++) {
				sum=sum+score[a][b];
			}
			avg = sum/3.0f;
			System.out.printf(name[a] + "�л��� ������ %d���̰�, �����" + avg + "�� �Դϴ�.", sum);
			if (avg>=90) {
				System.out.println(name[a] + "�л��� ������ A�Դϴ�.");
			}
			else if (avg>=80) {
				System.out.println(name[a] + "�л��� ������ B�Դϴ�.");
			}
			else if (avg>=70) {
				System.out.println(name[a] + "�л��� ������ C�Դϴ�.");
			}
			else if (avg>=60) {
				System.out.println(name[a] + "�л��� ������ D�Դϴ�.");
			}
			else {
				System.out.println(name[a] + "�л��� ������ F�Դϴ�.");
			}
		}

	}

}
