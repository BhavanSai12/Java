package Packages;

public class package1 {
    /*
    Access modifiers:
are used to change the scope of variables,methods and classes.
access modifiers are applied before the variable name,method name and class name

types of access modifiers:
1)private
2)protected
3)public
4)default( if above 3 are not present consider that modifier as default)

Syn:
<access_modifier><non-access_modifier> datatype var=value;
private static int a=10;
public float b=12.45f;
protected double c=12.67;
char ch='&';// default type

syn: method declaration
<access-mod><non-access-mod>datatype methodName(argList){

//body of the method
}

public int sum(int a,int b){
sop(sum);
}

1)private:
private members are accessible within the same class ,
the other classes cannot access private members of a class
2)protected:
the protected members are accessible to all the classes of the same package
and subclasses of other packages.
3)public:
the members are accessible anywhere (inside/outside the same package)
it is  a universal access modifier
4)default:
if we don't specify any access modifier to a member, it is default,
these are accessible upto the same package only.


Restricted Order:
private>default>protected>public

Ex1:
class Calc
{
	private int a=10,b=5;
public static void main(String args[])
{
	Calc ob=new Calc();
	System.out.println(ob.a);
	System.out.println(ob.b);
}
}


Ex2: scope of a and with in Calc class only and not outside of class Calc.
class Calc
{
	private int a=10,b=5;
}
class TestCalc
{
public static void main(String args[])
{
	Calc ob=new Calc();
	System.out.println(ob.a);
	System.out.println(ob.b);
}
}

Ex3:

class Calc
{
	int a=10,b=5;// default access modifier applied here
}
class TestCalc
{
public static void main(String args[])
{
	Calc ob=new Calc();
	System.out.println(ob.a);
	System.out.println(ob.b);
}
}

package:
package is a physical folder consists of classes and interfaces.
package is collection classes and interfaces.

package types:
1) pre-defined package  (already exists in the java library)
Ex:java.util,java.lang,java.io,java.sql

2) user defined package (user can create own packages)
 to create a user defined package use package keyword
 and to import a package into the java program use import

the order of usage of packages in java program is
1) declare the package
2) import the package
3) class with main method

Ex:
package pack;
import java.util.Scanner;
class A
{
main(){}
}

to import only one class use
import packagename.classname;
to import all classes use
import packagename.*;

Ex: import java.util.Scanner;//recommended one
    import java.util.*;

Advantages:
1) reduce the name conflict of class name
2) re-usability


Ex:reduce the name conflict

package pack1;
class CalcAreas
{
public static void main(String args[])
{
int r=2;
System.out.println(3.14*r*r);
}
}

for compile: javac -d . filename
for run : java.packagename.classname

Ex: javac -d . CalcAreas.java
     pack1.CalcAreas


package pack2;
class CalcAreas
{
public static void main(String args[])
{
int l=3,b=6;
System.out.println(l*b);
}
}

Ex: javac -d . CalcAreas.java
    java pack2.CalcAreas


F:\online codes>java pack1.CalcAreas
12.56

F:\online codes>java pack2.CalcAreas
18



package com.venus;
public class Calc
{
public int a=100,b=25;
public void add()
{
System.out.println(a+b);
}
public void sub()
{
System.out.println(a-b);
}
}

//for compiling  javac -d . Calc.java

package com.codegen;
import com.venus.Calc;
public class TestCalc
{
public static void main(String args[])
{
Calc ob=new Calc();
ob.add();
ob.sub();
}
}

//for compiling  javac -d . TestCalc.java
// for running  java com.codegnan.TestCalc


MOD        WITHINCLASS 	WITHINPKG    OUTPKGBYSUBCLASS  	OUTPKG
private          Y        N               N               N                         	  N
default          Y        Y               N               N                        	  N
protected        Y        Y               Y               N                        	  N
public           Y        Y               Y               Y                         	  Y



Default Example:

package com.venus;

class Circle {
	double r=3.45;
	void areaCirc()
	{
	System.out.println(Math.PI*r*r);
	}

}


package com.venus;

class Rectangle {
	float l=12.4f;
	float b=3.56f;
  void areaRect()
  {
	  System.out.println(l*b);
  }


}


package com.venus;

public class TestAreas {

	public static void main(String[] args) {
		 Circle ob=new Circle();
		 ob.areaCirc();
		 Rectangle ob2=new Rectangle();
		 ob2.areaRect();

	}

}


protected Example:
package com.venus;

public class Circle {
	double r=3.45;
	protected void areaCirc()
	{
	System.out.println(Math.PI*r*r);
	}

}


package com.codegnan;
import com.venus.*;

public class TestAreas extends Circle{

	public static void main(String[] args) {
		TestAreas ob=new TestAreas();
		  ob.areaCirc();


	}

}

public Example:

package com.venus;

public class Circle {
	double r=3.45;
	public void areaCirc()
	{
	System.out.println(Math.PI*r*r);
	}

}


package com.codegnan;
import com.venus.*;

public class TestAreas{

	public static void main(String[] args) {
       Circle ob=new Circle();
       ob.areaCirc();



	}

}

importing package in 3 ways

1) import packagename.classname;

Ex:
package com.venus;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the message");
		 String msg=s.nextLine();
		 System.out.println("enter the message id");
		   int id=s.nextInt();
		   System.out.println("Message: "+msg);
		   System.out.println("Id: "+id);


	}

}


2)
package com.venus;

import java.util.*;

public class Task {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the message");
		 String msg=s.nextLine();
		 System.out.println("enter the message id");
		   int id=s.nextInt();
		   System.out.println("Message: "+msg);
		   System.out.println("Id: "+id);


	}

}


3) full qualified:
no usage of import keyword
at the time of class usage write full qualified name
i.e
packagename.classname ob=new packagename.classname();

Ex:
package com.venus;

public class Task {

	public static void main(String[] args) {
		 java.util.Scanner s=new java.util.Scanner(System.in);
		 System.out.println("enter the message");
		 String msg=s.nextLine();
		 System.out.println("enter the message id");
		   int id=s.nextInt();
		   System.out.println("Message: "+msg);
		   System.out.println("Id: "+id);


	}

}



problem with nextLine() after reading other inputs:


Ex:
package com.venus;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		// 100 venu
		 System.out.println("enter the message id");
		 int id=s.nextInt();
		   s.nextLine();
		  System.out.println("enter the message");
		 String msg=s.nextLine();

		 System.out.println("Id: "+id);
		 System.out.println("Message: "+msg);


	}

}



create a class Calc1  having public add() and sub() methods.
Calc1 uses a package pack1.

package pack1;
class Calc1
{
add()
sub()

}

create a class Calc2 having public square() and cube() methods
Calc2 uses a package Pack1.
package pack1;
class Calc2
{
square()
cube()
}

use pack1 all classes and implements its functionalities
in another class TestCalcies with a package com.codegnan.tasks.
package com.codegnan.tasks;
import pack1.*;
class TestCalcies
{
main(){

}
}








*/


}
