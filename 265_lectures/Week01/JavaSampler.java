import java.util.ArrayList;
import java.util.Scanner; //indicates that we will be using this class within our program 

/**
 * A Sampler of basic programming constructs, in Java
 *
 * @author Kendra Walther
 * ITP 265, Fall 2019
 * Week 01
 * Email: kwalther@usc.edu
 *
 */
public class JavaSampler {

	// Instance variables are typically declared here, right after the class declaration
	// However, they may appear anywhere within the Java program, as order is not important
	/* Instance variables represent what objects/instances of a class store. */
	private String name;
	private double cost;
	private boolean withCream;
	private int numOunces;
	private Scanner scnr;
	
	// Class variables are static and there is one copy no matter how many objects of the 
	// class that are made. Think of it as one piece of global shared memory for the class.
	private static String beverageType = "Coffee";
	
	/**
	 * The main method is the "starting" point of a basic program
	 * This method determines the order of flow of what happens
	 * @param args
	 */
	public static void main(String[] args) {
		//static methods within the class can be automatically called from main
		//without first creating an object
		
		demoBranching();
		demoWhileLoops();
		demoForLoops();
		int number = demoClassMethod(42, 24);
		System.out.println("The demo class method returned : " + number);
		
		staticMethodExample(3, 4); // this method also returned an answer, but we did nothing with it
		
		/* Otherwise, (and this is more typical), you must create an instance of the class 
		 * by calling the constructor (special method that creates/constructs an object
		 * and then use that object to invoke/call member methods to accomplish task(s)
		 */ 
		JavaSampler program = new JavaSampler();
		program.run();
	}

	// Methods may appear in any order in the program
	
	/**
	 * This method shows a static method which uses the Math library (covered in class 2)
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static double staticMethodExample(int input1, int input2) {
		int numerator =  (int)Math.pow(input1, input2); //typecast (force) answer to be an int
		int denominator =  (int)Math.pow(input2, input1);
		double answer = (double)numerator/denominator; //typecast needed to correctly do division
		
		
		double a = Math.sqrt(16.0);
		int b = Math.round(3.14f);
		System.out.println("a is " + a + "   and " + b);
		
		
		return answer;
	}
	
	

	/**
	 * Constructor of the class. Typically the constructor will set up (initialize) any
	 * instance variables for the class
	 */
	public JavaSampler() {
		name = "House Coffee";
		cost = 4.55;
		numOunces = 12;
		withCream = true;
		scnr = new Scanner(System.in);
	}

	public void run() {
		System.out.println("Welcome to my \"Java\" coffee shop");
		
		//In a regular method, you can access any of the instance variables
		System.out.printf("\nA cup of \"Java\" at this shop is: %s, costs $%.2f, and holds %d ounces", name, cost, numOunces);
		
		
		System.out.println("This program can represent a cup of coffee, but we'll do more of that "
				+ " later when we cover Object-oriented programming in detail.");
		double d = cost/numOunces;
		System.out.println("The coffee costs $" + d + " per ounce");
		
		System.out.printf("Or, if you care about appearance, formatted, the coffee costs $%.2f per ounce", d);
		// To see more about formatting, go here: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		// or here: https://dzone.com/articles/java-string-format-examples
		// these work with String.format or with printf (which is print with formatting
		

		
		
		
	}

	/**
	 * 
	 */
	private static void demoForLoops() {
	
		for(int i = 0; i  < 35; i++ ) {
			System.out.print("*");
		}
		System.out.println();
	}

	/**
	 * 
	 */
	private static void demoWhileLoops() {
		//Will do Scanner in detail in Day 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's play a guessing game to demo while loops.");
		demoForLoops(); // I can call this just to print Stars
		int number = 42; //local variable
		
	
		int guess = -1; // set guess to a default value
		
		while( guess != number) {
			System.out.print("Guess the number I am thinking of: >> ");
			guess = sc.nextInt(); // local variable that will hold the user's guess
			
			if(guess == number) { System.out.println("YOU GOT IT!"); }
			else { System.out.println("WRONG."); }
			
		}
		
		System.out.println("\nThanks for playing my game.");
	}

	/**
	 * 
	 */
	private static void demoBranching() {
	
		Scanner sc = new Scanner(System.in); //not typical to do twice in a program
		System.out.println("What is your favorite color? >>");
		String color = sc.nextLine(); 
		if(color.toLowerCase().contains("blue")) {
			System.out.println("Blue is such a pretty color");
		}
		else if (color.toLowerCase().contains("green")) {
			System.out.println("Yay for green");
			
		}
		else if (color.toLowerCase().contains("purple")) {
			System.out.println("Yay for purple");
			
		}
		else {
			System.out.println("I'm more partial to cool colors like blue, green, and purple");
		}
		
		demoSwitch(color);
	}

	
	/**
	 * @param color
	 */
	private static void demoSwitch(String color) {
		System.out.println("Demo of switch statements with the color:"  + color);
		switch(color) {
		case "red": 
			System.out.println("R");
			break;
		case "orange": 
		case "yellow":
			System.out.println("sunshine");
			break;
		case "green":case "GREEN":
			System.out.println("Grass");
			break;
		case "blue": case "BLUE":
			System.out.println("Blue skies are pretty");
		default:
			if(color.equalsIgnoreCase("blue")) {
				System.out.println("Blue colors also come to default case");
			}
			else {
				System.out.println("your color didn't match any of the programmed cases ");
			}
			System.out.println("Default case is done");
		}
	}

	/**
	 * @param param1
	 * @param param2
	 * @return
	 */
	private static int demoClassMethod(int param1, int param2) {
		return param1 + param2;
		
	}
}
