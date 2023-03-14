import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("수학점수 입력 >> ");
		int math = input.nextInt();
		
		System.out.println("과학점수 입력 >> ");
		int science = input.nextInt();
		
		System.out.println("영어점수 입력 >> ");
		int english = input.nextInt();
		
		Grade grade = new Grade(math, science, english);
		
		System.out.println("평균 점수 : " + grade.average());
		
	}
}

class Grade{
	
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}

	int math, science, english;
	
	public double average() {
		double average = ( this.math + this.science + this.english ) / 3;
		return average;
	}
}
