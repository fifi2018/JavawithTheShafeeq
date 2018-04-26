
public class twofunc {

	public static void main(String[] args) {
		onefunc ref;
		ref = new onefunc();
		
		    int s = 1000;
		    float vat = ref.vat(s); //value of vat to be subtracted from salary s
		    float netSalary = s - vat;		
		    
          System.out.println("Vat for salary £"+s+" at 15% is "+ ref.vat(s)); // calling a method from function method with return value
          System.out.println("Net Salary is: £"+netSalary);
          

	
	}

}
