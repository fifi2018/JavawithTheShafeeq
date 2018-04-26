

public class arrays {

	public static void main(String[] args) {
		
		int [] numArrays = {600,800,30,40,50,60,700,80,90};//array
		
		int max =  numArrays[0];
		int secLarge = numArrays[0];//assuming first element is the largest number
		int thirdLarge = numArrays[0];
		int min =numArrays[0];
		
		for ( int i = 1; i<numArrays.length; i++) {

		 if (numArrays[i] > max) {
			 max = numArrays[i];
		 }
		 
		 if (numArrays[i] > secLarge) {
			 secLarge = max;
			 max = numArrays[i];
			
		}
		
		if (numArrays[i] < min) {
           min = numArrays[i];			  
	    }
		
		
	}
		System.out.println("Largest number in array is "+max); //outside the for loop {}
		System.out.println("-- -- -- -- -- -- -- -- -- -- -");
		
		System.out.println("The second largest number is"+secLarge);
		System.out.println("-- -- -- -- -- -- -- -- -- -- -");
		
		System.out.println("The third largest number is");
		System.out.println("-- -- -- -- -- -- -- -- -- -- -");
	
		//additional
	    System.out.println("smallest number in array is "+min);
}   
	
	
}