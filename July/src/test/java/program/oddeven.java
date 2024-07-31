package program;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==1) {  //(n%2!=0)
			System.out.println("It's Odd Number");
		}else {
			System.out.println("It's Even Number");
		}
	}
}
