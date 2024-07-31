package seleniums;
//equals() it will comparison of content
//equalsIgnoreCase() it will comparison of content
//== operator it will compare reference/address

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

public class compare {
	
	public static void main(String[] args) {		
		String s1 = "abc";		
		String s2 = "Abc";
		
		
		System.out.println(s1.equals(s2));
		if(s1.equals(s2)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		if(s1==s2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
	}
}
