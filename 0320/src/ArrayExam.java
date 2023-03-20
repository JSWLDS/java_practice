import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		String array[] = new String [2];
		array[0] = "one";
		array[1] = "two";
		for(String i : array) {
			System.out.println(i);
		} 
		System.out.println("======================");
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add(1, "1");
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("======================");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================");
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
		
		for(String i : colors) {
			System.out.println(i);
		}
		System.out.println("======================");
		System.out.println(colors.indexOf("Black"));
		System.out.println(colors.contains("Black"));
		System.out.println("======================");
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================");

	}

}
