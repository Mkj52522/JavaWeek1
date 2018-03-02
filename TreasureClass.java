package TheAdventureofthebarrenmoor;

public class TreasureClass {
	
	boolean hastreasurebeenlocated = true;
	if (hastreasurebeenlocated) {
	System.out.println("Game complete");
	} else {
	System.out.println("Continue game");
	
	
	int playCount = 0;
	boolean playing = true;
	
	do {
		System.out.println("Playing");
		playCount++;
		
		if (playCount > 10)
			playing = false;
		
		if (!isAlive())
			playing = false;
		
	} while (playing) ;
	
	System.out.println("Game Over!");}
}
}

