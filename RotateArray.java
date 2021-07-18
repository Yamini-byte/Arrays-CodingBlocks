package arraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sample Input
			7//number of elements
			1 
			2
			3
			4 
			5 
			6 
			7
			3//number of rotations
			Sample Output
			5 
			6 
			7 
			1 
			2 
			3 
			4
			Explanation
			Input: 1 2 3 4 5 6 7
			Output: 5 6 7 1 2 3 4
			Explaination
			rotate 1 steps to the right: [7,1,2,3,4,5,6]
			rotate 2 steps to the right: [6,7,1,2,3,4,5]
			rotate 3 steps to the right: [5,6,7,1,2,3,4]
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		int nOfRot = sc.nextInt();
		arr = rotate(arr,nOfRot%num);
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] rotate(int[] arr, int n) {
		int len = arr.length;
		while(--n >= 0) {
			int temp = arr[len-1];
			for(int i = len-2;i>=0;i--) {
				arr[i+1] = arr[i];
			}
			arr[0]=temp;
		}
		
		return arr;
	}
}
