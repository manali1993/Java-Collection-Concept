package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		//to add the values in arraylist
		list.add("Manali");
		list.add(100);
		list.add('d');
		list.add(34.234);
		
		//To get the value from ArrayList
		System.out.println("print value at 3rd position="+ list.get(2));
		
		//To print the size of the arrayList
		System.out.println("Size of arrayList="+ list.size());
		
		//Lowest index and highest index
		System.out.println("Lowest index="+ 0);
		System.out.println("Highest index="+ (list.size()-1));
		
		
		
	}

}
