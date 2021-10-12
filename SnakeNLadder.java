//Snake and Ladder Game

public class SnakeNLadder {
	public static void main(String args[]) {
		
		//variables
		int positionPlayer1 = 0;
		
		// Random Dice value between 1-6
		int dice_value = (int) Math.floor((Math.random()*6) + 1);
		
		// Random Option for No play, Ladder, and Snake
		int check_opt = (int) Math.floor(Math.random()*3);
		
		//checking option using case
		switch(check_opt) {
			case 1:		//ladder
				positionPlayer1 += dice_value;
				break;
			case 2:		//snake
				positionPlayer1 -= dice_value;
				break;
			default:	//no play
				positionPlayer1 += 0;
		}
	}
}
