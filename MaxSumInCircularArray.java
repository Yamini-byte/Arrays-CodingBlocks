package arraysAssignment;

import java.util.Scanner;

public class MaxSumInCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*first calculate the max sum in normal array
		 * then calculate max sum in inverted array
		 * add both
		 * */
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j = 0 ; j < n; j++) {
				arr[i] = sc.nextInt();
			}
			int sum = 0, maxSum2 = Integer.MIN_VALUE, tSum = 0;
//			for(int i = 0 ; i < arr.length ; i++) {
//				sum += arr[i];
//				if(sum > maxSum1) {
//					maxSum1 = sum;
//				}
//				if(sum < 0) {
//					sum = 0;
//				}
//			}
			//inverting the array
			for(int j = 0 ; j < arr.length ; j++) {
				arr[j] *= -1;
			}
			//calculating maxsum in inverted array
			//sum = 0;
			for(int k = 0 ; k < arr.length ; k++) {
				tSum += arr[k];
				sum += arr[k];
				if(sum > maxSum2) {
					maxSum2 = sum;
				}
				if(sum < 0) {
					sum = 0;
				}
			}
			//the max sum subarray is the sum of maxsum1 and maxsum2
			System.out.println(-1*tSum + maxSum2);
		}
		}
		
		//calculating max sum in  sub-array
		

}
