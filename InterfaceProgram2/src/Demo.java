
public class Demo {
	//defining a function perform which will take interface reference as parameter
	public static void perform(Game game) {
		game.play();
	}

	public static void main(String args[]) {
		Game game[] = new Game[3];
		game[0] = new Cricket();
		game[1] = new Football();
		game[2] = new Tennis();
		//invoking methods of subclasses by passing interface reference
		perform(game[0]);
		perform(game[1]);
		perform(game[2]);
	}
}
