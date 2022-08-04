package logicspractice;
import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class ArraySubSetCheck {
	
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Welcome to Array Program");
		System.out.println("************************");
		
		System.out.println("Max Elements in array 1 :");
		int m = sc.nextInt();
		System.out.println("Max Elements in array 2 :");
		int n = sc.nextInt();

		int arr1[] = new int [m];
		int arr2[] = new int [n];
		System.out.println("\nEnter Elements of Array 1");
		System.out.println("===========================");
		//For Scanning Array 1 Elements
		for(i = 0;i < m;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("\nEnter Elements of Array 2");
		System.out.println("===========================");
		// For scanning array 2 Elements
		for(j = 0;j < n;j++) {
			arr2[j] = sc.nextInt();
		}
		System.out.println(" ");
		boolean check = ArrayCheck(arr1, arr2, m, n);
		//Condition checking 
		if(check == true)
			System.out.println("The Array 2 is a SubSet of Array 1");
		else
			System.out.println("Sorry!! Array 2 is not a SubSet of Array 1");
	}
	
	//ArrayCheck Function
		static boolean ArrayCheck(int arr1[],int arr2[],int m, int n) {
			
			int i = 0;
			int j = 0;		
			
			for(i = 0;i < n;i++) {
				for(j = 0;j < m;j++) 
					if(arr2[i] == arr1[j])
						break;
					if(j == m) 
						return false;
			}
				return true;
		}
}
