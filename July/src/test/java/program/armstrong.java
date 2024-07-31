package program;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int org=n;
		while(n>0) {
			sum = sum + (n%10)*(n%10)*(n%10);
			n = n/10;
		}
		System.out.print(sum+"\n");
		if(sum==org) {
			System.out.println("It's Armstrong Number");
		}else {
			System.out.println("It's Not Armstrong Number");
		}
		
	}
}
