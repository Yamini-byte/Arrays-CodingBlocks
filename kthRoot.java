package arraysAssignment;

import java.util.Scanner;

public class kthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sample Input
		2
		10000 1
		1000000000000000 10
		Sample Output
		10000
		31*/
		
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		for(int i = 0;i< testcases ; i++) {
			long num = sc.nextLong();
			int k = sc.nextInt();
			long ans = binsearch(num,k);
			System.out.println(ans);
		}
		
	}
	
	public static long binsearch(long num,int k) {
		long ans = 0;
		long start = 0; long end = num-1;
		while(start <= end) {
			long mid = (end+start)/2;
			if(Math.pow(mid, k) <= num) {
				ans =  mid;
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		if(ans == num -1) {
			return num;
		}
		return ans;
	}

}
