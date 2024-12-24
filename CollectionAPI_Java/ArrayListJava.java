package CollectionAPI_Java;

import java.util.Collection;

public class ArrayListJava {
    public static void main(String[] args) {
        System.out.println("ArrayList in Java");

        // Collection API  belongs to the java.util package
        // Collection API is a framework that provides the architecture to store and manipulate the group of objects

        Collection <Integer> nums = new ArrayList<Integer>();  // using the generic type to store the integer values
        //List <Integer> nums = new ArrayList<Integer>();  // using the List interface to store the integer values
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        // System.out.println(nums);
        // System.out.println(nums.indexOf(6));  // it will give the index of the element
        // System.out.println(nums.contains(7));  // it will give the boolean value if the element is present or not
        // System.out.println(nums.get(2));  // it will give the element at the index 2

        for (int i : nums) {
            System.out.println(i);
        }

    }

    // ArrayList is a class which uses the List interface to store the elements
    // If you want to use the index  use the List instead of the Collection
}

// Collection is implented by the List, Set, Queue, Deque
// List is implemented by the ArrayList, LinkedList, Vector, Stack
// Set is implemented by the HashSet, LinkedHashSet, TreeSet
// Queue is implemented by the PriorityQueue, BlockingQueue
// Deque is implemented by the ArrayDeque, LinkedList

// Map is implemented by the HashMap, LinkedHashMap, TreeMap, HashTable, Properties


 // ArrayList is the part of the collection framework and it is present in the java.util package
        // ArrayList is the dynamic array in Java
        // ArrayList is the resizable array, it can grow and shrink its size dynamically
        // ArrayList is the implementation of the List interface
        // ArrayList is the ordered collection, it maintains the insertion order
        // ArrayList allows the duplicate elements
        // ArrayList is not synchronized
        // ArrayList maintains the index based system
        // ArrayList can be used in the multi-threaded environment
        // ArrayList is the best choice if our frequent operation is retrieval operation

        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Java");
        // list.add("Python");
        // list.add("C++");
        // list.add("C");
        // list.add("JavaScript");
        // list.add("Java");