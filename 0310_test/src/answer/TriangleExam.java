package answer;

import java.util.Scanner;

public class TriangleExam {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(10.2, 17.3);
		
		while(true) {
			
			Scanner input = new Scanner(System.in);
			int button = 0;
			
			System.out.print("숫자를 입력하세요 (0 : 종료 | 1 : 삼각형 크기 재설정 | 2 : 삼각형 넓이 출력) : ");
			button = input.nextInt();
			
			if(button == 1) {
				
				double bottomLine;
				double height;
				
				System.out.print("삼각형의 밑변의 크기를 입력하세요 : ");
				bottomLine = input.nextDouble();
				
				System.out.print("삼각형의 높이를 입력하세요 : ");
				height = input.nextDouble();
				
				triangle.setReSize(bottomLine, height);
				System.out.println("삼각형의 사이즈가 재설정 되었습니다.");
				
			}
			else if(button == 2) {
				triangle.printArea();
			}
			else if (button == 0) {
				System.out.println("종료하였습니다.");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
			
		}

	}

}

class Triangle{
	
	private double bottomLine;
	private double height;
	
	public Triangle(double bottomLine, double height) {
		this.bottomLine = bottomLine;
		this.height = height;
	}
	
	public void setReSize(double bottomLine, double height) {
		this.bottomLine = bottomLine;
		this.height = height;
	}
	public void printArea() {
		System.out.println("현재 삼각형의 넓이는 : " + (bottomLine * height) / 2 + "입니다.");
	}
	
	
}