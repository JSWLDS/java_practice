package answer;

import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		int num = input.nextInt();
		
		Circle circle = new Circle(num);
		
		circle.printArea();
	}

}

class Circle{
	
	private int radius;
	private final double PI = 3.141592;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public void printArea() {
		System.out.println("원의 넓이 : " + PI*radius*radius);
	}
	
}