package arraysAssignment;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
