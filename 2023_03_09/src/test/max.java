package test;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		
		int [] arrayNum = new int[5];
		int maxNum = 0;
		int maxNumIndex = 0;
		
		for(int i = 0; i < arrayNum.length; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print(i+1 + "번쨰 입력 : ");
			arrayNum[i] = input.nextInt();
			
			if(arrayNum[i] > maxNum) {
				maxNum = arrayNum[i];
				maxNumIndex = i;
			}
			
		}
		
		System.out.println("가장 큰 수는 " + (maxNumIndex + 1) + "번째 숫자인 " + maxNum + "입니다.");
		
		
	}

}
