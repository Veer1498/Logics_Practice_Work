package logicspractice;

import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Prime Number Program");
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter Starting Number\n");
		int low = sc.nextInt();
		System.out.println("Enter Ending Number\n");
		int high = sc.nextInt();
		System.out.println("Prime Numbers :\n");
		
		for(i = low;i <= high;i++) {
			boolean primeCheck = true;
			for (j = 2; j < i; j++) {
				if(i % j == 0) {
					primeCheck = false;
					break;
				}
			}
			if(primeCheck == true)
				System.out.print(i+" ");
		}
	}
}
