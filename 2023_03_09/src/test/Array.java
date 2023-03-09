package test;

public class Array {

	public static void main(String[] args) {
		int [] num = {94, 85, 95, 88, 90};
		int max = num[0];
		for (int i : num) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("최댓값은 " + max + "입니다.");
	}

}
