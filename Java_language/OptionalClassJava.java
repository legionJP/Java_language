import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassJava {
    public static void main(String[] args) {
        System.out.println("Optional class in the java ");

        List<String> names = Arrays.asList("You", "Who", "I", "Xmen", "Jarvish");

// Using the Optional Class

        Optional<String> name = names.stream()
                        .filter(str -> str.contains("x"))
                        .findFirst();   // it gives the String , bcz it returns the type of optional to counter the null pointer expextion
        
        // System.out.println(name.get());
        System.out.println(name.orElse("Not found")); // if name in the list it will print else not


// directly mention the orElse
        String name1 = name.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not Found");
        System.out.println(name1);

    }
}

// Optional Class java in 1.8