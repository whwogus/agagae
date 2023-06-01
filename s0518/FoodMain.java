package s0518;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Food donut = new Food();
//		donut.name = "크리스피 크림 도넛";
//		donut.count = 10;
//		donut.printfood();
//		donut.getprice();
		
		Food juice = new Food("오렌지 주스", 10);
		juice.printfood();
		
		Food coffee = new Food("카페라떼", 5);
		coffee.printfood();	
		int 가격 = coffee.getprice();
		System.out.println("가격: "+ 가격);
	}

}
