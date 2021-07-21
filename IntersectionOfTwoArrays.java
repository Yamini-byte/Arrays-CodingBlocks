package arraysAssignment;

import java.util.*;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Sample Input
			7
			1 2 3 1 2 4 1
			2 1 3 1 5 2 2
			Sample Output
			[1, 1, 2, 2, 3]
			Explanation
			Check which integer is present in both the arrays and add them in an array .Print this array as the ans.
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		ArrayList<Integer> arr = new ArrayList<>();
		int i=0;
		int j=0;
		while(i != n && j != n) {
			if(arr1[i]==arr2[j]) {
				arr.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
		
		System.out.println(arr);
	}

}
