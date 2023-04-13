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
			System.out.printf("학생%d 이름 입력 : ", (i+1));
			name[i] = sc.next();
			for(int j=0; j<3; j++) {
				System.out.printf("성적%d 입력 : ", (j+1));
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println("********** 입력 완료 **********");
		for(int a=0; a<2; a++) {
			sum = 0;
			avg = 0;
			for(int b=0; b<3; b++) {
				sum=sum+score[a][b];
			}
			avg = sum/3.0f;
			System.out.printf(name[a] + "학생의 총점은 %d점이고, 평균은" + avg + "점 입니다.", sum);
			if (avg>=90) {
				System.out.println(name[a] + "학생의 학점은 A입니다.");
			}
			else if (avg>=80) {
				System.out.println(name[a] + "학생의 학점은 B입니다.");
			}
			else if (avg>=70) {
				System.out.println(name[a] + "학생의 학점은 C입니다.");
			}
			else if (avg>=60) {
				System.out.println(name[a] + "학생의 학점은 D입니다.");
			}
			else {
				System.out.println(name[a] + "학생의 학점은 F입니다.");
			}
		}

	}

}
