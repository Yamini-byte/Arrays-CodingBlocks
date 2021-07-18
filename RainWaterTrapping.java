package arraysAssignment;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Constraints
		1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000

		Output Format
		Print how much unit of water collected among towers for each test case.

		Sample Input
		2
		6
		3  0  0  2  0  4
		12
		0  1  0  2  1  0  1  3  2  1  2  1
		Sample Output
		10
		6*/
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int i;
		for(int j=0;j<testCase;j++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
//			for(i=0;i<n;i++) {
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
			//array for left max
			int lmax = 0;
			int[] left = new int[n];
			for(i=0;i<n;i++) {
				if(arr[i] > lmax) {
					lmax = arr[i];
				}
				left[i] = lmax;
			}
//			for(i=0;i<n;i++) {
//				System.out.print(left[i]+" ");
//			}
//			System.out.println();
			int rmax = 0;
			int[] right = new int[n];
			for(i=n-1;i>=0;i--) {
				if(arr[i] > rmax) {
					rmax = arr[i];
				}
				right[i] = rmax;
			}
//			for(i=0;i<n;i++) {
//				System.out.print(right[i]+" ");
//			}
//			System.out.println();
			int[] ans = new int[n];
			int min = 0;
			for(i=0; i<n;i++) {
				min = Math.min(left[i], right[i]);
				ans[i] = min-arr[i];
			}
			int total = 0;
			for(i=0;i<n;i++) {
				total += ans[i];
			}
			System.out.println(total);
			
		}

	}

}
