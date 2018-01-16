import java.util.Scanner;

//import java.util.Scanner;

/**
 * 
 * What we do when building applications a. Modeling the real world, what is the
 * world made up of? b. Model the world as objects c. Like things in the real
 * world Objects have attributes or characteristics about them d. Objects can
 * take actions/methods e. Objects can interact with each other to take complex
 * actions f. Building programs/applications is working with objects and their
 * capabilities to model the world as we want g. Computers are dumb terminals,
 * they don't do anything by themselves, They follow instructions written by us
 * in some language h. Language we use is Java, it is an object oriented
 * language, high level language language is close to English but this is not a
 * computer understands compiler translates java to machine code or what the
 * computer understands i. Programs are a set of instructions, they are the
 * process through which input information is transformed into some type of
 * output. j. A Java program allows us to describe the work that we want our
 * program to do k. A Class is a template, template describes the objects that
 * we want to model. l. Contains information about the object and also the
 * actions that we want it to take. m. Open up Eclipse> Walk through creating a
 * Java Project > Name the project Right click on the project> Make a new class
 * > Class gets a name, include it having a main method
 * 
 * @author nikhilsrinivasan
 *
 */

public class HelloWorld {

	public static void main(String[] args) {

		// 1. Introduce the main method
		// How does a program know what to run when you double click on an icon, it runs
		// a method
		// That method in Java is the main method

		// 2. Code is written in chunks in blocks
		// Delineated by the opening and closing curly brace

		// 3. Introduce System.out.println
		// Statements end with a semicolon
		// System.out.println is a way to print out text that is present within
		// parentheses and double quotes
		System.out.println("Hello World");

		// 3.1 System.out.print
		// Used to print out text but stay on the same line

		System.out.print("Hello");
		System.out.println("World");

		// 4. Variables
		// variables are places to store information. in a computer they are memory
		// locations
		// think of them as cups that can hold something depending on the type of cup
		// some cups can hold cold things well, some can hold hot things well
		// variables have data types, they can hold specific types of data
		// can perform arithmetic operations on variables that allow arithmetic
		// operations
		// once a variable has declared and given a name, you can use it
		String aName; // this declares a variables
		aName = "Nikhil Srinivasan"; // this assigns a declared variable a value
		String name = "Nikhil"; // this declares and assigns a variable a value
		int age = 99;
		double salary = 9.99;
		int hours = 40;

		// 5. printing out variables
		//
		System.out.println(name);
		System.out.println(salary);
		System.out.println(age);

		// 6. Concatenating string literals with variables

		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary * hours + " dollars");

		// 7. Scanner class to get input

		// Scanner is something that is built into Java. Scanner allows you to read from
		// files
		// the keyboard and other types of input.
		// you have to import something from java to be able to do this
		// import statements come on the top of the java code
		// To use the Scanner you have to create an object of the scanner type

		Scanner scan = new Scanner(System.in);

		// Like every object in the real world that can do things, objects in java can
		// do things
		// the Scanner object reads data in and to do this it uses methods
		// the Scanner object has a lot of methods it can use
		// next() - methods return information and that information has to be stored
		// somewhere
		// where can we store it, a variable!!
		// next() return the data as a strings
		// nextInt() // returns the data as an integer
		// nextDouble() // returns the data as a double

		System.out.print("Type out your Name > ");
		name = scan.next();
		System.out.print("Salary > ");
		salary = scan.nextDouble();
		System.out.print("Age > ");
		age = scan.nextInt();
		System.out.print("Hours Worked > ");
		hours = scan.nextInt();

		// 8. \n

		// add's a new line character when used as part of a print or println statement
		// or string literal

		// Task D.
		System.out.print("Current Assets > ");
		double currentAssets = scan.nextInt();
		System.out.print("Current Liabilities > ");
		double currentLiabilities = scan.nextInt();
		System.out.print("Net Income > ");
		double netIncome = scan.nextInt();
		System.out.print("Total Assets > ");
		double totalAssets = scan.nextInt();
		System.out.print("Total Liabilities > ");
		double totalLiabilities = scan.nextInt();

		System.out.print("Shareholders Equity > ");
		int shareholdersEquity = scan.nextInt();

		double netAssets = totalAssets - totalLiabilities;

		double currentRatio = currentAssets / currentLiabilities;

		double rOA = (netIncome / netAssets);

		double rOE = netIncome / shareholdersEquity;

		System.out.println(currentRatio);
		System.out.println(rOA);
		System.out.println(rOE);

	}

}
