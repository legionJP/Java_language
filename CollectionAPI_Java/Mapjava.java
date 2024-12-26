package CollectionAPI_Java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapjava {
    public static void main(String[] args) {

        System.out.println("Map Collection in the Java ");

        // map is the interface itself and the class implements is HashMap 
        Map<String, Integer> students = new HashMap<>();
        
        // can use for the synchronization HashTable 
       // Map<String, Integer> students = new Hashtable<>();
        
        students.put("Jp", 23);   // put try to add if alreday key replace it 
        students.put("Hello", 24);
        students.put("New", 25);
        students.put("year", 24);
        students.remove("jp");
        
        System.out.println(students); // Not following the sequence 

        // get the value by key 
        System.out.println(students.get("New"));


        // Changing the value by the key 
        students.put("New", 26);   // key can't be duplicate and key is set and values are list

        // printing all the value one by one
        System.out.println(students.keySet());  // key set
        // key and value 
        for(String key : students.keySet())
        {
            System.out.println(key + ":"+ students.get(key));
        }


    }
}

// Map
// Need of the Map in the Collection 
// Mapping the collection of the key and value pair 