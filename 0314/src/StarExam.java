import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("별의 개수 : ");
		int starCount = input.nextInt();
		
		System.out.println("방향 : ");
		int direction = input.nextInt();
		
		if(direction == 1) {
			for(int i = 0; i < starCount; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("* ");
				}System.out.println();
			}
		}
		else if(direction == 2) {
			for(int i = starCount; i >= 0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("* ");
				}System.out.println();
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
}