import java.util.Scanner;

public class Player {
	
	int age;
	String name;
    Scanner sca = new Scanner(System.in);
	
	 public Player(int age, String name) { //Constructor
		 super();
		 this.age = age;
		 this.name = name; 
		
	}
	
	 public void PlayerNamePrint() {
		
		 System.out.println("What is your name? ");
		 String name = sca.nextLine();
		 
		 System.out.println("How old are you? Please note, you must be aged 16 & above ");
		
		 int age = sca.nextInt();
		
		 
	
		 if (age < 16) {
			 System.out.println("Sorry "+name+ " you have not met the minimum age requirements to play this game");
			 System.out.println("Please exit the game!");
			 System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
		 }
			 else {
				System.out.println("Hello " +name+ " Welcome to the Barren Moor game. The aim of this game is to find the treasure using your magic compass");
				System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
			}
		 sca.close();
		}
	 
	}
	


