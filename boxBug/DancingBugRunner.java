import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;


public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        DancingBug greg = new DancingBug();
        world.add(new Location(7, 8), greg);
        world.show();
    }
}