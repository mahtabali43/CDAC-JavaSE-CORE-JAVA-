package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListBasics {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		
		al.add(8);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(9);
        System.out.println(al);
       
        System.out.println(al);
        al.add(2, 100);
        System.out.println(al);
        al.set(3, 5000);
        System.out.println(al);
        System.out.println(al.size());
//        al.trimToSize(); // It make arraylist to it's actual size, no memory waste
//        System.out.println(al.size());
//        al.add(1000);
//        System.out.println(al);
//        al.add(1000100001);
//        System.out.println(al);
//        al.removeIf( a-> a>5);
//        System.out.println(al);
//        al.removeFirst();
//        System.out.println(al);
//        al.removeLast();
//        System.out.println(al);
        
//        al.removeAll(al);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(5));
        System.out.println(al.getClass());
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
        	System.out.print( it.next()+" ");
        }
         
        al.remove(0);
        al.remove(Integer.valueOf(100));
        System.out.println();
        
        Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return Integer.compare(o1 ,  o2);
        
			}

        });
        
        for(Integer i : al) {
        	System.out.println("Element: "+ i);
        }
        
        al.subList(2, 4).clear();   // works for any list, 4 exclusive
        System.out.println(al);
	}
	
}
