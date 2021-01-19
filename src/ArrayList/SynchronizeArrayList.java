package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeArrayList {

	public static void main(String[] args) {
		
		
		//Collections.synchronizedList
		
		List<String> sList = Collections.synchronizedList(new ArrayList<String>(Arrays.asList("Manali","Roshan")));
		
		System.out.println(sList);
		
		sList.add("Dax");
		sList.add("Urvi");
		System.out.println(sList);
		
		synchronized(sList){
			Iterator<String>it = sList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		
		
		}
		
		
		//CopyOnWriteArrayList
		
		CopyOnWriteArrayList<Object> cList = new CopyOnWriteArrayList<Object>(Arrays.asList("Manali","Roshan"));
		
		Iterator<Object>it = cList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
