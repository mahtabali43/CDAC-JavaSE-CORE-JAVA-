package Collections.List.ArrayList.Comparator;

import java.util.*;

public class Comparators {

	public static void main(String[] args) {
		LinkedList<String> l =new LinkedList<>();
		l.add("MAHTAB ALI");
		l.add("ROHIT");
		l.add("HARISH");
		l.add("MANISH");
		l.add("MAHESH");
		l.add("PATI");
		
		System.out.println(l);
		 System.out.println(l.indexOf("MANISH"));
		
		// Comparator used for String sorting
	
//		 Collections.sort(l, new Comparator<>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			}
//			 
//		 });
//		 
//			System.out.println(l);
			
			// Comparator used for Interger sorting
			
//			LinkedList <Integer> l1 = new LinkedList<>();
//			l1.add(998);
//			l1.add(43);
//			l1.add(99);
//			l1.add(3);
//			l1.add(88);
//			
//			
//			 Collections.sort(l1, new Comparator<Integer>() {
//
//					@Override
//					public int compare(Integer o1, Integer o2) {
//						
//						return Integer.compare(o1, o2);
//					}
//					 
//				 });
//
//				System.out.println(l1);

		 
		 
			LinkedList <Double> l2 = new LinkedList<>();
			l2.add(998.00);
			l2.add(43.50);
			l2.add(99.40);
			l2.add(3.20);
			l2.add(88.10);
			l2.add(3.20);
			
			System.out.println(l2.lastIndexOf(3.20));  // Last index of any object, we can also find the list's last index
			 Collections.sort(l2, new Comparator<Double>() {

					public int compare(Double o1, Double o2) {
						
						return Double.compare(o1, o2);
					}
					 
				 });

				System.out.println("Sorted LinkedList: "+l2);
			 
	}
	
}
