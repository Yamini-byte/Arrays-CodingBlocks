package arraysAssignment;

import java.util.Scanner;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

			Input Format
			First line contains integer N as size of array.
			Next line contains a N integer as element of array.
			
			Constraints
			arr[i]<=10000000
			
			Output Format
			print output array
			
			Sample Input
			4
			1 2 3 4
			Sample Output
			24 12 8 6 
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		int i;
		//taking array elements input.
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		for(i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		//left product array for every element
		long prod = 1;
		long[] lp = new long[n];
		for(i=0;i<n;i++) {
			lp[i] = prod;
			prod *= arr[i];
		}
//		for(i=0;i<n;i++) {
//			System.out.print(lp[i]+" ");
//		}
//		System.out.println();
		//right product subarray
		prod = 1;
		long[] rp = new long[n];
		for(i = n-1;i>=0;i--) {
			rp[i] = prod;
			prod *= arr[i];
		}
//		for(i=0;i<n;i++) {
//			System.out.print(rp[i]+" ");
//		}
//		System.out.println();
		long[] ans = new long[n];
		for(i=0;i<n;i++) {
			ans[i] = lp[i] * rp[i];
		}
		for(i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
