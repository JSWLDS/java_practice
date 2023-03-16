package mart;

public class PoketmonTest {

	public static void main(String[] args) {
		
		Poketmon pikach = new Poketmon();
		
		pikach = new Poketmon("피카츄", 4, "물");
		
		pikach.showInformation();
		
		Poketmon pairi = new Poketmon("파이리", 4, "불");
		
		pairi.showInformation();
	}

}

class Poketmon {
	
	private String pokeName;
	private int legs;
	private String skill;
	
	public Poketmon() {}

	public Poketmon(String pokeName, int legs, String skill) {
		super();
		this.pokeName = pokeName;
		this.legs = legs;
		this.skill = skill;
	}
	
	public void showInformation() {
		System.out.println("포켓몬 이름 : " + pokeName);
		System.out.println("포켓몬 다리 갯수 : " + legs);
		System.out.println("포켓몬 기술 타입 : " + skill);
	}
	
	
	
}