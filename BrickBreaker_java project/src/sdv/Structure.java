package sdv;

//This "Structure" class is the base for all on-screen objects in the game. The Ball, Brick, Item, and Paddle classes extend it.

//Imports
import java.awt.*;

//Class definition
public class Structure implements Constants {
	//Variables
	protected int x, y, width, height;
	protected Color color;

	//Constructor
	public Structure(int x, int y, int width, int height, Color color) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}

	//Draw a structure
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	//Mutator methods
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//Accessor methods
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}
}

