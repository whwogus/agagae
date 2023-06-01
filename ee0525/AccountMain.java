package ee0525;

import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account c1 = new Account("김태희", 101);
		c1.setbalance(8000);
		while(true) {
			c1.printmenu();
			int menu = sc.nextInt();
			if(menu==4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			else if(menu==1) {
				System.out.println("입금할 금액을 입력해주세요.");
				int money = sc.nextInt();
				c1.deposit(money);
				c1.printinfo();
			}
			else if(menu==2) {
				System.out.println("출금할 금액을 입력해주세요.");
				int money = sc.nextInt();
				c1.withdraw(money);
				c1.printinfo();
			}
			else if(menu==3) {
				c1.printinfo();
			}
			
		}
		Account c2 = new Account("배수지", 102, 0);
		c1.printinfo();
		c2.printinfo();
		c1.withdraw(5000);
		c2.deposit(100000);
		c1.deposit(1000);
		c2.withdraw(7000);
		c1.printinfo();
		c2.printinfo();
		c1.withdraw(5000);
		
	}

	
	
}
