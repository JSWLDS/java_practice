package mart;

import java.util.Random;
import java.util.Scanner;

public class RandomDice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num;
		int sum = 0;
		
		System.out.print("주사위 던질 횟수 입력 : ");
		num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int diceNum = random.nextInt(6)+1;
			sum += diceNum;
			System.out.println(i + "번째 숫자는 " + diceNum + "입니다.");
		}
		System.out.println("주사위를 " + num + "번 던진 결과, 총 합은 " + sum + "입니다.");
	}

}
