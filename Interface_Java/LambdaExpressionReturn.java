package Interface_Java;

interface Lamr {
    int add(int i, int j);
}

public class LambdaExpressionReturn {
    public static void main(String[] args) {
        System.out.println("Lambda Expression in Java");

        // Anonymous class implementation
        Lamr objLam = new Lamr() {
            public int add(int i, int j) {
                return i + j;
            }
        };
        System.out.println(objLam.add(5, 6));

    // Lambda expression implementation with return type

        Lamr obj = (i, j) -> i + j;  //becomes the return type of the method after -> 
        int result = obj.add(5, 6);
        System.out.println(result);
    }
}

//Lambda Expression in Java only works with the functional interface