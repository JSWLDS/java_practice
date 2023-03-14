	

public class ShapeExam {
	public static void main(String[] args) {
		Ract r = new Ract("사각형");
		r.area(7, 8);
        r.area(5, 5);
	}
}
class Shape{
	String name;
		/*1) 기본 생성자 생성 : “도형 생성” 출력 */
	public Shape() {
		System.out.println("도형 생성");
	}
	
       /*2) area 함수 생성 : 반환타입 x, 매개변수 정수형 변수 w,h 2개(가로, 세로 값)
	   -> "도형의 가로는 w이고, 세로는 h이다" 출력 */
	public void area(int w, int h) {
		System.out.println("도형의 가로는 " +  w + "이고, 세로는" +  h + "이다");
	}
}
/*3) Shape 클래스를 상속받는 Ract 클래스 생성 */
class Ract extends Shape
{
	/*4) 문자열 변수 1개를 매개변수로 받아오는 생성자 생성
	   - 받아온 문자열 변수를 name 변수에 넣어줌
	   - "도형은 name 입니다" 출력 */
	public Ract(String n) {
		name = n;
		System.out.println("도형은 " + name + "입니다." );
	}
	public void area(int w, int h) {
		super.area(w, h);
		if(w == h) {
			System.out.println("정사각형 / 넓이는 : " + w * h + "입니다.");
		}else {
			System.out.println("직사각형 / 넓이는 : " + w * h + "입니다.");
		}
	}
	/*5) area 함수 오버라이딩
	   - 상위클래스의 area 함수 호출
	   - 매개변수로 받아온 가로, 세로 값이 같으면,
            정사각형 / 넓이는 : ~(넓이 값) 출력하고, 다르면
            직사각형 / 넓이는 : ~(넓이 값) 출력   */
}