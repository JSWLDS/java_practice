import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> studentList = new ArrayList<String>();
		for(int i = 0; i < 5; i++) {
			System.out.print("학생의 이름을 입력하세요 : ");
			studentList.add(scan.next());
		}
		int count = 0;
		System.out.println("김씨 성을 가진 학생은 아래와 같습니다.");
		for(String student : studentList) {
			if(student.startsWith("김")) {
				System.out.println(student);
				count++;
			}
		}
		System.out.println("김씨 성을 가진 학생은 총 " + count + "명 입니다.");
		System.out.println("===============================");
		
	}

}
