	
	public class numbers2Strings {
		
		private String ones(int a) {
			String word = " ";
			
			
			switch (a) {
			case 1: word = "one";break;
			case 2: word = "two";break;
			case 3: word = "three";break;
			case 4: word = "four";break;
			case 5: word = "five";break;
			case 6: word = "six";break;
			case 7: word = "seven";break;
			case 8: word = "eight";break;
			case 9: word = "nine";break;
			case 10: word = "ten";break;
			case 11: word = "eleven";break;
			case 12: word = "twelve";break;		
		    case 13: word = "thirteen";break;
		    case 14: word = "fourteen";break;
		    case 15: word = "fifteen";break;
		    case 16: word = "sixteen";break;
		    case 17: word = "seventeen";break;
		    case 18: word = "eighteen";break;
		    case 19: word = "nineteen";break;
		}
			return word;
		}
		
		
		private String tys(int b) {
			String word = " ";
			
			
			switch (b) {
			case 20: word = "twenty";break;
			case 30: word = "thirty";break;
			case 40: word = "fourty";break;
			case 50: word = "fifty";break;
			case 60: word = "sixty";break;
			case 70: word = "seventy";break;
			case 80: word = "eighty";break;
			case 90: word = "ninety";break;
	
		}
		return word;
		}
		private String hundreds(int b) {
			String word = " ";
			
			
			switch (b) {
			case 100: word = "two hundred";break;
			case 200: word = "two hundred";break;
			case 300: word = "three hundred";break;
			case 400: word = "four hundred";break;
			case 500: word = "five hundred";break;
			case 600: word = "six hundred";break;
			case 700: word = "seven hundred";break;
			case 800: word = "eight hundred";break;
			case 900: word = "nine hundred";break;
	
		}
		return word;
		}
		
		
		public void getter(int d) { //d being 8751
			String answer = "";
			 
			    System.out.println(d);
				System.out.println("-- -- -- -- -- -- -- ");
				
			if (d>=1000) {
				
				answer = ones(d/1000) + " Thousand"; // 8 from ones methods = eight
				d=d-(d/1000*1000);                             //8751 - 8000 removing 8000 leaving 751
				System.out.println(answer);
			}
			
			
			if  (d>=100) {
				
				answer = hundreds(d/100*100) + " and "; // 7 from ones methods = seven
				d=d-(d/100*100); //value of d is now 51
				System.out.println(answer);
			}
	          if  (d>=20) {
				
				answer = tys(d/10*10); // 51/10*10 = 50 removes a 1 methods = fifty
				d=d-(d/10*10);// 51-50=1 value of d is now 1
				System.out.println(answer);
	          }
			
				if (d<20){
					answer=ones(d);
				
				System.out.println(answer);
				
				}
					
			}
		
	}
		
	
