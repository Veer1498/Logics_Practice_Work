package logicspractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Name");
		String name = sc.next();
		String revName = " ";
		for(int i=name.length()-1;i>=0;i--) {
			
			revName = revName+name.charAt(i);
		}
		System.out.println("Reversed String Output :"+revName);

	}
}
