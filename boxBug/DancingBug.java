import info.gridworld.actor.Bug;
import java.util.Random;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private Random r = new Random();
    private int[] array = new int[10];
    private int turn;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug()
    {
        for (int i = 0; i<array.length; i++) {
            array[i] = r.nextInt(100);
        }

    }

    /**
     * Moves to the next location of the square.
     */
    public void act(){
    if (turn < array.length - 1) {
        turn++;
    } else {
        turn = 0;
    }
    for (int j = 0; j<array[turn]; j++) {
        turn();                
    }          
        super.act();
       
    }
}
