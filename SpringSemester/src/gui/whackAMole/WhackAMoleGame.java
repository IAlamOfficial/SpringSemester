package gui.whackAMole;

import gui.GUIApplication;
import gui.whackAMole.WhackAMoleGame;
import gui.whackAMole.WhackAMoleScreen;

public class WhackAMoleGame extends GUIApplication {

	public WhackAMoleGame(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = 
				new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		WhackAMoleGame wam = new WhackAMoleGame(800, 500);
		Thread game = new Thread(wam);
		game.start();
	}
}

	
	
