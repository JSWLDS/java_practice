package Exam;

public class TransportExam {

	public static void main(String[] args) {
		
		Car c1 = new Car("디젤", 5);
		Car c2 = new Car("가스", 110);
		
		Airplane a1 = new Airplane("보잉 747", 10000, 1000);
		Airplane a2 = new Airplane("에스버스 380", 20000, 5000);
		Airplane a3 = new Airplane("보잉 707", 10000, 5000);
		
		c1.refuel();
		c2.refuel();
		
		c1.speedDown();
		c2.speedUp();
		
		 
		a1.refuel();
		a2.refuel();
		a3.refuel();
		
		a1.flightTime();
		a2.flightTime();
		
		a1.speedDown();
		a2.speedUp();
		
	}

}

abstract class Transport{
	
	abstract void refuel();              //운송수단의 주유를 담당하는 메소드
	abstract void speedUp();           //운송수단의 속도 증가를 담당하는 메소드
	abstract void speedDown();        //운송수단의 속도 감소를 담당하는 메소드
	
}

class Car extends Transport {
	
	private String oilType; //(자동차 오일의 종류)
	private double speed;  //(자동차 속력)'
	 
	public Car(String oilType, double speed) {
		super();
		this.oilType = oilType;
		this.speed = speed;
	}

	@Override
	void refuel() {
		
		if(oilType.equals("전기")||oilType.equals("태양열")) {
			System.out.println(oilType + "을(를) 충전합니다.");
		}
		else {
			System.out.println(oilType + "을(를) 주유합니다.");
		}
		
	}

	@Override
	void speedUp() {
		speed += 10;
		if(speed > 110) {
			System.out.println("속도위반 범칙금 10만원을 부과합니다.");
			speed = 10;
		}
	}

	@Override
	void speedDown() {
		speed -= 10;
		if(speed < 0) {
			System.out.println("차가 멈췄습니다.");
			speed = 10;
		}
	}
	
}

class Airplane extends Transport {
	
	private String airplanName; //(비행기 종류의 이름)
    private double distance;      //(비행거리)
    private double speed;      //(비행속력)
    private static double totalJetFuel = 1500;   //(보유하고 있는 ‘항공유’의 양 : 초기값을 1500으로 설정)
    private double jetFuel;       //(거리에 따른 항공유 양 계산 값)
     
	public Airplane(String airplanName, double distance, double speed) {
		super();
		this.airplanName = airplanName;
		this.distance = distance;
		this.speed = speed;
	}

	@Override
	void refuel() {
		jetFuel =  distance / 20;
		if(jetFuel > totalJetFuel) {
			System.out.println("항공유가 부족하여 주유할 수 없습니다.");
		} else {
			System.out.println("항공유" + jetFuel + "L를 주유합니다.");
			totalJetFuel -= jetFuel;
		}
	}

	@Override
	void speedUp() {
		speed += 1000;
		if(speed > 5500) {
			System.out.println("비행속도는 5500km를 넘을 수 없습니다.");
			speed = 5500;
		}
	}

	@Override
	void speedDown() {
		speed -= 1000;
		if(speed < 0) {
			System.out.println("비행기가 멈췄습니다.");
			speed = 0;
		}
	}
    
	void flightTime() {
		double flightTime = distance / speed;
		System.out.println(airplanName + "의 비행시간은 " + flightTime + "시간 입니다.");
		
	}
    
}