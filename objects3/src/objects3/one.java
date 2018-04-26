package objects3;

public class one {

	public int maths, phy,chem;
	
	public void results () {
		
		int total;
		float per;
		total = maths + phy + chem;
		per = total*100/450;
		System.out.println("Total is: "+ total);
		System.out.println("Percentage mark is: "+per);
	}
	
	
}
