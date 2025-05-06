package Task7;

import java.util.ArrayList;
import java.util.List;

public class Question7T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Graphs");
		fruits.add("Mango");
		System.out.println("List elements: " + fruits);
		
		System.out.println();
		
		String[] fruitsArray = fruits.toArray (new String[0]);
		System.out.println("Array elements:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

	}

}
