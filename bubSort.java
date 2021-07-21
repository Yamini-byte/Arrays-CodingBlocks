package arraysAssignment;

import java.util.Scanner;

public class bubSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		arr = bubble(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static long[] bubble(long[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1 ; j++) {
				if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    long temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
		}
		return arr;
	}
}
