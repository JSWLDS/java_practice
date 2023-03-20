import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxLexngthName {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			List<String> studentList = new ArrayList<String>();
			for(int i = 0; i < 5; i++) {
				System.out.print("별명을 입력하세요 : ");
				studentList.add(scan.next());
			}
			System.out.println("가장 긴 별명은 아래와 같습니다.");
			String maxLengthNickName="";
			for(String student : studentList) {
				if(student.length() > maxLengthNickName.length()) {
					maxLengthNickName = student;
				}
			}
			System.out.println(maxLengthNickName);
			System.out.println("===============================");
			
		}
}

