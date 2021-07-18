package arraysAssignment;

import java.util.Scanner;

public class MirrorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that returns true if the array is mirror-inverse and false otherwise. An array is called mirror-inverse if it's inverse is equal to itself.

		1.It reads a number N.
		2.Take Another N numbers as input and store them in an Array.
		3.Inverse the array and print true if array is mirror inverse else print false .
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		boolean ans = false;
		if(n <= 1) {
			ans = false;
		}
		else {
			ans = isMirrorInverse(arr,n);
		}
		System.out.println(ans);
	}
	public static boolean isMirrorInverse(int[] arr, int n) {
		int start = 0, end = n-1;
		while(start<=end) {
			if(arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
