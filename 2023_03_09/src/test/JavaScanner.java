package test;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start, end, sum=0;
		System.out.print("시작 숫자 : ");
		start = input.nextInt();
		System.out.print("마지막 숫자 : ");
		end = input.nextInt();
		System.out.print(start + "부터 " + end + "까지의 합은 : ");
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.print(sum);
	}

}
