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

	// Declare instance variables here
	private String name;
	private double cost;
	private boolean withCream;
	private int numOunces;
	private Scanner scnr;
	
	/**
	 * The main method is the "starting" point of a basic program
	 * This method determines the order of flow of what happens
	 * @param args
	 */
	public static void main(String[] args) {
		//static methods within the class can be automatically called
		demoBranching();
		demoWhileLoops();
		demoForLoops();
		int number = demoClassMethod(42, 24);
		System.out.println("The demo class method returned : " + number);
		
		/* Otherwise, create an instance of the class by calling the constructor
		* then call member methods to accomplish task(s)
		*/ 
		JavaSampler program = new JavaSampler();
		program.run();
	}

	/**
	 * Constructor of the class. Typically the constructor will set up (initialize) any
	 * instance variables for the class
	 */
	public JavaSampler() {
		name = "House Coffee";
		cost = 4.50;
		numOunces = 12;
		withCream = true;
		scnr = new Scanner(System.in);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void demoForLoops() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void demoWhileLoops() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void demoBranching() {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * @param param1
	 * @param param2
	 * @return
	 */
	private static int demoClassMethod(int param1, int param2) {
		// TODO Auto-generated method stub
		return 5;
		
	}
}
