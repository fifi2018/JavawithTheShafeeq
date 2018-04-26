package objects;

public class two {

	public static void main(String[] args) {
		
		one a; 
		a = new one(); //variable a = class 'one'
		a.x = 10;
		a.y = 50;
		
		System.out.println(a.x+a.y); //should output 30
		

	}

}
