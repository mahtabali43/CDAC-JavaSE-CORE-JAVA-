package Collections.Stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackBasics {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(6);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		System.out.println(st.isEmpty());
		
		System.out.println(st);
		System.out.println(st.peek());
//		st.pop();
		System.out.println(st.peek());

		if(!st.isEmpty()) {
			System.out.println("Stack: "+st);
		}
			System.out.println("Element Found at Index by search() method:"+ st.search(1)); // search mehtod has index from 1 to n, and top to down
		
			System.out.println("Element Found at Index by indexOf() method:"+ st.indexOf(1));// indixOf() method have index from 0 to n, and botttom to top.
			
       // Enumeration 
			System.out.println("Enumeration:");
			Enumeration en = st.elements();
			while(en.hasMoreElements()) {
				System.out.print(en.nextElement()+" ");
			}
			
			
	}
	
}
