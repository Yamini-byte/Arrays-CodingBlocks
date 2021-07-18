package arraysAssignment;

import java.util.Scanner;

public class ChewbacchaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long temp = n;
		int count = 0;
		while(temp != 0) {
			count++;
			temp/=10;
		}
		temp = n;
		long[] arr = new long[count];
		for(int i = count-1; i >= 0 ; i--) {
			arr[i] = temp % 10;
			temp/=10;
		}
//		for(int i=0;i<count;i++) {
//			System.out.print(arr[i]);
//		}
		int i = 0;
		if(arr[i] == 9) {
			i++;
		}
		while(i < count) {
			if(arr[i] >= 5) {
				arr[i] = 9-arr[i];
			}
			i++;
		}
		for(int j = 0; j < count ; j++) {
			System.out.print(arr[j]);
		}
	}

}
