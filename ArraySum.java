package arraysAssignment;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Sample Input
			4
			1 0 2 9
			5
			3 4 5 6 7
			Sample Output
			3, 5, 5, 9, 6, END
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<n1; i++) {
			arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0; i<n2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int num1 = 0;
		for(int i=0;i<n1;i++) {
			num1 = num1*10 + arr1[i];
		}
		//System.out.println(num1);
		int num2 = 0;
		for(int i=0;i<n2;i++) {
			num2 = num2*10 + arr2[i];
		}
		//System.out.println(num2);
		int ans = num1+num2;
		//System.out.println(ans);
		int temp = ans;
		int count = 0;
		while(temp!=0) {
			count++;
			temp /= 10;
		}
		int[] answer = new int[count];
		for(int i=count-1;i>=0;i--) {
			answer[i] = ans%10;
			ans /= 10;
		}
		for(int i = 0 ; i< count; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.print("END");
	}

}
