package CollectionAPI_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {
        System.out.println(" Comparator vs Comparable ");

        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(45);
        nums.add(65);
        nums.add(1);

// Sorting using the Collections
        Collections.sort(nums);
        System.out.println(nums);

// Sorting using the Collections based on the other logic like based on unit digit of the number

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j)  // has to use the class Integer as collection comparator work with the wrapper class
            {
                // selection sort
                if(i%10> j%10)
                    return 1; // swapped
                else
                    return -1;    
            }
        };

        Collections.sort(nums, comp); // comp object of the comparator
        System.out.println(nums);

        List<String> nameList = new ArrayList<>();
        nameList.add("Hello");
        nameList.add("Welcome");
        nameList.add("You what is your Name ");
        nameList.add("Good Day");

// Sorting String array with the help of the length of the String array

        Comparator<String> scomp = new Comparator<String>() {
            public int compare(String i, String j)
            {   
                // return Integer.compare(i.length(), j.length())
                if(i.length() > j.length())
                    return 1;
                else
                    return -1;

            }
        };
        Collections.sort(nameList,scomp);
        System.out.println(nameList);


// Sorting String array with the help of the length of the String array

        List<Students> numStudents = new ArrayList<>();
        numStudents.add(new Students(22, "Suresh"));
        numStudents.add(new Students(19, "Nehab"));
        numStudents.add(new Students(20, "You"));
        numStudents.add(new Students(17, "Who"));
        numStudents.add(new Students(18, "NoNo"));

        for(Students s: numStudents)
        {
            System.out.println(s);
        }

// sorting based on the age

      // Collections.sort(numStudents); // not working for it , bcz  the Students class is not implementing the comapareable 

 // using the  lambda and ternary 

       // Comparator<Students> comps =(i,j) -> i.age >  j.age?1:-1;
       
// OR
        Comparator<Students> comps = new Comparator<Students>() {
            public int compare(Students i, Students j)
            {
                if(i.age > j.age)
                    return 1;
                else    
                    return -1;
            }
        };
        Collections.sort(numStudents,comps);
        System.err.println(numStudents);
    }
}

// class Students implements Comparable<Students>  // use the comparable to sort by the class itself by implementing the Tocompare
class Students{
    int age;
    String name;

    
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "students [age=" + age + ", name=" + name + "]";
    }
    
    public int compareTo(Students that){
        if(this.age > that.age)
            return 1;
        else
            return -1;


    }

    
}

// comparator : It is the interface using which you can specify your own logic for the sortings
