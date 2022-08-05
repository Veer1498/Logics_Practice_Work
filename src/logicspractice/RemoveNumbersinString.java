package logicspractice;

import java.util.Scanner;

public class RemoveNumbersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Input");
		String name = sc.next();
		String updatedName = " ";
		for(int i=0;i<=name.length();i++) {
			char letter = name.charAt(i);
			if(letter == '1' || letter == '2' || letter == '3' || letter == '4' || letter == '5' || letter == '6' || letter == '7' || letter == '8' || letter == '9' || letter == '0')
				break;
			else
				updatedName = updatedName+letter;

		}
		System.out.println("Reversed String Output :"+updatedName);

	}

}
