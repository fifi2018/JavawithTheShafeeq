
public class Barclays extends Bank{

	public void abc(int a, int b) {
		System.out.println(a+b);
	}
	public void interest() { //cannot override this use the method as it is
		int a=11;
		int b=20;
		int interest = a*b;
		System.out.println(interest);
	
}
