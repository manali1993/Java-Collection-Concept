package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
     ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("Manali");
		list.add(100);
		list.add('d');
		list.add(34.234);
		
	//Typical for loop:
		for(int i=0; i<list.size(); i++){
			System.out.println("Values from typical for Loop="+list.get(i));
		}
		
	//For each loop:
		for(Object values: list){
			System.out.println("for each loop="+ values);
		}
		
	//Streams with lambda:
		list.stream().forEach(num -> System.out.println("stream with lambda:"+num));
		
	//iterator
	Iterator<Object> it = list.iterator();	
	
	while(it.hasNext()){
		System.out.println("iterator:"+ it.next());
	}
	
	}

}
