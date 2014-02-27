import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;

import java.util.ArrayList;
import java.awt.Color;
public class BlusterCritter extends Critter {
	private static final Color DEFAULT_COLOR = Color.PINK;
	private static final double DARKENING_FACTOR = 0.05;
	private int courage;
	private Color color;
	
	
	public BlusterCritter(int courage){
		this.courage = courage;
		setColor(Color.MAGENTA);
	}
	public BlusterCritter(){
		this.courage = 3;
		setColor(Color.MAGENTA);
	}
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location loc = getLocation();
		for (int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++) {
	   		for (int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++) {
	   			Location temp = new Location(r,c);
	   			if (getGrid().isValid(temp)) {
	   				Actor a = getGrid().get(temp);
	   				if (a != null && a != this && a instanceof Critter) {
	   					actors.add(a);
	   				}
	   			}
	   		}
		}	
		return actors;   
	}

	public void processActors(ArrayList<Actor> actors){
		int count = 0;
		for (Actor a: actors) {
			if (a instanceof Critter) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(this.courage);
		if (count < this.courage) {
			Color c = getColor();
			int red = c.getRed();
			int green = c.getGreen();
			int blue = c.getBlue();
			if (red < 255) {
				red++;
			}
			if (green < 255) {
				green++;
			}
			if (blue < 255) {
				blue++;
			}			
			setColor(new Color(red, green, blue));
		}
		if (count > this.courage) {
			Color c = getColor();
			int red = c.getRed();
			int green = c.getGreen();
			int blue = c.getBlue();
			if (red > 0) {
				red--;
			}
			if (green > 0) {
				green--;
			}
			if (blue > 0) {
				blue--;
			}
			

			setColor(new Color(red, green, blue));

		}
		count = 0;

	} 

}