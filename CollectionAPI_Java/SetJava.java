package CollectionAPI_Java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
    public static void main(String[] args) {
        System.out.println("Set in Java");

// Using the Hash Set 
        // Collection<Integer> nums = new TreeSet<Integer>(); Can use the collection insteda of Set as collection extends the Set
        Set<Integer> nums = new HashSet<Integer>();
        
        nums.add(6);
        nums.add(65);
        nums.add(6);
        nums.add(3);
        nums.add(2);
        nums.add(12);

        // for(int n: nums)
        // {
        //     System.out.println(n); // unordered and unique , (unsorted and not in sequence)
        // }
        

// Iterator is the top most interface of the Collection we can use it to get the next value 

        Iterator<Integer> values = nums.iterator();
        System.out.println(values);
        
        while(values.hasNext())
            System.out.println(values.next());


// Using the TreeSet, for the Sorted
        Set<Integer> nums1 = new TreeSet<>();
        nums1.add(12);
        nums1.add(23);
        nums1.add(45);
        nums1.add(34);
        for(int i: nums1)
        {
            System.out.println("Sorted set "+i);
        }
      
    }
}



  // Set is the interface in Java
        // Set is the collection of the unique elements
        // Set is the unordered collection of the unique elements
        // Set is the interface so we can not create the object of the Set
        // Set is implemented by the HashSet, LinkedHashSet, TreeSet

        // HashSet: HashSet is the class which implements the Set interface
        // HashSet is the collection of the unique elements
        // HashSet is the unordered collection of the elements
        // HashSet is the implementation of the hash table
        // HashSet allows the null value
        // HashSet does not maintain the insertion order
        // HashSet is non-synchronized
        // HashSet is not thread-safe
        // HashSet is the best choice if our frequent operation is the search operation
        // HashSet is the best choice if our frequent operation is the add and remove operation
        // HashSet is the best choice if our frequent operation is the iteration