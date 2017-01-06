package gui.whackAMole;

import gui.components.ClickableGraphic;
import gui.whackAMole.MoleInterface;

public class Mole extends ClickableGraphic implements MoleInterface {

	
	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, .9, "resources/sampleImages/mole.png");
	}


	public int getAppearanceTime() {
		return appearanceTime;
	}

	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;
	}

}