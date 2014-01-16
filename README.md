gridworld
=========
Yes the bug will always move to a new location, as when it is told to "step" it moves oen space in a specific
direction. 

The bug moves whatever direction it is told to do so, the default is forward, if the space ahead of it is clear.

When the bug is unable to move, it turns its direction by 45 degrees.

The bug leaves a flower behind when it moves. It leaves the flower on the last place that it was.

The bug will turn if it is facing the edge of the grid. This is so that eventually it will turn away from the wall and begin to mvoe again.

When the bug has a rock in the location in front of it, it will turn 45 degrees to the left. This is so that it can move when it turns far enough away from the rock.

The flower does not move. It will stay at the location that the bug dropped it at.

The flower only has one behavior, and that is to lose color over time. When the flower is left, eventually the color darkens and gets less vivid.

The rock is unable to move, or have any behavior, besides the fact that it stops the movement of the bug.

No, only one actor can be on a space. An actor is a bug, rock, flower or whatever the other thing is.

Exercises
1.  0-North
    45 - North East
    90 - East
    135 - South East
    180 - South
    225 - South West
    270 - West
    315 - North West
    360 - North

2. You can move your bug anywhere on the grid. If you move it on top of another actor, the bug deletes the actor. For instance, on a rock, deletes the rock.

3. You use setcolor method to se the color of specific things.

4. The bug will be deleted.
    
Set 2
1. Sidelength is the length of each side of the box in flowers. 

2. Steps is used with sidelength to decide whether the bug has moved how far it is needed to.

3. Each turn, turns 45 degrees. So when you turn 45 and another 45 you turn 90. This will make the sides of the box straight.

4. It can be called in the class because of inheritence, it has called the same functions has bug actor.

5. No, well it could be. It depends what the user enters in to the side length for the bug.

6. It could change if there was a rock in the middle of the path. Or maybe if it hits another bug.

7. The value of steps will be zero once it reaches the end of the sidelength. When the bug turns the steps gets set back to zero so that the next side can be done.

Set 3
1. loc1.getRow();
2. False
3. (3,5)
4. 45 Degrees
5. You tell it which way, such as Location.South, it gets the location below the selected bug.

Set 4
1. ArrayList<Location> getOccupiedLocations()
2. isValid(10,10);
3 .-
