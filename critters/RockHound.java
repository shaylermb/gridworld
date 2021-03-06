import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

import java.util.ArrayList;
import java.awt.Color;
class RockHound extends Critter {
	public void processActors(ArrayList<Actor> actors){
	    for (Actor a : actors){
	        if ((a instanceof Rock))
	            a.removeSelfFromGrid();
	    }
	}
}