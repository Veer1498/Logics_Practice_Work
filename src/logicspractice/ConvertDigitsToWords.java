package logicspractice;
import java.util.Scanner;
/**
 * Convert the Number Into Words Program By
 * @author Veer.Singa
 *
 */
public class ConvertDigitsToWords {
	//CheckNumber Function
	public static void checkNumber(int number) {
		/*
		 * This Function is Used to check The number and Convert the Number Into Words
		 * It Takes The Number from Main Function 
		 * Created 3 Arrays for oneDigits, Tens and teen values.
		 * I Took an If Else Condition to compare Number of Digits in Number.
		 */
		String hundred = "Hundred";
		String oneDigit[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String tens[] = {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		String teens[] = {"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
													"Seventeen","Eighteen","Nineteen"};
		
		int digits = String.valueOf(number).length();
		System.out.println("\nNumber Converted into Words :\n");
		if( digits == 1) {
			System.out.println(oneDigit[number - 1]);
		}
		else if(digits == 2) {
			if(number % 10 == 0) {
				System.out.println(tens[( number / 10) - 1]);
			}
			else if (number < 20 && number > 10){
				System.out.println(teens[(number - 10) - 1]);
			}
			else {
				
				int temp = number % 10;
				System.out.println(tens[( number / 10) - 1]+" "+oneDigit[temp-1]);
			}
		}
		else if(digits == 3) {
			int tempDiv = number / 100;
			int tempRem = number %100;

			System.out.print(oneDigit[tempDiv - 1]+" "+hundred);
			if(tempRem % 10 == 0) {
				System.out.print(" "+tens[( tempRem / 10) - 1]);
			}
			else if (tempRem < 20 && tempRem > 10){
				System.out.println(" "+teens[(tempRem - 10) - 1]);
			}
			else {
				int tempRem2 = tempRem % 10;
				System.out.println(" "+tens[( tempRem / 10) - 1]+" "+oneDigit[tempRem2-1]);
			}
		}
		else
			System.out.println("Thousand");
	}
	
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanning the Number and Call the function CheckNumber,
		 * By Giving the variable number into it.
		 * close the Scanner.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Converting Number into Words Program");
		System.out.println("====================================");
		
		System.out.print("Please Enter Number : ");
		int number = sc.nextInt();
		checkNumber(number);
		sc.close();

	}

}
