package inheritance;

public class math2 extends math1{
	
	public void addition(int a, int b) {
		System.out.println("Result is"+a+b);
	}
	public void multiplication() {
		super.multiplication(10, 10);
	}

}
