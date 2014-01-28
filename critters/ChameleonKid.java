import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.awt.Color;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonKid extends ChameleonCritter{
	private int direction = getDirection();
	ArrayList<Actor> a = new ArrayList<Actor>();
	public ArrayList<Actor> getActors(){
	    if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection()))) {
	    	a.add(getGrid().get(getLocation().getAdjacentLocation(getDirection())));
	    }
	    if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() + 180))) {
	    	a.add(getGrid().get(getLocation().getAdjacentLocation(getDirection())));
	    }
	    return a;
	}
}

