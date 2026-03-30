package Collections.List.ArrayList.Comparator;

import java.util.Comparator;

public class myClass implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
