package arraysAssignment;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//int[] arr = {2 ,5 ,3 ,4 ,5 ,0 };
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			insert(arr,i);
		}
	}
	public static void insert(int[] arr,int n) {
		//int n = arr.length;
		int temp = arr[n];
		int pos = 0;
		for(int i=n-1;i>=0;i--) {
			if(arr[i] < temp) {
				pos = i+1;
				break;
			}
			else {
				arr[i+1] = arr[i];
			}
		}
		arr[pos] = temp;	
	}
}
