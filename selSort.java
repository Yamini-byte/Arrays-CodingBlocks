package arraysAssignment;

import java.util.Scanner;

public class selSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		arr = selection(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int[] selection(int[] arr) {
		int i = 0;
		int j = 0;
		for(i = 0; i < arr.length-1; i++) {
			int min = i;
			for(j = i+1; j < arr.length ; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
}
