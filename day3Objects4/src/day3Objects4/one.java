package day3Objects4;

public class one {
	
	public void timestable(int table, int value) { //parameter value specifies when to stop the loop
		int a = 1; //counter starting from 1
		
		System.out.println("The "+table+" times table mutiplied up to "+ value);
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
		
		while (a <= value) {
         System.out.println(table+"x"+a+"= "+(table*a));
         a=a+1; //while loop adding 1 each time
         }
        
	}
	//additional
	public void eventimestable(int table, int value) { //parameter value specifies when to stop the loop
		int a = 0; //counter starting from 1
		
		System.out.println("The even number "+table+" times table mutiplied up to "+ value);
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
		
		while (a <= value) {
         System.out.println(table+"x"+a+"= "+(table*a));
         a=a+2; //while loop adding 1 each time
         }
        
	}
	
	

}
