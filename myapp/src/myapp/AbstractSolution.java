package myapp;
//Subclass (inherit from Abstarction)
public class AbstractSolution extends Abstarction {

	public static void main(String[] args) {
		 //creating the object of class AbstractSolution
		AbstractSolution a = new  AbstractSolution();
		a.m1();
		
		//If we are try to create a object of the abstract class then it will throw error 
		//because we cannot create a object of abstract class
		//Abstarction ab = new  Abstarction();
		//ab.m1();
	}

	@Override
	void m1() {
		// The body of m1() is provided here
	System.out.println(" m1 method from Abstraction class");
		
	}

}
