		package forLoops;
		
		public class one {
			
			public void breaktwotimestable() {
				int a;
				int table = 
						
						2;
				
				System.out.println("The "+table+" times table mutiplied up to 10");
				System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
				
				for (a=1; ; a=a+1) {
					
		         System.out.println(table+"x"+a+"= "+(table*a));
		          if (a == 10) 
		        	   break; 
				}
				
			System.out.println("  ");
		         }
			
			
			public void timestable(int table, int value) { //parameter value specifies when to stop the loop
				int a; 
				
				System.out.println("The "+table+" times table mutiplied up to "+ value);
				System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
				
				for (a=1; a<=value; a=a+1) {
		         System.out.println(table+"x"+a+"= "+(table*a));
		         
		         }
		        
			}
			
			
			
			
			
		}
