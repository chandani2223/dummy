package program;

public class largeNumber {
	public static void main(String[] args) {

		int a=90000,b=7550,c=4000;

		int r = (a>b)?(a>c?a:b):(b>c?b:c);
		System.out.println(r);

		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}else {
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
	}
}
