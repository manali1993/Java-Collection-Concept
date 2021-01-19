package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {


		HashMap<String, String> studentList = new HashMap<String, String>();
		
		studentList.put("Manali", "Math");
		studentList.put("Roshan", "Science");
		studentList.put("urvi", "Biology");
		studentList.put("dax", "computer");
		studentList.put("krisha", "chemical");
		studentList.put(null, "life-science");
		studentList.put(null, "s.s");
		
		System.out.println(studentList.get("Manali"));
		System.out.println(studentList.get(null));
		
		//Iterator: over the keys
		
		/*Iterator<String> it = studentList.keySet().iterator();
		while(it.hasNext()){
			String keys = it.next();
			String values = studentList.get(keys);
			System.out.println(keys + ":"+ values);
			
		}*/
		
		//Iterator : over the pair
		
		Iterator<Entry<String,String>> it1= studentList.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> pair = it1.next();
			System.out.println(pair);
		}

		//Iterator : using each and lambda
		System.out.println("--------------------");
		studentList.forEach((k,v) -> System.out.println(k+"="+v));
	}

}
