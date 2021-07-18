package arraysAssignment;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Output Format
			Print the missing number from array in range 1 to N.
			
			Sample Input
			7
			1 2 3 4 6 7 8
			Sample Output
			5
			Explanation
			In this test case, 5 is missing from the given array of integers.
			*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 0;
		for(i=0;i<n-1;i++) {
			if(arr[i+1] != arr[i]+1) {
				ans = arr[i]+1;
				break;
			}
		}
		System.out.println(ans);
	}

}
