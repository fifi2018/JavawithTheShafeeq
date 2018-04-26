
 abstract public class Bank {
	
	final public void interest() { //cannot override this use the method as it is
		int a=10;
		int b=20;
		int interest = a*b;
		System.out.println(interest);
	}
	
	abstract public void abc(int a, int b); // abstract method
	

}
