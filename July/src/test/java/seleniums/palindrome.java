package seleniums;

public class palindrome {
	public static void main(String[] args) {
		
		int a=121;
		int sum =0;
		int org = a;
		
		while(a>0) {
			sum = sum*10 + a%10;
			a=a/10;
		}
		System.out.print(sum);
		if(sum==org) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	
	}
}
