
#### Questions

```diff
-Question 1:
Which access modifier is used to access members of an inherited class when two classes are in different packages?
+ Answer: 

-Question 2:
Which principle emphasizes the binding of data and methods within a class?
1. Polymorphism 2. Encapsulation 3. Abstraction 4. Inheritance
+ Answer: 

-Question 3:
Can the value of a variable be changed if it is initialized with the 'final' keyword?
+ Answer:

-Question 4:
Does the given code defines the valid way to initialize the value to the final variable?

class MyClass {
private final int myVariable;
{
myVariable = 10;
}
}
1. Yes 2. No
+ Answer: 

-Question 5:
Which keyword is used to define a class member that can be accessed without reference to any object?
1. final 2. Statuc 3. public 4. Private
+ Answer: 

-Question 6:
Which keyword is used to achieve inheritance in Java?

+Answer: 

-Question 7:
Can a class be a superclass of itself in Java?
+ Answer: 

-Question 8:
Is method shadowing or method hiding possible with the private method?
+ Answer:

-Question 9:
What is the return type of overridden methods?
1. Different Return Types 2. Covariant Return Types 3. void Only
+ Answer:

-Question 10:
What interface is implemented by the String, StringBuffer, and StringBuilder classes?
1. StringSequenc 2. CharSequence 3. StringManiPulator 4. CharSequenceBuffer

-Question 11:
What will be the output of the given code snippet?

char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
String str = new String(chars,1,3);
System.out.println(str);
1. ['b','c', 'd'] 2. bcd 
+ Answer:

-Question 12:
Which constructor of StringBuffer reserves room for 16 characters without reallocation?
1. StringBuffer() 2.StringBuffer(int size) 3. StringBuffer(String Str )
+ Answer:

-Question 13:
Which class can be used when multiple threads are involved and thread-safety is required?
1. StringBuilder 2. StringBuffer 3. Both
+ Answer:

-Question 14:
What will be the value of the s1 and s2 variables after the execution of the following code?

class Main{

public static void main (String [] args) {

char ch [] = {'T', 'e', 'l', 'e', 'p', 'h', 'o', 'n', 'e'};

String st1 = new String(ch);

String st2 = new String(st1);

System.out.println(st1);

System.out.println(st2);

1. Telephone and null 2. Telephone and Telephone 3. Telephone and st1
+ Answer:

-Question 15:
Determine the capacity of the StringBuffer before and after the use of trimToSize() method in the given code:

StringBuffer sb = new StringBuffer("Java Code");

System.out.println(sb.capacity());

sb.trimToSize();

System.out.println(sb.capacity());

1. 16 and 16 2. 16 and 9 3. 25 and 9 4. 25 and 25
+ Answer:

-Question 16:
What Java keyword is employed for specifying a default method within a Java interface?
1. Default 2. new 3. override 4.implements

- Question 17:
When implementing a Java interface, methods must possess the following access modifier:
1. Public 2. Abstract 3. private 4. Protected
+ Answer:

-Question 18:
By default, the methods enclosed within a Java interface are characterized as:
1.  Abstract and Public 2. Public and static 3. final and protected 4. synchronized and void
+ Answer

- Question 19:
What is the output of the following code snippet?

interface MyCode{

double myScore();

}

public class Main {

public static void main(String[] args) {

MyCode myScore;

myCode = () -> 87;

System.out.println(MyCode.myScore());

}

}

+ Answer: Compile Time Error

- Question 20:
What is the output of the code?

public class Main {

int a=5;

A obj =()->{

System.out.println(this.a);};

public static void main(String []args){

Main ob=new Main();

ob.obj.run();

}

}



interface A{

public void run();

}
1. Compile time error 2. 5 3. 0 4. Runtime Error 

+ Answer : 5

Question 21:
Comment on the statement: "The method defined by a lambda expression does not have a name"

+ Answer: ?

-Question 22:
What is the output of the code?

class A{

public void run(){

System.out.println("I am running");

}

}

class Outer {

static A obj=new A(){};

public static void main(String []args){

obj.run();

}

}

1. C--- Error 2. Run --- Error 3. I am running 
+Answer: 

- Question 23:
What does Inner classes promote in Java?
1. Inheritance 2. Poly 3. Abs 4. Composition and Aggregration

+ Answer: 

-Question 24:
How do you access the method "m1()" of the inner class inside the main method?

class Outer {

class Inner{

public void m1(){

System.out.println("inner class instance m1()");}

}

public static void main(String[] args) { }

}

+ Answer: Outer.Inner i = new Outer.new Inner();

-Question 25:
What is the key requirement for an interface to be considered a functional interface?

+Answer: It must define Only one Abstract Mehtod

-Question 26:
Which of the given expressions returns 'true' if the value of the parameter n is even?

+ Answer : (n) -> (n%2)==0

-Question 27:
Can a subclass reference variable be assigned to a superclass reference variable?
+ Answer : Yes 

Question 28:
What is the purpose of the lambda operator (->) in Java lambda expressions?

+ Answer : Divides the expression into  the parameter list and lambda body

-Question 29:
In what order are the constructors executed when a class hierarchy is created?
+ Answer:  From Superclass to subclass

-Question 30:
Can an abstract class be instantiated directly with the new operator in Java?
+ Answer:  No






















```