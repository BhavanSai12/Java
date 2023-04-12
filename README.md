# Understand the Basics

## Java
>Java is a popular object-oriented programming language. It is defined as a completecollection of objects. By using Java, we can develop lots of applications such as gaming,mobile apps, and websites.

## History 
>In the year 1991, a small group of engineers called ‘Green Team’ led by James Gosling, workeda lot and introduced a new programming language called “Java”. This language is created insuch a way that it is going to revolutionize the world.
In today’s World, Java is not only invading the internet, but also it is an invisible force behindmany of the operations, devices, and applications.


## Features :
  The following are the notable features in Java:
  >Dynamic : Java is more dynamic when compared to C++ and C. Java is designed in sucha way that it is adaptable to any the evolving environments.
  
  >Simple :Java is very easy to learn and code.
  
  >Object-Oriented : In Java, everything is based on objects.
  
  >Secure : Java provides a secure platform to develop safe and virus-free applications.
  
  >Platform Independent : Unlike C and C++, when we compile Java code it is compiledinto platform-independent bytecode rather than the platform-specific machine code.
  
  >Portable : Java provides no implementation aspects for the specifications which makeJava portable.
  
  >Multithreaded : By this feature, we can perform multiple tasks simultaneously in Java.
  
  >High-Performance : With the built-in Just-in-Time compiler, Java provides highperformance.
  
  >Robust : Java makes more efforts to eliminate errors by concentrating more on runtimechecking and compile-time check.




## JVM
> JVM : Java Virtual Machine is the main part of Java programming, which providesplatform independence. JRE and JDK both contain JVM in order to run our Javaprograms.

## JDK
> JDK:
This development kit is mainly used for developing programs.

## JRE
>JRE:
Java Runtime Environment is mainly used for running Java programs.
- Setting Up the Java Environment 


## Datatypes
Datatypes in Java
specify the values and sizes that can be stored in the variables. There aremainly two types of data types; they are

>Primitive Data Types

>Non-primitive Data Types


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
Widening (automatically) - conversion of a smaller data type to a larger data type size.
>byte-> short -> char -> int -> long -> float -> double

Narrowing (manually) - converting a larger type to a smaller size type
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

>Static Variables:
A variable that is declared with the static keyword is called a static variable.A static variable cannot be a local variable, and the memory is allocated only once for thesevariables.

>Local Variables:
A variable that is declared inside the body of the method within the class iscalled a local variable. A local variable cannot be declared using the static keyword.

>Instance Variables:
The variable declared inside the class but outside the body of themethod is called the instance variable. This variable cannot be declared as static and its valueis instance-specific and cannot be shared among others.

Example
```bash
class A{ int num=30;//instance variable 
static char name=pranaya;//static variable 
void method(){ 
int n=90;//local variable
} }//end of class
```

- Conditional Statements
- Loops 
- Modifiers | Operators
## Arrays & String Manipulations
- array vs array list
- Scope of Variables
- Type Conversion in Java Switch Statements
## Classes ,Objects & Methods
- Classes And Objects
- Methods 
- Method Overloading
- Method Overiding
- Parameter passing
- constructors
## OOPs Concept
- Inheritance
- Encapsulation
- Polymorphism
- Abstraction

## Interfaces & Packages
- Interfaces | Packages
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

 
