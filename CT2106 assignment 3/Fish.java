
/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Fish extends Animal
{
    // instance variables - replace the example below with your own
    boolean hasFins;  //Creating variables that describe a fish
    boolean canSwim;
    boolean hasGills;
    private String name;
    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {
        // initialise instance variables
        super();  //using the super class to get the variabler from the animal constructor
        colour = "Grey";  //resetting the colour to better describe a fish
        hasFins = true;  //Setting these variables to describe a fish
        canSwim = true;
        hasGills = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void move(int distance){
        System.out.printf("I swim %d in water",distance); //using the move method to describe how a fish moves
    }
    
    
}
