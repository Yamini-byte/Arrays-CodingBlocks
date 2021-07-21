package arraysAssignment;

import java.util.Scanner;

public class sortArraysofThreeObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Sample Input
			7
			2 0 1 1 2 0 1
			Sample Output
			0 0 1 1 1 2 2
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		arr = sort(arr);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] sort(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n-1;
		while(start <= end) {
			if(arr[start] == 0) {
				start++;
			}
			else {
				if(arr[end] == 0) {
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
				}
				else {
					end--;
				}
			}
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		//System.out.println(count);
		start = count;
		end = n-1;
		while(start <= end) {
			if(arr[start] == 1) {
				start++;
			}
			else {
				if(arr[end] == 1) {
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
				}
				else {
					end--;
				}
			}
		}
		return arr;
	}
}
