package gui.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class MovingComponent extends Component implements Runnable{
	private long moveTime; //time when the image last moved
	private double vx; //the horizontal velocity
	private double vy; //the vertical velocity
	private double posx; //the actual x-coordinate of the object
	private double posy; //the actual y-coordinate of the object
	private boolean running;

	public static final int REFRESH_RATE = 20;
	
	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		vx = 0;
		vy = 0;
	}

	public boolean isAnimated(){
		return true;
	}
	
	public void setX(int x){
		super.setX(x);
		posx = x;
		//now the actual position is sync with the screen position
	}
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void setY(int y){
		super.setY(y);
		posy = y;
	}
	
	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	@Override
	public void run() {
		posx = getX();
		posy = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running){
			try {
				Thread.sleep(REFRESH_RATE);
				checkBehavior();
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void checkBehavior() {
		if(getY()>300){
			setY(300);
			setVy(-vy);
		}
		
	}

	@Override
	public void update(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		int diffrence = (int) (currentTime - moveTime);
		if(diffrence >= REFRESH_RATE){
			//update move time
			moveTime = currentTime;
			//calculate the new position
			posx += vx * (double)diffrence/REFRESH_RATE;
			posy += vy * (double)diffrence/REFRESH_RATE;
			//not for very low velocities, the position might not change by very much,\
			//so rounding down to an in might make it look like nothing changed,
			//but posx and posy will keep track of the small fraction
			super.setX((int) posx);
			super.setY((int) posy);
		}
		drawImage(g);
	}

	private void drawImage(Graphics2D g) {
		g.setColor(Color.blue);
		g.fillOval(0, 0, getWidth(), getHeight());
	}
	public void play(){
		if(!running){
			Thread go = new Thread(this);
			go.start();
		}
	}

}
