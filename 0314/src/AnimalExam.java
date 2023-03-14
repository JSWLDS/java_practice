  
public class AnimalExam {
	public static void main(String[] args) {
		Cat c1 = new Cat("고양이");
		c1.eat();
             c1.eat();
	}
}
class Animal{
	String name;
	int food = 0;
       /* 1) 기본 생성자 생성 */
	public Animal() {}
	
       /* 2) eat 함수 생성 : 반환타입 x, 매개변수 x
           - “eat 함수를 호출할 때마다 food 값이 10씩 증가합니다." 출력 */
	public void eat() {
		System.out.println("냠냠");
	}
}
class Cat extends Animal{
	
	int age = 3;
	public Cat(String name) {
		super();
		this.name = name;
		System.out.println("동물의 종류는 " + this.name + "이고, 나이는 " + age + "살 입니다.");
	}

	public void eat() {
		this.food += 10;
		System.out.println("오늘 먹은 음식의 양은 " + food + "g 입니다.");
	}
       /* 3) 정수형 변수 age를 생성하고 값에 3을 넣어줌
        
          4) 문자열 변수 1개를 매개변수로 받아오는 생성자 생성
          - 받아온 값을 name 변수에 넣어줌
          - “동물의 종류는 name이고, 나이는 age 살 입니다” 출력
          5) eat 함수 오버라이딩
          - food 변수 값에 10을 더해줌(값 누적)
          - “오늘 먹은 음식의 양은 food g입니다.” 출력
       */
}