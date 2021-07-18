package arraysAssignment;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(isPresent(arr,key));

	}
	public static int isPresent(int[] arr, int key) {
		int pos = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				pos = i;
			}
		}
		return pos;
	}

}
