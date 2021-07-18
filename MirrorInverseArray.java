package arraysAssignment;

import java.util.Scanner;

public class MirrorInverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*For the sample case, array=[4,0,2,1,3]. Inverse of this array is [1,3,2,4,0]. 
		 * Since inverse of the array is not equal to the array therefore, array is not 
		 * a mirror inverse.Hence, ans is false.
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] ans = new int[n];
		for(i=0;i<n;i++) {
			ans[arr[i]]=i;
		}
		
		for(i=0;i<n;i++) {
			if(arr[i] != ans[i]) {
				System.out.println("false");
				break;
			}
		}
		if(i == n) {
			System.out.println("true");
		}
	}

}
