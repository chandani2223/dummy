package program;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		int org=n;
		while(n>0) {
			rev = rev*10 + (n%10);
			n = n/10;
		}
		if(rev==org) {
			System.out.println("It's Palindrome Number");
		}else {
			System.out.println("It's Not Palindrome Number");
		}
	}
}
