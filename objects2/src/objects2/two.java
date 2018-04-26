package objects2;

public class two {

	public static void main(String[] args) {
		
		one a;
		
		a = new one();
		
		a.a = 10;
		a.b = 20;
		a.myMethod();// calling a method from main class one
		
		a.myMethod2(); //additional method addition of a & b

	}

}
