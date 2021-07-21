package arraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class bookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Sample Input
			1
			4 2
			12 34 67 90
			Sample Output
			113 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			int[] arr = new int[nob];
			int high = 0;
			for(int j = 0; j< nob;j++) {
				arr[j] = sc.nextInt();
				high += arr[j];
			}
			Arrays.sort(arr);
			int low = arr[0];
			int ans = 0;
			while(low<=high)
			{
				int mid = (low+high)/2;
				if(isItPossible(arr, nos, mid))
				{
					ans = mid;
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
			}
			System.out.println(ans);
			
		}

	}
	public static boolean isItPossible(int[] books,int nos,int max)
	{
		int students = 1;
		int nop = 0;
		for(int i = 0; i < books.length;)
		{
			if(nop+books[i] <= max)
			{
				nop += books[i];
				i++;
			}
			else {
				
				students++;
				nop = 0;
			}
			if(students > nos)
			{
				return false;
			}
		}
		return true;
		
	}
}
