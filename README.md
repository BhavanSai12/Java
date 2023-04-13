# Understand the Basics

## Java
>Java is a popular object-oriented programming language. It is defined as a completecollection of objects. By using Java, we can develop lots of applications such as gaming,mobile apps, and websites.

## History 
>In the year 1991, a small group of engineers called ‘Green Team’ led by James Gosling, workeda lot and introduced a new programming language called “Java”. This language is created insuch a way that it is going to revolutionize the world.
In today’s World, Java is not only invading the internet, but also it is an invisible force behindmany of the operations, devices, and applications.


## Features :
  The following are the notable features in Java:
  >**Dynamic** : Java is more dynamic when compared to C++ and C. Java is designed in sucha way that it is adaptable to any the evolving environments.
  
  >**Simple** :Java is very easy to learn and code.
  
  >**Object-Oriented** : In Java, everything is based on objects.
  
  >**Secure** : Java provides a secure platform to develop safe and virus-free applications.
  
  >**Platform Independent** : Unlike C and C++, when we compile Java code it is compiledinto platform-independent bytecode rather than the platform-specific machine code.
  
  >**Portable** : Java provides no implementation aspects for the specifications which makeJava portable.
  
  >**Multithreaded** : By this feature, we can perform multiple tasks simultaneously in Java.
  
  >**High-Performance** : With the built-in Just-in-Time compiler, Java provides highperformance.
  
  >**Robust** : Java makes more efforts to eliminate errors by concentrating more on runtimechecking and compile-time check.




## JVM
> **JVM** : Java Virtual Machine is the main part of Java programming, which providesplatform independence. JRE and JDK both contain JVM in order to run our Javaprograms.

## JDK
> **JDK**: This development kit is mainly used for developing programs.

## JRE
>**JRE**: Java Runtime Environment is mainly used for running Java programs.

## JIT
> **JIT** : Just In Time Compiler is the component of JRE, which is used to compile the bytecodes of theparticular method into the native machine code. This compiled code of the method is directlycalled by JVM without interpreting it.


- Setting Up the Java Environment 


## Datatypes
Datatypes in Java
specify the values and sizes that can be stored in the variables. There aremainly two types of data types; they are

>**Primitive Data Types** : Primitive data types in Java are the major constituents of data manipulation. These are themost basic data types that are available in Java. The primitive data types include int, char,byte, float, double, long, short, and boolean.

>**Non-primitive Data Types** : The non-primitive data types are something that is different from primitive data types, andthese non-primitive data types include String, arrays, and structures.


| Datatypes     | Default Values| Sizes  | Examples  |
| ------------- |:-------------:| ------:| -----------------------------------:|
| boolean       | false         | 1 bit  | Boolean one = false                 |
| char          | '\u0000'      | 2 byte | char letterA = 'A'                  |
| byte          | 0             | 1 byte | byte a = 10, byte b = -20           |
| short         | 0             | 2 byte | short s = 10000, short r = -5000    |
| int           | 0             | 4 byte | int a = 100000, int b = -200000     |  
| long          | 0L            | 8 byte | long a = 100000L, long b = -200000L |
| float         | 0.0f          | 4 byte | float f1 = 234.5f                   |
| double        | 0.0d          | 8 byte | double d1 = 12.3                    |

## TypeCasting
**Widening** (automatically) - conversion of a smaller data type to a larger data type size.
>byte-> short -> char -> int -> long -> float -> double

**Narrowing** (manually) - converting a larger type to a smaller size type
>double bytedouble -> float -> long -> int -> char -> short -> byte

## Type Conversion
There are two types of type conversions, and they are :
>Implicit type conversion

Example
```bash
public class ImplicitTypecastingExample {  
   public static void main(String args[]) {  
      byte p = 12;  
      System.out.println("byte value : "+p);  
      // Implicit Typecasting  
      short q = p;  
      System.out.println("short value : "+q);  
      int r = q;  
      System.out.println("int value : "+r);  
      long s = r;  
      System.out.println("long value : "+s);  
      float t = s;  
      System.out.println("float value : "+t);  
      double u = t;  
      System.out.println("double value : "+u);  
   }  
} 
```
 
>Explicit type conversion

Example
```bash
// Main class
public class GFG {
// Main driver method
	public static void main(String[] args)
	{
		// Double datatype
		double d = 100.04;
		// Explicit type casting by forcefully getting
		// data from long datatype to integer type
		long l = (long)d;
		// Explicit type casting
		int i = (int)l;
		// Print statements
		System.out.println("Double value " + d);
		// While printing we will see that
		// fractional part lost
		System.out.println("Long value " + l);
		// While printing we will see that
		// fractional part lost
		System.out.println("Int value " + i);
	}
}

```



## Variables
 Variables in Java can be defined as a basic storage unit of a program. It is a storage unit thatholds the value during the program execution. Always the variable is assigned with a datatype.

>**Static Variables**:
A variable that is declared with the static keyword is called a static variable.A static variable cannot be a local variable, and the memory is allocated only once for thesevariables.

>**Local Variables**:
A variable that is declared inside the body of the method within the class iscalled a local variable. A local variable cannot be declared using the static keyword.

>**Instance Variables**:
The variable declared inside the class but outside the body of themethod is called the instance variable. This variable cannot be declared as static and its valueis instance-specific and cannot be shared among others.

Example
```bash
class A{ int num=30;//instance variable 
static char name=pranaya;//static variable 
void method(){ 
int n=90;//local variable
} }//end of class
```

## Conditional Statements
In Java control statements are divided into three types. They are:
- Selection Statements
	> A selection statement is mainly used to transfer program control to a specific flow based upon the condition either true or false. These selection statements are also called conditional statements.
	
	- If Statement
	```bash
	Syntax:
		if(condition){  
		//code to be executed  
		}  
	--------------------------------------------------------
	
	//Java Program to demonstate the use of if statement.  
		public class IfExample {  
		public static void main(String[] args) {  
		    //defining an 'age' variable  
		    int age=20;  
		    //checking the age  
		    if(age>18){  
			System.out.print("Age is greater than 18");  
		    }  
		}  
		} 
	```

	- if-else Statement

	- Switch Statement
		
- Iterative/looping Statements
	> The iterative statements in Java are also called looping statements, these statements are the set of statements that repeat continuously until the condition for the termination is not met.

	- For loop

	- While loop

	- Do-while loop


- Jump Statements.
    > In Java, jump statements are mainly used to transfer control to another part of our program depending on the condition. Moreover, these statements are used to jump directly to other statements.
    - Break and Continue are the two jump statements present in Java.

- Loops 



## Access Specifiers
- *Public* :
The methods, classes, and variables that are defined as the public can beaccessed by any class or method.
- *Private* :
The methods or classes which are declared as private can be accessible withinthe same class only.
- *Protected* :
The variables, methods, and classes which are defined as private can beaccessed within the same class of the same package or by the subclass of the sameclass.
- *Default* :
By default, all the classes, variables, and methods are of default scope. Thedefault is accessible within the package only.

| Access Modifier  | Within Class  | Within Package |Outside package by Subclass only|Outside Package| 
| ------------- |:-------------:| -----:| ------:|------:|
| Private     | Y | Y | Y | N |
| Default      | Y | Y | N    |   N |
| Protected | Y |Y |Y   |    N |
|Public |Y|Y|Y|Y|


## Operators

- **Arithmetic operators**

	```
	class Main {
	public static void main(String[] args) {
		
		// declare variables
		int a = 12, b = 5;

		// addition operator
		System.out.println("a + b = " + (a + b));

		// subtraction operator
		System.out.println("a - b = " + (a - b));

		// multiplication operator
		System.out.println("a * b = " + (a * b));

		// division operator
		System.out.println("a / b = " + (a / b));

		// modulo operator
		System.out.println("a % b = " + (a % b));
	}
	}
	```
- **Assignment operators**

	```
	class Main {
	public static void main(String[] args) {
		
		// create variables
		int a = 4;
		int var;

		// assign value using =
		var = a;
		System.out.println("var using =: " + var);

		// assign value using =+
		var += a;
		System.out.println("var using +=: " + var);

		// assign value using =*
		var *= a;
		System.out.println("var using *=: " + var);
	}
	}
	```
- **Logical operators**

	```
	class Main {
	public static void main(String[] args) {

		// && operator
		System.out.println((5 > 3) && (8 > 5));  // true
		System.out.println((5 > 3) && (8 < 5));  // false

		// || operator
		System.out.println((5 < 3) || (8 > 5));  // true
		System.out.println((5 > 3) || (8 < 5));  // true
		System.out.println((5 < 3) || (8 < 5));  // false

		// ! operator
		System.out.println(!(5 == 3));  // true
		System.out.println(!(5 > 3));  // false
	}
	}
	```
- **Relational operators**

	```
	class Main {
	public static void main(String[] args) {
		
		// create variables
		int a = 7, b = 11;

		// value of a and b
		System.out.println("a is " + a + " and b is " + b);

		// == operator
		System.out.println(a == b);  // false

		// != operator
		System.out.println(a != b);  // true

		// > operator
		System.out.println(a > b);  // false

		// < operator
		System.out.println(a < b);  // true

		// >= operator
		System.out.println(a >= b);  // false

		// <= operator
		System.out.println(a <= b);  // true
	}
	}
	```
- Bitwise operators
	- Bitwise OR (A&B)
	- Bitwise AND (A|B)
	- Bitwise XOR (A^B)
	- Bitwise Complement (~A)
	- Left shift ( A<<2)
	- Right shift (A>>2)
	- Unsigned left shift ( <<<)
	- Unsigned right shift (>>>)

- Unary operators
```
class Main {
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 12;
    int result1, result2;

    // original value
    System.out.println("Value of a: " + a);

    // increment operator
    result1 = ++a;
    System.out.println("After increment: " + result1);

    System.out.println("Value of b: " + b);

    // decrement operator
    result2 = --b;
    System.out.println("After decrement: " + result2);
  }
}
```

- Ternary operators
	>Ternary operator in Java is used to replace the if-else statement. The representation or thesyntax for the ternary operator is given as:
	```
	Syntax:
	variable= falsevariable= (expression) ? expression true : expression false
	```
- Shift operators

## Arrays & String Manipulations
- array vs array list
- Scope of Variables
- Type Conversion in Java Switch Statements
## Classes ,Objects & Methods
## Class 
> Collection of objects is called class. It is a logical entity.
A class can also be defined as a blueprint from which you can create an individual object. Class
doesn't consume any space.

## Object
> Objects have states and behaviors. Example: A dog has states - color, name, breed as well as
behaviors – wagging the tail, barking, eating. An object is an instance of a class.

## Methods

> In general, a method is a way to perform some task. Similarly, the method in Java is a collection of instructions that performs a specific task. It provides the reusability of code. We can also easily modify code using methods.

> **Predefined Method** :
In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. Some predefined methods are length(), equals(), compareTo(), sqrt(), etc.

> **User-defined Method** :
The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement
> **Static Method** :
A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method. We can also create a static method by using the keyword static before the method name.

> **Instance Method** :
The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class.

> **Abstract Method** :
The method that does not has method body is known as abstract method. In other words, without an implementation is known as abstract method. It always declares in the abstract class. It means the class itself must be abstract if it has abstract method. To create an abstract method, we use the keyword abstract


- Method Overloading
- Method Overiding
- Parameter passing
## Constructors
> A constructor is a special type of method with a block of code to initialize the state of an object. A constructor is called only when the instance of the object is created. Every time in Java object is created using the new keyword and by default, the constructor is called. 

> - **Default constructor** : It is also called a no-argument constructor and it is mainly used to initialize the instance variable with the default value. Moreover, it is also used to perform some useful tasks on object creation. This default constructor is implicitly invoked by the compiler if there is no constructor for a particular class.
> - **Parameterized constructor** : A parameterized constructor is one type of constructor which is mainly used to initialize the instance variables with the given values. In simple words, the constructor that accepts arguments is called a parameterized constructor

## **OOPs Concept**
## Advantages Of OOP's
> - OOPs Provides data hiding
> - OOPs makes develpment and maintenance easier when compared to a procedural programming language.
> - OOPs has the ability to stimulate real-world entites more effectively.
## Inheritance
> When an object of child class has the ability to acquire the properties of a parent class then it is called inheritance. It is mainly used to acquire runtime polymorphism and also it provides code reusability.

## Encapsulation
> Binding data and code together into a single unit are called encapsulation. The capsule is the best example of encapsulation.

## Polymorphism
>Polymorphism in Java provides a way to perform one task in different possible ways. To achieve polymorphism in Java we use method overloading and method overriding.
## Abstraction
> Abstraction can be defined as hiding unnecessary data and showing or executing necessary data. In technical terms, abstraction can be defined as hiding internal processes and showing only the functionality. 
## Interfaces & Packages
- Interfaces | Packages
## **Package**
> A java package is a group of similar types of classes, interfaces and sub-packages. Package in java can be categorized in two form, built-in package and user-defined package.
There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

> Advantage of Java Package:
>   - Java package is used to categorize the classes and interfaces so that they can be easily maintained.
>   - Java package provides access protection.
>   - Java package removes naming collision.

- Nested Interface
- Abstract Classes
- Difference b/w Abstract Class & Interface


## Expection Handing ,I/O Streams & Multithreading Concepts
- Exception Handling
- Types of Exceptions
- Multithreading 
- file Handling

## Collection Framework,AWT & SWING
- Collections
- Generics
- Java Swings
- Java AWT

 
