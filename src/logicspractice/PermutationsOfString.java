package logicspractice;

import java.util.Scanner;

public class PermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Input");
		String name = sc.next();
		char temp;
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
			

		}
		for (int i = 0; i < name.length(); i++) {
			char exName = name.charAt(i);
			char ex2Name = name.charAt(i+1);
			temp = exName; 
			exName = ex2Name;
			ex2Name = temp;
			
			System.out.println(ex2Name);
		}
		

	}

}
