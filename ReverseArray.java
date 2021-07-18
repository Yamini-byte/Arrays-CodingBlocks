package arraysAssignment;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Constraints
			N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.
			
			Output Format
			Print the elements of the reversed array
			
			Sample Input
			5
			0 4 6 8 9
			Sample Output
			9 
			8 
			6 
			4 
			0 
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int i = 0, j = n-1;
		while(i <= j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(i = 0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
