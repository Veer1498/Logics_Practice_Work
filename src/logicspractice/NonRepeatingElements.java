package logicspractice;
import java.util.Scanner;
/**
 * 
 * @author Veer.Singa
 *
 */
public class NonRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Repeating Elements on Array Program");
		System.out.println("***********************************");
		int arr[] = new int [5];
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Elements");
		System.out.println("================");
		//For Scanning Elements
		for(int i = 0;i < 5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\nThe elements Present");
		System.out.println("====================");
		//For Printing All Elements
		for(int i = 0;i < 5;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("\nNon Repeated Elements");
		System.out.println("=====================");
		//For Printing Non Repeated Elements
		for(int i = 0;i < 5;i++) {
			for(int j = i+1;j < 5;j++) {
				if (i != j && arr[i] == arr[j])
					check = false;
			}
			if (check != false)
				System.out.println(arr[i]);
		}
		
		
		
	}

}
