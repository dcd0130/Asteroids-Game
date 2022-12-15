import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Circle {
		
	private static int radius =5;
	private double rotation; 
	

	public Bullet(Point center, double rotation) {
		super(center, radius );
        this.rotation = rotation;
	}

	@Override
	public void paint(Graphics brush, Color color) {
		brush.setColor(color);
		brush.fillOval((int) center.x, (int) center.y, radius, radius);
	}

	@Override
	public void move() {
		center.x += 2 * Math.cos(Math.toRadians(rotation));
		center.y += 2 * Math.sin(Math.toRadians(rotation));
	}

	public boolean outOfBounds(){
		// Write a method called outOfBounds() in the Bullet class that returns true if a Bullet goes off of the screen.
		
		if(center.x > Asteroids.SCREEN_WIDTH && center.y > Asteroids.SCREEN_HEIGHT) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Point getCenter() {
		// first add a getCenter() method to the Bullet class that returns the center Point of the Bullet object
		return center;
	}
}
