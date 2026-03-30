package Collections.List.ArrayList.Comparator;

import java.util.*;

public class ComparatorWithObjects {

	public static void main(String[] args) {
		List <Employee> l  = new LinkedList<>();
		
		l.add(new Employee("MAHTAB ALI", 23, 10000));	
		l.add(new Employee("Pati", 21, 28000));	
		l.add(new Employee("MANISH", 26, 11000));	
		l.add(new Employee("ROHIT", 19, 21000));	
		
		
		System.out.println("Sorted Based on Sallery:");

		Collections.sort(l, new Comparator<>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return Integer.compare(o1.getSl(), o2.getSl());
			}
		});
		
		System.out.println(l);
		
		System.out.println();
		
		System.out.println();

		
		System.out.println("Sorted Based on Age:");
Collections.sort(l, new Comparator<>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		});
		
		System.out.println(l);
		
		System.out.println();
		System.out.println();
		System.out.println("Sorted By Names:");
		Collections.sort(l, new myClass());
        
		System.out.println("Using Iterator: ");
		Iterator <Employee> itr = l.iterator(); /// Using iterator to print
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}
