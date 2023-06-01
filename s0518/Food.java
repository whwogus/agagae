package s0518;

public class Food {
	
	String name; 		   // 이름
	private int price = 1000;	   // 가격
	static int totalcount; // 전체수량
	int count;			   // 수량
	
	//생성자
	
	Food(){}//생략가능
	
	Food(String name1, int count1){
		name = name1;
		count = count1;
		totalcount += count;
	}
	
	//메소드
	void printfood() {
		//ex)도넛 1000원*10개
		System.out.println(name+price+"원*"+count+"개");
		System.out.println("총 수량: "+totalcount);
		price = 2000;
	}
	
	int getprice() {
		return price;
	}
	
	private void setprice(int price1) {
		price = price1;
	}
	
	
	public static void main(String[] args) {
		// TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO Auto-generated method stub
				
	}

}
