package arraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class pairOfRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Sample Input
		2
		2
		40 40
		80

		5
		10 2 6 8 4
		10
		Sample Output
		Deepak should buy roses whose prices are 40 and 40.
		Deepak should buy roses whose prices are 4 and 6.
		*/
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int counter=0;counter<test;counter++) {
			int num = sc.nextInt();
			int[] arr = new int[num];
			for(int a=0;a<num;a++) {
				arr[a] = sc.nextInt();
			}
			int[] ans = new int[2];
			Arrays.sort(arr);
			int total = sc.nextInt();
			
			int i = 0; int j = arr.length-1;
			while(i < j) {
				
					if(arr[j] + arr[i] <= total) {
						ans[0] = arr[i];
						ans[1] = arr[j];
						i++;
					}
				
				
				else {
					j--;
				}
			}
			System.out.println("Deepak should buy roses whose prices are "+ ans[0] +" and "+ ans[1]+".");
		}	
		
	}

}
