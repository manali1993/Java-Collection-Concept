package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("d","e","c"));
		
		Collections.sort(list1);
		Collections.sort(list2);

		System.out.println(list1.equals(list2));
		
		/*list1.removeAll(list2);
		System.out.println(list1);*/
		
		/*list2.removeAll(list1);
		System.out.println(list2);*/
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		

	}

}
