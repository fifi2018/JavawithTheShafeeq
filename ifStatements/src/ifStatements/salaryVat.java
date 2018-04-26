package ifStatements;

public class salaryVat {

	public static void main(String[] args) {
	  int salary = 4500;
	  
	  float vatTen = salary*10/100;
	  float vatFifteen = salary*15/100;
	  float vatSeventeen = salary*17/100;
	  float vatNineteen = salary*19/100;
	  
	  System.out.println("Salary before vat is: " + salary);
	  
	  if (salary <1000) {
		  System.out.println("Salary after vat is: " + salary);
	}
	  
	  if (salary >=1000 && salary <2000) {
		  System.out.println("Salary after vat is: " + vatTen); 
	  }
	  
	  if (salary >=2000 && salary <3000) {
		  System.out.println("Salary after vat is: " + vatFifteen);
	  }
	  if (salary >=3000 && salary <4000) {
		  System.out.println("Salary after vat is: " + vatSeventeen);
	}
	  if (salary >=4000) {
		  System.out.println("Salary after vat is: " + vatNineteen);
	}

}
}