package ifStatements;

public class grades {

	public static void main(String[] args) {
		
		int maths = 31;
		int physics = 40;
		int chemistry = 10;
		
		int marks = maths+physics+chemistry/300;
		  
		 System.out.println(marks);
	 
		  if (marks >=90) {
			  System.out.println("A");
		}
		  if (marks >=80 && marks<90) {
			  System.out.println("B"); 
	    }
		  
		  if (marks >=70 && marks <80) {
			  System.out.println("C");
	    }
		  if (marks <70) {
			  System.out.println("Fail");
		}

	}
	
	}