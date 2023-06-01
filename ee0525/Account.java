package ee0525;

public class Account {
	String name;
	int no;
	int balance;
	Account(){
		System.out.println("=====계정 추가=====");
	};
	Account(String name, int no){
		this();
		this.name = name;
		this.no = no;
	};
	
	Account(String name, int no, int balance){
		this(name, no);
		this.balance = balance;
	};
	
	
	String getname() {
		return name;
	}
	int getno() {
		return no;
	}
	int getbalance() {
		return balance;
	}
	
	
	public void setname(String name) {
		this.name = name;
	}
	public void setno(int no) {
		this.no = no;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	
	
	public void printinfo() {
		System.out.println("[계좌정보] \n예금주: " + name + "\n계좌번호 : " + no + "\n현재 잔고 : " + balance);
	}
	
	public void deposit(int deposit) {
		balance += deposit;
		System.out.println(name + "님" + deposit + "원 입금");
	}
	
	public void withdraw(int drawout) {
		if(balance>drawout) {
			balance -= drawout;
			System.out.println(name + "님" + drawout + "원 출금");
		}
		else {
			System.out.println(name + "님" + drawout + "원 출금 실패 - 현재 잔액 " + balance + "원");
		}
	}
	
	public void printmenu() {
		System.out.println("작업을 선택하세요\n"
				+ "1. 입금\n"
				+ "2. 출금\n"
				+ "3. 잔고조회\n"
				+ "4. 종료");
		
	}
	

	
}
