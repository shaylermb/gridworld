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
1. ArrayList GetOccupiedLocations() 2. If isValid(10, 10) returns true 3. In the super class of Location. 4. No because you dont know the size of the array at any given point.

Set 5 
1. The actors know their location, direction, and color 2. Its direction is North, and its color is Red. (unless setColor is used beforehand) 3. Because Actors are objects, and are subclasses where as you would have to implement all the different actors in order to use them if they were interfaces. 4. No, it cannot put itself in the grid twice. No, it cannot remove itself from the grid twice. Yes, an actor can put itself in, then remove itself, then put itself back in the grid. 5. setDirection(90);

Set 6 
1. if (gr == null) return false; 
2. return (neighbor == null) || (neighbor instanceof Rock); 
3. instanceof, gr 
4. neighbor 
5. Bug, Rock, Flower 
6. It returns false. 
7. It is needed because the bug needs to know what is in front of it. 
8. Because the flowers are dropped by the bug and take the color of the bug and fade color as the bug is farther away. 
9. No because it sets the location and the grid to null at that spot. 
10. flower.putSelfInGrid(gr, loc); 
11. 4 times.

Set 7
1. All methods from bug are implemented into Critter
2. move, change color, turn
3. No. We need this method so that they can change colors correctly.
4. It can avoid the neighbor, change colors to it, or jump it.
5. super.Act makes a critter move, because it just calls act in the bug class.
6. There doesnt need to be a critter constructor, becasue its makes a bug.

Set 8
1. Chameleon takes color of its neighboring rock.
2. Because it just moves, the color method is completely seperate.
3. super.Act before the normal act.
4. It has to override, because it does something different when there is a neighbor.
5. Bug contains the locations stuff.
6. A critter accesses its own grid with a grid array.

Set 9
1. It does not override bcause it needs to do the same thing when it overrides.
2. It looks for neighbors, and then moves towards them, unless it is a rock.
3. Because it cant move towards a rock, so it gets the corrct direction of that rock.
4. 3,4 - 3,5 - 3,3 - 3,2
5. Critters move away from neighbors, crabs move towards the correct critters.
6. It determines where to move with its neighboring actors.
7. Because it will move away from each other.
