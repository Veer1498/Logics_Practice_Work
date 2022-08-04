package logicspractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int num = sc.nextInt();
		int temp,rem=0,res = 0;
		
		temp = num;
		while(temp !=0) {
			rem = temp %10; //remainder
			res = res + (int) Math.pow(rem, 3);
			temp = temp/10;
		}
		if(res == num) {
			System.out.println(num+" : It is an Armstrong Number");
		}
		else {
			System.out.println(num+" : It is not an Armstrong Number");
		}
		sc.close();
	}

}
