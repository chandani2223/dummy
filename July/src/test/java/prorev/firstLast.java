package prorev;

import java.util.ArrayList;

public class firstLast {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");
		if(!arrayList.isEmpty()) {
			String first = arrayList.get(0);
			String last = arrayList.get(arrayList.size() - 1);
			
			System.out.println("Fisrt Element : " + first);
			System.out.println("Last Element : " + last);
		}else {
			System.out.println("ArrayList is empty");
		}
	}
}
