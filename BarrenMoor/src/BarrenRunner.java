
public class BarrenRunner {

	public static void main(String[] args) {
	
		Map m = new Map();
		Compass2 s = new Compass2();
		
		m.Welcome(); //will print out hello message
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- ");
		
		
		
		Player p = new Player(25, "Phyllis");
		
		
		p.PlayerNamePrint(); //takes user name & ages print on the screen
		
		m.MapState();
		
		s.inputReader3();
		
		m.ViewPosition(2, 0);
		
	   
	}

}
