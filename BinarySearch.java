package arraysAssignment;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(binarySearch(arr,key));
	}
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid] < key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return -1;
	}
}
