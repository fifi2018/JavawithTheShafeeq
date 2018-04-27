
import java.util.Random;

public class Map extends Grid{
	
		public int xPosition;
		public int yPosition;
		
		
		
		public void MapState(){
				              
          System.out.println("You awaken to find yourself in a barren moor grid");
          
			Random rand = new Random();
			switch ((rand.nextInt(4))) //generates random numbers only up to 4 from 0
			{
			case 0: 
				System.out.println("The area has grey foggy clouds floating close to you");break;
			
			case 1:
				System.out.println("The area has grey murky water that reach up your shins");break;
				
			case 2:
				System.out.println("This area has black plants out of the shallow water ");break;
				
			case 3:
				System.out.println("There's a small watch like device on your left hand");break;
	
			}
			System.out.println("-- -- -- -- -- -- -- -- -- -- ");
			System.out.println("Follow next instructions to find the treasure");
		}
		
		
	 public void ViewPosition(int positionX, int positionY) {
		int x = positionX;
		int y = positionY;
		 
		 if (x == 0 && y ==5) {
			System.out.println("Congradulations!! you have found the treasure!!");
			System.out.println("You can now exit the game");
		}
		
		 else { 
			System.out.println("You lost, there is no treasure at your location");
			System.out.println("You can now exit the game");
		}
		 
		 
	 }
		

	}

	

