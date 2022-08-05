package logicspractice;

import java.util.Scanner;

public class NumOfDigitsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Count Digits in Integer program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int r,n = sc.nextInt();
		int count = 0;
		System.out.print("Number of digits in Integer:");
		while(n > 0) {
			r = n % 10;
			count++;
			n= n / 10;
		}
		System.out.print(" "+count);
		sc.close();
	}

}
