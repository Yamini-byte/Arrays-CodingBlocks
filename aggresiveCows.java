package arraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class aggresiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Sample Input
			5 3
			1 2 8 4 9
			Sample Output
			3
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stalls = new int[n];
		int cows = sc.nextInt();
		
		for(int i=0; i< n; i++) {
			stalls[i] = sc.nextInt();
		}
		
		Arrays.sort(stalls);
		int max = stalls[n-1] - stalls[0];
		
//		for(int i = 1 ; i <= max ; i++)
//		{
//			if(isItPossible(stalls, cows, i) == false)
//			{
//				System.out.println(i-1);
//				break;
//			}
//				
//		}
		int low = 1;
		int high = max;
		int ans = 0;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(isItPossible(stalls, cows, mid))
			{
				ans = mid;
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		System.out.println(ans);

	}
	public static boolean isItPossible(int[] stalls,int noc,int min)
	{
		int cows = 1;
		int place = stalls[0];
		
		for(int i = 1; i < stalls.length; i++)
		{
			int nplace = stalls[i];
			if(nplace - place >= min)
			{
				cows++;
				place = nplace;
			}
			if(cows >= noc)
			{
				return true;
			}
		}
		
		return false;
	}
}
