package seleniums;

public class statics {
	
	int a=90;
	static int b=88;
	
	public void s() {
		int c=55; // can't use static modifier inside the method
	}
	public static void main(String[] args) {
		int a=81;
		statics s = new statics();
		System.out.println(s.a);
		System.out.println(b);
		
		System.out.println(a);
	}
}
