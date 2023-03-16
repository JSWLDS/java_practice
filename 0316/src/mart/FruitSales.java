package mart;

import java.util.Scanner;

public class FruitSales {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		int money = 0;
		System.out.print("얼마를 쓰시겠습니까 : ");
		money = input.nextInt();
		buyer.buyApple(seller, money);
		
		seller.shawSaleResult();
		buyer.shawBuyResult();
		
	}

}
class FruitSeller {
	
	private int numOfApple = 20;
	private int myMoney = 0;
	public final int APPLE_PRICE = 1000;
	
	public FruitSeller() {}
	
	public int saleApple(int money) {
		
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += num * APPLE_PRICE;
		
		return num;
		
	}
	public void shawSaleResult() {
		System.out.println("====================");
		System.out.println("과일 판매자의 현재 상황");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}
class FruitBuyer {
	
	private int numOfApple = 0;
	private int myMoney = 5000;
	
	public FruitBuyer() {}
	
	public void buyApple(FruitSeller fruitSeller, int money) {
		numOfApple = fruitSeller.saleApple(money);
		myMoney -= numOfApple * fruitSeller.APPLE_PRICE;
		
	}
	public void shawBuyResult() {
		System.out.println("====================");
		System.out.println("과일 구매자의 현재 상황");
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과개수 : " + numOfApple);
		System.out.println("====================");
	}
}
