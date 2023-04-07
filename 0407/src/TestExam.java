import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0, num = 0;
		
		System.out.println("500 이하의 자연수를 입력하세요.");
		num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0 && i % 7 == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("1~" + num + "까지 3의 배수이면서 7의 배수인 수의 합은 " + sum + "입니다.");
	}

}
