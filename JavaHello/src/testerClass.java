import java.time.LocalDate;

public class testerClass {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();  
		System.out.println("Hello, my friend");
		System.out.println(addition(1,1,1));
		System.out.println(date);
		
		   String s="SachinTendulkar";  
		   System.out.println(s.substring(6));//Tendulkar  
		   System.out.println(s.substring(0,6));//Sachin  
		 }  
	
	public static int addition(int a,int b, int c) {
		// a = 10;
		// b = 20;
		 c = a+b;
				
		
		return c;
		
	}

}
 