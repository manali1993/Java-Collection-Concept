package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Manali","Roshan","Dax","Krisha"));
		
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("shlok","javal","Ritu","Het"));
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		/*ar1.clear();
		System.out.println(ar1);*/

		System.out.println(ar1.contains("Manali"));
		System.out.println(ar2.contains("Manali"));
		
		System.out.println(ar1.indexOf("Ritu"));
		System.out.println(ar1.lastIndexOf("Manali"));
		
		ar1.remove("Dax");
		System.out.println(ar1);
		
		ar2.removeIf(list -> list == "Ritu");
		System.out.println(ar2);
		
		
	}

}
