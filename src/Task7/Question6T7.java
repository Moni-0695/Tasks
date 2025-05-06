package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Question6T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> employeeMap = new TreeMap<>();
       
        employeeMap.put(9100, "Moni");
        employeeMap.put(9135, "Kavi");
        employeeMap.put(9147, "Sathish");
        employeeMap.put(8431, "Pavi");
        
        System.out.println("Employee TreeMap (sorted by ID):");
        
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        ArrayList<String> nameList = new ArrayList<>(employeeMap.values());
       
        Collections.sort(nameList);

        System.out.println("\nEmployee names in alphabetical order:");
        for (String name : nameList) {
            System.out.println(name);
        }

	}

}
