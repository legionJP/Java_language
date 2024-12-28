import java.util.Arrays;
import java.util.List;

public class zMethodReference {
    public static void main(String[] args) {
        System.out.println("Method Reference in the Java ");

        List<String> names = Arrays.asList("Yogi", "harsh", "Johan");

// converting into upper case by calling the method toUpper
        List<String> uNames = names.stream()
                                .map(name -> name.toUpperCase())
                                .toList();  // convert the stream into list
        System.out.println(uNames);

// Using the Method reference , (So method ref. means pass the method inside the method with passing the class or object name)
        List<String> uNameStrings = names.stream()
                                    .map(String::toUpperCase) // mention that where the toUppercase belongs to 
                                    .toList();
        System.out.println(uNameStrings);

        // uNameStrings.forEach(i -> System.out.println(i));
        // Or
        uNameStrings.forEach(System.out::println);
    }
}
