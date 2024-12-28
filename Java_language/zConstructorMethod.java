import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Students{
    private int age;
    private String  name;

// Default constructor
    public Students(){

    }
// constructor for age and name
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

// constructor for name
    public Students(String name) {
        this.age = 0; // default age
        this.name = name;
    }
// Getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

// setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

// To String 
    @Override
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    
    
}

public class zConstructorMethod {
    public static void main(String[] args) {
        System.out.println(" Constructor Reference in the Java ");

        List<String>  names  = Arrays.asList("Navin", "Harsha", "Jarvish", "Grabage");
      //  List<Integer> ages = Arrays.asList(20, 25, 30);

// Method Reference 
        List<String> uNames = names.stream()
                            .map(String ::toUpperCase)
                            .toList();
        uNames.forEach(System.out::println);

// Creating the List of Students 
        List<Students> student = new ArrayList<>();

        for(String name : names){
            student.add(new Students(0, name));
        }
        System.out.println(student);

// Using the Stream Api
        student = names.stream()
                    .map(name -> new Students(0, name))
                    .toList();
        System.out.println(student);

// Using the Constructor reference
        student = names.stream()
                    .map(Students::new)
                    .toList();

// // Using the constructor reference with names and ages 
//         List<Students> students = IntStream.range(0, names.size())
//                                 .mapToObj(i -> new Students(ages.get(i), names.get(i)))
//                                 .collect(Collectors.toList());  
//         students.forEach(System.out::println);

    }
}
