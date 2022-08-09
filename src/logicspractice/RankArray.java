package logicspractice;

import java.util.Scanner;

public class RankArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		int arr2[] = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i<array.length;i++) {
			System.out.println("Please enter Element "+(i+1));
			array[i]= sc.nextInt();
		}
		
		System.out.println("\nArray Elements :\n");
		for (int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\nArray Based On Rank :\n");
		for (int i = 0;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
				arr2[i] = max;
			}
		}
		for (int i = 0;i<array.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
